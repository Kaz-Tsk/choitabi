package com.internousdev.choitabi.action;

import java.sql.SQLException;

import com.internousdev.choitabi.dao.InsertTourDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規ツアーの登録を行うアクション
 * @author YUKA MATSUMURA
 * @since 2017/09/12
 * @version 1.1
 * */
public class InsertTourAction extends ActionSupport {

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 8260806374195833620L;


	/**
	 * 新規ツアー名
	 * */
	private String newTourName;

	/**
	 * 新規ツアーの価格
	 * */
	private String newPrice;


	/**
	 * 新規ツアーの出発地
	 * */
	private String newDeparture;

	/**
	 * 新規ツアーのエリア
	 * */
	private String newRegion;

	/**
	 * 新規ツアーの都道府県
	 * */
	private String newPrefectures;

	/**
	 * 新規ツアーのテーマ
	 * */
	private String newTheme;

	/**
	 * 新規ツアーのコメント
	 * */
	private String newComment;

	/**
	 * 新規ツアーの画像名
	 * */
	private String newFileFileName;



	/**
	 * DBに新規ツアーを登録するメソッド
	 * @author YUKA MATSUMURA
	 * @since 2017/09/12
	 * @version 1.1
	 * @return result(SUCCES / ERROR)
	 * */
	public String execute() throws IllegalAccessException, InstantiationException, SQLException{
		String result = ERROR;
		int count = 0;
		InsertTourDAO itdao = new InsertTourDAO();

		newFileFileName = newFileFileName.replace("./img/","");
		newFileFileName = newFileFileName.replace("img/","");

		count = itdao.insertTour(newTourName, newPrice,
	                            		 newDeparture, newRegion, newPrefectures, newTheme, newComment, newFileFileName);/*←（）内は全部引数です*/

		if(count > 0){
			result = SUCCESS;
		}

		return result;
	}




	/*以下、変数のgetter/setter-----------------------------------------------------*/


	/**
	 * 新規ツアー名を取得するメソッド
	 * @return newTourName 新規ツアー名
	 * */
	public String getNewTourName(){
		return newTourName;
	}

	/**
	 * 新規ツアー名を格納するメソッド
	 * @param newTourName 新規ツアー名
	 * */
	public void setNewTourName(String newTourName){
		this.newTourName = newTourName;
	}

	/**
	 * 新規ツアーの価格を取得するメソッド
	 * @return newPrice 新規ツアーの価格
	 * */
	public String getNewPrice(){
		return newPrice;
	}

	/**
	 * 新規ツアーの価格を格納するメソッド
	 * @param newPrice 新規ツアーの価格
	 * */
	public void setNewPrice(String newPrice){
		this.newPrice = newPrice;
	}

	/**
	 * 新規ツアーの出発地を取得するメソッド
	 * @return newDeparture 新規ツアーの出発地
	 * */
	public String getNewDeparture(){
		return newDeparture;
	}

	/**
	 * 新規ツアーの出発地を格納するメソッド
	 * @param newDeparture 新規ツアーの出発地
	 * */
	public void setNewDeparture(String newDeparture){
		this.newDeparture = newDeparture;
	}

	/**
	 * 新規ツアーのエリアを取得するメソッド
	 * @return newRegion 新規ツアーのエリア
	 * */
	public String getNewRegion(){
		return newRegion;
	}

	/**
	 * 新規ツアーのエリアを格納するメソッド
	 * @param newRegion 新規ツアーのエリア
	 * */
	public void setNewRegion(String newRegion){
		this.newRegion = newRegion;
	}

	/**
	 * 新規ツアーの都道府県を取得するメソッド
	 * @return newPrefectures 新規ツアーの都道府県
	 * */
	public String getNewPrefectures(){
		return newPrefectures;
	}

	/**
	 * 新規ツアーの都道府県を格納するメソッド
	 * @param newPrefectures 新規ツアーの都道府県
	 * */
	public void setNewPrefectures(String newPrefectures){
		this.newPrefectures = newPrefectures;
	}

	/**
	 * 新規ツアーのテーマを取得するメソッド
	 * @return newTheme 新規ツアーのテーマ
	 * */
	public String getNewTheme(){
		return newTheme;
	}

	/**
	 * 新規ツアーのテーマを格納するメソッド
	 * @param newTheme 新規ツアーのテーマ
	 * */
	public void setNewTheme(String newTheme){
		this.newTheme = newTheme;
	}

	/**
	 *新規ツアーのコメントを取得するメソッド
	 *@return newComment 新規ツアーのコメント
	 * */
	public String getNewComment(){
		return newComment;
	}

	/**
	 *新規ツアーのコメントを格納するメソッド
	 *@param newComment 新規ツアーのコメント
	 * */
	public void setNewComment(String newComment){
		this.newComment = newComment;
	}


	/*画像のアップロードに使う変数のgetter/setter-----*/

  	/**
  	 *新規ツアーの画像名を取得するメソッド
  	 *@return newFileFileName 新規ツアーの画像名
  	 * */
  	public String getNewFileFileName(){
  		return newFileFileName;
  	}

  	/**
  	 *新規ツアーの画像名を格納するメソッド
  	 *@param newFileFileName 新規ツアーの画像名
  	 * */
  	public void setNewFileFileName(String newFileFileName){
  		this.newFileFileName = newFileFileName;
  	}






}




