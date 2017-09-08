package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.util.DBConnector;



/**
 * 管理者画面で受注情報を取得するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/07
 * @version 1.1
 */

public class KanriHistoryDAO {
		/**
	     * 受注情報をDBから検索するメソッド
	     * @param userId ユーザーID
	     * @param familyNameKanji 姓
	     * @param familyNameKanji 名
	     * @param tourId ツアーID
	     * @param trouName ツアー名
	     * @param quantity 販売数
	     * @param totalPrice 合計金額
	     * @param paymentMethod 支払い方法
	     * @param registrationDate 登録日
	     */

	    ArrayList<CartDTO> searchList=new ArrayList<CartDTO>();

	    public ArrayList<CartDTO> display(String searchName){

			DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
			Connection con = db.getConnection();
	        String sql = "select openconnect.users.userId, openconnect.users.familyNameKanji,"
	        		+ "openconnect.users.givenNameKanji, choitabi.payoff.tourId, choitabi.tours.tourName,"
	        		+ "choitabi.payoff.quantity, choitabi.tours.price, choitabi.payoff.registrationDate"
	        		+ " from (openconnect.users inner join choitabi.payoff on openconnect.users.userId = choitabi.payoff.userId) "
	        		+ "inner join choitabi.tours on choitabi.payoff.tourId = choitabi.tours.tourId";

	        if (!searchName.equals("")) {
	            sql = sql + " " + "where choitabi.tours.tourName like \"%" + searchName + "%\"";
	            }

	        try{
	            PreparedStatement ps= con.prepareStatement(sql);
	            ResultSet rs=ps.executeQuery();

	            while (rs.next()) {
	                CartDTO dto= new CartDTO();
	                dto.setUserId(rs.getInt("userId"));
	                dto.setFamilyNameKanji(rs.getString("familyNameKanji"));
	                dto.setGivenNameKanji(rs.getString("givenNameKanji"));
	                dto.setTourId(rs.getInt("tourId"));
	                dto.setTourName(rs.getString("tourName"));
	                dto.setQuantity(rs.getInt("quantity"));
	                dto.setTotalPrice(rs.getInt("price")*rs.getInt("totalPrice"));
	                dto.setRegistrationDate(rs.getString("registrationDate"));
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