package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.util.DBConnector;



/**
 * 管理者画面で予約情報を取得するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/07
 * @version 1.1
 */

public class KanriHistoryDAO {
		/**
	     * 予約情報をDBから検索するメソッド
	     * @param user_id ユーザーID
	     * @param family_name_kanji 姓
	     * @param family_name_kanji 名
	     * @param tour_id ツアーID
	     * @param trou_name ツアー名
	     * @param order_count 予約人数
	     * @param total_price 合計金額
	     * @param paymentMethod 支払い方法
	     * @param registration_date 登録日
	     */

	    ArrayList<CartDTO> searchList=new ArrayList<CartDTO>();

	    public ArrayList<CartDTO> display(String searchName){

			DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
			Connection con = db.getConnection();
	        String sql = "select openconnect.users.user_id, openconnect.users.family_name_kanji,"
	        		+ "openconnect.users.given_name_kanji, choitabi.payoff.tour_id, choitabi.tour.tour_name,"
	        		+ "choitabi.payoff.order_count, choitabi.tour.price, choitabi.payoff.registration_date"
	        		+ " from (openconnect.users inner join choitabi.payoff on openconnect.users.user_id = choitabi.payoff.user_id) "
	        		+ "inner join choitabi.tour on choitabi.payoff.tour_id = choitabi.tour.tour_id";

	        if (!searchName.equals("")) {
	            sql = sql + " " + "where choitabi.tour.tour_name like \"%" + searchName + "%\"";
	            }

	        try{
	            PreparedStatement ps= con.prepareStatement(sql);
	            ResultSet rs=ps.executeQuery();

	            while (rs.next()) {
	                CartDTO dto= new CartDTO();
	                dto.setUserId(rs.getInt("user_id"));
	                dto.setFamilyNameKanji(rs.getString("family_name_kanji"));
	                dto.setGivenNameKanji(rs.getString("given_name_kanji"));
	                dto.setTourId(rs.getInt("tour_id"));
	                dto.setTourName(rs.getString("tour_name"));
	                dto.setOrderCount(rs.getInt("order_count"));
	                dto.setTotalPrice(rs.getInt("price")*rs.getInt("total_price"));
	                dto.setRegistrationDate(rs.getString("registration_date"));
	                searchList.add(dto);
	                }

	            rs.close();
	            ps.close();
	            con.close();

	        }catch (SQLException e){
	            e.printStackTrace();
	            }

	        return searchList;
	        }

	    }