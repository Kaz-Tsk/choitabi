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
 * DBに格納されているメソッド情報を取得するメソッド
 * @param mailAddress メールアドレス
 * @param password パスワード
 * @param dto ユーザー情報
 */
	public UsersDTO select(String mailAddress,String password){
		/*コンストラクタへ代入*/
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		/*データベースへの接続*/
		Connection con = db.getConnection();
		UsersDTO dto = new UsersDTO();
		String sql ="select mailAddress,user_id,login_flg"
				+"from users where mailAddress = ? and password = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, mailAddress);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setMailAddress(rs.getString("mailAddress"));
				dto.setPassword(rs.getString("password"));
				dto.setUserId(rs.getInt("user_id"));
				dto.setLoginFlg(rs.getBoolean("login_flg"));
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
	 *ログインフラグをtrueにするメソッド
	 *@param loginId ログインID
	 *@return ログインフラグがtrueになれば１、できなければ０を返す。
		 */
	public int update(String mailAddress,String password){
		int count = 0;
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		String sql = "update users set login_flg = true where mailAddress = ? and password = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1,mailAddress);
			ps.setString(2,password);
			count  = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
		}
}
