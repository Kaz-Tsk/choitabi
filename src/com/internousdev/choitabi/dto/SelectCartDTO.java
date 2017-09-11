package com.internousdev.choitabi.dto;



/**
 * カート情報を格納・取得するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.0
 */

public class SelectCartDTO {

	    /**
	     * 商品ID
	     */
	    private int tourId;

	    /**
	     * 商品名
	     */
	    private String tourName;

	    /**
	     * 価格
	     */
	    private int price;

	    /**
	     * 注文数
	     */
	    private int quantity;

	    /**
	     * 画像パス
	     */
	    private String imgAddress001;



	    /**
	     * ツアーIDを取得するメソッド
	     * @return tourId ツアーID
	     */
	    public int getTourId(){
	        return tourId;
	    }

	    /**
	     * ツアーIDを格納するメソッド
	     * @param tourId ツアーID
	     */
	    public void setTourId(int tourId){
	        this.tourId = tourId;
	    }

	    /**
	     * ツアー名を取得するメソッド
	     * @return tourName ツアー名
	     */
	    public String getTourName(){
	        return tourName;
	    }

	    /**
	     * ツアー名を格納するメソッド
	     * @param tourName ツアー名
	     */
	    public void setTourName(String tourName){
	        this.tourName = tourName;
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

	    /**
	     * ツアーIDを取得するメソッド
	     * @return tourId ツアーID
	     */
	    public String getImgAddress001(){
	        return imgAddress001;
	    }

	    /**
	     * ツアーIDを格納するメソッド
	     * @param tourId ツアーID
	     */
	    public void setImgAddress001(String imgAddress001){
	        this.imgAddress001 = imgAddress001;
	    }

	}