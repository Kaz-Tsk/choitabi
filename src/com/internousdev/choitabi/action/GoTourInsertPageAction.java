package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

public class GoTourInsertPageAction extends ActionSupport{


	/**@author : YUKA MATSUMURA
	 * @since : 2017/09/08
	 * @version : 1.1
	 *
	 * 管理画面で、ツアーの一覧から「新規ツアーを登録する」をクリックすると、Strutsに送られるアクションです。
	 * 今はまだSUCCESSを返すだけの状態ですが、後々管理者アカウントのセッションをやり取りする変数が入ると思います。
	 * */


	public String execute(){
		String result = SUCCESS;
		return result;
	}

}
