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
 * @author MARI KAMBE
 * @author YUUKI ICHIJOU
 * @since 2017/8/02
 * @version 1.1
 */
public class LogoutAction extends ActionSupport implements SessionAware {


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -3843749424542012923L;

	/**
	 * セッション取得
	 */
	public Map<String,Object> session;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ログインフラグ
	 */
	private boolean loginFlg;


	/**
	 * セッションをクリアするための実行メソッド
	 * @author MARI KAMBE
	 * @since 2017/8/02
	 * @version 1.1
	 */
	public String execute() {
		String result = ERROR;

		if (session.get("userId") != null) {
			LogoutDAO dao = new LogoutDAO();
			dao.update((int) session.get("userId"), false);
			session.clear();
			if (session.isEmpty()) {
				result = SUCCESS;
			}
		}
		return result;
	}


	/**
	 * セッション取得メソッド
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * ユーザーID取得メソッド
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーID格納メソッド
	 *
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * ログインフラグ取得メソッド
	 */
	public boolean isLoginFlg() {
		return loginFlg;
	}

	/**
	 * ログインフラグ格納メソッド
	 */
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

}
