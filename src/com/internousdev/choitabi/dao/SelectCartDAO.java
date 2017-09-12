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
	public ArrayList<CartDTO> selectCart(int user_id) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

		String sql = "select * from cart where user_id=?";
		String select2 = "SELECT * FROM tour WHERE tour_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setCartId(rs.getInt("cart_id"));
				dto.setTourId(rs.getInt("tour_id"));
				dto.setOrderCount(rs.getInt("order_count"));
				cartList.add(dto);

				PreparedStatement ps2 = con.prepareStatement(select2);
				ps2.setInt(1, dto.getTourId());
				ResultSet rs2 = ps2.executeQuery();

				while(rs2.next()) {
					dto.setTourName(rs2.getString("tour_name"));
					dto.setPrice(rs.getInt("price"));
					dto.setSubTotal(dto.getPrice()*dto.getOrderCount());
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