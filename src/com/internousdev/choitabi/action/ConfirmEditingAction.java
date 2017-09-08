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


	/**編集前の情報を保存する変数です。*/
	/*ツアー名*/
	private String tourName;
	/*ツアーID*/
	private String tourId;
	/*価格*/
	private int price;
	/*定員*/
	private int persons;
	/*出発地*/
	private String departure;


	/**編集後の情報＝入力されたデータを格納する変数です(すべて文字列として受け取るようにしています)*/
	/*ツアー名*/
	private String editTourName;
	/*ツアーID*/
	private String editTourId;
	/*価格*/
	private String editPrice;
	/*定員*/
	private String editPersons;
	/*出発地*/
	private String editDeparture;

	/*削除確認チェック(チェックボックスにレ点がつくと、ここがtrueになります)*/
	private String deleteCheck = "false";

	/*エラーメッセージ（入力された情報が不完全だった場合に使われます）*/
	private String errorMsg = "";

	/**editPriceとeditPersonsは「String型」になっています。
	 * 編集画面から、価格・人数を入れる欄に文字列を入力したところ、javaに渡される際に数値に変換できずStrutsエラーがでてしまいました。
	 * そのため、一度文字列として受け取らせ、javaのInteger.Parseint()関数を使って数値に変換するステップを踏んでいます。
	 * **/


	/*executeメソッド-------------------------------------------------*/
	public String execute(){
		String result = ERROR;

		try{

			if(editTourName.equals("")|| editPrice.equals("") || editPersons.equals("") || editDeparture.equals("")){
				errorMsg = "入力が不完全です";
				/*後消し*/System.out.println(errorMsg);
			}else{
				/*価格・定員に関して、入力された情報が数値に変換できるかをチェックしています。
				 * 変換できればOK。変換できない＝エラーが起きた場合は、例外処理でエラーメッセージの表示に飛びます*/
				int editPrice_int = Integer.parseInt(editPrice);
				int editPersons_int = Integer.parseInt(editPersons);
				/*後消し*/System.out.println("ConfirmEditingAction : " + editTourName);
				/*後消し*/System.out.println("ConfirmEditingAction : " + editPrice_int);
				/*後消し*/System.out.println("ConfirmEditingAction : " + editPersons_int);
				/*後消し*/System.out.println("ConfirmEditingAction : " + editDeparture);
				/*後消し*/System.out.println("ConfirmEditingAction : " + deleteCheck);
				if(errorMsg.equals("")){
					result = SUCCESS;
				}
			}

		}catch(NumberFormatException e){
			errorMsg = "価格・人数の欄には数値を入力してください";
			/*後消し*/System.out.println(errorMsg);
		}

		/*後消し*/System.out.println("ConfirmEditingAction - result : " + result);
		return result;

	}



	/*編集前の情報のgetter/setter---------------------------------------------*/

	public String getTourName(){
		return tourName;
	}

	public void setTourName(String tourName){
		this.tourName = tourName;
	}

	public String getTourId(){
		return tourId;
	}

	public void setTourId(String tourId){
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

	public String getDeparture(){
		return departure;
	}

	public void setDeparture(String departure){
		this.departure = departure;
	}



	/*編集後の情報のgetter/setter---------------------------------------------*/

	public String getEditTourName(){
		return editTourName;
	}

	public void setEditTourName(String editTourName){
		this.editTourName = editTourName;
	}

	public String getEdittourId(){
		return editTourId;
	}

	public void setEditTourId(String editTourId){
		this.editTourId = editTourId;
	}

	public String getEditPrice(){
		return editPrice;
	}

	public void setEditPrice(String editPrice){
			this.editPrice = editPrice;
	}

	public String getEditPersons(){
		return editPersons;
	}

	public void setEditPersons(String editPersons){
		this.editPersons = editPersons;
	}

	public String getEditDeparture(){
		return editDeparture;
	}

	public void setEditDeparture(String editDeparture){
		this.editDeparture = editDeparture;
	}

	public String getDeleteCheck(){
		return deleteCheck;
	}

	public void setDeleteCheck(String deleteCheck){
		this.deleteCheck = deleteCheck;
	}

	public String getErrorMsg(){
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}


}
