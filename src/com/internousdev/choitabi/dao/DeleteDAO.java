/**
 *
 */
package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * カートテーブルのデータを削除する為のクラス
 * @author KOSUKE MAEDA
 * @since 2017/8/22
 * @version 1.1
 */

public class DeleteDAO {

	/**
	 * カートにあるツアーを全て削除する為のメソッド
	 * @author KOSUKE MAEDA
	 * @since 2017/08/22
	 * @version 1.1
	 * @param cart_id カートID
	 * @return count 削除できたら1, できなかったら0を返す。
	 */

	public int deleteCart(int cart_id) {
		int count = 0;
		Connection connection = new MySqlConnector("tabiyashi").getConnection();
		String sql = "DELETE FROM cart WHERE cart_id = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, cart_id);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	/**
	 * カートにあるツアーを全て削除する為のメソッド
	 * @author KOSUKE MAEDA
	 * @since 2017/08/22
	 * @version 1.1
	 * @param user_id ユーザーID
	 * @return count 削除できたら1, できなかったら0を返す。
	 */

	public int deleteAllCart(int user_id) {
		int count = 0;
		Connection con = new MySqlConnector("tabiyashi").getConnection();
		String sql = "DELETE FROM cart WHERE user_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

}
