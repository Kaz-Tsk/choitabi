package com.internousdev.choitabi.action;

import com.internousdev.choitabi.dao.SelectOneTourDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.opensymphony.xwork2.ActionSupport;

public class EditTourAction extends ActionSupport {

	/**@author YUKA MATSUMURA
	 * since 2017/0906
	 * versin 1.1
	 *
	 * 管理画面でツアー情報の更新・削除操作を行うためのクラスです。
	 * ツアー一覧画面からツアーの「編集」をクリックすると、このアクションが働いて選択されたーツアーの情報を取ってきます。
	 * 取ってきた情報は、「編集前のデータ」として、次の「kanri_tourHensyuu.jsp」に表示されます。
	 *
	 * **/


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

	/*削除確認チェック(チェックボックスにレ点がつくと、ここがtrueになります)*/
	private String deleteCheck = "false";


	/*executeメソッド-------------------------------------------------*/

	public String execute(){
		String result = ERROR;

		SelectOneTourDAO sotdao = new SelectOneTourDAO();
		SelectTourDTO stdto =sotdao.selectOneTour(tourId);

		if(stdto != null){
			this.tourId = stdto.getTourId();
			this.tourName = stdto.getTourName();
			this.price = stdto.getPrice();
			this.persons = stdto.getPersons();
			this.departure = stdto.getDeparture();
			this.region = stdto.getRegion();
			this.prefectures = stdto.getPrefectures();
			this.theme = stdto.getTheme();
			this.comment = stdto.getComment();
			this.img = stdto.getImg();
			result = SUCCESS;
		}

		/*後消し*/System.out.println("EdittourAction - result : " + result);
		return result;
	}



	/*以下、getter/setter---------------------------------------------*/

	/*ツアーIDのgetter*/
	public int getTourId(){
		return tourId;
	}

	/*ツアーIDのsetter*/
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

	/*削除チェックボックス判定のgetter*/
	public String getDeleteCheck(){
		return deleteCheck;
	}

	/*削除チェックボックス判定のsetter*/
	public void setDeleteCheck(String deleteCheck){
		this.deleteCheck = deleteCheck;
	}


}
