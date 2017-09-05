/**
 *
 */
package com.internousdev.choitabi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
* TOP画面に遷移するクラス
* @author SHUN NAGAO
* @since 2017/09/05
* @version 1.1
*
*/
public class MainTopAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * セッション情報(ユーザーID)
	 */
	private Map<String, Object> session;


	/**
	 * トップ画面に戻るための実行メソッド
	 * @author SHUN NAGAO
	 * @since 2017/09/05
	 * @version 1.1
	 */
	public String execute() {
			String rtn = SUCCESS;;

			return rtn;
		}



	/**
	 * セッション情報を取得するメソッド
	 * @return session セッション情報
	 */
		public Map<String, Object> getSession() {
			return session;
		}

	/**
	 * セッション情報を格納するメソッド
	 * @param session セットする セッション情報
	 */
		public void setSession(Map<String, Object> session) {
			this.session = session;
		}


	}
