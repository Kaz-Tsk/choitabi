package com.internousdev.choitabi.util;

import java.util.ArrayList;

import com.internousdev.choitabi.dto.CartDTO;



/**
 * ページネーションが必要なリストのために、1ページごとの情報を保持するためのクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/08
 * @version 1.0
 */

public class PageObjectHistory {

	/**
	 * ページを識別するID
	 */
	private int pageId;

	/**
	 * 当該1ページに掲載される商品のリスト
	 */
	private ArrayList<CartDTO> paginatedTourList = new ArrayList<CartDTO>();




	/**
	 * ページネートされたツアーリストを取得するメソッド
	 * @return  paginatedTourList ツアーリスト
	 */
	public ArrayList<CartDTO> getPaginatedList() {
			return paginatedTourList;
			}

	/**
	 * ページネートされたツアーーリストを格納するメソッド
	 * @param list ページネーションが完了した1ページごとのリスト
	 */
	public void setPaginatedList(ArrayList<CartDTO> list) {
			paginatedTourList = list;
	}


	/**
	 * AllPagesCクラスのpaginate()において使われる
	 * これによってDTOのインスタンスが当該ページにひとつずつ格納されていく
	 * @param list これからページネーション処理を行うリスト
	 * @param j 繰り返し用変数
	 */
	public void addPaginatedList(ArrayList<CartDTO> list, int j) {
			paginatedTourList.add((CartDTO)list.get(j));
			}

	/**
	 * ページID取得メソッド
	 * @return pageId
	 */
	public int getPageId() {
		return pageId;
	}

	/**
	 * ページID格納メソッド
	 * @param pageId セットする pageId
	 */
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}
}
