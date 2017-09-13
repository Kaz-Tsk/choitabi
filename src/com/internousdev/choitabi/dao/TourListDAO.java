package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.TourDTO;
import com.internousdev.util.DBConnector;

/**
 * 商品一覧画面遷移に関するメソッド
 * @author SHUN NAGAO
 * @since 2017/09/13
 * @version 1.1
 */

public class TourListDAO {

    ArrayList<TourDTO> selectList=new ArrayList<TourDTO>();

    public ArrayList<TourDTO> display(String theme, String region){
    	DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
        Connection con=db.getConnection();
        String sql = "select tour_id,tour_name,price,img from tour where theme = '"+theme+"'"+"'"+region+"'";

        try{
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                TourDTO dto= new TourDTO();
                dto.setTourId(rs.getInt("tour_id"));
                dto.setTourName(rs.getString("tour_name"));
                dto.setPrice(rs.getBigDecimal("price"));
                dto.setImg(rs.getString("img"));
                selectList.add(dto);
                }

            rs.close();
            ps.close();
            con.close();

        }catch (SQLException e){
            e.printStackTrace();
            }
        return selectList;
        }

}