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
	 *シリアルバージョン
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * session情報
	 */
	private Map<String,Object> session;

	/**
	 * ユーザーリスト
	 */
	private ArrayList<MypageDTO> User = new ArrayList<MypageDTO>();

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ユーザー情報を表示するための実行メソッド
	 * @author KAZUYUKI TASAKI
	 * @return ユーザー情報取得でSUCCESS 失敗でERROR
	 */
	public String execute(){
		if(session.get("userId")==null){
			return ERROR;
		}

		/**
		 * sessionからユーザーIDを取得
		 */
		userId = (int)session.get("userId");
		MypageDAO mypagedao = new MypageDAO();

		User = mypagedao.select(userId);

		if(User.size()==0){

			return ERROR;
		}else{
			return SUCCESS;
		}
	}

	/**
	 * sessionを取得
	 */
	public Map<String,Object> getSession(){
		return session;
	}

	/**
	 * sessionを格納
	 */
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	/**
	 * ユーザーリストを取得
	 */
	public ArrayList<MypageDTO>getUser(){
		return User;
	}

	/**
	 * ユーザーリストを格納
	 */
	public void setUserList(ArrayList<MypageDTO> userList){
		User = userList;
	}

	/**
	 * ユーザーIDを取得
	 */
	public int getUserId(){
		return userId;
	}

	/**
	 * ユーザーIDを格納
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}
}