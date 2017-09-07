package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

public class ConfirmEditingAction extends ActionSupport{

	/**
	 * @author YUKA MATSUMURA
	 * @since 2017/09/07
	 * @version 1.1
	 *
	 * 管理-ツアー編集で使うクラスです。
	 * 入力画面→編集完了画面までの橋渡しを行います。
	 * 入力された情報に漏れが無いか、などのチェックもここで行います。
	 * */

	/*ツアー名*/
	private String editTourName;
	/*ツアーID*/
	private int editTourId;
	/*価格*/
	private int editPrice;
	/*定員*/
	private int editPersons;
	/*最終編集日*/
	private String editDate;
	/*出発地*/
	private String editDeparture;

	/*削除確認チェック(チェックボックスにレ点がつくと、ここがtrueになります)*/
	private boolean deleteCheck = false;

	/*エラーメッセージ（入力された情報が不完全だった場合に使われます）*/
	private String errorMsg;


	/*executeメソッド-------------------------------------------------*/

	public String execute(){
		String result = ERROR;

		/*後消し*/System.out.println("ConfirmEditingAction : " + editTourName);
		/*後消し*/System.out.println("ConfirmEditingAction : " + editPrice);
		/*後消し*/System.out.println("ConfirmEditingAction : " + editPersons);
		/*後消し*/System.out.println("ConfirmEditingAction : " + editDeparture);
		/*後消し*/System.out.println("ConfirmEditingAction : " + deleteCheck);
		return result;
	}



	/*以下、getter/setter---------------------------------------------*/

	public String getEditTourName(){
		return editTourName;
	}

	public void seteditTourName(String editTourName){
		this.editTourName = editTourName;
	}

	public int getEdittourId(){
		return editTourId;
	}

	public void setEditTourId(int editTourId){
		this.editTourId = editTourId;
	}

	public int getEditPrice(){
		return editPrice;
	}

	public void setEditPrice(int editPrice){
		this.editPrice = editPrice;
	}

	public int getEditPersons(){
		return editPersons;
	}

	public void setEditPersons(int editPersons){
		this.editPersons = editPersons;
	}

	public String gerEditDate(){
		return editDate;
	}

	public void setEditDate(String editDate){
		this.editDate = editDate;
	}

	public String getEditDeparture(){
		return editDeparture;
	}

	public void setDeparture(String editDeparture){
		this.editDeparture = editDeparture;
	}

	public boolean getDeleteCheck(){
		return deleteCheck;
	}

	public void setDeleteCheck(boolean deleteCheck){
		this.deleteCheck = deleteCheck;
	}

	public String getErrorMsg(){
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}


}
