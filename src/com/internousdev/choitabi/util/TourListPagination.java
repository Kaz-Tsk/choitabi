package com.internousdev.choitabi.util;

import java.util.ArrayList;

import com.internousdev.choitabi.dto.SelectTourDTO;

/**
 * ツアー情報一覧のページネーションを行うクラス
 * @author:YUKA MATSUMURA
 * @since:2017/09/05
 * @version:1.1
 * */
public class TourListPagination {

	/**
	 * 表示するリストの最初のインデックス番号
	 * */
	private int firstIndex = 0;

	/**
	 * 表示するリストの最後のインデックス番号
	 * */
	private int lastIndex = 0;

	/**
	 * 1ページに表示する件数
	 * */
	private int tourNumber = 10;




	/**
	 * ツアー情報の一覧をページネートするメソッド
	 * @author YUKA MATSUMURA
	 * @since 2017/09/05
	 * @version 1.1
	 * @param allTourList ツアー全件を格納したアレイリスト
	 * @param currentPage 現在のページ数
	 * @return currentTourList ページネートされたツアー一覧のリスト
	 * */
	public ArrayList<SelectTourDTO> paginateTourList(ArrayList<SelectTourDTO> allTourList, int currentPage){

		/*呼び出し元に返すツアーのリスト*/
		ArrayList<SelectTourDTO> currentTourList = new ArrayList<SelectTourDTO>();

		firstIndex = firstIndex + ( (currentPage - 1)  * tourNumber );
		lastIndex = lastIndex + (currentPage * tourNumber);


		if(allTourList.size() == 0){
			return null;
		}

		for(int i = firstIndex; i < lastIndex; i ++){
			if(i >= allTourList.size()){
				break;
			}
			currentTourList.add(allTourList.get(i));
		}

		return currentTourList;

	}

	/**
	 * 渡されたツアーのリストから最大ページ数を求めるメソッド
	 * @author:YUKA MATSUMURA
	 * @since:2017/09/05
	 * @version:1.1
	 * @param allTourList ツアー全件を格納したアレイリスト
	 * @return maxPage(int) 最大ページ数
	 * */
	public int rerturnMaxPage(ArrayList<SelectTourDTO> allTourList){
		int maxPage;

		if(allTourList.size() == 0){
			maxPage = 1;
		}
		else if( (allTourList.size() % tourNumber)  != 0 ){
			maxPage = (allTourList.size() / tourNumber) + 1;
		}else{
			maxPage = (allTourList.size() / tourNumber);
		}
		System.out.println("returnMaxPage : " + maxPage);

		return maxPage;
	}




}
