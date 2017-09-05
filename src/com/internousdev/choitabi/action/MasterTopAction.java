/**
 *
 */
package com.internousdev.choitabi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理者TOP画面へ遷移するアクション
 * @author SHUN NAGAO
 * @since 2017/9/5
 * @version 1.1
 */
public class MasterTopAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -7706440317700426984L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;


	/**
	 * 管理者TOP画面へ遷移するためのメソッド
	 * @author SHUN NAGAO
	 * @since 2017/9/5
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
