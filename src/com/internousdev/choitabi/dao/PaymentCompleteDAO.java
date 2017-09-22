
package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.choitabi.util.ChoitabiDBConnector;
/**
 * 決済に関するDAO
 * @author SHUN NAGAO
 * @since 2017/09/08
 * @version 1.1
 */
public class PaymentCompleteDAO {


    /**
     * カートテーブルの情報を、購入情報テーブルにインサートするメソッド
     * @param user_id ユーザーＩＤ
     * @return ret 成否を格納する変数
     * @author SHUN NAGAO
     * @since 2017/09/08
     * @version 1.1
     */
    public int purchase(int user_id) {
        int ret = 0;
        ChoitabiDBConnector db = new ChoitabiDBConnector();
        Connection con = null;

        try {
        con = db.createConnection();
        CartDTO dto = new CartDTO();
        String select = "select * from cart where userId = ?";
        String insert = "insert into purchases(user_id, tour_id, order_count, resistlation_date) values(?, ?, ?, ?)";


            PreparedStatement ps1 = con.prepareStatement(select);
            ps1.setInt(1, user_id);
            ResultSet rs = ps1.executeQuery();

            while (rs.next()) {
                dto.setUser_id(rs.getInt("cart_id"));
                dto.setTour_id(rs.getInt("tour_id"));
                dto.setOrder_count(rs.getInt("order_count"));

                PreparedStatement ps2 = con.prepareStatement(insert);
                ps2.setInt(1, user_id);
                ps2.setInt(2, dto.getTour_id());
                ps2.setInt(3, dto.getOrder_count());

                ret += ps2.executeUpdate();
                }

        } catch (SQLException e) {
        	e.printStackTrace();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        try {
        	con.close();

        } catch (SQLException e) {
        	e.printStackTrace();
        }

        return ret;
    }


    /**
     * カート情報を削除するメソッド
     * @param user_id ユーザーＩＤ
     * @return ret 成否を格納する変数
     * @author SHUN NAGAO
     * @since 2017/09/08
     * @version 1.1
     */
    public int clean(int user_id) {
    	int ret = 0;
    	Connection con = null;
    	try {
    		ChoitabiDBConnector db = new ChoitabiDBConnector();
    		con = db.createConnection();
    		String cleanCart = "delete from cart where user_id = ?";


    		PreparedStatement ps1 = con.prepareStatement(cleanCart);
    		ps1.setInt(1, user_id);
    		ret = ps1.executeUpdate();

    	} catch (SQLException e) {
    		e.printStackTrace();

    	} catch (Exception e) {
    		e.printStackTrace();
    	}

        try {
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
            }

        return ret;
        }




}
