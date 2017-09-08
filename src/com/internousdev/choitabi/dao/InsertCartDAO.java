package com.internousdev.choitabi.dao;

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
	public ArrayList<SelectCartDTO> tourStatus(int tourId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		ArrayList<SelectCartDTO> tourStatus = new ArrayList<SelectCartDTO>();

		String sql = "select * from tours where tourId=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tourId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				SelectCartDTO scDto = new SelectCartDTO();
				scDto.setTourName(rs.getString("tourName"));
				scDto.setPrice(rs.getInt("price"));
                scDto.setImgAddress001(rs.getString("imgAddress001"));

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

	public int addToCart(int userId, int tourId, int quantity) {
		int addCount = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "insert into cart (userId, tourId, quantity) values(?, ?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, tourId);
			ps.setInt(3, quantity);
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
	 * @param userId ユーザーID
	 * @return cartList カート情報
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/06
	 * @version 1.0
	 */

	public ArrayList<CartDTO> selected(int userId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

		String sql = "select * from cart where userId=?";
		String select2 = "SELECT * FROM tours WHERE tourId=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,  userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setUserId(rs.getInt("userId"));//ユーザID
				dto.setTourId(rs.getInt("tourId"));//商品ID
				dto.setQuantity(rs.getInt("quantity"));//購入数
				dto.setCartId(rs.getInt("cartId"));//カートID

				cartList.add(dto);

				PreparedStatement ps2 = con.prepareStatement(select2);
				ps2.setInt(1, dto.getTourId());
				ResultSet rs2 = ps2.executeQuery();

				while(rs2.next()) {
					dto.setTourName(rs2.getString("tourName"));
					dto.setPrice(rs2.getInt("price"));
					dto.setSubTotal(dto.getPrice() * dto.getQuantity());
                    dto.setImgAddress001(rs2.getString("imgAddress001")); //イメージパス
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