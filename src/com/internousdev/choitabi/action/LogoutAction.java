/**
 *
 */
package com.internousdev.choitabi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.util.login.LogoutDAO;
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
	 * session情報
	 */
	private Map<String,Object>session;

	/**
	 * ログインフラグ
	 */
	private boolean loginFlg;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ログアウトする為の実行メソッド
	 * @return ログアウト成功でSUCCESS　失敗でERROR
	 */
	public String execute(){
		String result = ERROR;
		if(session.get("userId")!=null){
			LogoutDAO dao = new LogoutDAO();
			dao.update((int)session.get("userId"),false);
			session.clear();
			if(session.isEmpty()){
				result = SUCCESS;
				}
		}
		return result;
	}

	/**
	 * session格納
	 * @param session
	 */
	public void setSession(Map<String,Object>session){
		this.session =session;
	}

	/**
	 * session取得
	 * @return session
	 */
	public Map<String,Object>getSession(){
		return session;
	}

	/**
	 * loginFlg格納
	 * @param loginFlg
	 */
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}

	/**
	 * loginFlg取得
	 * @return
	 */
	public boolean isLoginFlg(){
		return loginFlg;
	}

	/**
	 * userId格納
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}

	/**
	 * userId取得
	 * @return userId
	 */
	public int getUserId(){
		return userId;
	}
}