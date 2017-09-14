/**
 *
 */
package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.Test_TourDAO;
import com.internousdev.choitabi.dto.Test_TourDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * ツアー一覧からツアーの詳細情報を取得するクラス
 *
 * @author SHUN NAGAO
 * @since 2017/09/14
 * @version 1.0
 **/



public class Test_TourAction extends ActionSupport implements SessionAware{


 /**
 *シリアルID
 */
 private static final long serialVersionUID = 1265651996185917162L;
 /**
 * ツアー名
 */
  private String tourName;
  /**
  * ツアーID
  */
  private int tourID;
  /**
   * 単価
   */
  private float price;
  /**
   * イメージファイルパス
   */
  private String imgPath;
  /**
   * 在庫数
   */
  private int stocks;
  /**
   * ツアー詳細
   */
  private String tourDetail;
  /**
   * 売上数
   */
  private int sales;
  /**
   * 種類ID
   */
  private int sortId;
  /**
   * ジャンル
   */
  private String tourGenre;




  /**
   * ツアーリスト
   */
  public ArrayList<Test_TourDTO> Tour = new ArrayList<Test_TourDTO>();
 /**
  * セッション情報
  */
  private Map<String,Object> session;


  /**
   * 商品情報を取得するメソッド
   */



  public String execute()throws SQLException{

	     String result=ERROR;
	     Test_TourDAO dao= new Test_TourDAO();
	     Tour = dao.select();
	     if (Tour.size()>0){

	    	 result = SUCCESS;
	     }
	     return result;
  }


/**
 * ツアー名を取得するメソッド
 * @return tourName　ツアー名
 */
public String getTourName() {
	return tourName;
}


/**
 * ツアー名を格納するメソッド
 * @param tourName セットする tourName
 */
public void setTourName(String tourName) {
	this.tourName = tourName;
}


/**
 * ツアーIDを取得するメソッド
 * @return tourID
 */
public int getTourID() {
	return tourID;
}


/**
 * ツアーIDを格納するメソッド
 * @param tourID セットする tourID
 */
public void setTourID(int tourID) {
	this.tourID = tourID;
}


/**
 * 単価を取得するメソッド
 * @return price　単価
 */
public float getPrice() {
	return price;
}


/**
 * 単価を格納するメソッド
 * @param price セットする price
 */
public void setPrice(float price) {
	this.price = price;
}


/**
 * イメージファイルパスを取得するメソッド
 * @return imgPath　イメージファイルパス
 */
public String getImgPath() {
	return imgPath;
}


/**
 * イメージファイルパスを格納するメソッド
 * @param imgPath セットする imgPath
 */
public void setImgPath(String imgPath) {
	this.imgPath = imgPath;
}


/**
 * 在庫数を取得するメソッド
 * @return stocks　在庫数
 */
public int getStocks() {
	return stocks;
}


/**
 * 在庫数を格納するメソッド
 * @param stocks セットする stocks
 */
public void setStocks(int stocks) {
	this.stocks = stocks;
}


/**
 * ツアー詳細を取得するメソッド
 * @return tourDetail　ツアー詳細
 */
public String getTourDetail() {
	return tourDetail;
}


/**
 * ツアー詳細を格納するメソッド
 * @param tourDetail セットする tourDetail
 */
public void setTourDetail(String tourDetail) {
	this.tourDetail = tourDetail;
}


/**
 * 売上数を取得するメソッド
 * @return sales　売上数
 */
public int getSales() {
	return sales;
}


/**
 * 売上数を格納するメソッド
 * @param sales セットする sales
 */
public void setSales(int sales) {
	this.sales = sales;
}


/**
 * 種類IDを取得するメソッド
 * @return sortId　種類ID
 */
public int getSortId() {
	return sortId;
}


/**
 * 種類IDを格納するメソッド
 * @param sortId セットする sortId
 */
public void setSortId(int sortId) {
	this.sortId = sortId;
}


/**
 * ツアーリストを取得するメソッド
 * @return tour　ツアーリスト
 */
public ArrayList<Test_TourDTO> getTour() {
	return Tour;
}


/**
 * ツアーリストを格納するメソッド
 * @param tour セットする tour
 */
public void setTour(ArrayList<Test_TourDTO> tour) {
	Tour = tour;
}


/**
 * セッション情報を取得するメソッド
 * @return session　セッション
 */
public Map<String, Object> getSession() {
	return session;
}


/**
 * セッション情報を格納するメソッド
 * @param session セットする session
 */
public void setSession(Map<String, Object> session) {
	this.session = session;
}


/**
 * ジャンルを取得するメソッド
 * @return　tourGenre　ジャンル
 */
public String getTourGenre() {
	return tourGenre;
}


/**
 * ジャンルを格納するメソッド
 * @param tourGenre セットする tourGenre
 */
public void setTourGenre(String tourGenre) {
	this.tourGenre = tourGenre;
}


}
