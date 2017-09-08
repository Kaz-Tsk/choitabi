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

	/**編集後の情報＝入力されたデータを格納する変数です（JSPを通して、ConfirmEditingActionの値を持ってきます）*/
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
		count = utdao.updateTour(editTourName, editTourId, editPrice, editPersons, editDeparture,deleteCheck);

		if(count > 0){
			result = SUCCESS;
		}



		/*後消し*/System.out.println("UpdateTourAction - result :" + result );
		return result;
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
