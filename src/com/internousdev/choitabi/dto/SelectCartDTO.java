/**
 *
 */
package com.internousdev.choitabi.dto;

/**
 * カート情報を格納・取得するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class SelectCartDTO {

	/**
	 * カートID
	 */
	private int cart_id;

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
	 * 数量を取得するメソッド
	 * @return quantity 数量
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * 数量を格納するメソッド
	 * @param quantity 数量
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
	 *
	 * @param price 価格
	 */
	public void setPrice(int price) {
		this.price = price;
	}

}
