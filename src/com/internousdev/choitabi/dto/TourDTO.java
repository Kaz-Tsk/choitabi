package com.internousdev.choitabi.dto;

import java.math.BigDecimal;



/** ツアー情報に関するDTO
 * @author HINAKO HAGIWARA
 * @since 2017/09/13
 * @version 1.0
 */

public class TourDTO {

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
	private int persons;

	/**
	 * 出発地
	 */
	private String departure;

	/**
	 * 地方
	 */
	private String region;

	/**
	 * 都道府県
	 */
	private String prefectures;

	/**
	 * テーマ
	 */
	private String theme;

	/**
	 * 詳細文
	 */
	private String comment;

	/**
	 * 画像パス
	 */
	private String img;

    /**
     * ツアーリストから値を取得するためのインデックス番号
     */
    private int index;



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
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 価格を格納するメソッド
	 * @oaram price 価格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 予約人数を取得するメソッド
	 * @return persons 予約人数
	 */
	public int getPersons() {
		return persons;
	}

	/**
	 * 予約人数を格納するメソッド
	 * @param persons 予約人数
	 */
	public void setPersons(int persons) {
		this.persons = persons;
	}

	/**
	 * 出発地を取得するメソッド
	 * @return departure 出発地
	 */
	public String getDeparture() {
		return departure;
	}

	/**
	 * 出発地を格納するメソッド
	 * @param departure 出発地
	 */
	public void setDeparture(String departure) {
		this.departure = departure;
	}

	/**
	 * 地方を取得するメソッド
	 * @return region 地方
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * 地方を格納するメソッド
	 * @oaram region 地方
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * 都道府県を取得するメソッド
	 * @return prefectures 都道府県
	 */
	public String getPrefectures() {
		return prefectures;
	}

	/**
	 * 都道府県を格納するメソッド
	 * @param prefectures 都道府県
	 */
	public void setPrefectures(String prefectures) {
		this.prefectures = prefectures;
	}

	/**
	 * テーマを取得するメソッド
	 * @return theme テーマ
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * テーマを格納するメソッド
	 * @param theme テーマ
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 * ツアー詳細文を取得するメソッド
	 * @return comment ツアー詳細文
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * ツアー詳細文を格納するメソッド
	 * @param comment ツアー詳細文
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 画像パスを取得するメソッド
	 * @return img 画像パス
	 */
	public String getImg() {
		return img;
	}

	/**
	 * 画像パスを格納するメソッド
	 * @param img 画像パス
	 */
	public void setImg(String img) {
		this.img = img;
	}

    /**
     * ツアーリストから値を取得するためのインデックス番号を取得するメソッド
     * @return index ツアーリストから値を取得するためのインデックス番号
     */
    public int getIndex() {
        return index;
    }

    /**
     * ツアーリストから値を取得するためのインデックス番号を格納するメソッド
     * @param index ツアーリストから値を取得するためのインデックス番号
     */
    public void setIndex(int index) {
        this.index = index;
    }

}
