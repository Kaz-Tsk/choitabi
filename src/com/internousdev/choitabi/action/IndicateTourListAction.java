package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.SelectTourListDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.internousdev.choitabi.util.TourListPagination;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ツアー情報の一覧を表示するアクション（管理画面用）
 * @author YUKA MATSUMURA
 * @since 2017/09/05
 * @virsion 1.1
 * */

public class IndicateTourListAction extends ActionSupport{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 2211634393797926367L;

	/**
	 * 検索ワード
	 * */
	private String selectWord = "";

	/**
	 * 検索テーマ
	 * */
	private String selectTheme = "";

	/**
	 * 検索エリア
	 * */
	private String selectRegion = "";


	/**
	 * 全件分のツアーリスト
	 * */
	private ArrayList<SelectTourDTO> allTourList = new ArrayList<SelectTourDTO>();

	/**
	 * 1ページ分のツアーリスト
	 * */
	private ArrayList<SelectTourDTO> currentTourList = new ArrayList<SelectTourDTO>();

	/**
	 * 最大ページ数
	 * */
	private int maxPage;

	/**
	 * 現在のページ番号
	 * */
	private int currentPage = 1;/*nullPointerが起きないように、最初に1を入れておきます。*/




	/**
	 * DBからツアー情報の一覧を検索・取得するメソッド
	 * @return result (SUCCESS/ERROR)
	 * */
	public String execute(){
		String result = ERROR;

		/*DAOでツアーの一覧を持ってきます*/
		SelectTourListDAO stldao = new SelectTourListDAO();
		allTourList = stldao.selectTourList(selectWord, selectTheme, selectRegion);

		/*ここからページネート処理*/
		TourListPagination tlp = new TourListPagination();

		 /*すべてのデータのうち、現在のページに表示するデータだけを切り抜いて、もう一度リストにして渡しなさい、という処理です。*/
		 currentTourList = tlp.paginateTourList(allTourList, currentPage);
		 /*ついでに最大ページ数がいくつになるかも計算させます。*/
		 maxPage = tlp.rerturnMaxPage(allTourList);

		 /*リストがうまく作れたらSUCCESS、そうでなかったらERRORを返します*/
		if(currentTourList != null){
			result = SUCCESS;
		}else{
			result = ERROR;
		}

		return result;
	}


	/*以下、各変数、リストのgetter/setter---------------------- */


	/**
	 * 検索ワードを取得するメソッド
	 * @returnr selectWord 検索ワード
	 * */
	public String getSelectWord(){
		return selectWord;
	}

	/**
	 * 検索ワードを格納するメソッド
	 * @param selectWord 検索ワード
	 * */
	public void setSelectWord(String selectWord){
		this.selectWord = selectWord;
	}

	/**
	 * 検索テーマを取得するメソッド
	 * @return selectTheme 検索テーマ
	 * */
	public String getSelectTheme(){
		return selectTheme;
	}

	/**
	 * 検索テーマを格納するメソッド
	 * @param selectTheme 検索テーマ
	 * */
	public void setSelectTheme(String selectTheme){
		this.selectTheme = selectTheme;
	}

	/**
	 * 検索エリアを取得するメソッド
	 * @return selectRegion 検索エリア
	 * */
	public String getSelectRegion(){
		return selectRegion;
	}

	/**
	 * 検索エリアを格納するメソッド
	 * @param selectRegion 検索エリア
	 * */
	public void setSelectRegion(String selectRegion){
		this.selectRegion = selectRegion;
	}



	/**
	 * 全件分のツアーリストを取得するメソッド
	 * @return allTourList ツアー全件分のリスト
	 * */
	public ArrayList<SelectTourDTO> getAllTourList(){
		return allTourList;
	}

	/**
	 * 全件分のツアーリストを格納するメソッド
	 * @param allTourList ツアー全件分のリスト
	 * */
	public void setAllTourList(ArrayList<SelectTourDTO> allTourList){
		this.allTourList = allTourList;
	}

	/**
	 * 1ページ分のツアーリストを取得するメソッド
	 * @return currentTourList 1ページ分のツアーリスト
	 * */
	public ArrayList<SelectTourDTO> getCurrentTourList(){
		return currentTourList;
	}

	/**
	 * 1ページ分のツアーリストを格納するメソッド
	 * @param currentTourList 1ページ分のツアーリスト
	 * */
	public void setCurrentTourList(ArrayList<SelectTourDTO> currentTourList){
		this.currentTourList = currentTourList;
	}


	/**
	 * 最大ページ数を取得するメソッド
	 * @return maxPage
	 * */
	public int getMaxPage(){
		return maxPage;
	}

	/**
	 * 最大ページ数を格納するメソッド
	 * @param maxPage
	 * */
	public void setMaxPage(int allPages){
		this.maxPage = allPages;
	}

	/**
	 * 現在のページ番号を取得するメソッド
	 * @return currentPage 現在のページ番号
	 * */
	public int getCurrentPage(){
		return currentPage;
	}

	/**
	 * 現在のページ番号を格納するメソッド
	 * @param currentPage 現在のページ番号
	 * */
	public void setCurrentPage(int currentPage){

		this.currentPage = currentPage;
	}


}
