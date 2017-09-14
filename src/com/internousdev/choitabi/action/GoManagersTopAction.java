package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

public class GoManagersTopAction extends ActionSupport{

	/**@author YUKA MATSUMURA
	 * @since 2017/09/14
	 * @version 1.1
	 *
	 * 管理画面の各操作ページからトップページに戻るときに動くアクションです。
	 * 現時点はSUCCESSを返すだけのアクションです。今後必要によっては処理が増えるかも…（セッション管理とか）
	 */

	public String execute(){
		String result = SUCCESS;

		return result;
	}

}
