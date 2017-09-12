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
 * @version 1.0
 */

public class UpdateCartAction extends ActionSupport implements SessionAware{

    /**
     * シリアルID
     */
    private static final long serialVersionUID = 1L;

   /**
     * カートID
     */
    private int cartId;

    /**
     * ユーザーID
     */
    private int userId;

    /**
     * ツアーID
     */
    private int tourId;

    /**
     * ツアー名
     */
    private String tourName;

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
    private int totalPrice;

    /**
     * 更新処理をした件数
     */
    private int updateCount;

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
     * @version 1.0
     * @return succeess or login
     */

    public String execute() throws SQLException{
        String result = LOGIN;

        if(session.containsKey("userId")) {
        	userId = (int) session.get("userId");
        	UpdateCartDAO ucDao = new UpdateCartDAO();

        	SelectCartDAO scDao = new SelectCartDAO();

        	updateCount = ucDao.updateCart(cartId, userId, quantity);
        	cartList = scDao.selectCart(userId);

        if (cartList.size() > 0) {
        	for(int i = 0; i < cartList.size(); i++) {
        		totalPrice += (cartList.get(i).getPrice()) * (cartList.get(i).getQuantity());
        	}

        	result = SUCCESS;

        }result = ERROR;

        }
        return result;
    }



    /**
     * カートIDを取得するメソッド
     * @return cartId カートID
     */
    public int getCartId() {
        return cartId;
        }

    /**
     * カートIDを格納するメソッド
     * @param cartId カートID
     */
    public void setCartId(int cartId) {
        this.cartId = cartId;
        }

    /**
     * ユーザーIDを取得するメソッド
     * @return userId ユーザーID
     */
    public int getUserId() {
    	return userId;
    }

    /**
     * ユーザーIDを格納メソッド
     * @oaram userId ユーザーID
     */
    public void setUserId(int userId) {
    	this.userId = userId;
    }

    /**
     * ツアーIDを取得するメソッド
     * @return tourId ツアーID
     */
    public int getTourId() {
    	return tourId;
    }

    /**
     * ツアーIDを格納するメソッド
     * @param tourId ツアーID
     */
    public void setTourId(int tourId) {
    	this.tourId = tourId;
    }

    /**
     * ツアー名を取得するメソッド
     * @return tourName ツアー名
     */
    public String getTourName() {
    	return tourName;
    }

    /**
     * ツアー名を格納するメソッド
     * @param tourName ツアー名
     */
    public void setTourName(String tourName) {
    	this.tourName = tourName;
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
     * @return totalPrice 合計金額
     */
    public int getTotalPrice() {
    	return totalPrice;
    }

    /**
     * 合計金額を格納するメソッド
     * @param totalPrice 合計金額
     */
    public void setTotalPrice(int totalPrice) {
    	this.totalPrice = totalPrice;
    }

    /**
     * 更新処理をした件数を取得するメソッド
     * @return updateCount 更新処理をした件数
     */
    public int getUpdateCount() {
    	return updateCount;
    }

    /**
     * 更新処理をした件数を格納するメソッド
     * @param updateCount 更新処理をした件数
     */
    public void setUpdateCount(int updateCount) {
    	this.updateCount = updateCount;
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