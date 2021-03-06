package com.internousdev.choitabi.dto;

/**
 * お問い合わせ情報を保存するためのDTO
 * @author KANAKO MIYAZONO
 * @version 1.0
 * @since 1.0
 */

public class ContactConpleteDTO {


	/**
	 * 名前
	 */

    private String contact_name;



	/**
	 * メールアドレス
	 */
	private String contact_mailAddress;

	/**
	 * 書き込み内容
	 */
	private String contact_contents;



	/**
	 * 名前を取得するメソッド
	 * @return contact_name 名前
	 */
	public String getContact_name() {
		return contact_name;
	}

	/**
	 * 名前を格納するメソッド
	 * @param contact_name 名前
	 */
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}






	/**
	 * メールアドレスを取得するメソッド
	 * @return contact_mailAddress メールアドレス
	 */
	public String getContact_mailAddress() {
		return contact_mailAddress;
	}

	/**
	 * メールアドレスを格納するメソッド
	 * @param contact_mailAddress メールアドレス
	 */
	public void setContact_mailAddress(String contact_mailAddress) {
		this.contact_mailAddress =contact_mailAddress;
	}

	/**
	 * 書き込み内容を取得するメソッド
	 * @return contact_contents 書き込み内容
	 */
	public String getContact_contents() {
		return contact_contents;
	}

	/**
	 *
	 *
	 * 書き込み内容を格納するメソッド
	 * @param contact_contents 書き込み内容
	 */
	public void setContact_contents(String contact_contents) {
		this.contact_contents= contact_contents;
	}
}



