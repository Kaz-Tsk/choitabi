/**
 *
 */
package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * ログアウトに関するクラス
 * @author KAZUYUKI TASAKI
 *@since 2017/9/14
 *@version 1.1
 */
public class LogoutDAO {

	/**
	 * ログアウトするための実行メソッド
	 * @param userId
	 * @param loginFlg
	 */
	public void update(int userId, int loginFlg){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();

		String sql = "update users set login_flg=? where user_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, loginFlg);
			ps.setInt(2, userId);
			ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
