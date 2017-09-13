package com.internousdev.choitabi.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.TourListDAO;
import com.internousdev.choitabi.dto.TourDTO;
import com.internousdev.choitabi.util.AllPagesT;
import com.internousdev.choitabi.util.PageObjectTour;
import com.opensymphony.xwork2.ActionSupport;

/**
 *  商品一覧を表示するクラス
 *  @auter SHUN NAGAO
 *  @since 2017/09/13
 *  @version 1.0
 */

public class TourListAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルIDの発行
	 */
	private static final long serialVersionUID = -2071088191134829678L;
	/**
	 * データベースから取得した商品情報リスト
	 */
	private ArrayList<TourDTO> selectList = new ArrayList<>();
	/**
	 * データベースから取得した商品情報を表示するための情報リスト
	 */
	public ArrayList<TourDTO> itemList = new ArrayList<TourDTO>();
	/**
	 * セッション情報
	 */
	private Map<String,Object> session;
	/**
	 * 総ページ数
	 */
	private int maxPage;
	/**
	 * 現在のページ
	 */
	private int pageNum=1;
	/**
	 * 総データ数
	 */
	private int number;

	/**
	 *  MySQLより商品情報を取得する為の実行メソッド
	 * @author TETSUYA KANAZAWA
	 * @version 1.0
	 * @since 2017/08/02
	 */
	public String execute(){
		String result = ERROR;

		//商品情報の取得
		TourListDAO dao=new TourListDAO();
		selectList = dao.select();


		java.util.Date date = new java.util.Date();
		java.sql.Date today = new java.sql.Date(date.getTime());

		for(int i=0;i < selectList.size();i++){
			if(today.compareTo(selectList.get(i).getSales_perid()) > 0 || selectList.get(i).getItem_stock() <= 0){
					selectList.remove(i);
					i--;
			}
		}

		//ページネーション
		number=selectList.size();
		if(number>0){
			ArrayList<PageObjectTour> allPages = new ArrayList<PageObjectTour>();
			AllPagesT allp = new AllPagesT();
			allPages = allp.paginate(selectList, 12);
			maxPage = allp.getMaxPage(selectList, 12);
			itemList = allPages.get(pageNum-1).getPaginatedList();
		}

			result =SUCCESS;
			return result;
	}

	/**
	 * 総ページ数を取得するメソッド
	 * @return maxPage
	 */
	public int getMaxPage() {
		return maxPage;
	}

	/**
	 * 総ページ数を格納するメソッド
	 * @param maxPage セットする maxPage
	 */
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	/**
	 * 現在のページを取得するメソッド
	 * @return pageNum
	 */
	public int getPageNum() {
		return pageNum;
	}

	/**
	 * 現在のページを格納するメソッド
	 * @param pageNum セットする pageNum
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * 総データ数を取得するメソッド
	 * @return number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * 総データ数を格納するメソッド
	 * @param number セットする number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * 商品情報のリストを取得するメソッド
	 * @return itemList
	 */
	public ArrayList<TourDTO> getItemList() {
		return itemList;
	}

	/**
	 * 商品情報のリストを格納するメソッド
	 * @param itemList セットする itemList
	 */
	public void setItemList(ArrayList<TourDTO> itemList) {
		this.itemList = itemList;
	}

	/**
	 * 商品情報のリストを取得するメソッド
	 * @return selectList
	 */
	public ArrayList<TourDTO> getSelectList() {
		return selectList;
	}

	/**
	 * 商品情報のリストを格納するメソッド
	 * @param selectList セットする selectList
	 */
	public void setSelectList(ArrayList<TourDTO> selectList) {
		this.selectList = selectList;
	}

	/**
	 * セッション情報を取得するメソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * シリアルIDを取得するメソッド
	 * @return serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}