package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.SelectTourDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.opensymphony.xwork2.ActionSupport;

public class IndicateTourListAction extends ActionSupport{


	/*作成者：松村
	 * 管理画面のツアー情報の管理で使用するアクションです。
	 * DBからツアーのデータを取得し、リストにしてJSPに渡して、表示させます。	 *
	 * */

	/*検索ワード（初期状態はnullなので、ifで例外回避を）*/
	private String selectWord;

	/*取得されたすべてのツアー情報*/
	private ArrayList<SelectTourDTO> allTourList = new ArrayList<SelectTourDTO>();

	/*現在表示している＝１ページに表示するツアー情報（ページネート）*/
	private ArrayList<SelectTourDTO> currentTourList = new ArrayList<SelectTourDTO>();

	/*ツアー情報の総ページ数*/
	private int allPages;

	/*ツアー情報の現在のページ番号*/
	private int currentPage;




	/*アクションクラスの「execute」メソッド。
	 * DAOクラスを呼び出してツアーの情報をリストとして取得。
	 * うまく取得できたら、Strutsに「SUCCESS」を、リストが種t句できなかったら「ERROR」を返すこと。*/

	public String execute(){
		String result = ERROR;

		SelectTourDAO tstl = new SelectTourDAO();

		allTourList = tstl.selectTour();

		/*
		 * この部分に、さらにページネート処理を追加。
		 * ↓の記述も微調整を忘れずに。
		 *
		 * */

		/*
		 * currentTourList = paginateTourList(allTourList, currentPage);
		 * ↑このメソッドをutilに作り、JSPに渡す
		 * ＝下のallTourListはcurrentTourListに変更する
		 *
		 * */


		if(allTourList != null){
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
	public int getAllPages(){
		return allPages;
	}

	/*ツアー情報総ページ数のsetter*/
	public void serAllPages(int allPages){
		this.allPages = allPages;
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
