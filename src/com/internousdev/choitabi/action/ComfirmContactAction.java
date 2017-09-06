package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 問い合わせ確認画面へ遷移するアクションクラス
 *
 * @author kanakomiyazono
 * @version 1.0
 * @since 1.0
 */
public class ComfirmContactAction extends ActionSupport {

    /**
     * 生成されたシリアルナンバー(規定)
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
     * 問い合わせ画面の情報を取得して問い合わせ内容確認画面に表示するためのメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute() {
    	System.out.println("名前：" + contact_name);
    	System.out.println("メールアドレス：" + contact_mailAddress);
    	System.out.println("問い合わせ内容：" + contact_contents);
        return SUCCESS;
    }


    //送信者名を取得する

    public String getContact_name() {
        return contact_name;
    }

    //送信者メールアドレスを取得

    public String getContact_mailAddress() {
        return contact_mailAddress;
    }

   // 問い合わせ内容を取得するためのメソッド

    public String getContact_contents() {
        return contact_contents;
    }


    //送信者名を格納
    public void setContact_name(String contact_name) {
        this.contact_name =contact_name;
    }


    //送信者メールアドレスを格納

    public void setContact_mailAddress(String contact_mailAddress) {
        this.contact_mailAddress = contact_mailAddress;
    }


    // 問い合わせ内容を格納
    public void setContact_contents(String contact_contents) {
        this.contact_contents= contact_contents;
    }




}