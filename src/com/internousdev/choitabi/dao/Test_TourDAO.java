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
import com.internousdev.util.DBConnector;

/**
 * ツアー一覧画面遷移に関するクラス
 * @author SHUN NAGAO
 * @since 2017/09/14
 * @version 1.0
 */
public class Test_TourDAO {

	/**
	 * ツアーの種類を取得しリストに格納するメソッド
	 * @return Tour ツアー情報
	 * @author SHUN NAGAO
	 * @since 2017/09/14
	 * @version 1.0
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
        public ArrayList<Test_TourDTO> select() throws IllegalAccessException, InstantiationException{
        	DBConnector dbc = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "choitabi", "root", "mysql");
        	Connection con = dbc.getConnection();
        	ArrayList<Test_TourDTO> Tour = new ArrayList<Test_TourDTO>();
        	String sql ="select * from sorts";


        	try{
        		PreparedStatement ps = con.prepareStatement(sql);
        		ResultSet rs = ps.executeQuery();
        		while(rs.next()){
        			Test_TourDTO dto = new Test_TourDTO();;
        			dto.setTourGenre(rs.getString("sorts")); //種類
        			dto.setSortId(rs.getInt("sort_id")); //種類ID
        			dto.setImgPath(rs.getString("sort_img")); //イメージパス
        			Tour.add(dto);
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
        	return Tour;
        	}
}








