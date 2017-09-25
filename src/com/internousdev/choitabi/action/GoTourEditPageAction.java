package com.internousdev.choitabi.action;

import com.internousdev.choitabi.dao.SelectOneTourDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ツアーの編集画面に遷移するアクション
 * @author YUKA MATSUMURA
 * @since 2017/0906
 * @versin 1.1
 * **/
public class GoTourEditPageAction extends ActionSupport {

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = -3005189118822441576L;

	/*【1/3】編集前のツアー情報を保管するための変数
	 * DBから取得したデータが入ります。*/

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


	/*【2/3】編集後の情報を保管するための変数
	 * （編集内容確認ページから戻ってきたときに、編集内容を一緒に持って来れるように作っています）*/

	/**
	 *編集後のツアー名
	 * */
	private String editTourName;

	/**
	 *編集後の価格
	 * */
	private int editPrice;

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



	/*【3/3】入力画面で、フォームに最初から入っている情報。
	 * 最初は「編集前」と同じものが、確認画面から戻ったときは編集した内容が入ってきます。*/

	/**
	 *フォームに表示するツアー名
	 * */
	private String defaultTourName;

	/**
	 *フォームに表示する価格
	 * */
	private int defaultPrice;

	/**
	 *フォームに表示する出発地
	 * */
	private String defaultDeparture;

	/**
	 *フォームに表示するエリア
	 * */
	public String defaultRegion;

	/**
	 *フォームに表示する都道府県
	 * */
	public String defaultPrefectures;

	/**
	 *フォームに表示するテーマ
	 * */
	public String defaultTheme;

	/**
	 *フォームに表示するコメント
	 * */
	public String defaultComment;

	/**
	 *フォームに表示する画像URL
	 * */
	public String defaultImg;


	/**
	 * 削除用チェックボックスの状態
	 * */
	private String deleteCheck = "false";

	/**
	 * 遷移元
	 * */
	private String from;




	/**
	 * ツアーの編集画面に遷移し、入力画面を表示するメソッド。
	 * @author YUKA MATSUMURA
	 * @since 2017/0906
	 * @versin 1.1
	 * **/
	public String execute(){
		String result = ERROR;

		SelectOneTourDAO sotdao = new SelectOneTourDAO();
		SelectTourDTO stdto =sotdao.selectOneTour(currentTourId);

		if(stdto != null){
			/*「編集前」の項目には、DBから持ってきたもともとの情報が入ります*/
			currentTourId = stdto.getTourId();
			currentTourName = stdto.getTourName();
			currentPrice = stdto.getPrice();
			currentDeparture = stdto.getDeparture();
			currentRegion = stdto.getRegion();
			currentPrefectures = stdto.getPrefectures();
			currentTheme = stdto.getTheme();
			currentComment = stdto.getComment();
			currentImg = stdto.getImg();

			/*「編集後」の項目（ツアー一覧から来た場合）には、最初「編集前」と同じ情報が入っています*/
			if(this.from.equals("tourListPage")){
				defaultTourName = currentTourName;
				defaultPrice = currentPrice;
				defaultDeparture = currentDeparture;
				defaultRegion = currentRegion;
				defaultPrefectures = currentPrefectures;
				defaultTheme = currentTheme;
				defaultComment = currentComment;
				defaultImg = currentImg;
				result = SUCCESS;

			/*「編集後」の項目（編集内容確認画面から戻ってきた場合）には、編集された情報が残ります*/
			}else if(this.from.equals("confirmingPage")){
				defaultTourName = editTourName;
				defaultPrice = editPrice;
				defaultDeparture = editDeparture;
				defaultRegion = editRegion;
				defaultPrefectures = editPrefectures;
				defaultTheme = editTheme;
				defaultComment = editComment;
				defaultImg = editImg;
				result = SUCCESS;
			}
		}

		return result;
	}





	/*【1/3】現在のツアー情報のgetter/setter---------------------------------------------*/


	/**
	 * 編集するツアーのIDを取得するメソッド。
	 * @return currentTourId 編集するツアーのID
	 * */
	public int getCurrentTourId(){
		return currentTourId;
	}

	/**
	 * 編集するツアーのIDを格納するメソッド。
	 * @param currentTourId 編集するツアーのID
	 * */
	public void setCurrentTourId(int currentTourId){
		this.currentTourId = currentTourId;
	}


	/**
	 * 編集前のツアー名を取得するメソッド
	 * @return currentTourName 編集前のツアー名
	 * */
	public String getCurrentTourName(){
		return currentTourName;
	}


	/**
	 * 編集前のツアー名を格納するメソッド
	 * @param currentTourName 編集前のツアー名
	 * */
	public void setCurrentTourName(String currentTourName){
		this.currentTourName = currentTourName;
	}


	/**
	 * 編集前の価格を取得するメソッド
	 * @return currentPrice 編集前の価格
	 * */
	public int getCurrentPrice(){
		return currentPrice;
	}

	/**
	 * 編集前の価格を格納するメソッド
	 * @param currentPrice 編集前の価格
	 * */
	public void setCurrentPrice(int currentPrice){
		this.currentPrice = currentPrice;
	}

	/**
	 * 編集前の出発地を取得するメソッド
	 * @return currentDeparture 編集前の出発地
	 * */
	public String getCurrentDeparture(){
		return currentDeparture;
	}

	/**
	 * 編集前の出発地を格納するメソッド
	 * @param currentDeparture 編集前の出発地
	 * */
	public void setCurrentDeparture(String currentDeparture){
		this.currentDeparture = currentDeparture;
	}

	/**
	 * 編集前のエリアを取得するメソッド
	 * @return currentRegion 編集前のエリア
	 * */
	public String getCurrentRegion(){
		return currentRegion;
	}

	/**
	 * 編集前のエリアを格納するメソッド
	 * @param currentRegion 編集前のエリア
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
	 *@return currentTheme 編集前のテーマ
	 * */
	public String getCurrentTheme(){
		return this.currentTheme;
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
	 *編集前の画像URLを取得するメソッド
	 *@return currentImg 編集前の画像URL
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
	public int getEditPrice(){
		return editPrice;
	}

	/**
	 *編集後の価格を格納するメソッド
	 *@param editPrice 編集後の価格
	 * */
	public void setEditPrice(int editPrice){
		this.editPrice = editPrice;
	}

	/**
	 * 編集後の出発地を取得するメソッド
	 * @return editDeparture 編集後の出発地
	 * */
	public String getEditDeparture(){
		return editDeparture;
	}

	/**
	 * 編集後の出発地を格納するメソッド
	 * @param editDeparture 編集後の出発地
	 * */
	public void setEditDeparture(String editDeparture){
		this.editDeparture = editDeparture;
	}

	/**
	 *編集後のエリアを取得するメソッド
	 *@return editRegion 編集後の出発地
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
	 *@return editPrefectures 編集後の都道府県
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
		return this.editTheme;
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


/*フォームに表示する情報のgetter/setter---------------------------------------------*/

	/**
	 *フォームに表示するツアー名を取得するメソッド
	 *@return defaultTourName フォームに表示するツアー名
	 * */
	public String getDefaultTourName(){
		return defaultTourName;
	}

	/**
	 *フォームに表示するツアー名を格納するメソッド
	 *@param defaultTourName フォームに表示するツアー名
	 * */
	public void setDefaultTourName(String defaultTourName){
		this.defaultTourName = defaultTourName;
	}

	/**
	 *フォームに表示する価格を取得するメソッド
	 *@return defaultPrice フォームに表示する価格
	 * */
	public int getDefaultPrice(){
		return defaultPrice;
	}

	/**
	 *フォームに表示する価格を格納するメソッド
	 *@param defaultPrice フォームに表示する価格
	 * */
	public void setDefaultPrice(int defaultPrice){
		this.defaultPrice = defaultPrice;
	}

	/**
	 *フォームに表示する出発地を取得するメソッド
	 *@return defaultDeparture フォームに表示する出発地
	 * */
	public String getDefaultDeparture(){
		return defaultDeparture;
	}

	/**
	 *フォームに表示する出発地を格納するメソッド
	 *@param defaultDeparture フォームに表示する出発地
	 * */
	public void setDefaultDeparture(String defaultDeparture){
		this.defaultDeparture = defaultDeparture;
	}

	/**
	 *フォームに表示するエリアを取得するメソッド
	 *@return defaultRegion フォームに表示するエリア
	 * */
	public String getDefaultRegion(){
		return defaultRegion;
	}

	/**
	 *フォームに表示するエリアを格納するメソッド
	 *@return defaultRegion フォームに表示するエリア
	 * */
	public void setDefaultRegion(String defaultRegion){
		this.defaultRegion = defaultRegion;
	}

	/**
	 *フォームに表示する都道府県を取得するメソッド
	 *@return defaultPrefectures フォームに表示する都道府県
	 * */
	public String getDefaultPrefectures(){
		return defaultPrefectures;
	}

	/**
	 *フォームに表示する都道府県を格納するメソッド
	 *@param defaultPrefectures フォームに表示する都道府県
	 * */
	public void setDefaultPrefectures(String defaultPrefectures){
		this.defaultPrefectures = defaultPrefectures;
	}

	/**
	 *フォームに表示するテーマを取得するメソッド
	 *@return defaultTheme フォームに表示するテーマ
	 * */
	public String getDefaultTheme(){
		return this.defaultTheme;
	}

	/**
	 *フォームに表示するテーマを格納するメソッド
	 *@param defaultTheme フォームに表示するテーマ
	 * */
	public void setDefaultTheme(String defaultTheme){
		this.defaultTheme = defaultTheme;
	}

	/**
	 *フォームに表示するコメントを取得するメソッド
	 *@return defaultComment フォームに表示するコメント
	 * */
	public String getDefaultComment(){
		return defaultComment;
	}

	/**
	 *フォームに表示するコメントを格納するメソッド
	 *@param defaultComment フォームに表示するコメント
	 * */
	public void setDefaultComment(String defaultComment){
		this.defaultComment = defaultComment;
	}

	/**
	 *フォームに表示する画像URLを取得するメソッド
	 *@return defaultImg フォームに表示する画像URL
	 * */
	public String getDefaultImg(){
		return defaultImg;
	}

	/**
	 *フォームに表示する画像URLを格納するメソッド
	 *@param defaultImg フォームに表示する画像URL
	 * */
	public void setDefaultImg(String defaultImg){
		this.defaultImg = defaultImg;
	}

	/*その他の情報のgetter/setter----------------------*/

	/**
	 * 削除用チェックボックスの状態を取得するメソッド
	 * @return deleteCheck 削除用チェックボックスの状態
	 * */
	public String getDeleteCheck(){
		return deleteCheck;
	}

	/**
	 * 削除用チェックボックスの状態を格納するメソッド
	 * @param deleteCheck 削除用チェックボックスの状態
	 * */
	public void setDeleteCheck(String deleteCheck){
		this.deleteCheck = deleteCheck;
	}

	/**
	 * 遷移元を取得するメソッド
	 * @return from 遷移元
	 * */
	public String getFrom(){
		return from;
	}


	/**
	 * 遷移元を格納するメソッド
	 * @rparam from 遷移元
	 * */
	public void setFrom(String from){
		this.from = from;
	}




}
