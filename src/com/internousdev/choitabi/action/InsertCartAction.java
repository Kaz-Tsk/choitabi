package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.InsertCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.choitabi.dto.SelectCartDTO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * ツアー詳細からカートに遷移するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/06
 *@version 1.0
 */

public class InsertCartAction extends ActionSupport implements SessionAware {

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
	 * 予約人数
	 */
	private int order_count;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 合計金額
	 */
	private int total_price;

	/**
	 * カート情報
	 */
	private ArrayList<CartDTO> cartList;

	/**
	 * ツアー情報
	 */
	private ArrayList<SelectCartDTO> tourStatus;

	/**
	 * ツアー追加
	 */
	private int addCount;

	/**
	 * 小計
	 */
	private int sub_total;



	/**
	 * 実行メソッド
	 * 商品詳細からカートに購入情報を送る
	 * @return success or error
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/06
	 * @version 1.0
	 */

	public String execute() throws SQLException {
		String result = ERROR;

		if(session.containsKey("user_id")) {
			user_id = (int) session.get("user_id");
			InsertCartDAO icDao = new InsertCartDAO();
			tourStatus = icDao.tourStatus(tour_id);
			addCount = icDao.addToCart(user_id, tour_id, order_count);
			cartList = icDao.selected(user_id);

			if(cartList.size() > 0) {
				for(int i = 0; i < cartList.size(); i++) {
					total_price += (cartList.get(i).getPrice()) * (cartList.get(i).getOrderCount());
				}

				result = SUCCESS;
			}
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
	 * ユーザーIDを格納するメソッド
	 * @param user_id ユーザーID
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
	 * 予約人数を取得するメソッド
	 * @return order_count 予約人数
	 */
	public int getOrderCount() {
		return order_count;
	}

	/**
	 * 予約人数を格納するメソッド
	 * @param order_count 予約人数
	 */
	public void setOrderCount(int order_count) {
		this.order_count = order_count;
	}

    /**
     * セッションを取得するメソッド
     * @return session セッション情報
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション情報
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
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
     * @return tourStatus ツアー情報
     */
    public ArrayList<SelectCartDTO> getTourStatus() {
    	return tourStatus;
    }

    /**
     * ツアー情報を格納するメソッド
     * @param tourStatus ツアー情報
     */
    public void setTourStatus(ArrayList<SelectCartDTO> tourStatus) {
    	this.tourStatus = tourStatus;
    }

    /**
     * ツアー追加を取得するメソッド
     * @return addCount ツアー追加
     */
    public int getAddCount() {
    	return addCount;
    }

    /**
     * ツアー追加を格納するメソッド
     * @param addCount ツアー追加
     */
    public void setAddCount(int addCount) {
    	this.addCount = addCount;
    }

    /**
     * 小計を取得するメソッド
     * @return sub_total 小計
     */
    public int getSubTotal() {
    	return sub_total;
    }

    /**
     * 小計を格納するメソッド
     * @param sub_total 小計
     */
    public void setSubTotal(int sub_total) {
    	this.sub_total = sub_total;
    }

}