package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.SelectTourListDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.internousdev.choitabi.util.TourListPagination;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理画面で、ツアー情報の一覧を表示する際使用するアクションクラス。
 *
 * @author YUKA MATSUMURA
 * @since 2017/09/05
 * @virsion 1.1
 * */

public class IndicateTourListAction extends ActionSupport{

	/**
	 *
	 */
	private static final long serialVersionUID = 2211634393797926367L;

	/**
	 * シリアルID
	 */


	/**
	 * 検索ワード
	 * */
	private String selectWord = "";

	/**
	 * 検索テーマ
	 * */
	private String selectTheme = "";

	/**
	 * DBから取得した全ツアー情報のリスト
	 * */
	private ArrayList<SelectTourDTO> allTourList = new ArrayList<SelectTourDTO>();

	/**
	 * ページネートした1ページ分のリスト
	 * */
	private ArrayList<SelectTourDTO> currentTourList = new ArrayList<SelectTourDTO>();

	/**
	 * ツアー情報一覧の最大ページ数
	 * */
	private int maxPage;

	/**
	 * 現在表示しているページ番号
	 * */
	private int currentPage = 1;/*nullPointerが起きないように、最初に1を入れておきます。*/




	/**executeメソッド
	 * DAOクラスを呼び出し、ツアーの情報をリストとして取得する。
	 * @return result (SUCCESS/ERROR)
	 * */
	public String execute(){
		String result = ERROR;

		/*DAOでツアーの一覧を持ってくる*/
		SelectTourListDAO stldao = new SelectTourListDAO();
		allTourList = stldao.selectTourList(selectWord, selectTheme);

		/*持ってきた全ツアーを、ページネートで分割されたリストにします*/
		TourListPagination tlp = new TourListPagination();
		 maxPage = tlp.rerturnMaxPage(allTourList);/*ついでに最大ページ数がいくつになるかも計算させます。*/

		 /*すべてのデータのうち、現在のページに表示するデータだけを切り抜いて、もう一度リストにして渡しなさい、という処理です。*/
		 currentTourList = tlp.paginateTourList(allTourList, currentPage);

		 /*リストがうまく作れたらSUCCESS、そうでなかったらERRORを返します*/
		if(currentTourList != null){
			result = SUCCESS;
		}else{
			result = ERROR;
		}

		/*後消し*/System.out.println(result);

		return result;
	}


	/*以下、各変数、リストのgetter/setter----------------------------------------------------------------------
	 * */


	/*検索ワードのgetter*/
	public String getSelectWord(){
		return selectWord;
	}

	/*検索ワードのsetter*/
	public void setSelectWord(String selectWord){
		this.selectWord = selectWord;
	}

	/*検索テーマのgetter*/
	public String getSelectTheme(){
		return selectTheme;
	}

	/*検索テーマのsetter*/
	public void setSelectTheme(String selectTheme){
		this.selectTheme = selectTheme;
	}


	/*ツアーリスト（すべて）のgetter*/
	public ArrayList<SelectTourDTO> getAllTourList(){
		return allTourList;
	}

	/*ツアーリスト（すべて）のsetter*/
	public void setAllTourList(ArrayList<SelectTourDTO> allTourList){
		this.allTourList = allTourList;
	}

	/*表示中ツアーリストのgetter*/
	public ArrayList<SelectTourDTO> getCurrentTourList(){
		return currentTourList;
	}

	/*表示中ツアーリストのsetter*/
	public void setCurrentTourList(ArrayList<SelectTourDTO> currentTourList){
		this.currentTourList = currentTourList;
	}


	/*ツアー情報総ページ数のgetter*/
	public int getMaxPage(){
		return maxPage;
	}

	/*ツアー情報総ページ数のsetter*/
	public void setMaxPage(int allPages){
		this.maxPage = allPages;
	}

	/*ツアー情報の現在のページ番号のgetter*/
	public int getCurrentPage(){
		return currentPage;
	}

	/*ツアー情報の現在のページ番号のsetter*/
	public void setCurrentPage(int currentPage){

		this.currentPage = currentPage;
	}


}
