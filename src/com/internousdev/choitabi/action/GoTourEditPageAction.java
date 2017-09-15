package com.internousdev.choitabi.action;

import com.internousdev.choitabi.dao.SelectOneTourDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoTourEditPageAction extends ActionSupport {

	/**@author YUKA MATSUMURA
	 * since 2017/0906
	 * versin 1.1
	 *
	 * 管理画面でツアー情報の更新・削除操作を行うためのクラスです。
	 * ツアー一覧画面からツアーの「編集」をクリックすると、このアクションが働いて選択されたーツアーの情報を取ってきます。
	 * 取ってきた情報は、「編集前のデータ」として、次の「kanri_tourHensyuu.jsp」に表示されます。
	 *
	 * **/

	/*編集前の情報を保管するための変数*/
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

	/*入力内容確認ページに戻ったときに、入力情報を残すための変数*/

	private int defaultTourId;
	/*ツアー名*/
	private String defaultTourName;
	/*価格*/
	private int defaultPrice;
	/*定員*/
	private int defaultPersons;
	/*出発地*/
	private String defaultDeparture;
	/*エリア*/
	private String defaultRegion;
	/*県*/
	private String defaultPrefectures;
	/*テーマ*/
	private String defaultTheme;
	/*コメント*/
	private String defaultComment;
	/*画像URL*/
	private String defaultImg;


	/*削除確認チェック(チェックボックスにレ点がつくと、ここがtrueになります)*/
	private String deleteCheck = "false";

	/*ツアー一覧から入力画面に来たか、入力内容確認画面から来たかを保持するための変数
	 * （これによって、入力フォームにデフォルトで表示する内容を変えます）
	 * ツアー一覧からアクセスされたら「tourList」が入り、変更前の情報がフォームに表示されます
	 * 入力内容確認画面から戻ってきたら「confirm」が入り、編集していた内容が残ります*/
	private String from;




	/*executeメソッド-------------------------------------------------*/

	public String execute(){
		String result = ERROR;

		SelectOneTourDAO sotdao = new SelectOneTourDAO();
		SelectTourDTO stdto =sotdao.selectOneTour(currentTourId);
		/*動作確認*/System.out.println("GoTourEditPageAction - 遷移元ページ：" + from);

		if(stdto != null){
			//if(this.from.equals("tourListPage")){
				this.currentTourId = stdto.getTourId();
				this.currentTourName = stdto.getTourName();
				this.currentPrice = stdto.getPrice();
				this.currentPersons = stdto.getPersons();
				this.currentDeparture = stdto.getDeparture();
				this.currentRegion = stdto.getRegion();
				this.currentPrefectures = stdto.getPrefectures();
				this.currentTheme = stdto.getTheme();
				this.currentComment = stdto.getComment();
				this.currentImg = stdto.getImg();
				result = SUCCESS;
//			}else if(this.from.equals("confirmingPage")){
//				this.currentTourId = stdto.getTourId();
//				this.currentTourName = this.defaultTourName;
//				this.currentPrice = this.defaultPrice;
//				this.currentPersons = this.defaultPersons;
//				this.currentDeparture = this.defaultDeparture;
//				this.currentRegion = this.defaultRegion;
//				this.currentPrefectures = this.defaultPrefectures;
//				this.currentTheme = this.defaultTheme;
//				this.currentComment = this.defaultComment;
//				this.currentImg = this.defaultImg;
//				result = SUCCESS;
//			}
		}


		/*後消し*/System.out.println("EdittourAction - result : " + result);
		return result;
	}





	/*編集前の情報のgetter/setter---------------------------------------------*/



	/*編集前のツアーIDのgetter*/
	public int getCurrentTourId(){
		return currentTourId;
	}

	/*編集前のツアーIDのsetter*/
	public void setCurrentTourId(int currentTourId){
		this.currentTourId = currentTourId;
	}

	/*編集前のツアー名のgetter*/
	public String getCurrentTourName(){
		return currentTourName;
	}

	/*編集前のツアー名のsetter*/
	public void setCurrentTourName(String currentTourName){
		this.currentTourName = currentTourName;
	}

	/*編集前の価格のgetter*/
	public int getCurrentPrice(){
		return currentPrice;
	}

	/*編集前の価格のsetter*/
	public void setCurrentPrice(int currentPrice){
		this.currentPrice = currentPrice;
	}

	/*編集前の定員のgetter*/
	public int getCurrentPersons(){
		return currentPersons;
	}

	/*編集前の定員のsetter*/
	public void setCurrentPersons(int currentPersons){
		this.currentPersons = currentPersons;
	}

	/*編集前の出発地のgetter*/
	public String getCurrentDeparture(){
		return currentDeparture;
	}

	/*編集前の出発地のsetter*/
	public void setCurrentDeparture(String currentDeparture){
		this.currentDeparture = currentDeparture;
	}

	/*編集前のエリアのgetter*/
	public String getCurrentRegion(){
		return currentRegion;
	}

	/*編集前のエリアのsetter*/
	public void setCurrentRegion(String currentRegion){
		this.currentRegion = currentRegion;
	}

	/*編集前の県のgetter*/
	public String getCurrentPrefectures(){
		return currentPrefectures;
	}

	/*編集前の県のsetter*/
	public void setCurrentPrefectures(String currentPrefectures){
		this.currentPrefectures = currentPrefectures;
	}

	/*編集前のテーマのgetter*/
	public String getCurrentTheme(){
		return this.currentTheme;
	}

	/*編集前のテーマのsetter*/
	public void setCurrentTheme(String currentTheme){
		this.currentTheme = currentTheme;
	}

	/*編集前のコメントのgetter*/
	public String getCurrentComment(){
		return currentComment;
	}

	/*編集前のコメントのsetter*/
	public void setCurrentComment(String currentComment){
		this.currentComment = currentComment;
	}

	/*編集前の画像URLのgetter*/
	public String getCurrentImg(){
		return currentImg;
	}

	/*編集前の画像URLのsetter*/
	public void setCurrentImg(String currentImg){
		this.currentImg = currentImg;
	}



/*フォームに入る情報のgetter/setter---------------------------------------------*/



	/*フォームに入るツアーIDのgetter*/
	public int getDefaultTourId(){
		return defaultTourId;
	}

	/*フォームに入るツアーIDのsetter*/
	public void setDefaultTourId(int defaultTourId){
		this.defaultTourId = defaultTourId;
	}

	/*フォームに入るツアー名のgetter*/
	public String getDefaultTourName(){
		return defaultTourName;
	}

	/*フォームに入るツアー名のsetter*/
	public void setDefaultTourName(String defaultTourName){
		this.defaultTourName = defaultTourName;
	}

	/*フォームに入る価格のgetter*/
	public int getDefaultPrice(){
		return defaultPrice;
	}

	/*フォームに入る価格のsetter*/
	public void setDefaultPrice(int defaultPrice){
		this.defaultPrice = defaultPrice;
	}

	/*フォームに入る定員のgetter*/
	public int getDefaultPersons(){
		return defaultPersons;
	}

	/*フォームに入る定員のsetter*/
	public void setDefaultPersons(int defaultPersons){
		this.defaultPersons = defaultPersons;
	}

	/*フォームに入る出発地のgetter*/
	public String getDefaultDeparture(){
		return defaultDeparture;
	}

	/*フォームに入る出発地のsetter*/
	public void setDefaultDeparture(String defaultDeparture){
		this.defaultDeparture = defaultDeparture;
	}

	/*フォームに入るエリアのgetter*/
	public String getDefaultRegion(){
		return defaultRegion;
	}

	/*フォームに入るエリアのsetter*/
	public void setDefaultRegion(String defaultRegion){
		this.defaultRegion = defaultRegion;
	}

	/*フォームに入る県のgetter*/
	public String getDefaultPrefectures(){
		return defaultPrefectures;
	}

	/*フォームに入る県のsetter*/
	public void setDefaultPrefectures(String defaultPrefectures){
		this.defaultPrefectures = defaultPrefectures;
	}

	/*フォームに入るテーマのgetter*/
	public String getDefaultTheme(){
		return this.defaultTheme;
	}

	/*フォームに入るテーマのsetter*/
	public void setDefaultTheme(String defaultTheme){
		this.defaultTheme = defaultTheme;
	}

	/*フォームに入るコメントのgetter*/
	public String getDefaultComment(){
		return defaultComment;
	}

	/*フォームに入るコメントのsetter*/
	public void setDefaultComment(String defaultComment){
		this.defaultComment = defaultComment;
	}

	/*フォームに入る画像URLのgetter*/
	public String getDefaultImg(){
		return defaultImg;
	}

	/*フォームに入る画像URLのsetter*/
	public void setDefaultImg(String defaultImg){
		this.defaultImg = defaultImg;
	}

	/*その他の情報のgetter/setter----------------------*/

	/*削除チェックボックス判定のgetter*/
	public String getDeleteCheck(){
		return deleteCheck;
	}

	/*削除チェックボックス判定のsetter*/
	public void setDeleteCheck(String deleteCheck){
		this.deleteCheck = deleteCheck;
	}

	/*どのページからきたかのgetter*/

	public String getFrom(){
		return from;
	}
	/*どのページからきたかのgetter*/

	public void setFrom(String from){
		this.from = from;
	}




}
