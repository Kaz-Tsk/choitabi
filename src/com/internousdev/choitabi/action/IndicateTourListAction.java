package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.SelectTourListDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.internousdev.choitabi.util.TourListPagination;
import com.opensymphony.xwork2.ActionSupport;

public class IndicateTourListAction extends ActionSupport{


	/**@author YUKA MATSUMURA
	 * @since 2017/09/05
	 * @virsion 1.1
	 * 管理画面のツアー情報の管理で使用するアクションです。
	 * DBからツアーのデータを取得し、アレイリストにしてJSPに渡して、表示させます。
	 * 使っているアレイリストは2種類で、
	 * DBから取得したすべてのデータを入れた「allTourList」と、そこから
	 * 現在のページに表示するものだけを切り出した「currentTourList」です。
	 * JSPに渡しているのは「currentTourList」の方です。
	 * */

	/*検索ワード（初期状態はnullになってしまうので、""=空白を入れておきます*/
	private String selectWord = "";

	/*取得されたすべてのツアー情報*/
	private ArrayList<SelectTourDTO> allTourList = new ArrayList<SelectTourDTO>();

	/*現在表示している＝１ページに表示するツアー情報（ページネート）*/
	private ArrayList<SelectTourDTO> currentTourList = new ArrayList<SelectTourDTO>();

	/*ツアー情報の最大ページ数*/
	private int maxPage;

	/*ツアー情報の現在のページ番号*/
	private int currentPage = 1;/*nullPointerが起きないように、最初に1を入れておきます。*/




	/*アクションクラスの「execute」メソッド。
	 * DAOクラスを呼び出してツアーの情報をリストとして取得。
	 * うまく取得できたら、Strutsに「SUCCESS」を、そうでなかったら「ERROR」を返します。*/
	public String execute(){
		String result = ERROR;

		/*DAOでツアーの一覧を持ってくる*/
		SelectTourListDAO stldao = new SelectTourListDAO();
		allTourList = stldao.selectTourList(selectWord);

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
