/**
 *
 */
package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * @author KAZUYUKI TASAKI
 *@since 2017/9/4
 *@version 1.0
 */
public class LogoutDAO {

	/**
	 * @param userId
	 * @return
	 */
	public int update(int userId, boolean loginFlg){
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "openconnect", "root", "mysql");
		Connection con = db.getConnection();

		String sql = "update users set login_flg=? where user_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setBoolean(1, loginFlg);
			ps.setInt(2, userId);
			count = ps.executeUpdate();
			return count;
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
 		return count;
	}


}
