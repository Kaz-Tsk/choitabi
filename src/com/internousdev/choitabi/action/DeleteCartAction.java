package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.DeleteCartDAO;
import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * カートの中身を削除するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class DeleteCartAction extends ActionSupport implements SessionAware{

    /**
     * 合計金額
     */
    private int total_price;

    /**
     * 購入数
     */
    private int quantity;

    /**
     * ユーザーID
     */
    private int user_id;

    /**
     * カートID
     */
    private int cart_id;

    /**
     * 削除処理をした件数
     */
    private int del_count;

    /**
     *  セッション情報
     */
    private Map<String, Object> session;

    /**
     * 検索したカート内の商品の情報を入れるリスト
     */
    private List<CartDTO> cart_list = new ArrayList<>();



    /**
     * カートの商品を削除処理をする実行メソッド
     * @author HINAKO HAGIWWARA
     * @since 2017/09/05
     * @version 1.1
     */
    public String execute() throws SQLException{
        String result =ERROR;

        if(session.get("user_id") != null){
            int user_id = (int) (session).get("user_id");

            DeleteCartDAO dao = new DeleteCartDAO();
            SelectCartDAO dao2 =new SelectCartDAO();

            del_count= dao.delete(user_id,cart_id);

            if(del_count>0){
                cart_list =dao2.select_cart(user_id);

                if(cart_list.size() > 0){
                    for(int i = 0; i < cart_list.size(); i++ ){
                        total_price += (cart_list.get(i).getPrice())*(cart_list.get(i).getQuantity());
                        }

                    result =SUCCESS;
                    }
                }
            }

        return result;
        }


    /**
     * ユーザーIDを取得するためのメソッド
     * @return user_id ユーザーID
     */
    public int getUserId() {
        return user_id;
        }

    /**
     * ユーザーIDを格納するためのメソッド
     * @param user_id ユーザーID
     */
    public void setUserId(int user_id) {
        this.user_id = user_id;
        }

    /**
     * セッションを取得するためのメソッド
     * @return session セッション情報
     */
    public Map<String, Object> getSession() {
        return session;
        }

    /**
     * セッションを格納するためのメソッド
     * @param session セッション情報
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
        }

    /**
     * カート内の商品情報を取得するためのメソッド
     * @return cart_list カート内の商品情報
     */
    public List<CartDTO> getCartList() {
        return cart_list;
        }

    /**
     * カート内の商品情報を格納するためのメソッド
     * @param cart_list カート内の商品情報
     */
    public void setCartList(List<CartDTO> cart_list) {
        this.cart_list = cart_list;
        }

    /**
     * 合計金額を取得するメソッド
     * @return amount 合計金額
     */
    public int getTotalPrice() {
        return total_price;
        }

    /**
     * 合計金額を格納するメソッド
     * @param total_price 合計金額
     */
    public void setTotalPrice(int total_price) {
        this.total_price = total_price;
        }

    /**
     * カート内の購入数を取得するメソッド
     * @return quantity 購入数
     */
    public int getQuantity() {
        return quantity;
        }

    /**
     * カート内の購入数を格納するメソッド
     * @param quantity 購入数
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        }

    /**
     * 削除処理をした件数を取得するメソッド
     * @return del_count 削除処理をした件数
     */
    public int getDelCount() {
        return del_count;
        }

    /**
     * 削除処理をした件数を格納するメソッド
     * @param del_count 削除処理をした件数
     */
    public void setDelCount(int del_count) {
        this.del_count = del_count;
        }

    /**
     * カートIDを取得するメソッド
     * @return cart_id カートID
     */
    public int getCartId() {
        return cart_id;
        }

    /**
     * カートIDを格納するメソッド
     * @param cart_id カートID
     */
    public void setCartId(int cart_id) {
        this.cart_id = cart_id;
        }

}