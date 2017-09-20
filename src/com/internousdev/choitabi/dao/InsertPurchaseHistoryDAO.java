package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * 購入履歴テーブルにデータを追加する為のクラス
 * @author KOSUKE MAEDA
 * @since 2017/8/22
 * @version 1.1
 */

public class InsertPurchaseHistoryDAO {

	/**
	 * 購入されたツアーを購入履歴テーブルに追加する為のメソッド
	 * @author KOSUKE MAEDA
	 * @since 2017/08/22
	 * @version 1.1
	 * @param user_id　ユーザーID
	 * @param tour_id ツアーID
	 * @param quantity 購入数
	 * @param total 合計金額
	 * @return count 更新できたら1、できなかったら0を返す
	 */

	public int insertPurchasehistory(int user_id, int tour_id, int quantity, int total) {
		int count = 0;

		Connection con = new MySqlConnector("tabiyashi").getConnection();
		String sql = "INSERT INTO purchase_history(user_id, tour_id, purchase_date, quantity, total) VALUE(?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ps.setInt(2, tour_id);
			ps.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
			ps.setInt(4, quantity);
			ps.setInt(5, total);
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
