package com.internousdev.choitabi.dto;

/**
 * カート情報に関するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */
public class CartDTO {

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
	 * 購入数
	 */
	private int quantity;

	/**
	 * 価格
	 */
	private int price;

	/**
	 * 合計金額
	 */
	private int total_price;

	/**
	 * 登録日
	 */
	private String registration_date;

	/**
	 * 更新日
	 */
	private String update_date;

	/**
	 * 小計
	 */
	private int sub_total;


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
	 * 購入数を取得するメソッド
	 * @return quantity 購入数
	 */
	public int getQuqntity() {
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
	 * 合計金額を取得するメソッド
	 * @return total_price 合計金額
	 */
	public int setTotalPrice() {
		return total_price;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param total_price 合計金額
	 */
	public void getTotalPrice(int total_price) {
		this.total_price = total_price;
	}

	/**
	 * 登録日を取得するメソッド
	 * @return registration_date 登録日
	 */
	public String setRegistrationDate() {
		return registration_date;
	}

	/**
	 * 登録日を格納するメソッド
	 * @param registration_date 登録日
	 */
	public void getRegistrationDate(String registration_date) {
		this.registration_date = registration_date;
	}

	/**
	 * 更新日を取得するメソッド
	 * @return update_date 更新日
	 */
	public String setUpdateDate() {
		return update_date;
	}

	/**
	 * 更新日を格納するメソッド
	 * @param update_date 更新日
	 */
	public void getUpdateDate(String update_date) {
		this.update_date = update_date;
	}

	/**
	 * 小計を取得するメソッド
	 * @return sub_total 小計
	 */
	public int setSubTotal() {
		return sub_total;
	}

	/**
	 * 小計を格納するメソッド
	 * @param sub_total 小計
	 */
	public void getSubTotal(int sub_total) {
		this.sub_total = sub_total;
	}
}
