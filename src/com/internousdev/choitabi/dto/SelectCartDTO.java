package com.internousdev.choitabi.dto;

import java.math.BigDecimal;

/**
 * カート情報を格納・取得するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class SelectCartDTO {

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
	    private BigDecimal price;

	    /**
	     * 予約人数
	     */
	    private int order_count;

	    /**
	     * 画像パス
	     */
	    private String img;

	    /**
	     * 決済フラグ
	     */
	    private int purchase_flg;



	    /**
	     * ツアーIDを取得するメソッド
	     * @return tour_id ツアーID
	     */
	    public int getTour_id(){
	        return tour_id;
	    }

	    /**
	     * ツアーIDを格納するメソッド
	     * @param tour_id ツアーID
	     */
	    public void setTour_id(int tour_id){
	        this.tour_id = tour_id;
	    }

	    /**
	     * ツアー名を取得するメソッド
	     * @return tour_name ツアー名
	     */
	    public String getTour_name(){
	        return tour_name;
	    }

	    /**
	     * ツアー名を格納するメソッド
	     * @param tour_name ツアー名
	     */
	    public void setTour_name(String tour_name){
	        this.tour_name = tour_name;
	    }

	    /**
	     * 価格を取得するメソッド
	     * @return price 価格
	     */
	    public BigDecimal getPrice(){
	        return price;
	    }

	    /**
	     * 価格を格納するメソッド
	     * @param price 価格
	     */
	    public void setPrice(BigDecimal price){
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
	     * 画像パスを取得するメソッド
	     * @return img 画像パス
	     */
	    public String getImg(){
	        return img;
	    }

	    /**
	     * 画像パスを格納するメソッド
	     * @param img 画像パス
	     */
	    public void setImg(String img){
	        this.img = img;
	    }

	    /**
	     * 決済フラグを取得するメソッド
	     */
	    public int setPurchase_flg() {
	    	return purchase_flg;
	    }

	    /**
	     * 決済フラグを格納するメソッド
	     */
	    public void getPurchase_flg(int purchase_flg) {
	    	this.purchase_flg = purchase_flg;
	    }

	}