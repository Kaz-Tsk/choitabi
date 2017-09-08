package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.util.DBConnector;



/**
 * カート情報を取得するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.0
 */
public class SelectCartDAO {
	public ArrayList<CartDTO> selectCart(int userId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

		String sql = "select * from cart where userId=?";
		String select2 = "SELECT * FROM tours WHERE tourId=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setUserId(rs.getInt("userId"));
				dto.setCartId(rs.getInt("cartId"));
				dto.setTourId(rs.getInt("tourId"));
				dto.setQuantity(rs.getInt("quantity"));
				cartList.add(dto);

				PreparedStatement ps2 = con.prepareStatement(select2);
				ps2.setInt(1, dto.getTourId());
				ResultSet rs2 = ps2.executeQuery();

				while(rs2.next()) {
					dto.setTourName(rs2.getString("tourName"));
					dto.setPrice(rs.getInt("price"));
					dto.setSubTotal(dto.getPrice()*dto.getQuantity());
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