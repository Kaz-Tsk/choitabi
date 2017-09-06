package com.internousdev.choitabi.action;

import com.internousdev.choitabi.dao.SelectOneTourDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.opensymphony.xwork2.ActionSupport;

public class EditTourAction extends ActionSupport {

	/*@author YUKA MATSUMURA
	 * since 2017/0906
	 * versin 1.1
	 *
	 * 管理画面でツアー情報の更新・削除操作を行うためのクラスです
	 *
	 * **/


	/*ツアー名*/
	private String tourName;
	/*ツアーID*/
	private int tourId;
	/*価格*/
	private int price;
	/*定員*/
	private int persons;
	/*最終編集日*/
	private String date;
	/*出発地*/
	private String departure;

	/*削除確認チェック(チェックボックスにレ点がつくと、ここがtrueになります)*/
	private boolean deleteCheck = false;


	/*executeメソッド-------------------------------------------------*/

	public String execute(){
		String result = ERROR;

		SelectOneTourDAO sotdao = new SelectOneTourDAO();
		SelectTourDTO dto =sotdao.selectOneTour(tourId);

		if(dto != null){
			this.tourName = dto.getTourName();
			this.tourId = dto.getTourId();
			this.price = dto.getPrice();
			this.persons = dto.getPersons();
			this.date = dto.getDate();
			this.departure = dto.getDeparture();
			result = SUCCESS;
		}

		/*後消し*/System.out.println("EdittourAction - result : " + result);
		return result;
	}



	/*以下、getter/setter---------------------------------------------*/

	public String getTourName(){
		return tourName;
	}

	public void setTourName(String tourName){
		this.tourName = tourName;
	}

	public int getTourId(){
		return tourId;
	}

	public void setTourId(int tourId){
		this.tourId = tourId;
	}

	public int getPrice(){
		return price;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPersons(){
		return persons;
	}

	public void setPersons(int persons){
		this.persons = persons;
	}

	public String gerDate(){
		return date;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDeparture(){
		return departure;
	}

	public void setDeparture(String departure){
		this.departure = departure;
	}

	public boolean getDeleteCheck(){
		return deleteCheck;
	}

	public void setDeleteCheck(boolean deleteCheck){
		this.deleteCheck = deleteCheck;
	}





}
