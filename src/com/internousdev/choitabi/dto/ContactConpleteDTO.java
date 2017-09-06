package com.internousdev.choitabi.dto;

/**
 * お問い合わせ情報を保存するためのDTO
 * @author kanako miyazono
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
	private String contact_mailAddress
;

	/**
	 * 書き込み内容
	 */
	private String contact_contents;

	/**
	 * 問い合わせ日

	private String formResistration;
*/

	/**
	 * 名前を取得するメソッド
	 * @return formName 名前
	 */
	public String getContact_name() {
		return contact_name;
	}

	/**
	 * 名前を格納するメソッド
	 * @param formName 名前
	 */
	public void setForm_name_a(String contact_name) {
		this.contact_name = contact_name;
	}






	/**
	 * メールアドレスを取得するメソッド
	 * @return formAddress メールアドレス
	 */
	public String getContact_mailAddress
() {
		return contact_mailAddress;
	}

	/**
	 * メールアドレスを格納するメソッド
	 * @param formAddress メールアドレス
	 */
	public void setContact_mailAddress(String contact_mailAddress) {
		this.contact_mailAddress =contact_mailAddress;
	}

	/**
	 * 書き込み内容を取得するメソッド
	 * @return formContents 書き込み内容
	 */
	public String getContact_contents
() {
		return contact_contents;
	}

	/**
	 * 書き込み内容を格納するメソッド
	 * @param formContents 書き込み内容
	 */
	public void setContact_contents(String contact_contents) {
		this.contact_contents= contact_contents;
	}
}



    /**
     * 記入を取得する為のメソッド
     * @return formId 記入

    public String getFormId() {
        return formId;
    }

    /**
     * 記入を格納する為のメソッド
     * @param formId 記入

    public void setFormId(String formId) {
        this.formId = formId;
    }

    /**
     * 記入を取得する為のメソッド
     * @return formResistration 記入

    public String getFormResistration() {
        return formResistration;
    }

    /**
     * 記入を格納する為のメソッド
     * @param formResistration 記入

    public void setFormResistration(String formResistration) {
        this.formResistration = formResistration;
    }
}
*/