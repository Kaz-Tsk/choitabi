/**
 *
 */
package com.internousdev.choitabi.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.UserPurchaseHistoryDAO;
import com.internousdev.choitabi.dto.HistoryDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 購入履歴：商品一覧を取得するクラス
 * @author KAZUYUKI TASAKI
 * 	@since 2017/9/14
 *@version 1.0
 */
public class UserPurchaseHistoryAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョン
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * userId
	 */
	private int userId;

	/**
	 * ツアーID
	 */
	private int tourId;

	/**
	 * ツアー名
	 */
	private String tourName="";

	/**
	 * 単価
	 */
	private float price;

	/**
	 * 人数
	 */
	private int counts;

	/**
	 * 合計金額
	 */
	private float subtotal;

	/**
	 * 購入日
	 */
	private String registrationAt;

	/**
	 * session
	 */
	private Map<String,Object>session;

	/**
	 * 購入履歴リスト
	 */
	private ArrayList<HistoryDTO>UserPurchaseHistoryList = new ArrayList<HistoryDTO>();

	/**
	 * 購入履歴リスト生成メソッド
	 */
	public String execute(){
		String result =ERROR;
		userId = 0;

		if(session.containsKey("userId")){
			userId = (int)session.get("userId");
		}


		ArrayList<HistoryDTO>allList = new ArrayList<HistoryDTO>();
		UserPurchaseHistoryDAO dao = new UserPurchaseHistoryDAO();
		allList = dao.UserPurchaseHistoryList(userId);

		if(allList.size()!=0){
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * userId取得
	 * @return userId
	 */
	public int getUserId(){
		return userId;
	}

	/**
	 * userId格納
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}

	/**
	 * tourId取得
	 * @return tourId
	 */
	public int getTourId(){
		return tourId;
	}

	/**
	 * tourId格納
	 * @param tourId
	 */
	public void setTourId(int tourId){
		this.tourId = tourId;
	}

	/**
	 * tourName取得
	 * @return tourName
	 */
	public String getTourName(){
		return tourName;
	}

	/**
	 * tourName格納
	 * @param tourName
	 */
	public void setTourName(String tourName){
		this.tourName = tourName;
	}

	/**
	 * price取得
	 * @return price
	 */
	public float getPrice(){
		return price;
	}

	/**
	 * price格納
	 * @param price
	 */
	public void setPrice(float price){
		this.price = price;
	}

	/**
	 *counts取得
	 *@return counts
	 */
	public int getCounts(){
		return counts;
	}

	/**
	 * counts格納
	 */
	public void setCounts(int counts){
		this.counts = counts;
	}
	/**
	 *subtotal取得
	 * @return subtotal
	 */
	public float getSubtotal(){
		return subtotal;
	}

	/**
	 * subtotal格納
	 * @param subtotal
	 */
	public void setSubtotal(float subtotal){
		this.subtotal = subtotal;
	}

	/**
	 * registrationAt取得
	 */
	public String getRegisrtationAt(){
		return registrationAt;
	}

	/**
	 * registation格納
	 * @param registationAt
	 */
	public void setRegistrationAt(String registrationAt){
		this.registrationAt = registrationAt;
	}
	/**
	 * session取得
	 * @return session
	 */
	public Map<String,Object>getSession(){
		return session;
	}

	/**
	 * session格納
	 * @param session
	 */
	public void setSession(Map<String,Object>session){
		this.session = session;
	}

	/**
	 * UserPurchaseHistoryList取得
	 * @return UserPurchaseHistoryList
	 */
	public ArrayList<HistoryDTO>getUserPurchaseHistoryList(){
		return UserPurchaseHistoryList;
	}

	/**
	 * UserPurchaseHistoryList格納
	 * @param UserPurchaseHistoryList
	 */
	public void setUserPurchaseHistoryList(ArrayList<HistoryDTO>UserPurchaseHistoryList){
		this.UserPurchaseHistoryList = UserPurchaseHistoryList;
	}
}
