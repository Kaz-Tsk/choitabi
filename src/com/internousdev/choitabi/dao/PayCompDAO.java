package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * 決済完了に関するクラス
 * @author SHUN NAGAO
 * @since 2017/09/25
 * @version 1.1
 */
public class PayCompDAO {

	/**
	 * カート・商品の情報の取得に関するメソッド
	 * @author SHUN NAGAO
	 * @since 2017/09/25
	 * @version 1.1
	 * @param user_id ユーザーID
	 * @return cartList カート情報のリスト
	 */
	public ArrayList<CartDTO> cartSelect(int user_id) {


    MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "choitabi", "root","mysql");
    Connection con = db.getConnection();

    ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();


    String sql = "select * from cart where user_id = ? and purchase_flg = 0";

    try{
    	PreparedStatement ps = con.prepareStatement(sql);
    	ps.setInt(1,user_id);
    	ResultSet rs = ps.executeQuery();
    	while(rs.next()){
    		CartDTO dto = new CartDTO();
    		dto.setUser_id(rs.getInt("user_id"));//ユーザーID
    		dto.setCart_id(rs.getInt("cart_id"));//カートID
    		dto.setTour_id(rs.getInt("tour_id"));//ツアーID
    		dto.setOrder_count(rs.getInt("order_count"));//予約人数

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


	/**
	 * 購入情報の登録に関するメソッド
	 * @author SHUN NAGAO
	 * @since 2017/09/25
	 * @version 1.1
	 * @param user_id ユーザーID
	 * @param tour_id ツアーID
	 * @param order_count 注文数
	 * @param total_price 合計金額
	 * @return addCount 登録件数
	 */
    public int payInsert(int user_id,int tour_id,int order_count/*, BigDecimal total_price*/) {
        int addCount = 0;

        MySqlConnector db = new MySqlConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","choitabi","root","mysql");
		Connection con = db.getConnection();

        String sql = "update  cart set purchase_flg=1 where user_id=? and tour_id=? and order_count=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.setInt(2, tour_id);
            ps.setInt(3, order_count);
            /*ps.setBigDecimal(4, total_price);*/
            addCount = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return addCount;
    }


    /**
     * カートテーブル内情報の削除に関するメソッド
     * @author SHUN NAGAO
     * @since 2017/09/25
     * @version 1.1
     * @param user_id ユーザーID
     * @return ret 削除件数
     */
    public int cartDelete(int user_id){
    	MySqlConnector dbCon = new MySqlConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/","choitabai","root","mysql");
    	Connection con = dbCon.getConnection();
    	int ret = 0;
    	String sql = "delete from carts where user_id = ?";
    	try{
    		PreparedStatement ps = con.prepareStatement(sql);
    		ps.setInt(1,user_id);

    		ret = ps.executeUpdate();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}finally{
    			try{
    				con.close();
    			}catch (SQLException e){
    				e.printStackTrace();
    			}
    	}
    	return ret;
    }

	}
