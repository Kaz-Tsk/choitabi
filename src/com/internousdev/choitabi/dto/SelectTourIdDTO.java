package com.internousdev.choitabi.dto;

/**
 * 購入情報を格納・取得するクラス
 * @author TOSHIKI TACHIBANA
 * @since 2017/8/22
 * @version 1.1
 */

public class SelectTourIdDTO {
	/** ツアーID */
	private int tour_id;
	/** 購入数 */
	private int quantity;
	/** 価格 */
	private int unit_price;

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
	 * 価格を取得するメソッド
	 * @return unit_price 価格
	 */
	public int getUnit_price() {
		return unit_price;
	}

	/**
	 * 価格を格納するメソッド
	 * @param unit_price 価格
	 */
	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}
}
