package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

public class ConfirmTourInsertingAction extends ActionSupport{

	/**@author YUKA MATSUMURA
	 * @since 2017/09/08
	 * @version 1.1
	 *
	 *管理者トップ画面→GoTourInsertPageAction→入力画面→【このAction】→入力内容確認画面→InsertTourAction
	 * 管理側で、ツアーの新規登録時に使用するアクションです。
	 * フォームから入力されたデータに漏れや不適切な部分（価格に文字列が入っている場合など）がないかをチェックし、
	 * OKならばSUCCESSを返します。
	 *（※11日朝現在、未完成です）
	 *
	 * */

	/*新規ツアーのID（自動で入るので0のままでOKです）*/
	private int newTourId = 0;

	/*入力されたツアー名*/
	private String newTourName;

	/*入力された価格*/
	private String newPrice;

	/*入力された定員*/
	private String newPersons;

	/*入力された出発地*/
	private String newDeparture;

	/*入力されたエリア*/
	private String newRegion;

	/*入力された都道府県*/
	private String newPrefectures;

	/*入力されたテーマ*/
	private String newTheme;

	/*入力されたコメント*/
	private String newComment;

	/*入力された画像URL*/
	private String newImg;

	/*エラーメッセージ（入力された情報に誤りがあった場合などに使われます）*/
	private String errorMsg="";



	/*executeメソッド-------------------------------------------------*/
	public String execute(){
		String result = ERROR;


		/*もし、画像に何も指定されていなかったら、デフォルトで「NO IMAGE」の画像を入れます。*/
		if(newImg.equals("")){
			newImg = "img/no_image.jpg";
		}

		try{
			if (	newTourName.equals("")|| newPrice.equals("") || newPersons.equals("") ||
				newDeparture.equals("") || newRegion.equals("") || newPrefectures.equals("") || newTheme.equals("") ||
			    newComment.equals("") ) {

				errorMsg = "情報が完全に入力されていません";
				System.out.println(errorMsg);

			}else if(newImg.indexOf(".png") == -1 && newImg.indexOf(".jpg") == -1){
				/*後消し*/System.out.println("ConfirmTourInsertingAction : " + newImg.indexOf(".png"));
				/*後消し*/System.out.println("ConfirmTourInsertingAction : " + newImg.indexOf(".jpg"));
				errorMsg = "画像にはpngもしくはjpgを指定してください";
				System.out.println(errorMsg);

			}else{
				/*価格・定員に関して、入力された情報が数値に変換できるかをチェックしています。
				 * 変換できればOK。変換できない＝エラーが起きた場合は、例外処理でエラーメッセージの表示に飛びます*/
				int newPrice_int = Integer.parseInt(newPrice);
				int newPersons_int = Integer.parseInt(newPersons);
				/*後消し*/System.out.println("ConfirmTourInsertingAction - newTourId(0ならOK) : " + newTourId);
				/*後消し*/System.out.println("ConfirmTourInsertingAction : " + newTourName);
				/*後消し*/System.out.println("ConfirmTourInsertingAction : " + newPrice_int);
				/*後消し*/System.out.println("ConfirmTourInsertingAction : " + newPersons_int);
				/*後消し*/System.out.println("ConfirmTourInsertingAction : " + newDeparture);
			}

		}catch(NumberFormatException e){
			errorMsg = "価格・人数の欄には数値を入力してください";
			/*後消し*/System.out.println(errorMsg);
		}catch(NullPointerException e){
			System.out.println("いずれかの情報の受け渡しに失敗しました");
			e.printStackTrace();
		}



		if(errorMsg.equals("")){
			result = SUCCESS;
		}
		/*後消し*/System.out.println("ConfirmnewingAction - result : " + result);
		return result;

	}

	/*以下、変数のgetter/setter-----------------------------------------------------*/


	public int getNewTourId(){
		return newTourId;
	}

	public void setNewTourId(int newTourId){
		this.newTourId = newTourId;
	}

	public String getNewTourName(){
		return newTourName;
	}

	public void setNewTourName(String newTourName){
		this.newTourName = newTourName;
	}

	public String getNewPrice(){
		return newPrice;
	}

	public void setNewPrice(String newPrice){
		this.newPrice = newPrice;
	}

	public String getNewPersons(){
		return newPersons;
	}

	public void setNewPersons(String newPersons){
		this.newPersons = newPersons;
	}

	public String getNewDeparture(){
		return newDeparture;
	}

	public void setNewDeparture(String newDeparture){
		this.newDeparture = newDeparture;
	}

	public String getNewRegion(){
		return newRegion;
	}

	public void setNewRegion(String newRegion){
		this.newRegion = newRegion;
	}

	public String getNewPrefectures(){
		return newPrefectures;
	}

	public void setNewPrefectures(String newPrefectures){
		this.newPrefectures = newPrefectures;
	}

	public String getNewTheme(){
		return newTheme;
	}

	public void setNewTheme(String newTheme){
		this.newTheme = newTheme;
	}

	public String getNewComment(){
		return newComment;
	}

	public void setNewComment(String newComment){
		this.newComment = newComment;
	}

	public String getNewImg(){
		return newImg;
	}

	public void setNewImg(String newImg){
		this.newImg = newImg;
	}








}
