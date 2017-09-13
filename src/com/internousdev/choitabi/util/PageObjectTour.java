package com.internousdev.choitabi.util;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.TourDTO;



/**
 * ページネーションが必要なリストのために、1ページごとの情報を保持するためのクラス
 * @author SHUN NAGAO
 * @since 2017/09/13
 * @version 1.0
 */
public class PageObjectTour {

	/**
	 * ページを識別するID
	 */
	private int pageId;

	/**
	 * 当該1ページに掲載される商品のリスト
	 */
	private ArrayList<TourDTO> paginatedItemList = new ArrayList<TourDTO>();




	/**
	 * ページネートされた商品リストを取得するメソッド
	 * @return  paginatedItemList
	 */
	public ArrayList<TourDTO> getPaginatedList() {
			return paginatedItemList;
			}

	/**
	 * ページネートされた商品リストを格納するメソッド
	 * @param list ページネーションが完了した1ページごとのリスト
	 */
	public void setPaginatedList(ArrayList<TourDTO> list) {
			paginatedItemList = list;
	}

	/**
	 * AllPagesクラスのpaginate()において使われる
	 * これによってDTOのインスタンスが当該ページにひとつずつ格納されていく
	 * @param list これからページネーション処理を行うリスト
	 * @param j 繰り返し用変数
	 */
	public void addPaginatedList(ArrayList<TourDTO> list, int j) {
			paginatedItemList.add((TourDTO)list.get(j));
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