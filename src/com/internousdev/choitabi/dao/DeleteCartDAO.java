package com.internousdev.choitabi.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;

/**
 * カート テーブルのデータを削除に関するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class DeleteCartDAO {

	public int delete(int user_id, int cart_id) {
		int delete = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = (Connection) db.getConnection();
		String sql = "delete from cart where user_id=? and cart_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ps.setInt(2, cart_id);

			delete = ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();

		}finally {
			try {
				con.close();

			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return delete;
	}

}
