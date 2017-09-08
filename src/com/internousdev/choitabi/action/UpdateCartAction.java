package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dao.UpdateCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内の商品の購入数を変更するアクション
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */


public class UpdateCartAction extends ActionSupport implements SessionAware{

    /**
     * シリアルID
     */
    private static final long serialVersionUID = 1L;


   /**
     * カートID
     */
    private int cart_id;

    /**
     * ユーザーID
     */
    private int user_id;

    /**
     * ツアーID
     */
    private int tour_id;

    /**
     * ツアー名
     */
    private String tour_name;

    /**
     * 価格
     */
    private int price;

    /**
     * 購入数
     */
    private int quantity;

    /**
     * 合計金額
     */
    private int total_price;

    /**
     * 更新処理をした件数
     */
    private int update_count;

    /**
     * カート情報
     */
    private ArrayList<CartDTO> cartList;

    /**
     * ツアー情報
     */
    private ArrayList<SelectTourDTO> tourList;

    /**
     * セッション情報
     */
    private Map<String,Object> session;



    /**
     * カートの上限処理を実行するメソッド
     * @author HINAKO HAGIWARA
     * @since 2017/09/05
     * @version 1.1
     * @return succeess or login
     */
    public String execute() throws SQLException{
        String result = LOGIN;

        if(session.containsKey("user_id")) {
        	user_id = (int) session.get("user_id");
        	UpdateCartDAO ucDao = new UpdateCartDAO();

        	SelectCartDAO scDao = new SelectCartDAO();

        	update_count = ucDao.updateCart(cart_id, user_id, quantity);
        	cartList = scDao.selectCart(user_id);

        if (cartList.size() > 0) {
        	for(int i = 0; i < cartList.size(); i++) {
        		total_price += (cartList.get(i).getPrice()) * (cartList.get(i).getQuantity());
        	}

        	result = SUCCESS;

        }result = ERROR;

        }
        return result;
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
     * ユーザーIDを取得するメソッド
     * @return user_id ユーザーID
     */
    public int getUserId() {
    	return user_id;
    }

    /**
     * ユーザーIDを格納メソッド
     * @oaram user_id ユーザーID
     */
    public void setUserId(int user_id) {
    	this.user_id = user_id;
    }

    /**
     * ツアーIDを取得するメソッド
     * @return tour_id ツアーID
     */
    public int getTourId() {
    	return tour_id;
    }

    /**
     * ツアーIDを格納するメソッド
     * @param tour_id ツアーID
     */
    public void setTourId(int tour_id) {
    	this.tour_id = tour_id;
    }

    /**
     * ツアー名を取得するメソッド
     * @return tour_name ツアー名
     */
    public String getTourName() {
    	return tour_name;
    }

    /**
     * ツアー名を格納するメソッド
     * @param tour_name ツアー名
     */
    public void setTourName(String tour_name) {
    	this.tour_name = tour_name;
    }

    /**
     * 価格を取得するメソッド
     * @return price 価格
     */
    public int getPrice() {
    	return price;
    }

    /**
     * 価格を格納するメソッド
     * @param price 価格
     */
    public void setPrice(int price) {
    	this.price = price;
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
     * 合計金額を取得するメソッド
     * @return total_price 合計金額
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
     * 更新処理をした件数を取得するメソッド
     * @return update_count 更新処理をした件数
     */
    public int getUpdateCount() {
    	return update_count;
    }

    /**
     * 更新処理をした件数を格納するメソッド
     * @param update_count 更新処理をした件数
     */
    public void setUpdateCount(int update_count) {
    	this.update_count = update_count;
    }

    /**
     * カート情報を取得するメソッド
     * @return cartList カート情報
     */
    public ArrayList<CartDTO> getCartList() {
    	return cartList;
    }

    /**
     * カート情報を格納するメソッド
     * @param cartList カート情報
     */
    public void setCartList(ArrayList<CartDTO> cartList) {
    	this.cartList = cartList;
    }

    /**
     * ツアー情報を取得するメソッド
     * @return tourList ツアー情報
     */
    public ArrayList<SelectTourDTO> getTourList() {
    	return tourList;
    }

    /**
     * ツアー情報を格納するメソッド
     * @oaram tourList ツアー情報
     */
    public void setTourList(ArrayList<SelectTourDTO> tourList) {
    	this.tourList = tourList;
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