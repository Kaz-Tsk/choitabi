package com.internousdev.choitabi.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.choitabi.dto.SelectCartDTO;
import com.internousdev.util.DBConnector;



/**
 * 商品詳細からカートに遷移
 * @author HINAKO HAGIWARA
 * @since 2017/09/06
 * @version 1.0
 */

public class InsertCartDAO {
	public ArrayList<SelectCartDTO> tourStatus(int tour_id) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","choitabi","root","mysql");
		Connection con = db.getConnection();
		ArrayList<SelectCartDTO> tourStatus = new ArrayList<SelectCartDTO>();

		String sql = "select * from tour where tour_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tour_id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				SelectCartDTO scDto = new SelectCartDTO();
				scDto.setTour_name(rs.getString("tour_name"));
				scDto.setPrice(rs.getBigDecimal("price"));

				tourStatus.add(scDto);
				}

		}catch(SQLException e) {
			e.printStackTrace();

		}finally {
			try {
				con.close();

			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return tourStatus;
	}

	public int addToCart(int user_id, int tour_id, int order_count) {
		int addCount = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","choitabi","root","mysql");
		Connection con = db.getConnection();
		String sql = "insert into cart (user_id, tour_id, order_count) values(?, ?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ps.setInt(2, tour_id);
			ps.setInt(3, order_count);
			addCount = ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();

		}finally {
			if(con != null) {
				try {
					con.close();

				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return addCount;
		}



	/**
	 * ツアー詳細からカートに遷移
	 * @param user_id ユーザーID
	 * @return cartList カート情報
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/06
	 * @version 1.0
	 */

	public ArrayList<CartDTO> selected(int user_id) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/?useSSL=true&requireSSL=true","choitabi","root","mysql");
		Connection con = db.getConnection();
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

		String sql = "select * from cart where user_id=?";
		String select2 = "SELECT * FROM tour WHERE tour_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,  user_id);
			ResultSet rs = ps.executeQuery();
			/*動作確認*/System.out.println("InsertCartDAO - rs：" + rs);

			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setUser_id(rs.getInt("user_id"));
				dto.setTour_id(rs.getInt("tour_id"));
				dto.setOrder_count(rs.getInt("order_count"));
				dto.setCart_id(rs.getInt("cart_id"));

				cartList.add(dto);

				PreparedStatement ps2 = con.prepareStatement(select2);
				ps2.setInt(1, dto.getTour_id());
				ResultSet rs2 = ps2.executeQuery();

				while(rs2.next()) {
					dto.setTour_name(rs2.getString("tour_name"));
					dto.setPrice(rs2.getBigDecimal("price"));
					dto.setSub_total(dto.getPrice().multiply(BigDecimal.valueOf(dto.getOrder_count())));
					}
			}
		}catch(SQLException e) {
			e.printStackTrace();

		}finally {
			try {
				con.close();

			}catch(Exception e) {
				e.printStackTrace();
				}
		}

		/*動作確認*/System.out.println("InsertCartDAO：確認" + cartList);
		return cartList;

	}

}