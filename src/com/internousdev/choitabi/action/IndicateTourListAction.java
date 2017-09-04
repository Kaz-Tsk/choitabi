package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.Test_SelectTourDAO;
import com.internousdev.choitabi.dto.Test_SelectTourDTO;
import com.opensymphony.xwork2.ActionSupport;

public class IndicateTourListAction extends ActionSupport{


	/*作成者：松村
	 * 管理画面のツアー情報の管理で使用するアクションです。
	 * DBからツアーのデータを取得し、リストにしてJSPに渡し、表示させます。	 *
	 * */

	/*取得されたすべてのツアー情報*/
	private ArrayList<Test_SelectTourDTO> allTourList = new ArrayList<Test_SelectTourDTO>();

	/*現在表示している＝１ページに表示するツアー情報（ページネート）*/
	private ArrayList<Test_SelectTourDTO> currentTourList = new ArrayList<Test_SelectTourDTO>();

	/*ツアー情報の総ページ数*/
	private int allPages;

	/*ツアー情報の現在のページ番号*/
	private int currentPage;




	/*アクションクラスの「execute」メソッド。
	 * DAOクラスを呼び出してツアーの情報をリストとして取得。
	 * うまく取得できたら、Strutsに「SUCCESS」を、リストが種t句できなかったら「ERROR」を返すこと。*/

	public String execute(){
		String result = ERROR;

		Test_SelectTourDAO tstl = new Test_SelectTourDAO();

		allTourList = tstl.selectTour();

		/*
		 * この部分に、さらにページネート処理を追加。
		 * ↓の記述も微調整を忘れずに。
		 *
		 * */

		if(allTourList != null){
			result = SUCCESS;
		}else{
			result = ERROR;
		}

		System.out.println(result);

		return result;
	}


	/*以下、各変数、リストのgetter/setter
	 * */


	/*ツアーリスト（すべて）のgetter*/
	public ArrayList<Test_SelectTourDTO> getAllTourList(){
		return allTourList;
	}

	/*ツアーリスト（すべて）のsetter*/
	public void setAllTourList(ArrayList<Test_SelectTourDTO> allTourList){
		this.allTourList = allTourList;
	}








}
