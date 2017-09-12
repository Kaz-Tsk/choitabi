package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;



/**
 * カート内の商品の購入数を変更するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.0
 */

public class UpdateCartDAO {
    public int updateCart(int cartId, int userId, int quantity) {
        int count = 0;
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
        Connection con = db.getConnection();
        String sql ="update cart set quantity=? where userId=?, and cartId=?";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, quantity);
            ps.setInt(2, userId);
            ps.setInt(3, cartId);
            count = ps.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();

        }finally{
        	if(con!=null) {
        		try {
        			con.close();

        		}catch(SQLException e){
        			e.printStackTrace();
                    }
                }
        }
        return count;
        }

}