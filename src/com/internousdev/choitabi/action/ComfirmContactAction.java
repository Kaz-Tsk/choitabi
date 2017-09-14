package com.internousdev.choitabi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 問い合わせ確認画面へ遷移するアクションクラス
 *
 * @author kanakomiyazono
 * @version 1.0
 * @since 1.0
 */
public class ComfirmContactAction extends ActionSupport implements SessionAware {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 7193520504007481422L;

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
     * エラーメッセージを
     */
   private String errorMessage;



   private Map<String, Object> session;






    /**
     * 問い合わせ画面の情報を取得して問い合わせ内容確認画面に表示するためのメソッド
     * （入力されない箇所が一つでもあればERROR）
     */
    public String execute() {



    	if(contact_name.equals("")){
            errorMessage="名前が入力されていません";
    		return ERROR;}

    	if(contact_mailAddress.equals("")){
    			errorMessage="メールアドレスが入力されていません。";
    		return ERROR;}

    	if(contact_contents.equals("")){
    			errorMessage="お問い合わせ内容が入力されていません";
    			return ERROR;}


    	System.out.println("名前：" + contact_name);
    	System.out.println("メールアドレス：" + contact_mailAddress);
    	System.out.println("問い合わせ内容：" + contact_contents);


        return SUCCESS;
    }


    /**
     * 上記のexecuteでエラーが出た場合のエラーメッセージを取ってくるメソッド
     */
    public String getErrorMessage() {
    	return errorMessage;
    }

    /**
     * 上記のexexuteでエラーが出た場合のエラーメッセージを入れておく箱メソッド
     * @param errorMessage
     */
    public void setErrorMessage(String errorMessage) {
    	this.errorMessage = errorMessage;

    }






    /**
     * 送信者名を取得するためのメソッド
     * @return postingName 送信者名
     */
    public String getContact_name
() {
        return contact_name
;
    }

    /**
     * 送信者名を格納するためのメソッド
     * @param postingName 送信者名
     */
    public void setContact_name(String contact_name
) {
        this.contact_name =contact_name;
    }

    /**
     * 送信者メールアドレスを取得するためのメソッド
     * @return postingEmail 送信者メールアドレス
     */
    public String getContact_mailAddress
() {
        return contact_mailAddress;
    }

    /**
     * 送信者メールアドレスを格納ためのメソッド
     * @param postingEmail
     *            送信者メールアドレス
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