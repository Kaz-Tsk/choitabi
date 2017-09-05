package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * カートの商品の数を増減
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class UpdateCartDAO {
    public int updateCart(int cart_id,int user_id,int quantity){
        int update_count = 0;
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","openconnect","root","mysql");
        Connection con = (Connection) db.getConnection();
        String sql ="update cart set quantity=? where user_id=? and cart_id=?";

        try{
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, quantity);
            ps.setInt(2, user_id);
            ps.setInt(3, cart_id);
            update_count = ps.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();

        }finally{
            if(con!=null){
                try{
                    con.close();

                }catch(SQLException e){
                    e.printStackTrace();
                    }
                }
            }
        return update_count;
        }

}