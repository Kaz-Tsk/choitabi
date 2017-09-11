package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

public class ConfirmTourEditingAction extends ActionSupport{

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



	/**編集後の情報＝入力されたデータを格納する変数です(すべて文字列として受け取るようにしています)
	 *  編集画面から、価格・人数を入れる欄に文字列を入力したところ、javaに渡される際に数値に変換できずStrutsエラーがでてしまいました。
	 *  そのため、一度文字列として受け取らせ、javaのInteger.Parseint()関数を使って数値に変換するステップを踏んでいます。
	 * */

	/*ツアーID*/
	private String editTourId;
	/*ツアー名*/
	private String editTourName;
	/*価格*/
	private String editPrice;
	/*定員*/
	private String editPersons;
	/*出発地*/
	private String editDeparture;
	/*エリア*/
	public String editRegion;
	/*県*/
	public String editPrefectures;
	/*テーマ*/
	public String editTheme;
	/*コメント*/
	public String editComment;
	/*画像URL*/
	public String editImg;

	/*削除確認チェック(チェックボックスにレ点がつくと、ここがtrueになります)*/
	private String deleteCheck = "false";

	/*エラーメッセージ（入力された情報に誤りだった場合などに使われます）*/
	private String errorMsg = "";



	/*executeメソッド-------------------------------------------------*/
	public String execute(){
		String result = ERROR;

		try{
			if(deleteCheck.equals("true")){
				result = SUCCESS;
			}else if(deleteCheck.equals("false") && (editTourName.equals("")|| editPrice.equals("") || editPersons.equals("") || editDeparture.equals(""))){
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



	/*編集後の情報のgetter/setter---------------------------------------------*/



	public String getEditTourId(){
		return editTourId;
	}

	public void setEditTourId(String editTourId){
		this.editTourId = editTourId;
	}

	public String getEditTourName(){
		return editTourName;
	}

	public void setEditTourName(String editTourName){
		this.editTourName = editTourName;
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

	public String getEditRegion(){
		return region;
	}

	public void setEditRegion(String editRegion){
		this.editRegion = editRegion;
	}

	public String getEditPrefectures(){
		return editPrefectures;
	}

	public void setEditPrefectures(String editPrefectures){
		this.editPrefectures = editPrefectures;
	}

	public String getEditTheme(){
		return editTheme;
	}

	public void setEditTheme(String editTheme){
		this.editTheme = editTheme;
	}

	public String getEditComment(){
		return editComment;
	}

	public void setEditComment(String editComment){
		this.editComment = editComment;
	}

	public String getEditImg(){
		return editImg;
	}

	public void setEditImg(String editImg){
		this.editImg = editImg;
	}








	/*編集時のチェック項目（削除チェックボックス、エラーメッセージ）のgetter/setter--------------------*/
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
