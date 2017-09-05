package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * カートの商品の数を増減
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */
public class UpdateCartDAO {


	/**
	 * カートの購入数を変更するためのメソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/05
	 * @version 1.1
	 * @param quantity 購入数
	 * @param cart_id カートID
	 * @return count 更新できたら1、できなかったら0を繰り返す
	 */
	public int cart_update(int quantity, int cart_id) {
		int count = 0;
		DBConnector con = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		String sql ="update cart set quantity=? where cart_id=?";

		try {
			PreparedStatement ps = ((Connection) con).prepareStatement(sql);
			ps.setInt(1, quantity);
			ps.setInt(2, cart_id);
			count = ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();

		}finally {
				try {
					((Connection) con).close();

				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		return count;
	}

}
