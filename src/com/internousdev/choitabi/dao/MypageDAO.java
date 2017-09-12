package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.choitabi.dto.MypageDTO;
import com.internousdev.util.DBConnector;


/**
 * @author KAZUYUKI TASAKI
 *@since 2017/9/6
 *@version 1.0
 */
public class MypageDAO {

	/**
	 * ユーザー情報をリスト化
	 */
	public List<MypageDTO> UserInfo = new ArrayList<MypageDTO>();

	/**
	 *	@param userId
	 *@return UserList
	 */
	public ArrayList<MypageDTO> select(int userId) throws SQLException{

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
		Connection usercon = db.getConnection();
		MypageDTO dto = new MypageDTO();
		String sql = "SELECT * FROM users WHERE user_id = ?";

		try{
			PreparedStatement ps = usercon.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto = new MypageDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
				dto.setGivenNameKanji(rs.getString("given_name_kanji"));
				dto.setAddress(rs.getString("address"));
				dto.setMailAddress(rs.getString("phone_email"));
				dto.setPhoneNumber(rs.getString("phone_number"));
				UserInfo.add(dto);
			}
	}catch(SQLException e){
		e.printStackTrace();
		}
		return userList;
	}
	/**
	 * 購入履歴リスト
	 */
	public List<MypageDTO>PayOffHistoryList = new ArrayList<MypageDTO>();

	/**
	 * DBに格納されているツアープランを取得するメソッド(9/6現在:DB=test_choitabiを指定してます)
	 * ※リストを管理側に合わせるのでまだ完成してません。（9/6）
	 * @param userId
	 * @return PayOffHistoryList 購入売歴リスト
	 */
	public List<MypageDTO> PayOffHistoryListselect(int userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "test_choitabi", "root", "mysql");
		Connection payoffcon = db.getConnection();
		MypageDTO dto = new MypageDTO();
		String sql = "SELECT * FROM purchases_history WHERE user_id = ?";

		try{
			PreparedStatement ps = payoffcon.prepareStatement(sql);
			ps.setInt(1, userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				dto = new MypageDTO();
				dto.setTourId(rs.getInt("tour_id"));
				dto.setTourName(rs.getString("item_name"));
				dto.setTourName(rs.getString("tour_name"));

				PayOffHistoryList.add(dto);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}try{
			payoffcon.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
			return PayOffHistoryList;
	}
}
