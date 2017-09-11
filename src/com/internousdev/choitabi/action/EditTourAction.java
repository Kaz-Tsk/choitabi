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
	private int currentTourId;
	/*ツアー名*/
	private String currentTourName;
	/*価格*/
	private int currentPrice;
	/*定員*/
	private int currentPersons;
	/*出発地*/
	private String currentDeparture;
	/*エリア*/
	private String currentRegion;
	/*県*/
	private String currentPrefectures;
	/*テーマ*/
	private String currentTheme;
	/*コメント*/
	private String currentComment;
	/*画像URL*/
	private String currentImg;

	/*削除確認チェック(チェックボックスにレ点がつくと、ここがtrueになります)*/
	private String deleteCheck = "false";


	/*executeメソッド-------------------------------------------------*/

	public String execute(){
		String result = SUCCESS;

		SelectOneTourDAO sotdao = new SelectOneTourDAO();
		SelectTourDTO stdto =sotdao.selectOneTour(currentTourId);

		if(stdto != null){
			this.currentTourId = stdto.getTourId();
			this.currentTourName = stdto.getTourName();
			this.currentPrice = stdto.getPrice();
			this.currentPersons = stdto.getPersons();
			this.currentDeparture = stdto.getDeparture();
			this.currentRegion = stdto.getRegion();
			this.currentPrefectures = stdto.getPrefectures();
			/*動作確認*/System.out.println("editTourAction："+ stdto.getTheme());
			this.currentTheme = stdto.getTheme();
			this.currentComment = stdto.getComment();
			this.currentImg = stdto.getImg();
			result = SUCCESS;
		}

		/*後消し*/System.out.println("EdittourAction - result : " + result);
		return result;
	}



	/*以下、getter/setter---------------------------------------------*/

	/*ツアーIDのgetter*/
	public int getCurrentTourId(){
		return currentTourId;
	}

	/*ツアーIDのsetter*/
	public void setCurrentTourId(int currentTourId){
		this.currentTourId = currentTourId;
	}

	/*ツアー名のgetter*/
	public String getCurrentTourName(){
		return currentTourName;
	}

	/*ツアー名のsetter*/
	public void setCurrentTourName(String currentTourName){
		this.currentTourName = currentTourName;
	}

	/*価格のgetter*/
	public int getCurrentPrice(){
		return currentPrice;
	}

	/*価格のsetter*/
	public void setCurrentPrice(int currentPrice){
		this.currentPrice = currentPrice;
	}

	/*定員のgetter*/
	public int getCurrentPersons(){
		return currentPersons;
	}

	/*定員のsetter*/
	public void setCurrentPersons(int currentPersons){
		this.currentPersons = currentPersons;
	}

	/*出発地のgetter*/
	public String getCurrentDeparture(){
		return currentDeparture;
	}

	/*出発地のsetter*/
	public void setCurrentDeparture(String currentDeparture){
		this.currentDeparture = currentDeparture;
	}

	/*エリアのgetter*/
	public String getCurrentRegion(){
		return currentRegion;
	}

	/*エリアのsetter*/
	public void setCurrentRegion(String currentRegion){
		this.currentRegion = currentRegion;
	}

	/*県のgetter*/
	public String getCurrentPrefectures(){
		return currentPrefectures;
	}

	/*県のsetter*/
	public void setCurrentPrefectures(String currentPrefectures){
		this.currentPrefectures = currentPrefectures;
	}

	/*テーマのgetter*/
	public String getCurrentTheme(){
		return this.currentTheme;
	}

	/*テーマのsetter*/
	public void setCurrentTheme(String currentTheme){
		this.currentTheme = currentTheme;
	}

	/*コメントのgetter*/
	public String getCurrentComment(){
		return currentComment;
	}

	/*コメントのsetter*/
	public void setCurrentComment(String currentComment){
		this.currentComment = currentComment;
	}

	/*画像URLのgetter*/
	public String getCurrentImg(){
		return currentImg;
	}

	/*画像URLのsetter*/
	public void setCurrentImg(String currentImg){
		this.currentImg = currentImg;
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
