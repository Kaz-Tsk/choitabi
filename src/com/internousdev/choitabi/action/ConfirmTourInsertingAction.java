package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

public class ConfirmTourInsertingAction extends ActionSupport{

	/**@author YUKA MATSUMURA
	 * @since 2017/09/08
	 * @version 1.1
	 *
	 * 管理画面から、ツアーの新規登録時に使用するアクションです。
	 * フォームから入力されたデータに漏れや不適切な部分（価格に文字列が入っている場合など）がないかをチェックし、
	 * OKならばSUCCESSを返します。
	 *（※11朝現在、未完成です）
	 * */

	/*入力されたツアー名*/
	private String newTourName;

	/*入力された価格*/
	private String newTourPrice;

	/*入力された定員*/
	private String newTourPersons;

	/*入力された出発地*/
	private String newTourDeparture;

	/**/


public String execute(){
	String result = SUCCESS;
	return result;
}



	/*以下、変数のgetter/setter-----------------------------------------------------*/

}
