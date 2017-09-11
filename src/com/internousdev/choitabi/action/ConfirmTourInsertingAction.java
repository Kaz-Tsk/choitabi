package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

public class ConfirmTourInsertingAction extends ActionSupport{

	/**@author YUKA MATSUMURA
	 * @since 2017/09/08
	 * @version 1.1
	 *
	 * 管理画面から、ツアーの新規登録時に使用するアクションです。
	 * フォームから入力されたデータに漏れや不適切な部分（価格に文字列が入っている場合など）がないかをチェックし、
	 * OKならばSUCCESSを返します。
	 *（※11日朝現在、未完成です）
	 * */

	/*新規ツアーのID（自動で入るので0のままでOKです）*/
	private int newTourId = 0;

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



	public String execute(){
		String result = SUCCESS;
		return result;
	}

	/*以下、変数のgetter/setter-----------------------------------------------------*/


	public int getNewTourId(){
		return newTourId;
	}

	public void setNewTourId(int newTourId){
		this.newTourId = newTourId;
	}

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
