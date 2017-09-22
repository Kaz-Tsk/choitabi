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
	 * シリアルナンバー
	 */
	private static final long serialVersionUID = 7206773230457585751L;






	 /**
     * 送信者名
     */
    private String contact_name;

    /**
     * 送信者メールアドレス
     */
    private String contact_mailAddress;

    /**
     * 問い合わせ内容
     */
    private String contact_contents;




	/**
	 * セッション
	 */
	private Map<String, Object> session;


	 /**
     * 送信者名を取得するためのメソッド
     */
    public String getContact_name() {
        return contact_name;
    }

    /**
     * 送信者名を格納するためのメソッド
     */
    public void setContact_name(String contact_name) {
        this.contact_name =contact_name;
    }

    /**
     * 送信者メールアドレスを取得するためのメソッド
     */
    public String getContact_mailAddress() {
        return contact_mailAddress;
    }

    /**
     * 送信者メールアドレスを格納ためのメソッド
     */
    public void setContact_mailAddress(String contact_mailAddress) {
        this.contact_mailAddress = contact_mailAddress;
    }

    /**
     * 問い合わせ内容を取得するためのメソッド
     * @return postingText 問い合わせ内容
     */
    public String getContact_contents() {
        return contact_contents;
    }

    /**
     * 問い合わせ内容を格納するためのメソッド
     * @param postingText 問い合わせ内容
     */
    public void setContact_contents(String contact_contents) {
        this.contact_contents= contact_contents;
    }






	/**
	 * お問い合わせ画面へ遷移するためのメソッド
	 * @author kanako miyazono
	 * @since 2017/9/14
	 * @version 1.1
	 * @return SUCCESS
	 */
	public String execute() {
		String rtn = SUCCESS;
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
