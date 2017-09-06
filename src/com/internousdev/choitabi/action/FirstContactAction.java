package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 問い合わせ画面へ遷移するアクションクラス
 *
 * @author kanako miyazono
 * @version 1.0
 * @since 1.0
 */
public class FirstContactAction extends ActionSupport {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 6239062489411744537L;

    /**
     * 問い合わせページへ遷移する為のメソッド
     *
     * @return 常にSUCCESSを返します。
     */
    public String execute() {
        return SUCCESS;
    }
}
