package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.SelectTourIdDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * カート情報を取得するクラス
 * @author KOSUKE MAEDA
 * @since 2017/8/22
 * @version 1.1
 */
public class SelectTourIdDAO {

	/**
	 * カート情報を格納するリスト
	 */
	private ArrayList<SelectTourIdDTO> selectTourIdList = new ArrayList<>();

	/**
	 * カート情報を取得する為のメソッド
	 * @author KOSUKE MAEDA
	 * @since 2017/08/22
	 * @version 1.1
	 * @param user_id ユーザーID
	 * @return result 取得できたらリストに格納してtrue、できなかったらfalseを返す
	 */
	public boolean selectTourId(int user_id) {
		boolean result = false;

		Connection con = new MySqlConnector("tabiyashi").getConnection();
		String sql = "SELECT * from cart join tour on cart.tour_id = tour.tour_id  where user_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SelectTourIdDTO dto = new SelectTourIdDTO();
				dto.setTour_id(rs.getInt("tour_id"));
				dto.setQuantity(rs.getInt("quantity"));
				dto.setUnit_price(rs.getInt("unit_price"));
				selectTourIdList.add(dto);
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * カート情報のリストを取得するメソッド
	 * @return selectTourIdList カート情報のリスト
	 */
	public ArrayList<SelectTourIdDTO> getSelectTourIdList() {
		return selectTourIdList;
	}

	/**
	 * カート情報のリストを格納するメソッド
	 * @param selectTourIdList カート情報のリスト
	 */
	public void setSelectTourIdList(ArrayList<SelectTourIdDTO> selectTourIdList) {
		this.selectTourIdList = selectTourIdList;
	}
}
