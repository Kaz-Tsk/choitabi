package com.internousdev.choitabi.action;

import java.io.File;
import java.sql.SQLException;

import com.internousdev.choitabi.dao.UpdateTourDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * DBに登録されているツアーに対し、編集または削除の操作を行うアクション
 * @author YUKA MATSUMURA
 * @since 2017/09/08
 * @version 1.1
 * */
public class UpdateTourAction extends ActionSupport{

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 7529843417299461761L;


	/**
	 *編集先ツアーID
	 * */
	private String editTourId;

	/**
	 *編集後のツアー名
	 * */
	private String editTourName;

	/**
	 *編集後の価格
	 * */
	private String editPrice;

	/**
	 *編集後の出発地
	 * */
	private String editDeparture;

	/**
	 *編集後のエリア
	 * */
	public String editRegion;

	/**
	 *編集後の都道府県
	 * */
	public String editPrefectures;

	/**
	 *編集後のテーマ
	 * */
	public String editTheme;

	/**
	 *編集後のコメント
	 * */
	public String editComment;

	/**
	 *編集後の画像URL
	 * */
	public String editImg;

	/**
	 *削除用チェックボックスの状態
	 * */
	private String deleteCheck = "false";


	/*画像のアップデートに使う変数------------------*/

	   /**
     * 画像のファイルデータ
     * */
    private File editFile;

	/**
	 * 編集後ツアーの画像URL/名前
	 * */
	private String editFileFileName;

	/**
	 * 編集後ツアー画像のファイル形式
	 * */
	public String editFileContentType;





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
		count = utdao.updateTour(editTourId, editTourName, editPrice,
	                            		 editDeparture, editRegion, editPrefectures, editTheme, editComment, editFileFileName,deleteCheck);/*←（）内は全部引数です*/

		if(count > 0){
			result = SUCCESS;
		}

		return result;
	}






	/*編集後の情報のgetter/setter---------------------------------------------*/

	/**
	 *編集先ツアーIDを取得するメソッド
	 *@return editTourId 編集先ツアーID
	 * */
	public String getEditTourId(){
		return editTourId;
	}

	/**
	 *編集先ツアーIDを格納するメソッド
	 *@param editTouId 編集先ツアーID
	 * */
	public void setEditTourId(String editTourId){
		this.editTourId = editTourId;
	}

	/**
	 *編集後のツアー名を取得するメソッド
	 *@return editTourName 編集後のツアー名
	 * */
	public String getEditTourName(){
		return editTourName;
	}

	/**
	 *編集後のツアー名を格納するメソッド
	 *@param editTourName 編集後のツアー名
	 * */
	public void setEditTourName(String editTourName){
		this.editTourName = editTourName;
	}

	/**
	 *編集後の価格を取得するメソッド
	 *@return editPrice 編集後の価格
	 * */
	public String getEditPrice(){
		return editPrice;
	}

	/**
	 *編集後の価格を格納するメソッド
	 *@param editPrice 編集後の価格
	 * */
	public void setEditPrice(String editPrice){
			this.editPrice = editPrice;
	}

	/**
	 *編集後の出発地を取得するメソッド
	 *@return editDeparture 編集後の出発地
	 * */
	public String getEditDeparture(){
		return editDeparture;
	}

	/**
	 *編集後の出発地を格納するメソッド
	 *@param editDeparture 編集後の出発地
	 * */
	public void setEditDeparture(String editDeparture){
		this.editDeparture = editDeparture;
	}

	/**
	 *編集後のエリアを取得するメソッド
	 *@return editRegion 編集後のエリア
	 * */
	public String getEditRegion(){
		return editRegion;
	}

	/**
	 *編集後のエリアを格納するメソッド
	 *param editRegion 編集後のエリア
	 * */
	public void setEditRegion(String editRegion){
		this.editRegion = editRegion;
	}

	/**
	 *編集後の都道府県を取得するメソッド
	 *@return editPrefectures 編集後の都道府県
	 * */
	public String getEditPrefectures(){
		return editPrefectures;
	}

	/**
	 *編集後の都道府県を格納するメソッド
	 *@param 編集後の都道府県
	 * */
	public void setEditPrefectures(String editPrefectures){
		this.editPrefectures = editPrefectures;
	}

	/**
	 *編集後のテーマを取得するメソッド
	 *@return editTheme 編集後のテーマ
	 * */
	public String getEditTheme(){
		return editTheme;
	}

	/**
	 *編集後のテーマを格納するメソッド
	 *@param editTheme 編集後のテーマ
	 * */
	public void setEditTheme(String editTheme){
		this.editTheme = editTheme;
	}

	/**
	 *編集後のコメントを取得するメソッド
	 *@returnr editComment 編集後のコメント
	 * */
	public String getEditComment(){
		return editComment;
	}

	/**
	 *編集後のコメントを格納するメソッド
	 *@param editComment
	 * */
	public void setEditComment(String editComment){
		this.editComment = editComment;
	}

	/**
	 *編集後の画像URLを取得するメソッド
	 *@return editImg 編集後の画像URL
	 * */
	public String getEditImg(){
		return editImg;
	}

	/**
	 *編集後の画像URLを格納するメソッド
	 *@param editImg 編集後の画像URL
	 * */
	public void setEditImg(String editImg){
		this.editImg = editImg;
	}

	/*編集時のチェック項目（削除チェックボックス、エラーメッセージ）のgetter/setter--------------------*/

	/**
	 *削除用チェックボックスの状態を取得するメソッド
	 *@return deleteCheck 削除用チェックボックスの状態
	 * */
	public String getDeleteCheck(){
		return deleteCheck;
	}

	/**
	 *削除用チェックボックスの状態を格納するメソッド
	 *@param deleteCheck 削除用チェックボックスの状態
	 * */
	public void setDeleteCheck(String deleteCheck){
		this.deleteCheck = deleteCheck;
	}


	/*画像のアップデートに使う変数のgetter/setter--------------------------------*/

	 /**
     * 画像のファイルデータを取得するメソッド
     * @return editFile 画像のファイルデータ
     * */
     public File getEditFile(){
    	 return editFile;
     }

     /**
      * 画像のファイルデータを格納するメソッド
      * @return fileFile 画像のファイルデータ
      * */
      public void setEditFile(File editFile){
     	 this.editFile =  editFile;
      }


  	/**
  	 *新規ツアーの画像URLを取得するメソッド
  	 *@return editFileFileName 新規ツアーの画像URL
  	 * */
  	public String getEditFileFileName(){
  		return editFileFileName;
  	}

  	/**
  	 *新規ツアーの画像URLを格納するメソッド
  	 *@param editFileFileName 新規ツアーの画像URL
  	 * */
  	public void setEditFileFileName(String editFileFileName){
  		this.editFileFileName = editFileFileName;
  	}

  	/**
  	 * 新規ツアー画像のファイル形式を取得するメソッド
  	 * @return editFileContentType 新規ツアー画像のファイル形式
  	 * */
  	public String getEditFileContentType(){
  		return editFileContentType;
  	}

  	/**
  	 * 新規ツアー画像のファイル形式を格納するメソッド
  	 * @return editFileContentType 新規ツアー画像のファイル形式
  	 * */
  	public void setEditFileContentType(String editFileContentType){
  		this.editFileContentType  = editFileContentType;
  	}



}
