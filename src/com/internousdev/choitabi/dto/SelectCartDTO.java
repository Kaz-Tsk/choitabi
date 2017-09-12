package com.internousdev.choitabi.dto;



/**
 * カート情報を格納・取得するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.0
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
	    private int price;

	    /**
	     * 予約人数
	     */
	    private int order_count;

	    /**
	     * 画像パス
	     */
	    private String img;



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
	    public void setOrdercount(int order_count) {
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

	}