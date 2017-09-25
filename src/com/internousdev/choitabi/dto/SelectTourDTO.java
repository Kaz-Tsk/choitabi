package com.internousdev.choitabi.dto;

/**
 * ツアー情報を取得・格納するDTOクラス。
 * @author:YUKA MATSUMURA
 *@since:2017/09/05
 *@version:1.1
 * */
public class SelectTourDTO {


	/**
	 *ツアーID
	 * */
	private int tourId;

	/**
	 *ツアー名
	 * */
	private String tourName;

	/**
	 *価格
	 * */
	private int price;

	/**
	 *出発地
	 * */
	private String departure;

	/**
	 *エリア
	 * */
	private String region;

	/**
	 *都道府県
	 * */
	private String prefectures;

	/**
	 *テーマ
	 * */
	private String theme;

	/**
	 *コメント
	 * */
	private String comment;

	/**
	 *画像URL
	 * */
	private String img;


	/*以下、各変数のgetter/setter----------------------------*/


	/**
	 *ツアーIDを取得するメソッド
	 *@return tourId ツアーID
	 * */
	public int getTourId(){
		return tourId;
	}

	/**
	 *ツアーIDを格納するメソッド
	 *@param tourId ツアーID
	 * */
	public void setTourId(int tourId){
		this.tourId = tourId;
	}

	/**
	 *ツアー名を取得するメソッド
	 *@return tourName ツアー名
	 * */
	public String getTourName(){
		return tourName;
	}

	/**
	 *ツアー名を格納するメソッド
	 *@param tourName ツアー名
	 * */
	public void setTourName(String tourName){
		this.tourName = tourName;
	}

	/**
	 *価格を取得するするメソッド
	 *@return price 価格
	 * */
	public int getPrice(){
		return price;
	}

	/**
	 *価格を格納するメソッド
	 *@param price 価格
	 * */
	public void setPrice(int price){
		this.price = price;
	}

	/**
	 *出発地を取得するメソッド
	 *@return departure 出発地
	 * */
	public String getDeparture(){
		return departure;
	}

	/**
	 *出発地を格納するメソッド
	 *@param departure 出発地
	 * */
	public void setDeparture(String departure){
		this.departure = departure;
	}

	/**
	 *エリアを取得するメソッド
	 *@return region エリア
	 * */
	public String getRegion(){
		return region;
	}

	/**
	 *エリアを格納するメソッド
	 *@param region エリア
	 * */
	public void setRegion(String region){
		this.region = region;
	}

	/**
	 *都道府県を取得するメソッド
	 *@return prefectures 都道府県
	 * */
	public String getPrefectures(){
		return prefectures;
	}

	/**
	 *都道府県を格納するメソッド
	 *@param prefectures 都道府県
	 * */
	public void setPrefectures(String prefectures){
		this.prefectures = prefectures;
	}

	/**
	 *テーマを取得するメソッド
	 *@return theme テーマ
	 * */
	public String getTheme(){
		return theme;
	}

	/**
	 *テーマを格納するメソッド
	 *@param theme テーマ
	 * */
	public void setTheme(String theme){
		this.theme = theme;
	}

	/**
	 *コメントを取得するメソッド
	 *@return comment
	 * */
	public String getComment(){
		return comment;
	}

	/**
	 *コメントを格納するメソッド
	 *@param comment コメント
	 * */
	public void setComment(String comment){
		this.comment = comment;
	}

	/**
	 *画像URLを取得するメソッド
	 *@return img 画像URL
	 * */
	public String getImg(){
		return img;
	}

	/**
	 *画像URLを格納するメソッド
	 *@param img 画像URL
	 * */
	public void setImg(String img){
		this.img = img;
	}




}
