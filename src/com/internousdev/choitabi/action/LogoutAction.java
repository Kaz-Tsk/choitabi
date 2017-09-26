/**
 *
 */
package com.internousdev.choitabi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.LogoutDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
	 * ログアウトするためのクラス
	 * @author KAZUYUKI TASAKI
	 * @since 2017/9/14
	 * @version 1.1
	 */
public class LogoutAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルバージョン
	 */
	private static final long serialVersionUID = -2136617804303987697L;

	/**
	 * セッション情報
	 */
	private Map<String,Object>session;

	/**
	 * ログインフラグ
	 */
	private int loginFlg;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ログアウトする為の実行メソッド
	 * @return ログアウト成功でSUCCESS　失敗でERRORを返す
	 */
	public String execute(){
		String result = ERROR;
		if(session.get("userId")!=null){
			LogoutDAO dao = new LogoutDAO();
			System.out.println(userId);
			dao.update((int)session.get("userId"),0);
			session.clear();
			if(session.isEmpty()){
				result = SUCCESS;
			}
		}
		return result;
	}

	/**
	 * セッション情報格納
	 * @param session
	 */
	public void setSession(Map<String,Object>session){
		this.session =session;
	}

	/**
	 * セッション情報取得
	 * @return session
	 */
	public Map<String,Object>getSession(){
		return session;
	}

	/**
	 * ログインフラグ格納
	 * @param loginFlg
	 */
	public void setLoginFlg(int loginFlg){
		this.loginFlg = loginFlg;
	}

	/**
	 * ログインフラグ取得
	 * @return loginFlg
	 */
	public int getLoginFlg(){
		return loginFlg;
	}

	/**
	 * ユーザーID格納
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}

	/**
	 * ユーザーID取得
	 * @return userId
	 */
	public int getUserId(){
		return userId;
	}
}