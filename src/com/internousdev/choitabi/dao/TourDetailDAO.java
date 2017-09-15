package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.TourDTO;
import com.internousdev.util.DBConnector;



/**
 * @author HINAKO HAGIWARA
 * @since 2017/09/13
 * @version 1.0
 */

public class TourDetailDAO {

	public ArrayList<TourDTO> select(int tour_id) {
		/*動作化確認*/System.out.println("TourDetailDAO - 取得ID：" + tour_id);
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","choitabi","root","mysql");
		Connection con = db.getConnection();
		TourDTO dto = new TourDTO();
		ArrayList<TourDTO> tourList = new ArrayList<TourDTO>();
		String sql = "SELECT * FROM tour where tour_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tour_id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				dto.setTour_id(rs.getInt("tour_id"));
				dto.setTour_name(rs.getString("tour_name"));
				dto.setPrice(rs.getBigDecimal("price"));
				dto.setDeparture(rs.getString("departure"));
				dto.setRegion(rs.getString("region"));
				dto.setPrefectures(rs.getString("prefectures"));
				dto.setTheme(rs.getString("theme"));
				dto.setComment(rs.getString("comment"));
				dto.setImg(rs.getString("img"));
				dto.setPersons(rs.getInt("persons"));
				tourList.add(dto);

			}

		}
		catch(SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				con.close();

			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

		return tourList;

	}

}
