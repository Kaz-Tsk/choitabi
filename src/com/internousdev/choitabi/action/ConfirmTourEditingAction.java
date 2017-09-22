package com.internousdev.choitabi.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ツアー編集画面で入力された内容を確認するアクション。
 * @author YUKA MATSUMURA
 * @since 2017/09/07
 * @version 1.1
 * */
public class ConfirmTourEditingAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -1258679400956968932L;


	/**
	 * 編集前（選択した）のツアーID
	 * */
	private int currentTourId;

	/**
	 * 編集前のツアー名
	 * */
	private String currentTourName;

	/**
	 * 編集前の価格
	 * */
	private int currentPrice;

	/**
	 * 編集前の定員
	 * */
	private int currentPersons;

	/**
	 * 編集前の出発地
	 * */
	private String currentDeparture;

	/**
	 * 編集前のエリア
	 * */
	private String currentRegion;

	/**
	 * 編集前の都道府県
	 * */
	private String currentPrefectures;

	/**
	 * 編集前のテーマ
	 * */
	private String currentTheme;

	/**
	 * 編集前のコメント
	 * */
	private String currentComment;

	/**
	 *編集前の画像URL
	 * */
	private String currentImg;



	/*編集後の情報＝入力されたデータを格納する変数です(すべて文字列として受け取るようにしています)
	 * 編集画面から、価格・人数を入れる欄に文字列を入力したところ、javaに渡される際に数値に変換できずStrutsエラーがでてしまいました。
	 * そのため、一度文字列として受け取らせ、javaのInteger.Parseint()関数を使って数値に変換するステップを踏んでいます。
	 *
	 *こっちには、ツアーIDはありません。
	 * （IDは変わらない＝現在のデータだけを保持すればOKなので）
	 * 「UodateTourAction」まで、↑で用意したcurrentTourIdを持っていきます。*/

	/**
	 *編集後のツアー名
	 * */
	private String editTourName;

	/**
	 *編集後の価格
	 * */
	private String editPrice;

	/**
	 *編集後の定員
	 * */
	private String editPersons;

	/**
	 *編集後の出発地
	 * */
	private String editDeparture;

	/**
	 *編集後のエリア
	 * */
	public String editRegion;

	/**
	 *編集後の都道府県
	 * */
	public String editPrefectures;

	/**
	 *編集後のテーマ
	 * */
	public String editTheme;

	/**
	 *編集後のコメント
	 * */
	public String editComment;

	/**
	 *編集後の画像URL
	 * */
	public String editImg;

	/**
	 * 削除用チェックボックスの状態
	 * */
	private String deleteCheck = "false";

	/**
	 * エラーメッセージ
	 * */
	private String errorMsg = "";



	/**
	 *入力内容を確認するメソッド。
	 * *@author YUKA MATSUMURA
	 * @since 2017/09/07
	 * @return result (SUCCESS/ERROR)
	 * */
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
				 * 変換できればOK。変換できない＝例外が起きた場合は、例外処理でエラーメッセージの表示に飛びます*/
				Integer.parseInt(editPrice);
				Integer.parseInt(editPersons);
			}

		}catch(NumberFormatException e){
			errorMsg = "価格・定員の欄には数値を入力してください";
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

	/**
	 * 編集前のツアーIDを取得するメソッド
	 * @return currentTourId 編集前のツアーID
	 * */
	public int getCurrentTourId(){
		return currentTourId;
	}

	/**
	 *編集前のツアーIDを格納するメソッド
	 *@param currentTourId 編集前のツアーID
	 * */
	public void setCurrentTourId(int currentTourId){
		this.currentTourId = currentTourId;
	}

	/**
	 *編集前のツアー名を取得するメソッド
	 *@return currentTourName 編集前のツアー名
	 * */
	public String getCurrentTourName(){
		return currentTourName;
	}

	/**
	 *編集前のツアー名を格納するメソッド
	 *@param currentTourName 編集前のツアー名
	 * */
	public void setCurrentTourName(String currentTourName){
		this.currentTourName = currentTourName;
	}

	/**
	 *編集前の価格を取得するメソッド
	 *@return currentprice 編集前の価格
	 * */
	public int getCurrentPrice(){
		return currentPrice;
	}

	/**
	 *編集前の価格を格納するメソッド
	 *@param 編集前の価格
	 * */
	public void setCurrentPrice(int currentPrice){
		this.currentPrice = currentPrice;
	}

	/**
	 *編集前の定員を取得するメソッド
	 *@return currentPersons 編集前の定員
	 * */
	public int getCurrentPersons(){
		return currentPersons;
	}

	/**
	 *編集前の定員を格納するメソッド
	 *@param currentPersons 編集前の定員
	 * */
	public void setCurrentPersons(int currentPersons){
		this.currentPersons = currentPersons;
	}

	/**
	 *編集前の出発地を取得するメソッド
	 *@retrurn currentDeparture 編集前の出発地
	 * */
	public String getCurrentDeparture(){
		return currentDeparture;
	}

	/**
	 *編集前の出発地を格納するメソッド
	 *@param curentDeparture 編集前の出発地
	 * */
	public void setCurrentDeparture(String currentDeparture){
		this.currentDeparture = currentDeparture;
	}

	/**
	 *編集前のエリアを取得するメソッド
	 *@return currentRegion 編集前のエリア
	 * */
	public String getCurrentRegion(){
		return currentRegion;
	}

	/**
	 *編集前のエリアを格納するメソッド
	 *@param currentRegion 編集前のエリア
	 * */
	public void setCurrentRegion(String currentRegion){
		this.currentRegion = currentRegion;
	}

	/**
	 *編集前の都道府県を取得するメソッド
	 *@return currentPrefectures 編集前の都道府県
	 * */
	public String getCurrentPrefectures(){
		return currentPrefectures;
	}

	/**
	 *編集前の都道府県を格納するメソッド
	 *@param currentPrefectures 編集前の都道府県
	 * */
	public void setCurrentPrefectures(String currentPrefectures){
		this.currentPrefectures = currentPrefectures;
	}

	/**
	 *編集前のテーマを取得するメソッド
	 *@return currentTheme 編集前
	 * */
	public String getCurrentTheme(){
		return currentTheme;
	}

	/**
	 *編集前のテーマを格納するメソッド
	 *@param currentTheme 編集前のテーマ
	 * */
	public void setCurrentTheme(String currentTheme){
		this.currentTheme = currentTheme;
	}

	/**
	 *編集前のコメントを取得するメソッド
	 *@return currentComment 編集前のコメント
	 * */
	public String getCurrentComment(){
		return currentComment;
	}

	/**
	 *編集前のコメントを格納するメソッド
	 *@param currentComment 編集前のコメント
	 * */
	public void setCurrentComment(String currentComment){
		this.currentComment = currentComment;
	}

	/**
	 *編集前の画像URLを取得するメソッド
	 *@return currentImg 編集前の画像URL
	 * */
	public String getCurrentImg(){
		return currentImg;
	}

	/**
	 *編集前の画像URLを格納するメソッド
	 *@param currentImg 編集前の画像URL
	 * */
	public void setCurrentImg(String currentImg){
		this.currentImg = currentImg;
	}



	/*編集後の情報のgetter/setter---------------------------------------------*/

	/**
	 *編集後のツアー名を取得するメソッド
	 *@return editTourName 編集後のツアー名
	 * */
	public String getEditTourName(){
		return editTourName;
	}

	/**
	 *編集後のツアー名を格納するメソッド
	 *@param editTourName 編集後のツアー名
	 * */
	public void setEditTourName(String editTourName){
		this.editTourName = editTourName;
	}

	/**
	 *編集後の価格を取得するメソッド
	 *@return editPrice 編集後の価格
	 * */
	public String getEditPrice(){
		return editPrice;
	}

	/**
	 *編集後の価格を格納するメソッド
	 *@parama editPrice 編集後の価格
	 * */
	public void setEditPrice(String editPrice){
			this.editPrice = editPrice;
	}

	/**
	 *編集後の定員を取得するメソッド
	 *@rturn editPersons 編集後の定員
	 * */
	public String getEditPersons(){
		return editPersons;
	}

	/**
	 *編集後の定員を格納するメソッド
	 *@param editPersons 編集後の定員
	 * */
	public void setEditPersons(String editPersons){
		this.editPersons = editPersons;
	}

	/**
	 *編集後の出発地を取得するメソッド
	 *@return editDeparture 編集後の出発地
	 * */
	public String getEditDeparture(){
		return editDeparture;
	}

	/**
	 *編集後の出発地を格納するメソッド
	 *@param editDeparture 編集後の出発地
	 * */
	public void setEditDeparture(String editDeparture){
		this.editDeparture = editDeparture;
	}

	/**
	 *編集後のエリアを取得するメソッド
	 *@return editRegion 編集後のエリア
	 * */
	public String getEditRegion(){
		return editRegion;
	}

	/**
	 *編集後のエリアを格納するメソッド
	 *@param editRegion 編集後のエリア
	 * */
	public void setEditRegion(String editRegion){
		this.editRegion = editRegion;
	}

	/**
	 *編集後の都道府県を取得するメソッド
	 *@return editPrefrectures 編集後の都道府県
	 * */
	public String getEditPrefectures(){
		return editPrefectures;
	}

	/**
	 *編集後の都道府県を格納するメソッド
	 *@param editPrefectures 編集後の都道府県
	 * */
	public void setEditPrefectures(String editPrefectures){
		this.editPrefectures = editPrefectures;
	}

	/**
	 *編集後のテーマを取得するメソッド
	 *@return editTheme 編集後のテーマ
	 * */
	public String getEditTheme(){
		return editTheme;
	}

	/**
	 *編集後のテーマを格納するメソッド
	 *@param editTheme 編集後のテーマ
	 * */
	public void setEditTheme(String editTheme){
		this.editTheme = editTheme;
	}

	/**
	 *編集後のコメントを取得するメソッド
	 *@return editComment 編集後のコメント
	 * */
	public String getEditComment(){
		return editComment;
	}

	/**
	 *編集後のコメントを格納するメソッド
	 *@param editComment 編集後のコメント
	 * */
	public void setEditComment(String editComment){
		this.editComment = editComment;
	}

	/**
	 *編集後の画像URLを取得するメソッド
	 *@return editImg 編集後の画像URL
	 * */
	public String getEditImg(){
		return editImg;
	}

	/**
	 *編集後の画像URLを格納するメソッド
	 *@param editImg 編集後の画像URL
	 * */
	public void setEditImg(String editImg){
		this.editImg = editImg;
	}








	/*編集時のチェック項目（削除チェックボックス、エラーメッセージ）のgetter/setter--------------------*/

	/**
	 *削除用チェックボックスの状態を取得するメソッド
	 *@return deleteCheck 削除用チェックボックスの状態
	 * */
	public String getDeleteCheck(){
		return deleteCheck;
	}

	/**
	 *削除用チェックボックスの状態を格納するメソッド
	 *@param deleteCheck 削除用チェックボックスの状態
	 * */
	public void setDeleteCheck(String deleteCheck){
		this.deleteCheck = deleteCheck;
	}

	/**
	 *エラーメッセージを取得するメソッド
	 *@return errorMsg エラーメッセージ
	 * */
	public String getErrorMsg(){
		return errorMsg;
	}

	/**
	 *エラーメッセージを格納するメソッド
	 *@param errorMsg
	 * */
	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}


}
