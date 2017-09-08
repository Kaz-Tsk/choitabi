package com.internousdev.choitabi.dto;

/**
 * カート情報を格納・取得するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class SelectCartDTO {

	    /**
	     * 商品ID
	     */
	    private int tour_id;

	    /**
	     * 商品名
	     */
	    private String tour_name;

	    /**
	     * 価格
	     */
	    private int price;

	    /**
	     * 注文数
	     */
	    private int quantity;



	    /**
	     * ツアーIDを取得するメソッド
	     * @return tour_id ツアーID
	     */
	    public int getTourId(){
	        return tour_id;
	    }

	    /**
	     * ツアーIDを格納するメソッド
	     * @param tour_id ツアーID
	     */
	    public void setTourId(int tour_id){
	        this.tour_id = tour_id;
	    }

	    /**
	     * ツアー名を取得するメソッド
	     * @return tour_name ツアー名
	     */
	    public String getTourName(){
	        return tour_name;
	    }

	    /**
	     * ツアー名を格納するメソッド
	     * @param tour_name ツアー名
	     */
	    public void setTourName(String tour_name){
	        this.tour_name = tour_name;
	    }

	    /**
	     * 価格を取得するメソッド
	     * @return price 価格
	     */
	    public int getPrice(){
	        return price;
	    }

	    /**
	     * 価格を格納するメソッド
	     * @param price 価格
	     */
	    public void setPrice(int price){
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

	}