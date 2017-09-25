/**
 *
 */
package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.choitabi.dto.UsersDTO;
import com.internousdev.util.DBConnector;


/**
 * loginDAO
 * DBからユーザー情報を取得するクラス
 * @author KAZUYUKI TASAKI
 * @since 2017/9/4
 *@version 1.0
 */
public class LoginDAO {
	/**
	 * 取得メソッド
	 * DBに格納されているusersテーブルからユーザー情報を取得するメソッド
	 * @param mailAddress メールアドレス
	 * @param password パスワード
	 * @param dto ユーザー情報
	 * @return dtoにユーザー情報を格納する
	 */
	public UsersDTO select(String mailAddress, String password){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");

		Connection con = db.getConnection();
		UsersDTO dto = new UsersDTO();

		String sql = "select phone_email, password, user_id, user_flg,login_flg"
				+" from users where phone_email=? and password=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, mailAddress);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setMailAddress(rs.getString("phone_email"));
				dto.setPassword(rs.getString("password"));
				dto.setUserId(rs.getInt("user_id"));
				dto.setLoginFlg(rs.getInt("login_flg"));
				dto.setUserFlg(rs.getInt("user_flg"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}


	/**
	 *ログインフラグを１に更新するメソッド
	 * @param userId
	 * @return loginFlgを１を更新する
	 */


	public void  update(int userId){

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");

		Connection con = db.getConnection();

		String sql = "update  users set login_flg=1 where user_id=?";
		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, userId);
			ps.executeUpdate();


		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
