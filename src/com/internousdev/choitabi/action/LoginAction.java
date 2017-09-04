package com.internousdev.choitabi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.LoginDAO;
import com.internousdev.choitabi.dto.UsersDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン画面からログインするクラス
 * 	@author KAZUYUKI TASAKI
 * @since 2017/9/1
 *@version 1.0
 */
	public class LoginAction  extends ActionSupport implements SessionAware {
	/**
	 * シリアルID
	 */
	private static  final long serialVersionUID =1L;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * 携帯メールアドレス
	 */
	private String mailAddress;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * ログインフラグ
	 */
	private boolean loginFlg;
	/**
	 * エラーメッセージ
	 */
	public String errorMsg;
	/**
	 * セッション情報
	 */
	private Map<String,Object>session;
	/**
	 *
	 * @author KAZUYUKI TASAKI
	 * @since 2017/9/1
	 * @version 1.0
	 * @return
	 */
	public String execute(){
		String result = ERROR;
		this.errorMsg = "メールアドレス、もしくはパスワードが間違っています。";
		session.clear();

		LoginDAO dao = new LoginDAO();
		UsersDTO dto = new UsersDTO();

		dto = dao.select(mailAddress, password);

		if(mailAddress.equals(dto.getMailAddress())){
			if(password.equals(dto.getPassword())){
				if(dto.isUserdelFlg() ==false){
					if(dao.update(dto.getMailAddress(),dto.getPassword())>0){
						/*update実行後のログインフラグを取得する取得するために再度select*/
						dto=dao.select(dto.getMailAddress(),dto.getPassword());

						loginFlg = dto.isLoginFlg();
						userId = dto.getUserId();

						result = SUCCESS;
					}
				}

			}
		}else{
			session.put("errorMsg",false);
		}
		return result;
	}
	/**
	 * メールアドレス取得メソッド
	 * @return mailAddress メールアドレス
	 */
	public String getMailAddress(){
		return mailAddress;
	}
	/**
	 * メールアドレス格納メソッド
	 *
	 * @param mailAddress メールアドレス
	 */
	public void setMailAddress(String mailAddress){
		this.mailAddress = mailAddress;
	}
	/**
	 * パスワード取得メソッド
	 * @return password パスワード
	 */
	public String getPassword(){
		return password;
	}
	/**
	 * パスワード格納メソッド
	 * @param password パスワード
	 */
	public void setPassword(String password){
		this.password = password;
	}
	/**
	 * ユーザーID取得メソッド
	 * @return userId ユーザーID
	 */
	public int getUserId(){
		return userId;
	}
	/**
	 * ユーザーID格納メソッド
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}
	/**
	 * ログインフラグ取得メソッド
	 * @retrun loginFlg ログインフラグ
	 */
	public boolean isLoginFlg(){
		return loginFlg;
	}
	/**
	 * ログインフラグ格納メソッド
	 * @param loginFlg ログインフラグ
	 */
	public void seLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}
	/**
	 * セッション取得メソッド
	 * @return session セッション
	 */
	public Map<String,Object> getSession(){
		return session;
	}
	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	/**
	 * エラーメッセージ取得メソッド
	 * @return errorMsg エラーメッセージ
	 */
	public String getErrorMsg(){
		return errorMsg;
	}
	/**
	 * エラーメッセージ格納メソッド
	 * @param errorMsg エラーメッセージ
	 */
	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}

}


