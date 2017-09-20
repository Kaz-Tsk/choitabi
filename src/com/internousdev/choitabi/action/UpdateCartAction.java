package com.internousdev.choitabi.action;

import java.math.BigDecimal;
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
 * カート内のツアーの予約人数を変更するアクション
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
    private BigDecimal price = BigDecimal.ZERO;

    /**
     * 予約人数
     */
    private int order_count;

    /**
     * 合計金額
     */
    private BigDecimal total_price = BigDecimal.ZERO;

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
        	user_id = (int) session.get("userId");

        	UpdateCartDAO ucDao = new UpdateCartDAO();
        	SelectCartDAO scDao = new SelectCartDAO();

        	updateCount = ucDao.updateCart(cart_id, user_id, order_count);
        	cartList = scDao.selectCart(user_id);

        if (cartList.size() > 0) {
        	for(int i = 0; i < cartList.size(); i++) {
        		total_price = (cartList.get(i).getPrice()).multiply(BigDecimal.valueOf(cartList.get(i).getOrder_count()));
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
    public int getCart_id() {
        return cart_id;
        }

    /**
     * カートIDを格納するメソッド
     * @param cart_id カートID
     */
    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
        }

    /**
     * ユーザーIDを取得するメソッド
     * @return user_id ユーザーID
     */
    public int getUser_id() {
    	return user_id;
    }

    /**
     * ユーザーIDを格納メソッド
     * @oaram user_id ユーザーID
     */
    public void setUser_id(int user_id) {
    	this.user_id = user_id;
    }

    /**
     * ツアーIDを取得するメソッド
     * @return tour_id ツアーID
     */
    public int getTour_id() {
    	return tour_id;
    }

    /**
     * ツアーIDを格納するメソッド
     * @param tour_id ツアーID
     */
    public void setTour_id(int tour_id) {
    	this.tour_id = tour_id;
    }

    /**
     * ツアー名を取得するメソッド
     * @return tour_name ツアー名
     */
    public String getTour_name() {
    	return tour_name;
    }

    /**
     * ツアー名を格納するメソッド
     * @param tour_name ツアー名
     */
    public void setTour_name(String tour_name) {
    	this.tour_name = tour_name;
    }

	/**
	 * 価格を取得するメソッド
	 * @return price 価格
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 価格を格納するメソッド
	 * @param price 価格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

    /**
     * 予約人数を取得するメソッド
     * @return order_count 予約人数
     */
    public int getOrder_count() {
        return order_count;
        }

    /**
     * 予約人数を格納するメソッド
     * @param order_count 予約人数
     */
    public void setOrder_count(int order_count) {
        this.order_count = order_count;
        }

    /**
     * 合計金額を取得するメソッド
     * @return total_price 合計金額
     */
    public BigDecimal getTotal_price() {
    	return total_price;
    }

    /**
     * 合計金額を格納するメソッド
     * @param total_price 合計金額
     */
    public void setTotal_price(BigDecimal total_price) {
    	this.total_price = total_price;
    }

    /**
     * 更新処理をした件数を取得するメソッド
     * @return updateCount 更新処理をした件数
     */
    public int getUpdate_count() {
    	return updateCount;
    }

    /**
     * 更新処理をした件数を格納するメソッド
     * @param updateCount 更新処理をした件数
     */
    public void setUpdate_count(int updateCount) {
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