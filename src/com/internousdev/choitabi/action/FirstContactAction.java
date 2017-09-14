package com.internousdev.choitabi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * お問い合わせ画面へ遷移するアクション
 * @author kanako miyazono
 * @since 2017/9/14
 * @version 1.1
 */
public class FirstContactAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -8491587999319615832L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * お問い合わせ画面へ遷移するためのメソッド
	 * @author kanako miyazono
	 * @since 2017/8/22
	 * @version 1.1
	 * @return SUCCESS
	 */
	public String execute() {
		String rtn = SUCCESS;
		;

		return rtn;
	}

	/**
	 * セッションを取得するメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納する
	 * @param session  セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
