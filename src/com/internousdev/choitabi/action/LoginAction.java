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
	 * ユーザーフラグ
	 */
	private int userFlg;

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
		LoginDAO dao = new LoginDAO();
		UsersDTO dto = new UsersDTO();

		dto = dao.select(mailAddress, password,userFlg);

		if(mailAddress.equals(dto.getMailAddress())){
			if(password.equals(dto.getPassword())){
				if(dto.getUserFlg()==3){
				result = "ADMIN";
				session.put("userFlg",dto.getUserFlg());
				}else{
				result =  SUCCESS;
				session.put("userFlg",dto.getUserFlg());
				}
			}
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
	 * userFlg取得メソッド
	 */
	public int getUserFlg(){
		return userFlg;
	}
	/**
	 * userFlg格納メソッド
	 */
	public void setUserFlg(int userFlg){
		this.userFlg = userFlg;
	}
}


