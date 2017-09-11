
package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.choitabi.util.DBConnector;
/**
 * 決済に関するDAO
 * @author SHUN NAGAO
 * @since 2017/09/08
 * @version 1.1
 */
public class PaymentCompleteDAO {


    /**
     * カートテーブルの情報を、購入情報テーブルにインサートするメソッド
     * @param userId ユーザーＩＤ
     * @return ret 成否を格納する変数
     * @author SHUN NAGAO
     * @since 2017/09/08
     * @version 1.1
     */
    public int purchase(int userId) {
        int ret = 0;
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/test_choitabi", "choitabi", "root", "mysql");
        Connection con = null;

        con = db.createConnection();
        CartDTO dto = new CartDTO();
        String select = "select * from cart where userId = ?";
        String insert = "insert into payoff(userId, itemId, orderCount) values(?, ?, ?)";

        try {
            PreparedStatement ps1 = con.prepareStatement(select);
            ps1.setInt(1, userId);
            ResultSet rs = ps1.executeQuery();

            while (rs.next()) {
                dto.setUserId(rs.getInt("userId"));
                dto.setTourId(rs.getInt("TourId"));
                dto.setQuantity(rs.getInt("Quantity"));

                PreparedStatement ps2 = con.prepareStatement(insert);
                ps2.setInt(1, userId);
                ps2.setInt(2, dto.getTourId());
                ps2.setInt(3, dto.getQuantity());

                ret += ps2.executeUpdate();
                }

        } catch (SQLException e) {
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
     * @param userId ユーザーＩＤ
     * @return ret 成否を格納する変数
     * @author SHUN NAGAO
     * @since 2017/09/08
     * @version 1.1
     */
    public int clean(int userId) {
        int ret = 0;
        DBConnector db = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/test_choitabi", "choitabi", "root", "mysql");
        Connection con = db.createConnection();
        String cleanCart = "delete from cart where userId = ?";

        try {
            PreparedStatement ps1 = con.prepareStatement(cleanCart);
            ps1.setInt(1, userId);
            ret = ps1.executeUpdate();

        } catch (SQLException e) {
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
