package com.internousdev.choitabi.util;

import java.util.ArrayList;

import com.internousdev.choitabi.dto.KanriContactDTO;

/**
 * ページネーションが必要なリストのために、1ページごとの情報を保持するためのクラス
 * @author RYUTO TASHIRO
 * @since 2017/08/22
 * @version 1.1
 */
public class PageContact {

	/**
	 * ページを識別するID
	 */
	private int pageId;



	/**
	 * 当該1ページに掲載される商品のリスト
	 */
	private ArrayList<KanriContactDTO> paginatedItemList = new ArrayList<KanriContactDTO>();

	/**
	 * ページネートされた商品リストを取得するメソッド
	 * @author RYUTO TASHIRO
	 * @since 2017/08/22
	 * @return paginatedItemList ページネートされた商品リスト
	 */
	public ArrayList<KanriContactDTO> getPaginatedList() {
		return paginatedItemList;
	}

	/**
	 * ページネートされた商品リストを格納するメソッド
	 * @param list ページネーションが完了した1ページごとのリスト
	 */
	public void setPaginatedList(ArrayList<KanriContactDTO> list) {
		paginatedItemList = list;
	}

	/**
	 * AllPagesPurchaseHistoryクラスのpaginate()において使われる
	 * これによってDTOのインスタンスが当該ページにひとつずつ格納されていく
	 * @param list これからページネーション処理を行うリスト
	 * @param j 繰り返し用変数
	 */
	public void addPaginatedList(ArrayList<KanriContactDTO> list, int j) {
		paginatedItemList.add((KanriContactDTO) list.get(j));
	}

	/**
	 * ページIDを取得するメソッド
	 * @author RYUTO TASHIRO
	 * @since 2017/08/22
	 * @return pageId ページID
	 */
	public int getPageId() {
		return pageId;
	}

	/**
	 * ページIDを格納するメソッド
	 * @param pageId ページID
	 */
	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	/**
	 * ページネートされた商品リストを取得するメソッド
	 * @author RYUTO TASHIRO
	 * @since 2017/08/22
	 * @return paginatedItemList ページネートされた商品リスト
	 */
	public ArrayList<KanriContactDTO> getPaginatedItemList() {
		return paginatedItemList;
	}

	/**
	 * ページネートされた商品リストを格納するメソッド
	 * @param paginatedItemList ページネートされた商品リスト
	 */
	public void setPaginatedItemList(ArrayList<KanriContactDTO> paginatedItemList) {
		this.paginatedItemList = paginatedItemList;
	}
}