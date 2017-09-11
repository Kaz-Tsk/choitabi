package com.internousdev.choitabi.dto;
/**
 * ツアー情報を格納・取得するクラス
 * @author kanako miyazono
 * @since 2017/9/11
 * @version 1.1
 */
public class KanriContactDTO {
	/**
     * 問い合わせ者名
     */
    private String contact_name
;

    /**
     * メールアドレス
     */
    private String contact_mailAddress
;

    /**
     * 問い合わせ内容
     */
    private String contact_contents
;

    /**
     * 登録日
     */
    private String registrationDate;




	/**
	*	問い合わせ者名を取得するメソッド
	*	@return contactName 問い合わせ者名
	*/
	public String getContact_name
() {
		return contact_name
;
	}

	/**
	*	問い合わせ者名を格納する
	*	@param contactName 問い合わせ者名
	*/
	public void setContact_name
(String contact_name
) {
		this.contact_name
 = contact_name
;
	}

	/**
	*	メールアドレスを取得するメソッド
	*	@return email メールアドレス
	*/
	public String getContact_mailAddress
() {
		return contact_mailAddress
;
	}

	/**
	*	メールアドレスを格納する
	*	@param email メールアドレス
	*/
	public void setContact_mailAddress
(String contact_mailAddress
) {
		this.contact_mailAddress
 = contact_mailAddress
;
	}

	/**
	*	問い合わせ内容を取得するメソッド
	*	@return comment 問い合わせ内容
	*/
	public String getContact_contents
() {
		return contact_contents
;
	}

	/**
	*	問い合わせ内容
	*
を格納する
	*	@param comment 問い合わせ内容
	*/
	public void setContact_contents(String contact_contents){
		this.contact_contents = contact_contents;
	}

	/**
	*	登録日を取得するメソッド
	*	@return registrationDate 登録日
	*/
	public String getRegistrationDate() {
		return registrationDate;
	}

	/**
	*	登録日を格納する
	*	@param registrationDate 登録日
	*/
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}






}