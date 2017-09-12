package com.internousdev.choitabi.action;

public class InsertTourAction {



	/**@author YUKA MATSUMURA
	 * @since 2017/09/12
	 * @version 1.1
	 *管理者トップ画面→GoTourInsertPageAction→入力画面→ConfirmTourInsertingAction→入力内容確認画面→【このアクション】→値を持ったままIndicateTourListActionへ
	 * 管理側で、ツアーの新規登録時に使用するアクションです。
	 * 入力されたデータのチェックが完了したので、そのデータをDBに追加します。
	 * OKならばSUCCESSを返します。
	 * */


	/*入力されたツアー名*/
	private String newTourName;

	/*入力された価格*/
	private String newPrice;

	/*入力された定員*/
	private String newPersons;

	/*入力された出発地*/
	private String newDeparture;

	/*入力されたエリア*/
	private String newRegion;

	/*入力された都道府県*/
	private String newPrefectures;

	/*入力されたテーマ*/
	private String newTheme;

	/*入力されたコメント*/
	private String newComment;

	/*入力された画像URL*/
	private String newImg;






	/*以下、変数のgetter/setter-----------------------------------------------------*/


	public String getNewTourName(){
		return newTourName;
	}

	public void setNewTourName(String newTourName){
		this.newTourName = newTourName;
	}

	public String getNewPrice(){
		return newPrice;
	}

	public void setNewPrice(String newPrice){
		this.newPrice = newPrice;
	}

	public String getNewPersons(){
		return newPersons;
	}

	public void setNewPersons(String newPersons){
		this.newPersons = newPersons;
	}

	public String getNewDeparture(){
		return newDeparture;
	}

	public void setNewDeparture(String newDeparture){
		this.newDeparture = newDeparture;
	}

	public String getNewRegion(){
		return newRegion;
	}

	public void setNewRegion(String newRegion){
		this.newRegion = newRegion;
	}

	public String getNewPrefectures(){
		return newPrefectures;
	}

	public void setNewPrefectures(String newPrefectures){
		this.newPrefectures = newPrefectures;
	}

	public String getNewTheme(){
		return newTheme;
	}

	public void setNewTheme(String newTheme){
		this.newTheme = newTheme;
	}

	public String getNewComment(){
		return newComment;
	}

	public void setNewComment(String newComment){
		this.newComment = newComment;
	}

	public String getNewImg(){
		return newImg;
	}

	public void setNewImg(String newImg){
		this.newImg = newImg;
	}




}







