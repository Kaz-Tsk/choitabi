package com.internousdev.choitabi.action;

import java.sql.SQLException;

import com.internousdev.choitabi.dao.UpdateTourDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBに登録されているツアーに対し、編集または削除の操作を行うアクション
 * @author : YUKA MATSUMURA
 * @since : 2017/09/08
 * @version : 1.1
 * */
public class UpdateTourAction extends ActionSupport{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 7529843417299461761L;


	/**
	 *
	 * */
	private String editTourId;

	/**
	 *
	 * */
	private String editTourName;

	/**
	 *
	 * */
	private String editPrice;

	/**
	 *
	 * */
	private String editPersons;

	/**
	 *
	 * */
	private String editDeparture;

	/**
	 *
	 * */
	public String editRegion;

	/**
	 *
	 * */
	public String editPrefectures;

	/**
	 *
	 * */
	public String editTheme;

	/**
	 *
	 * */
	public String editComment;

	/**
	 *
	 * */
	public String editImg;

	/**
	 *
	 * */
	private String deleteCheck = "false";

	/**
	 *
	 * */
	private String errorMsg = "";

	/**
	 * DBに登録されているツアーを編集、または削除するメソッド
	 * @author : YUKA MATSUMURA
	 * @since : 2017/09/08
	 * @version : 1.1
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
