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
	 * カートにある商品を削除するためのメソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/05
	 * @version 1.0
	 * @param cartId カートID
	 * @return delete 削除できたら1、できなかったら0を繰り返す
	 */

	public int delete(int userId, int cartId) {
		int delete = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "delete from cart where userId=? and cartId=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, cartId);

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
