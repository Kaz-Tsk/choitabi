package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.choitabi.util.MySQLConnector;

/**]
 * クレジットカードの種類を判別し情報が正しいかチェック
 * @author SHUN NAGAO
 * @since 2017/09/11
 * @version 1.1
 */
public class CheckCreditInfomationDAO {

	/**
     * select Method m_creditcard_typeテーブル内をカラムcard_name により検索するメソッド
     * @author SHUN NAGAO
     * @since 2017/09/11
     * @version 1.1
     * @param stringCreditType クレジットタイプ
     * @param checkNumber チェックナンバー
     * @return result　リザルト
     */

	public boolean select(String stringCreditType, String checkNumber) {
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/";
		MySQLConnector db = new MySQLConnector(driverName, url, "creditcard_manager", "root", "mysql");
		Connection con = db.getConnection();
		boolean result = false;

		/*
		 * m_creditcard_typeテーブルよりcard_numberをselect
		 * 条件:LIKE="CardTypeの文字列"をあいまい検索 stringCreditType=action111,226行目
		 */
		String query = "SELECT card_number FROM m_creditcard_type WHERE card_name LIKE " + stringCreditType;

		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				//DB上の"card_number"と入力される"checkNumber"(action114行目)が一緒ならtrue
				if (rs.getString("card_number").equals(checkNumber)) {
					result = true;
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}



	public int insert(int userId, int creditName, String creditNumber, String nameE, String securityCode, String expirationMonth, String expirationYear) {

		/**
		 * insert Method 入力された値をcreditテーブルへ挿入するメソッド
		 * @param userId クレジットID
		 * @param creditType クレジットの種類
		 * @param creditNumber 入力されたクレジットカード番号
		 * @param nameE クレジットカード名義人
		 * @param securityCode セキュリティコード
		 * @param expirationMonth 有効期限(月)
		 * @param expirationYear 有効期限(年)
		 * @return count 正しくinsertされればinsertされた行数を返す
		 * @param creditName クレジットの名前
		 * @param name 名前
		 */

		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/";
		MySQLConnector db = new MySQLConnector(driverName, url, "hannari", "root", "mysql");
		Connection con = db.getConnection();
		int count = 0;
		//creditテーブルにinsert
		String query = "INSERT INTO credit(user_id, credit_name, credit_number, name_e, security_code, expiration_month, expiration_year)"
				+ "VALUES(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, userId);
			ps.setInt(2, creditName);
			ps.setString(3, creditNumber);
			ps.setString(4, nameE);
			ps.setString(5, securityCode);
			ps.setString(6, expirationMonth);
			ps.setString(7, expirationYear);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;

	}

}
