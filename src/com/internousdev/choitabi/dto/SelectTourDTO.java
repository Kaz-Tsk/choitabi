package com.internousdev.choitabi.dto;

public class SelectTourDTO {


	/*@author:YUKA MATSUMURA
	 *@since:2017/09/05
	 *@version:1.1
	 *
	 *DBから、ツアー1件分の情報を入れるためのDTOです。
	 *ツアーの検索と、編集・削除操作の両方で使います。
	 * */

	/*ツアー名*/
	private String tourName;
	/*ツアーID*/
	private int tourId;
	/*価格*/
	private int price;
	/*定員*/
	private int persons;
	/*編集等をした日付*/
	private String date;
	/*出発地*/
	private String departure;



	/*以下、各変数のgetter/setter----------------------------*/



	/*ツアー名のgetter*/
	public String getTourName(){
		return tourName;
	}

	/*ツアー名のsetter*/
	public void setTourName(String tourName){
		this.tourName = tourName;
	}


	/*ツアーIDのgetter*/
	public int getTourId(){
		return tourId;
	}

	/*ツアー名のsetter*/
	public void setTourId(int tourId){
		this.tourId = tourId;
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

	/*日付のgetter*/
	public String getDate(){
		return date;
	}

	/*日付のsetter*/
	public void setDate(String date){
		this.date = date;
	}

	/*出発地のgetter*/
	public String getDeparture(){
		return departure;
	}

	/*出発地のsetter*/
	public void setDeparture(String departure){
		this.departure = departure;
	}



}
