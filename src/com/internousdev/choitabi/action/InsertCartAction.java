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
 * 商品詳細からカートに遷移するクラス
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
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 合計金額
	 */
	private int totalPrice;

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
	private int subTotal;



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

		if(session.containsKey("userId")) {
			userId = (int) session.get("userId");
			InsertCartDAO icDao = new InsertCartDAO();
			tourStatus = icDao.tourStatus(tourId);
			addCount = icDao.addToCart(userId, tourId, quantity);
			cartList = icDao.selected(userId);

			if(cartList.size() > 0) {
				for(int i = 0; i < cartList.size(); i++) {
					quantity += (cartList.get(i).getPrice()) * (cartList.get(i).getQuantity());
				}

				result = SUCCESS;
			}
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
	 * ユーザーIDを格納するメソッド
	 * @param userId ユーザーID
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
     * @return totalPrice 合計金額
     */
    public int getTtalPrice() {
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
     * @return subTotal 小計
     */
    public int getSubTotal() {
    	return subTotal;
    }

    /**
     * 小計を格納するメソッド
     * @param subTotal 小計
     */
    public void setSubTotal(int subTotal) {
    	this.subTotal = subTotal;
    }

}