package com.internousdev.choitabi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.UpdateCartDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内の商品の購入数を変更するアクション
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */


public class UpdateCartAction extends ActionSupport implements SessionAware{

   /**
     * カートID
     */
    private int cart_id;

    /**
     * 購入数
     */
    private int quantity;

    /**
     * セッション情報
     */
    private Map<String,Object> session;



    /**
     * カート内の商品の購入数を変更するメソッド
     * @author HINAKO HAGIWARA
     * @since 2017/09/05
     * @version 1.1
     * @return result 結果を返す
     */
    public String execute() {
        String ret = ERROR;

        UpdateCartDAO dao = new UpdateCartDAO();

        if (dao.updateCart(cart_id, quantity) > 0) {
        	ret = SUCCESS;
        }

        return ret;

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

    /**
     * 購入数を取得するメソッド
     * @return quantity 購入数
     */
    public int getQuantity() {
        return quantity;
        }

    /**
     * 購入数を格納するメソッド
     * @param quantity 購入数
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        }

    /**
     * セッション情報を取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
        }

    /**
     * セッション情報を格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
        }

}