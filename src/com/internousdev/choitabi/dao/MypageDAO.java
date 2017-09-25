package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.MypageDTO;
import com.internousdev.util.DBConnector;


/**
 * Mypageに関するクラス
 * @author KAZUYUKI TASAKI
 *@since 2017/9/14
 *@version 1.1
 */
public class MypageDAO {
	/**
	 * userIdでMypageに必要な情報を取得してリストに格納するメソッド
	 * @param userId
	 * @return Userに情報を格納する
	 */

	public ArrayList<MypageDTO> select(int userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection con = db.getConnection();
		MypageDTO dto = new MypageDTO();
		ArrayList<MypageDTO> userList = new ArrayList<MypageDTO>();

		String sql = "select * from users where user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,userId);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto.setUserId(rs.getInt("user_id"));
				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
				dto.setGivenNameKanji(rs.getString("given_name_kanji"));
				dto.setAddress(rs.getString("address"));
				dto.setMailAddress(rs.getString("phone_email"));
				dto.setTelNumber(rs.getString("phone_number"));

				userList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return userList;
	}
}