package com.internousdev.choitabi.action;

import java.net.UnknownHostException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.ContactCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 問い合わせフォームからの情報をMongoDBにインサートするアクション
 * @author kanako miyazono
 * @since 2017/9/5
 * @version 1.1
 *
 */
public class CompleteContactAction extends ActionSupport implements SessionAware {


   private static final long serialVersionUID = 7193520504007481422L;



	/**
	 * お問い合わせ者の名前
	 */
	private String contact_name;


    /**
	 * メールアドレス
	 */
	private String contact_mailAddress;

	/**
	 * お問い合わせ本文
	 */
	private String contact_contents;

	/**
	 * 登録日
	 */
    /*private String registration_date;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 説明 お問い合わせ情報をデータベースに登録できたらSUCCESSを返すメソッド
	 * @author kanako miyazono
	 * @since 2017/9/5
	 * @version 1.1
	 */
	public String execute() {
		String result = ERROR;
		ContactCompleteDAO dao = new ContactCompleteDAO ();

		try {
			if (dao.dbInsert(contact_name,contact_mailAddress,contact_contents)) {
				result = SUCCESS;

				return result;
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * お問い合わせ者の名前を取得するメソッド
	 * @return contactName お問い合わせ者の名前
	 */
	public String getContact_name() {
		return contact_name;
	}

	/**
	 * お問い合わせ者の名前を格納する
	 * @param contactName  お問い合わせ者の名前
	 */
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	/**
	 * メールアドレスを取得するメソッド
	 * @return email メールアドレス
	 */
	public String getContact_mailAddress() {
		return contact_mailAddress;
	}

	/**
	 * メールアドレスを格納する
	 * @param email メールアドレス
	 */
	public void setContact_mailAddress(String contact_mailAddress) {
		this.contact_mailAddress= contact_mailAddress;
	}

	/**
	 * お問い合わせ本文を取得するメソッド
	 * @return comment お問い合わせ本文
	 */
	public String getContact_contents() {
		return contact_contents;
	}

	/**
	 * お問い合わせ本文を格納する
	 * @param comment お問い合わせ本文
	 */
	public void setContact_contents(String contact_contents) {
		this.contact_contents = contact_contents;
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
