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
 * @version 1.0
 */
	public class LoginAction  extends ActionSupport implements SessionAware {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 8445527315894179667L;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * 携帯メールアドレス
	 */
	private String mailAddress;

	/**
	 * ログインフラグ
	 */
	private int loginFlg;
	/**
	 * セッション情報(ユーザーID)
	 */
	private Map<String,Object>session;

	/**
	 *管理者
	 */
	private boolean admin=true;

	/**
	 *ログインするための実行メソッド
	 * @author KAZUYUKI TASAKI
	 * @since 2017/9/1
	 * @version 1.0
	 * @return ログイン成功:SUCCESS  失敗:ERROR  管理者:admin を返す
	 */
	public String execute(){
		String result = ERROR;
		LoginDAO dao = new LoginDAO();
		UsersDTO dto = new UsersDTO();
		dto = dao.select(mailAddress, password);

		if(loginFlg==1){
			return ERROR;
		}

		if(mailAddress.equals(dto.getMailAddress())){
			if(password.equals(dto.getPassword())){
				if(dto.getLoginFlg()!=1){
					if(admin){
						dao.update(dto.getUserId());
						int userFlg = (int)dto.getUserFlg();
						if(userFlg ==3){
							session.put("userFlg", dto.getUserFlg());
							session.put("userId", dto.getUserId());
							session.put("loginFlg",dto.getLoginFlg());
							result = "admin";
						}else{
							session.put("userFlg", dto.getUserFlg());
							session.put("userId", dto.getUserId());
							session.put("loginFlg", dto.getLoginFlg());
							result = SUCCESS;
						}
					}
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
	 * ログインフラグ取得メソッド
	 * @return loginFlg
	 */
	public int getLoginFlg(){
		return loginFlg;
	}

	/**
	 * ログインフラグ格納メソッド
	 * @param loginFlg
	 */
	public void setLoginFlg(int loginFlg){
		this.loginFlg= loginFlg;
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
	}


