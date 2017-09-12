package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;



/**
 * カートテーブル内情報の削除に関するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.0
 */

public class DeleteCartDAO {

	/**
	 * カートにあるツアーを削除するためのメソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/05
	 * @version 1.0
	 * @param cart_id カートID
	 * @return delete 削除できたら1、できなかったら0を繰り返す
	 */

	public int delete(int user_id, int cart_id) {
		int delete = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
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