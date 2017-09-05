package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.UpdateCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * カートの購入数を変更するアクション
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 */
public class UpdateCartAction extends ActionSupport{

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
	 * カート情報
	 */
	private ArrayList<CartDTO> cart_list;

	/**
	 * セッション情報
	 */
	private Map<String, Object> session;


	/**
	 * カート画面で購入数を変更するメソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/05
	 * @return result 結果を返す
	 */
	public String execute() {
		String ret = ERROR;

		UpdateCartDAO dao = new UpdateCartDAO();

		if(dao.cart_update(quantity, cart_id) > 0) {
			ret =SUCCESS;
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
	 * カート情報を取得するメソッド
	 * @return cart_list カート情報
	 */
	public ArrayList<CartDTO> getCartList() {
		return cart_list;
	}

	/**
	 * カート情報を格納するメソッド
	 * @param cart_list カート情報
	 */
	public void setCratList(ArrayList<CartDTO> cart_list) {
		this.cart_list = cart_list;
	}

	/**
	 * セッション情報を取得するメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSeesion() {
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
