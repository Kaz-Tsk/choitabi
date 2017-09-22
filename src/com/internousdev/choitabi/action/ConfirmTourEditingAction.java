package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

public class ConfirmTourEditingAction extends ActionSupport{

	/**
	 * @author YUKA MATSUMURA
	 * @since 2017/09/07
	 * @version 1.1
	 *
	 * 管理-ツアー編集で使うクラスです。
	 * 入力画面→編集完了画面までの橋渡しを行います。
	 * 入力された情報に漏れが無いか、などのチェックもここで行います。
	 * */


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -1258679400956968932L;


	/**編集前の情報を保存する変数です。*/
	/*ツアーID*/
	private int currentTourId;

	/*ツアー名*/
	private String currentTourName;
	/*価格*/
	private int currentPrice;
	/*定員*/
	private int currentPersons;
	/*出発地*/
	private String currentDeparture;
	/*エリア*/
	private String currentRegion;
	/*県*/
	private String currentPrefectures;
	/*テーマ*/
	private String currentTheme;
	/*コメント*/
	private String currentComment;
	/*画像URL*/
	private String currentImg;



	/**編集後の情報＝入力されたデータを格納する変数です(すべて文字列として受け取るようにしています)
	 *  編集画面から、価格・人数を入れる欄に文字列を入力したところ、javaに渡される際に数値に変換できずStrutsエラーがでてしまいました。
	 *  そのため、一度文字列として受け取らせ、javaのInteger.Parseint()関数を使って数値に変換するステップを踏んでいます。
	 * */
	/*こっちには、ツアーIDはありません。
	 * （IDは変わらない＝現在のデータだけを保持すればOKなので）
	 * 「UodateTourAction」まで、↑で用意したcurrentTourIdを持っていきます。*/

	/*ツアー名*/
	private String editTourName;
	/*価格*/
	private String editPrice;
	/*定員*/
	private String editPersons;
	/*出発地*/
	private String editDeparture;
	/*エリア*/
	public String editRegion;
	/*県*/
	public String editPrefectures;
	/*テーマ*/
	public String editTheme;
	/*コメント*/
	public String editComment;
	/*画像URL*/
	public String editImg;

	/*削除確認チェック(チェックボックスにレ点がつくと、ここがtrueになります)*/
	private String deleteCheck = "false";

	/*エラーメッセージ（入力された情報に誤りだった場合などに使われます）*/
	private String errorMsg = "";



	/*executeメソッド-------------------------------------------------*/
	public String execute(){
		String result = ERROR;

		/*もし、画像URLに何も書かれていなかったら、デフォルトの「NO IMAGE」画像のURLを入れておきます。*/
		if(editImg.equals("")){
			editImg = "img/no_image.jpg";
		}

		try{
			if(deleteCheck.equals("true")){
				result = SUCCESS;

			}else if(deleteCheck.equals("false") &&
					 (editTourName.equals("")|| editPrice.equals("") || editPersons.equals("") ||
					  editDeparture.equals("") || editRegion.equals("") || editPrefectures.equals("") || editTheme == null ||
					  editComment.equals("") )) {
				errorMsg = "未入力の情報があります";
				System.out.println(errorMsg);

				/*↓画像URLチェック用で作りました。が、現在は画像のプレビューを出すようにしたので不要としています。今後もしかしたら復活するかも…*/
//			}else if(editImg.indexOf(".png") == -1 && editImg.indexOf(".jpg") == -1){
//				/*後消し*/System.out.println(editImg.indexOf(".png"));
//				/*後消し*/System.out.println(editImg.indexOf(".jpg"));
//				errorMsg = "画像URLにはpngもしくはjpgを指定してください";
//				System.out.println(errorMsg);

			}else{
				/*価格・定員に関して、入力された情報が数値に変換できるかをチェックしています。
				 * 変換できればOK。変換できない＝エラーが起きた場合は、例外処理でエラーメッセージの表示に飛びます*/
				Integer.parseInt(editPrice);
				Integer.parseInt(editPersons);
			}

		}catch(NumberFormatException e){
			errorMsg = "価格・人数の欄には数値を入力してください";
		}catch(NullPointerException e){
			e.printStackTrace();
		}

		/*エラーメッセージが空白だったら、OKとしてSUCCESSを返します*/
		if(errorMsg.equals("")){
			result = SUCCESS;
		}
		return result;

	}



	/*編集前の情報のgetter/setter---------------------------------------------*/

	/*ツアーIDのgetter*/
	public int getCurrentTourId(){
		return currentTourId;
	}

	/*ツアー名のsetter*/
	public void setCurrentTourId(int currentTourId){
		this.currentTourId = currentTourId;
	}

	/*ツアー名のgetter*/
	public String getCurrentTourName(){
		return currentTourName;
	}

	/*ツアー名のsetter*/
	public void setCurrentTourName(String currentTourName){
		this.currentTourName = currentTourName;
	}

	/*価格のgetter*/
	public int getCurrentPrice(){
		return currentPrice;
	}

	/*価格のsetter*/
	public void setCurrentPrice(int currentPrice){
		this.currentPrice = currentPrice;
	}

	/*定員のgetter*/
	public int getCurrentPersons(){
		return currentPersons;
	}

	/*定員のsetter*/
	public void setCurrentPersons(int currentPersons){
		this.currentPersons = currentPersons;
	}

	/*出発地のgetter*/
	public String getCurrentDeparture(){
		return currentDeparture;
	}

	/*出発地のsetter*/
	public void setCurrentDeparture(String currentDeparture){
		this.currentDeparture = currentDeparture;
	}

	/*エリアのgetter*/
	public String getCurrentRegion(){
		return currentRegion;
	}

	/*エリアのsetter*/
	public void setCurrentRegion(String currentRegion){
		this.currentRegion = currentRegion;
	}

	/*県のgetter*/
	public String getCurrentPrefectures(){
		return currentPrefectures;
	}

	/*県のsetter*/
	public void setCurrentPrefectures(String currentPrefectures){
		this.currentPrefectures = currentPrefectures;
	}

	/*テーマのgetter*/
	public String getCurrentTheme(){
		return currentTheme;
	}

	/*テーマのsetter*/
	public void setCurrentTheme(String currentTheme){
		this.currentTheme = currentTheme;
	}

	/*コメントのgetter*/
	public String getCurrentComment(){
		return currentComment;
	}

	/*コメントのsetter*/
	public void setCurrentComment(String currentComment){
		this.currentComment = currentComment;
	}

	/*画像URLのgetter*/
	public String getCurrentImg(){
		return currentImg;
	}

	/*画像URLのsetter*/
	public void setCurrentImg(String currentImg){
		this.currentImg = currentImg;
	}



	/*編集後の情報のgetter/setter---------------------------------------------*/


	public String getEditTourName(){
		return editTourName;
	}

	public void setEditTourName(String editTourName){
		this.editTourName = editTourName;
	}

	public String getEditPrice(){
		return editPrice;
	}

	public void setEditPrice(String editPrice){
			this.editPrice = editPrice;
	}

	public String getEditPersons(){
		return editPersons;
	}

	public void setEditPersons(String editPersons){
		this.editPersons = editPersons;
	}

	public String getEditDeparture(){
		return editDeparture;
	}

	public void setEditDeparture(String editDeparture){
		this.editDeparture = editDeparture;
	}

	public String getEditRegion(){
		return editRegion;
	}

	public void setEditRegion(String editRegion){
		this.editRegion = editRegion;
	}

	public String getEditPrefectures(){
		return editPrefectures;
	}

	public void setEditPrefectures(String editPrefectures){
		this.editPrefectures = editPrefectures;
	}

	public String getEditTheme(){
		return editTheme;
	}

	public void setEditTheme(String editTheme){
		this.editTheme = editTheme;
	}

	public String getEditComment(){
		return editComment;
	}

	public void setEditComment(String editComment){
		this.editComment = editComment;
	}

	public String getEditImg(){
		return editImg;
	}

	public void setEditImg(String editImg){
		this.editImg = editImg;
	}








	/*編集時のチェック項目（削除チェックボックス、エラーメッセージ）のgetter/setter--------------------*/
	public String getDeleteCheck(){
		return deleteCheck;
	}

	public void setDeleteCheck(String deleteCheck){
		this.deleteCheck = deleteCheck;
	}

	public String getErrorMsg(){
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}


}
