package com.internousdev.choitabi.action;

import java.net.UnknownHostException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.InsertContactDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 問い合わせフォームからの情報をMongoDBへ
 * @author kanako miyazono
 * @since 2017/9/4
 * @version 1.1
 *
 */
public class InsertContactAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -6110908008518755876L;

	/**
	 * お問い合わせ者の名前
	 */
	private String contactName;

	/**
	 * メールアドレス
	 */
	private String email;


	/**
	 * お問い合わせ本文
	 */
	private String comment;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 説明 お問い合わせ情報をデータベースに登録できたらSUCCESSを返すメソッド
	 * @author NORIO SAITO
	 * @since 2017/8/22
	 * @version 1.1
	 * @return ERROR、SUCCESS
	 */
	public String execute() {
		String result = ERROR;
		InsertContactDAO dao = new InsertContactDAO();

		try {
			if (dao.dbInsert(contactName, email, comment)) {
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
	public String getContactName() {
		return contactName;
	}

	/**
	 * お問い合わせ者の名前を格納する
	 * @param contactName  お問い合わせ者の名前
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * メールアドレスを取得するメソッド
	 * @return email メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレスを格納する
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * お問い合わせ本文を取得するメソッド
	 * @return comment お問い合わせ本文
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * お問い合わせ本文を格納する
	 * @param comment お問い合わせ本文
	 */
	public void setComment(String comment) {
		this.comment = comment;
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
