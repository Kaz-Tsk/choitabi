package com.internousdev.choitabi.dto;

public class SelectTourDTO {


	/**@author:YUKA MATSUMURA
	 *@since:2017/09/05
	 *@version:1.1
	 *
	 *DBから、ツアー1件分の情報を入れるためのDTOです。
	 *ツアーの検索と、編集・削除操作の両方で使います。
	 * */


	/*ツアーID*/
	private int tourId;
	/*ツアー名*/
	private String tourName;
	/*価格*/
	private int price;
	/*定員*/
	private int persons;
	/*出発地*/
	private String departure;
	/*エリア*/
	private String region;
	/*県*/
	private String prefectures;
	/*テーマ*/
	private String theme;
	/*コメント*/
	private String comment;
	/*画像URL*/
	private String img;


	/*以下、各変数のgetter/setter----------------------------*/


	/*ツアーIDのgetter*/
	public int getTourId(){
		return tourId;
	}

	/*ツアー名のsetter*/
	public void setTourId(int tourId){
		this.tourId = tourId;
	}

	/*ツアー名のgetter*/
	public String getTourName(){
		return tourName;
	}

	/*ツアー名のsetter*/
	public void setTourName(String tourName){
		this.tourName = tourName;
	}

	/*価格のgetter*/
	public int getPrice(){
		return price;
	}

	/*価格のsetter*/
	public void setPrice(int price){
		this.price = price;
	}

	/*定員のgetter*/
	public int getPersons(){
		return persons;
	}

	/*定員のsetter*/
	public void setPersons(int persons){
		this.persons = persons;
	}

	/*出発地のgetter*/
	public String getDeparture(){
		return departure;
	}

	/*出発地のsetter*/
	public void setDeparture(String departure){
		this.departure = departure;
	}

	/*エリアのgetter*/
	public String getRegion(){
		return region;
	}

	/*エリアのsetter*/
	public void setRegion(String region){
		this.region = region;
	}

	/*県のgetter*/
	public String getPrefectures(){
		return prefectures;
	}

	/*県のsetter*/
	public void setPrefectures(String prefectures){
		this.prefectures = prefectures;
	}

	/*テーマのgetter*/
	public String getTheme(){
		return theme;
	}

	/*テーマのsetter*/
	public void setTheme(String theme){
		this.theme = theme;
	}

	/*コメントのgetter*/
	public String getComment(){
		return comment;
	}

	/*コメントのsetter*/
	public void setComment(String comment){
		this.comment = comment;
	}

	/*画像URLのgetter*/
	public String getImg(){
		return img;
	}

	/*画像URLのsetter*/
	public void setImg(String img){
		this.img = img;
	}




}
