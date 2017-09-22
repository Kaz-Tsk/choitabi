package com.internousdev.choitabi.action;

import java.sql.SQLException;

import com.internousdev.choitabi.dao.UpdateTourDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateTourAction extends ActionSupport{

	/**@author : YUKA MATSUMURA
	 * @since : 2017/09/08
	 * @version : 1.1
	 *
	 * 管理画面でツアーの編集・削除の操作を行うアクションクラスです。
	 * DAOを呼び出してSQLのデータを操作し、処理結果が1以上であれば＝更新が成功していれば、SUCCESSを返します。
	 * (SUCCESSでもERRORでも画面一覧に戻るようにしています)
	 * */

	/**
	 *
	 */
	private static final long serialVersionUID = 7529843417299461761L;
	/**編集後の情報＝入力されたデータを格納する変数です（JSPを通して、ConfirmEditingActionの値を持ってきます）*/
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

	/*エラーメッセージ（入力された情報が不完全だった場合に使われます）*/
	private String errorMsg = "";

	/**editPriceとeditPersonsは「String型」になっています。
	 * 画面のフォームから入力された情報は文字列として扱われるため、
	 * まずはそのまま受け取って、javaの機能で数値に変換しています。
	 * @throws SQLException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * **/

	public String execute() throws IllegalAccessException, InstantiationException, SQLException{
		String result = ERROR;
		int count = 0;

		UpdateTourDAO utdao = new UpdateTourDAO();
		count = utdao.updateTour(editTourId, editTourName, editPrice,editPersons,
	                            		 editDeparture, editRegion, editPrefectures, editTheme, editComment, editImg,deleteCheck);/*←（）内は全部引数です*/

		if(count > 0){
			result = SUCCESS;
		}

		return result;
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
		return editRegion;
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
