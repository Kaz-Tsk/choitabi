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
 * @version 1.0
 */
public class UserPurchaseHistoryAction extends ActionSupport implements SessionAware{

	/**
	 *シリアルバージョン
	 */
	private static final long serialVersionUID = 8895639892537692245L;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ツアーID
	 */
	private int tourId;

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
	 * セッション情報
	 */
	private Map<String,Object>session;

	/**
	 * 購入履歴リスト
	 */
	private ArrayList<HistoryDTO>UserPurchaseHistoryList = new ArrayList<HistoryDTO>();

	/**
	 * 購入履歴の情報を格納するメソッド
	 */
	public String execute(){
		String result =ERROR;
		userId = 0;

		if(session.containsKey("userId")){
			userId = (int)session.get("userId");
			ArrayList<HistoryDTO>allList = new ArrayList<HistoryDTO>();
			UserPurchaseHistoryDAO dao = new UserPurchaseHistoryDAO();
			allList = dao.UserPurchaseHistoryList(userId);
			if(allList.size()!=0){
				result = SUCCESS;
			}else{
				result = ERROR;
			}
		}
		return result;
	}

	/**
	 * ユーザーID取得
	 * @return userId
	 */
	public int getUserId(){
		return userId;
	}

	/**
	 * ユーザーID格納
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}

	/**
	 * ツアーID取得
	 * @return tourId
	 */
	public int getTourId(){
		return tourId;
	}

	/**
	 * ツアーID格納
	 * @param tourId
	 */
	public void setTourId(int tourId){
		this.tourId = tourId;
	}

	/**
	 * 単価取得
	 * @return price
	 */
	public float getPrice(){
		return price;
	}

	/**
	 * 単価格納
	 * @param price
	 */
	public void setPrice(float price){
		this.price = price;
	}

	/**
	 *人数取得
	 *@return counts
	 */
	public int getCounts(){
		return counts;
	}

	/**
	 * 人数格納
	 * @param counts
	 */
	public void setCounts(int counts){
		this.counts = counts;
	}
	/**
	 * 合計金額取得
	 * @return subtotal
	 */
	public float getSubtotal(){
		return subtotal;
	}

	/**
	 * 合計金額格納
	 * @param subtotal
	 */
	public void setSubtotal(float subtotal){
		this.subtotal = subtotal;
	}

	/**
	 * 購入日取得
	 * @registrationAt
	 */
	public String getRegisrtationAt(){
		return registrationAt;
	}

	/**
	 * 購入日格納
	 * @param registationAt
	 */
	public void setRegistrationAt(String registrationAt){
		this.registrationAt = registrationAt;
	}
	/**
	 * セッション情報取得
	 * @return session
	 */
	public Map<String,Object>getSession(){
		return session;
	}

	/**
	 * セッション情報格納
	 * @param session
	 */
	public void setSession(Map<String,Object>session){
		this.session = session;
	}

	/**
	 * 	購入履歴リスト取得
	 * @return UserPurchaseHistoryList
	 */
	public ArrayList<HistoryDTO>getUserPurchaseHistoryList(){
		return UserPurchaseHistoryList;
	}

	/**
	 * 購入履歴リスト格納
	 * @param UserPurchaseHistoryList
	 */
	public void setUserPurchaseHistoryList(ArrayList<HistoryDTO>UserPurchaseHistoryList){
		this.UserPurchaseHistoryList = UserPurchaseHistoryList;
	}
}
