/**
 *
 */
package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.Test_TourDTO;

/**
 * ツアー詳細表示に関するクラス
 * @author SHUN NAGAO
 * @since 2017/09/14
 * @version 1.0
 */
public class Test_GoTourDetailDAO {
	public ArrayList<Test_TourDTO> searchList=new ArrayList<Test_TourDTO>();

	/**
	 *種類IDでツアー詳細を取得しリストに格納するメソッド
	 * @param sortId 種類ID
	 * @return searchList ツアー情報
	 * @author SHUN NAGAO
	 * @since 2017/09/14
	 * @version 1.0
	 */
	public ArrayList<Test_TourDTO> select(int sortId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/","choitabi", "root","mysql");
		Connection con = db.getConnection();
		String sql;
		 sql = "select * from items where sort_id=? and del_key =false";
		try{
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setInt(1, sortId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				Test_TourDTO dto=new Test_TourDTO();
				dto.setSortId(rs.getInt("sort_id"));
				dto.setTourId(rs.getInt("tour_id"));
				dto.setTourName(rs.getString("tour_name"));
				dto.setPrice(rs.getFloat("price"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setTourDetail(rs.getString("tour_detail"));
				dto.setTourImg01(rs.getString("tour_img01"));
				dto.setTourImg02(rs.getString("tour_img02"));
				dto.setImgPath(rs.getString("img_path"));
				searchList.add(dto);
			}
		} catch (SQLException e ) {
		   e.printStackTrace() ;
		} finally {
			try{
				con.close();
		}catch(SQLException e){
			e.printStackTrace();
			}
	}
		return searchList;
	}

	/**
	 *ツアーIDでツアー詳細を取得しリストに格納するメソッド
	 * @param tourId ツアーID
	 * @return searchList ツアー情報
	 * @author SHUN NAGAO
	 * @since 2017/09/14
	 * @version 1.0
	 */
	public ArrayList<Test_TourDTO> selectbyTour(int tourId) {
		DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/","choitabi", "root","mysql");
		Connection con = db.getConnection();
		Test_TourDTO dto = new Test_TourDTO();
		ArrayList<Test_TourDTO> tourList = new ArrayList<Test_TourDTO>();
		String sql;
		 sql = "select * from tour where item_id=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql) ;
			ps.setInt(1, tourId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				dto.setTourId(rs.getInt("tour_id"));
				dto.setTourName(rs.getString("tour_name"));
				dto.setPrice(rs.getFloat("price"));
				dto.setStocks(rs.getInt("stocks"));
				dto.setTourDetail(rs.getString("tour_detail"));
				dto.setImgPath(rs.getString("img_path"));
				tourList.add(dto);
			}
		} catch (SQLException e ) {
		   e.printStackTrace() ;
		} finally {
			try{
				con.close();
		}catch(SQLException e){
			e.printStackTrace();
			}
	}
		return tourList;
	}
}


