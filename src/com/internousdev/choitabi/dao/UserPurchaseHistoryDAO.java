/**
 *
 */
package com.internousdev.choitabi.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.HistoryDTO;
import com.internousdev.util.DBConnector;

/**
 * 購入履歴に関するクラス
 * @author KAZUYUKI TASAKI
 * @since 2017/9/14
 *@version 1.0
 */
public class UserPurchaseHistoryDAO {

	/**
	 * 購入履歴をリスト化
	 */
	public ArrayList<HistoryDTO>UserPurchaseHistoryList = new ArrayList<HistoryDTO>();

	/**
	 *購入履歴に格納するメソッド
	 * @param userId
	 * @return UserPurchaseHistoryList 購入履歴
	 */
	public ArrayList<HistoryDTO>UserPurchaseHistoryList(int userId){
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "choitabi", "root","mysql");
		Connection con = db.getConnection();
		ArrayList<HistoryDTO>UserPurchaseHistoryList = new ArrayList<HistoryDTO>();

		String sql = "select tour_name,order_count,cart.price,date_format(registration_date,'%Y/%m/%d')  AS 'registration_date' from cart left join tour on cart.tour_id = tour.tour_id where user_id=? and purchase_flg=1";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				HistoryDTO dto = new HistoryDTO();
				dto.setCounts(rs.getInt("order_count"));
				dto.setRegistrationAt(rs.getString("registration_date"));
				dto.setTourName(rs.getString("tour_name"));
				dto.setPrice(rs.getBigDecimal("cart.price"));
				dto.setSubtotal(dto.getPrice().multiply(BigDecimal.valueOf(dto.getCounts())));

				UserPurchaseHistoryList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return UserPurchaseHistoryList;
	}
}
