package com.internousdev.choitabi.action;

import com.internousdev.choitabi.dao.SelectOneTourDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoTourEditPageAction extends ActionSupport {

	/**
	 *
	 */
	private static final long serialVersionUID = -3005189118822441576L;
	/**@author YUKA MATSUMURA
	 * since 2017/0906
	 * versin 1.1
	 *
	 * 管理画面でツアー情報の更新・削除操作を行うためのクラスです。
	 * ツアー一覧画面からツアーの「編集」をクリックすると、このアクションが働いて選択されたーツアーの情報を取ってきます。
	 * 取ってきた情報は、「編集中だったデータ」として、次の「kanri_tourHensyuu.jsp」に表示されます。
	 *
	 * **/

	/*編集中だった情報を保管するための変数---------------------------------------------------------------------*/
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


	/*編集後の情報を保管するための変数（編集内容確認ページから戻ってきたときに、編集内容を一緒に持って来れるように作っています）-----------------------------*/

	/*ツアー名*/
	private String editTourName;
	/*価格*/
	private int editPrice;
	/*定員*/
	private int editPersons;
	/*出発地*/
	private String editDeparture;
	/*エリア*/
	private String editRegion;
	/*県*/
	private String editPrefectures;
	/*テーマ*/
	private String editTheme;
	/*コメント*/
	private String editComment;
	/*画像URL*/
	private String editImg;


	/*↓入力画面で、フォームに最初から入っている情報。最初は「編集前」と同じものが、確認画面から戻ったときは編集した内容が入ってきます。--------------------------------------------*/


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

		if(stdto != null){
			/*「編集前」の項目には、DBから持ってきたもともとの情報が入ります*/
			currentTourId = stdto.getTourId();
			currentTourName = stdto.getTourName();
			currentPrice = stdto.getPrice();
			currentPersons = stdto.getPersons();
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
				defaultPersons = currentPersons;
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
				defaultPersons = editPersons;
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





	/*編集中だった情報のgetter/setter---------------------------------------------*/



	/*編集中だったツアーIDのgetter*/
	public int getCurrentTourId(){
		return currentTourId;
	}

	/*編集中だったツアーIDのsetter*/
	public void setCurrentTourId(int currentTourId){
		this.currentTourId = currentTourId;
	}

	/*編集中だったツアー名のgetter*/
	public String getCurrentTourName(){
		return currentTourName;
	}

	/*編集中だったツアー名のsetter*/
	public void setCurrentTourName(String currentTourName){
		this.currentTourName = currentTourName;
	}

	/*編集中だった価格のgetter*/
	public int getCurrentPrice(){
		return currentPrice;
	}

	/*編集中だった価格のsetter*/
	public void setCurrentPrice(int currentPrice){
		this.currentPrice = currentPrice;
	}

	/*編集中だった定員のgetter*/
	public int getCurrentPersons(){
		return currentPersons;
	}

	/*編集中だった定員のsetter*/
	public void setCurrentPersons(int currentPersons){
		this.currentPersons = currentPersons;
	}

	/*編集中だった出発地のgetter*/
	public String getCurrentDeparture(){
		return currentDeparture;
	}

	/*編集中だった出発地のsetter*/
	public void setCurrentDeparture(String currentDeparture){
		this.currentDeparture = currentDeparture;
	}

	/*編集中だったエリアのgetter*/
	public String getCurrentRegion(){
		return currentRegion;
	}

	/*編集中だったエリアのsetter*/
	public void setCurrentRegion(String currentRegion){
		this.currentRegion = currentRegion;
	}

	/*編集中だった県のgetter*/
	public String getCurrentPrefectures(){
		return currentPrefectures;
	}

	/*編集中だった県のsetter*/
	public void setCurrentPrefectures(String currentPrefectures){
		this.currentPrefectures = currentPrefectures;
	}

	/*編集中だったテーマのgetter*/
	public String getCurrentTheme(){
		return this.currentTheme;
	}

	/*編集中だったテーマのsetter*/
	public void setCurrentTheme(String currentTheme){
		this.currentTheme = currentTheme;
	}

	/*編集中だったコメントのgetter*/
	public String getCurrentComment(){
		return currentComment;
	}

	/*編集中だったコメントのsetter*/
	public void setCurrentComment(String currentComment){
		this.currentComment = currentComment;
	}

	/*編集中だった画像URLのgetter*/
	public String getCurrentImg(){
		return currentImg;
	}

	/*編集中だった画像URLのsetter*/
	public void setCurrentImg(String currentImg){
		this.currentImg = currentImg;
	}


	/*編集中だった情報のgetter/setter---------------------------------------------*/


	/*編集中だったツアー名のgetter*/
	public String getEditTourName(){
		return editTourName;
	}

	/*編集中だったツアー名のsetter*/
	public void setEditTourName(String editTourName){
		this.editTourName = editTourName;
	}

	/*編集中だった価格のgetter*/
	public int getEditPrice(){
		return editPrice;
	}

	/*編集中だった価格のsetter*/
	public void setEditPrice(int editPrice){
		this.editPrice = editPrice;
	}

	/*編集中だった定員のgetter*/
	public int getEditPersons(){
		return editPersons;
	}

	/*編集中だった定員のsetter*/
	public void setEditPersons(int editPersons){
		this.editPersons = editPersons;
	}

	/*編集中だった出発地のgetter*/
	public String getEditDeparture(){
		return editDeparture;
	}

	/*編集中だった出発地のsetter*/
	public void setEditDeparture(String editDeparture){
		this.editDeparture = editDeparture;
	}

	/*編集中だったエリアのgetter*/
	public String getEditRegion(){
		return editRegion;
	}

	/*編集中だったエリアのsetter*/
	public void setEditRegion(String editRegion){
		this.editRegion = editRegion;
	}

	/*編集中だった県のgetter*/
	public String getEditPrefectures(){
		return editPrefectures;
	}

	/*編集中だった県のsetter*/
	public void setEditPrefectures(String editPrefectures){
		this.editPrefectures = editPrefectures;
	}

	/*編集中だったテーマのgetter*/
	public String getEditTheme(){
		return this.editTheme;
	}

	/*編集中だったテーマのsetter*/
	public void setEditTheme(String editTheme){
		this.editTheme = editTheme;
	}

	/*編集中だったコメントのgetter*/
	public String getEditComment(){
		return editComment;
	}

	/*編集中だったコメントのsetter*/
	public void setEditComment(String editComment){
		this.editComment = editComment;
	}

	/*編集中だった画像URLのgetter*/
	public String getEditImg(){
		return editImg;
	}

	/*編集中だった画像URLのsetter*/
	public void setEditImg(String editImg){
		this.editImg = editImg;
	}





/*フォームに入る情報のgetter/setter---------------------------------------------*/

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
