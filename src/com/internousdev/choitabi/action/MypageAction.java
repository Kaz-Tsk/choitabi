package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.MypageDAO;
import com.internousdev.choitabi.dto.MypageDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザー情報を取得するクラス
 * @author KAZUYUKI TASAKI
 * @since 2017/9/6
 * @version 1.0
 *
 */
public class MypageAction extends ActionSupport implements SessionAware {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ユーザーリスト
	 */
	private List<MypageDTO> UserInfo = new ArrayList<MypageDTO>();

	/**
	 * 購入履歴リスト
	 */
	private List<MypageDTO> PayOffHistoryList = new ArrayList<MypageDTO>();

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * セッション情報
	 */
	private Map<String,Object> session;

	/**
	 * ユーザー結果
	 */
	private String userResult;

	/**
	 * 購入結果
	 */
	private String payOffResult;

	/**
	 * 実行メソッド
	 * DAOに入力された内容を渡して結果を返すためのメソッド
	 * @return result 該当する情報があればSUCCESS なければERROR
	 */
	public String execute() throws SQLException{
		String result = ERROR;
		userId = (int)session.get("userId");
		MypageDAO userdao = new MypageDAO();
		UserInfo = userdao.select(userId);

		if(UserInfo.size()!=0){
			userResult = "done";
		}

		MypageDAO payoffdao = new MypageDAO();
		PayOffHistoryList = payoffdao.PayOffHistoryListselect(userId);

		if(PayOffHistoryList.size()!=0){
			payOffResult = "done";
		}

		if(userResult.equals("done") || payOffResult.equals("done")){
			result = SUCCESS;
		}
		return result;
	}

		/**
		 * ユーザーリストを取得するメソッド
		 * @return UserInfo
		 */
		public List<MypageDTO>getUserInfo(){
			return UserInfo;
		}

		/**
		 * ユーザーリストを格納するメソッド
		 * @param UserInfo
		 */
		public void setUserInfo(List<MypageDTO> userInfo){
			UserInfo = userInfo;
		}

		/**
		 * 購入履歴リストを取得するメソッド
		 * @return PayOffHistoryList
		 */
		public List<MypageDTO>getPayOffHistory(){
			return PayOffHistoryList;
		}
		/**
		 * 購入履歴リストを格納するメソッド
		 * @param PayOffHistoryList
		 */
		public void setPayOffHistoryList(List<MypageDTO> payOffHistoryList){
				PayOffHistoryList = payOffHistoryList;
		}

		/**
		 * ユーザーIDを取得するメソッド
		 * @return userId
		 */
		 public int getUserId(){
			 return userId;
		 }

		 /**
		  * ユーザーIDを格納するメソッド
		  * @param userId
		  */
		 public void setUserId(int userId){
			 this.userId = userId;
		 }

		 /**
		  * セッションを取得するメソッド
		  * @return session
		  */
		 public Map<String,Object> getSession(){
			 return session;
		 }

		 /**
		  * セッションを格納するメソッド
		  * @param session
		  */
		 public void SetSession(Map<String,Object> session){
			 	this.session = session;
		 }

		 /**
		  * ユーザー結果を取得するメソッド
		  * @return userResult
		  */
		 public String getUserResult(){
			 return userResult;
		 }

		 /**
		  * ユーザー結果を格納するメソッド
		  * @param userResult
		  */
		 public void setUserResult(String userResult){
			 this.userResult = userResult;
		 }

		 /**
		  * 購入結果を取得するメソッド
		  * @return payOffResult
		  */
		 public String getPayOffResult(){
			 return payOffResult;
		 }
		 /**
		  * 購入結果を格納するメソッド
		  * @return payOffResult
		  */
		 public void setPayOffResult(String payOffResult){
			 this.payOffResult = payOffResult;
		 }




}