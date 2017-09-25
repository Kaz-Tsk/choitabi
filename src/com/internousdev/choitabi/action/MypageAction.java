package com.internousdev.choitabi.action;

import java.util.ArrayList;
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
	 * シリアルバージョン
	 */
	private static final long serialVersionUID = 8087800859437095577L;

	/**
	 * セッション情報
	 */
	private Map<String,Object>session;

	/**
	 * 	ユーザーリスト
	 */
	private ArrayList<MypageDTO> User = new ArrayList<MypageDTO>();

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ユーザー情報を表示するための実行メソッド
	 * @return ユーザー情報取得でSUCCESS　失敗でERRORを返す
	 */
	public String execute(){
		if(session.get("userId")==null){
			return ERROR;
		}
		userId = (int)session.get("userId");
		MypageDAO dao = new MypageDAO();

		User = dao.select(userId);

		if(User.size()==0){
			return ERROR;

		}else{
			return SUCCESS;
		}
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
	 * ユーザーリスト取得
	 * @return User
	 */
	public ArrayList<MypageDTO> getUser(){
		return User;
	}

	/**
	 * ユーザーリスト格納
	 * @param User
	 */
	public void setUser(ArrayList<MypageDTO> userList){
		User =userList;
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
}