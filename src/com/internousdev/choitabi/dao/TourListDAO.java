package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.TourDTO;
import com.internousdev.choitabi.util.MySQLConnector;


/**
 * 商品一覧を取得するメソッド
 * @author SHUN NAGAO
 * @since 2017/09/13
 * @version 1.1
 */
public class TourListDAO {

	public ArrayList<TourDTO> select(){
		MySQLConnector db = new MySQLConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/","choitabi", "root", "mysql");
		Connection con =db.getConnection();
		ArrayList<TourDTO> itemList =new ArrayList<TourDTO>();
		TourDTO dto = null;
		String sql = "SELECT * FROM item";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				dto =new TourDTO();
				dto.setTourId(rs.getInt("tour_id"));
				dto.setTourName(rs.getString("tour_name"));
				dto.setPrice(rs.getBigDecimal("price"));
				dto.setImg(rs.getString("img"));
				dto.setComment(rs.getString("comment"));
				itemList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return itemList;
	}
}
