/**
 *
 */
package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.LogoutDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author KAZUYUKI TASAKI
 *@since 2017/9/4
 *@version 1.0
 *ログアウトする為のクラス
 */
public class LogoutAcution extends ActionSupport implements SessionAware {

	/**
	 * シリアルバージョン
	 */
	private static final long serialVersionUID = 1L;

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
	 * セッション取得メソッド
	 * @return session
	 */
	public Map<String,Object> session(){
		return session;
	}
	/**
	 * セッション格納メソッド
	 * @param session
	 */
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	/**
	 * 実行メソッド
	 * ログインした際に取得したセッションの内容を削除
	 * ログインフラグをfalseにするメソッド
	 * @throws SQLException エラー処理
	 */
	public String execute()throws SQLException{
		LogoutDAO dao = new LogoutDAO();
		String result = ERROR;

		if(session.get("userId")==null){
			return result;
		}

		userId = (int)session.get("userId");

		int count = 0;
		count = dao.update(userId,false);

		if(count > 0){
			session.clear();
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * ユーザーID取得メソッド
	 * @return useId ユーザーID
	 */
	public int getUserId(){
		return userId;
	}
	/**
	 * ユーザーID格納メソッド
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}
	/**
	 * ログインフラグ取得メソッド
	 * @return  isloginFlg
	 */
	public boolean isLoginFlg(){
		return loginFlg;
	}
	/**
	 * ログインフラグ格納メソッド
	 * @param loginFlg
	 */
	public void loginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}
}
