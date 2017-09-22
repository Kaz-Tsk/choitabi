package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

public class GoTourInsertPageAction extends ActionSupport{


	/**
	 *
	 */
	private static final long serialVersionUID = 103477118082355207L;

	/**@author : YUKA MATSUMURA
	 * @since : 2017/09/08
	 * @version : 1.1
	 *
	 *ツアー一覧画面→【このアクション】→入力画面→ConfirmTourInsertingAction→入力内容確認画面→InsertTourAction
	 * 管理画面で、ツアーの一覧から「新規ツアーを登録する」をクリックすると、Strutsに送られるアクションです。

	 * */

	/*以下、入力された情報を保管するための変数
	 * ※このアクションは、次の「入力内容確認画面」から「入力画面に戻る」が選択されたときにも動きます。
	 *   そして、入力画面をもう一度表示（するための信号を出）してくれます。
	 *   そのときに、すでに入力された情報を入力フォームに残せるように用意したのが、ここの「new」とついた変数です。
	 * */

	/*ツアーIDを入れる変数は作っていません（DBでオートインクリメントの設定がついているため）*/

	private String newTourName;
	private String newPrice;
	private String newPersons;
	private String newDeparture;
	private String newRegion;
	private String newPrefectures;
	private String newTheme;
	private String newComment;
	private String newImg;



	/*executeメソッド*/
	public String execute(){
		String result = SUCCESS;
		return result;
	}


	/*変数のgetter/setter*/

	/*ツアー名*/
	public String getNewTourName(){
		return newTourName;
	}

	public void setNewTourName(String newTourName){
		this.newTourName = newTourName;
	}

	/*価格*/
	public String getNewPrice(){
		return newPrice;
	}

	public void setNewPrice(String newPrice){
		this.newPrice = newPrice;
	}

	/*定員*/
	public String getNewPersons(){
		return newPersons;
	}

	public void setNewPersons(String newPersons){
		this.newPersons = newPersons;
	}

	/*出発地*/
	public String getNewDeparture(){
		return newDeparture;
	}

	public void setNewDeparture(String newDeparture){
		this.newDeparture = newDeparture;
	}

	/*エリア*/
	public String getNewRegion(){
		return newRegion;
	}

	public void setNewRegion(String newRegion){
		this.newRegion = newRegion;
	}

	/*都道府県*/
	public String getNewPrefectures(){
		return newPrefectures;
	}

	public void setNewPrefectures(String newPrefectures){
		this.newPrefectures = newPrefectures;
	}

	/*テーマ*/
	public String getNewTheme(){
		return newTheme;
	}

	public void setNewTheme(String newTheme){
		this.newTheme = newTheme;
	}

	/*コメント*/
	public String getNewComment(){
		return newComment;
	}

	public void setNewComment(String newComment){
		this.newComment = newComment;
	}

	/*画像URL*/
	public String getNewImg(){
		return newImg;
	}

	public void setNewImg(String newImg){
		this.newImg = newImg;
	}







}
