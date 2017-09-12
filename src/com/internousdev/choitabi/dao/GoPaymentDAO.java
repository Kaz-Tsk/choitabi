/**
 *
 */
package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * カート画面から購入画面へ遷移する
 * @author internousdev
 * @since 2017/09/08
 * @version 1.1
 */

public class GoPaymentDAO {

    /**
     * カート内の商品情報を取得しリストに格納するメソッド
     * @author SHUN NAGAO
     * @since 2017/09/08
     * @version 1.1
     * @param userId ユーザーID
     * @return cartList カート内の商品情報
     */
    public ArrayList<CartDTO> selectCartRecord(int userId){
        MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "hannari", "root","mysql");
        Connection con = db.getConnection();
        ArrayList<CartDTO> cartList= new ArrayList<CartDTO>();

        String sql = "select * from cart where userId=?";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,userId);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                CartDTO dto = new CartDTO();
                dto.setUserId(rs.getInt("userId"));//ユーザーID
                dto.setTourId(rs.getInt("TourId"));//ツアーID
                dto.setQuantity(rs.getInt("Quantity"));//購入数

                cartList.add(dto);
                }

        }catch(SQLException e){
            e.printStackTrace();

        }finally {
            try{
                con.close();

            }catch(Exception e){
                 e.printStackTrace();
                 }
            }

        return cartList;
        }

}
