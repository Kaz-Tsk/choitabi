package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.Date;
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
 * @version 1.1
 */

public class InsertCartDAO {
	public ArrayList<SelectCartDTO> tourStatus(int tour_id) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		ArrayList<SelectCartDTO> tourStatus = new ArrayList<SelectCartDTO>();

		String sql = "select * from tours where tour_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tour_id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				SelectCartDTO scDto = new SelectCartDTO();
				scDto.setTourName(rs.getString("tour_name"));
				scDto.setPrice(rs.getInt("price"));

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

	public int addToCart(int user_id, int tour_id, int quantity, Date date) {
		int addCount = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "insert into cart (user_id, tour_id, quantity, date) values(?, ?, ?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ps.setInt(2, tour_id);
			ps.setInt(3, quantity);
			ps.setDate(4, date);
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
	 * 商品詳細からカートに遷移
	 * @param user_id ユーザーID
	 * @return cartList カート情報
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/06
	 * @version 1.1
	 */

	public ArrayList<CartDTO> selected(int user_id) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

		String sql = "select * from cart where user_id=?";
		String select2 = "SELECT * FROM tours WHERE tour_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,  user_id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setTourId(rs.getInt("tour_id"));
				dto.setQuantity(rs.getInt("quantity"));
				dto.setDate(rs.getDate("date"));
				dto.setCartId(rs.getInt("cart_id"));

				cartList.add(dto);

				PreparedStatement ps2 = con.prepareStatement(select2);
				ps2.setInt(1, dto.getTourId());
				ResultSet rs2 = ps2.executeQuery();

				while(rs2.next()) {
					dto.setTourName(rs2.getString("tour_name"));
					dto.setPrice(rs2.getInt("price"));
					dto.setSubTotal(dto.getPrice() * dto.getQuantity());
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
		return cartList;

	}
}
