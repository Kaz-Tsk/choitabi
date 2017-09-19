package com.internousdev.choitabi.dao;

import java.math.BigDecimal;
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
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/?useSSL=true&requireSSL=true","choitabi","root","mysql");
		Connection con = db.getConnection();
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

		String sql = "select * from cart where user_id=?";
		String select2 = "SELECT * FROM tour WHERE tour_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ResultSet rs = ps.executeQuery();
			/*動作確認*/System.out.println("SelectCartDAO - rs：" + rs);

			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setUser_id(rs.getInt("user_id"));
				dto.setCart_id(rs.getInt("cart_id"));
				dto.setTour_id(rs.getInt("tour_id"));
				dto.setOrder_count(rs.getInt("order_count"));

				cartList.add(dto);

				PreparedStatement ps2 = con.prepareStatement(select2);
				ps2.setInt(1, dto.getTour_id());
				ResultSet rs2 = ps2.executeQuery();

				while(rs2.next()) {
					dto.setTour_name(rs2.getString("tour_name"));
					dto.setPrice(rs.getBigDecimal("price"));
					dto.setSub_total(dto.getPrice().multiply(BigDecimal.valueOf(dto.getOrder_count())));
					/*total_price = (cartList.get(i).getPrice()).multiply(BigDecimal.valueOf(cartList.get(i).getOrder_count()));*/
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

		/*動作確認*/System.out.println("SelectCartDAO：確認" + cartList);
		return cartList;
	}

}