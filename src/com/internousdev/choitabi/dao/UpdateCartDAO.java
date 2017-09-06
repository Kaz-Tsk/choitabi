package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * カート内の商品の購入数を変更するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class UpdateCartDAO {

	/**
	 * カート内の商品の購入数を変更するメソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/05
	 * @version 1.1
	 * @param quantity 購入数
	 * @param cart_id カートID
	 * @return count 更新できたら1、できなかったら0を繰り返す
	 */
    public int updateCart(int cart_id, int quantity){
        int count = 0;
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
        Connection con = db.getConnection();
        String sql ="update cart set quantity=? where cart_id=?";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, quantity);
            ps.setInt(2, cart_id);
            count = ps.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();

        }finally{
        	try{
        		con.close();
        		}catch(SQLException e){
        			e.printStackTrace();
                    }
                }
        return count;
        }

}