package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;


/**
 *  入力された新規ツアーの情報を確認するアクション
 * @author YUKA MATSUMURA
 * @since 2017/09/08
 * @version 1.1
 * */
public class ConfirmTourInsertingAction extends ActionSupport{

	/*
	 * 管理者トップ画面→GoTourInsertPageAction→入力画面→【このAction】→入力内容確認画面→InsertTourAction
	 * フォームから入力されたデータに漏れや不適切な部分（価格に文字列が入っている場合など）がないかをチェックし、
	 * OKならばSUCCESSを返します。
	 * */

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 6481205050973520069L;

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
				newDeparture.equals("") || newRegion.equals("") || newPrefectures.equals("") || newTheme == null ||
			    newComment.equals("") ) {

				errorMsg = "未入力の情報があります";
				System.out.println(errorMsg);

				/*↓画像URLチェック用で作りました。が、現在は画像のプレビューを出すようにしたので不要としています。今後もしかしたら復活するかも…*/
//			}else if(newImg.indexOf(".png") == -1 && newImg.indexOf(".jpg") == -1){
//				errorMsg = "画像にはpngもしくはjpgを指定してください";

			}else{
				/*価格・定員に関して、入力された情報が数値に変換できるかをチェックしています。
				 * 変換できればOK。変換できない＝エラーが起きた場合は、例外処理でエラーメッセージの表示に飛びます*/
				Integer.parseInt(newPrice);
				Integer.parseInt(newPersons);
			}

		}catch(NumberFormatException e){
			errorMsg = "価格・人数の欄には数値を入力してください";
		}catch(NullPointerException e){
			e.printStackTrace();
		}

		if(errorMsg.equals("")){
			result = SUCCESS;
		}
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

	/*エラーメッセージのgetter/setter------------------*/
	public String getErrorMsg(){
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}



}
