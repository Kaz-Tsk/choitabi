package com.internousdev.choitabi.util;

import java.util.ArrayList;

import com.internousdev.choitabi.dto.KanriContactDTO;

/**
 * ページネーションが必要なリストのために、1ページごとの情報を保持するためのクラス
 * @author KANAKO MIYAZONO
 * @since 2017/09/11
 * @version 1.1
 */
public class KanriContactPagenation2 {

	/**
	 * ページを識別するID
	 */
	private int pageId;



	/**
	 * 当該1ページに掲載される商品のリスト
	 */
	public ArrayList<KanriContactDTO> paginatedItemList = new ArrayList<KanriContactDTO>();

	/**
	 * ページネートされた商品リストを取得するメソッド
	 * @author KANAKO MIYAZONO
	 * @since 2017/09/11
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
	 * これによってDTOのインスタンスが当該ページにひとつずつ格納されていく
	 * @param list これからページネーション処理を行うリスト
	 * @param j 繰り返し用変数
	 */
	public void addPaginatedList(ArrayList<KanriContactDTO> list, int j) {
		paginatedItemList.add((KanriContactDTO) list.get(j));
	}

	/**
	 * ページIDを取得するメソッド
	 * @author KANAKO MIYAZONO
	 * @since 2017/09/11
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
	 * @author kanako miyazono
	 * @since 2017/09/11
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

