package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.SelectTourListDAO;
import com.internousdev.choitabi.dto.SelectTourDTO;
import com.internousdev.choitabi.util.TourListPagination;
import com.opensymphony.xwork2.ActionSupport;

public class IndicateTourListAction extends ActionSupport{


	/*@author YUKA MATSUMURA
	 * @since 2017/09/05
	 * @virsion 1.1
	 * 管理画面のツアー情報の管理で使用するアクションです。
	 * DBからツアーのデータを取得し、リストにしてJSPに渡して、表示させます。	 *
	 * */

	/*検索ワード（初期状態はnullなので、ifで例外回避を）*/
	private String selectWord = "";

	/*取得されたすべてのツアー情報*/
	private ArrayList<SelectTourDTO> allTourList = new ArrayList<SelectTourDTO>();

	/*現在表示している＝１ページに表示するツアー情報（ページネート）*/
	private ArrayList<SelectTourDTO> currentTourList = new ArrayList<SelectTourDTO>();

	/*ツアー情報の最大ページ数*/
	private int maxPage;

	/*ツアー情報の現在のページ番号*/
	private int currentPage;/*ここは、JSPから持ってくる*/




	/*アクションクラスの「execute」メソッド。
	 * DAOクラスを呼び出してツアーの情報をリストとして取得。
	 * うまく取得できたら、Strutsに「SUCCESS」を、リストが種t句できなかったら「ERROR」を返すこと。*/
	public String execute(){
		String result = ERROR;

		/*DAOでツアーの一覧を持ってくる*/
		SelectTourListDAO tstl = new SelectTourListDAO();
		allTourList = tstl.selectTourList(selectWord);

		/*持ってきた全ツアーを、ページネートで分割されたリストにします*/
		TourListPagination tlp = new TourListPagination();
		 maxPage = tlp.rerturnMaxPage(allTourList);/*ついでに最大ページ数も持ってきます。*/

		/*「＜＜」「＞＞」の移動で現在ページがマイナスになったり、
		 * 最大ページ数を超えたりしないようにするための処理です。
		 * ※後ほどこの処理はJSP上で行うようにします。（URLで0ページ目と4ページ目ができてしまうのでなんだか気持ち悪い）*/
//		if(currentPage >= maxPage){
//			currentPage = maxPage;
//		}else if(currentPage <= 1){
//			currentPage = 1;
//		}

		 /*すべてのデータのうち、現在のページに表示するデータをもう一度リストにして渡しなさい、という処理です。*/
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
