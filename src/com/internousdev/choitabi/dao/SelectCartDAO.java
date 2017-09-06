package com.internousdev.choitabi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.SelectCartDTO;
import com.internousdev.util.DBConnector;
import com.mysql.jdbc.Connection;

/**
 * カート情報を取得するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/052
 * @version 1.1
 */
public class SelectCartDAO {

	/**
	 * カート情報を格納するリスト
	 */
	private ArrayList<SelectCartDTO> selectList = new ArrayList<>();
	private int total_price;

	/**
	 * カート情報を取得する為のメソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/05
	 * @version 1.1
	 * @param user_id ユーザーID
	 * @return result 取得できたらリストに格納してtrue、できなかったらfalseを返す
	 */
	public boolean selectCart(int user_id) {

		boolean result = false;
		total_price = 0;

		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
        Connection con = (Connection) db.getConnection();
		String sql = "select * from cart join tour on cart.tour_id = tour.tour_id where user_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SelectCartDTO dto = new SelectCartDTO();
				dto.setCartId(rs.getInt("cart_id"));
				dto.setTourName(rs.getString("tour_name"));
				dto.setQuantity(rs.getInt("quantity"));
				dto.setPrice(rs.getInt("price"));
				total_price += ((rs.getInt("price")) * (rs.getInt("quantity")));
				selectList.add(dto);
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
	 * @return selectList カート情報のリスト
	 */
	public ArrayList<SelectCartDTO> getSelectList() {
		return selectList;
	}

	/**
	 * カート情報のリストを格納するメソッド
	 * @param selectList カート情報のリスト
	 */
	public void setSelectList(ArrayList<SelectCartDTO> selectList) {
		this.selectList = selectList;
	}

	/**
	 * 合計を取得するメソッド
	 * @return totalprice
	 */
	public int getTotalPrice() {
		return total_price;
	}

	/**
	 * 合計を格納する
	 * @param totalprice 合計
	 */
	public void setTotalPrice(int total_price) {
		this.total_price = total_price;
	}

}
