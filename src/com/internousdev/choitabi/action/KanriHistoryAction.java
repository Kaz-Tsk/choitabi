package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.KanriHistoryDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.choitabi.util.AllPagesC;
import com.internousdev.choitabi.util.PageObjectHistory;
import com.opensymphony.xwork2.ActionSupport;



/**
 * 管理画面で予約情報を検索・表示するアクション
 * @author HINAKO HAGIWARA
 * @since 2017/09/07
 *@version 1.1
 */

public class KanriHistoryAction extends ActionSupport {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * 姓
	 */
	private String familyNameKanji;

	/**
	 * 名
	 */
	private String givenNameKanji;

	/**
	 * ツアーID
	 */
	private int tourId;

	/**
	 * ツアー名
	 */
	private String tourName;

	/**
	 * 購入数
	 */
	private int quantity;

	/**
	 * 合計金額
	 */
	private int totalPrice;;

	/**
	 * 検索ワード
	 */
	private String searchName;

	/**
	 * 検索結果リスト
	 */
	private ArrayList<CartDTO> searchList = new ArrayList<CartDTO>();

	/**
	 * ページネーション
	 */
	private int maxPage;
	private int pageNum = 1;
	private int number;
	public ArrayList<CartDTO> displayList = new ArrayList<CartDTO>();



	/**
	 * 管理者画面で予約情報を検索するメソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/07
	 * @version 1.1
	 */

	public String execute() {
		String result = SUCCESS;
		if(tourName == null || tourName.equals(null)) {
			tourName = "";

			ArrayList<CartDTO> allList = new ArrayList<CartDTO>();
			KanriHistoryDAO dao = new KanriHistoryDAO();

			allList = dao.display("");

			int all = 0;
			all = allList.size();
			for(int i = 0; i < all; i++) {
				CartDTO dto = new CartDTO();
				dto = allList.get(i);
				searchList.add(dto);
			}

		}else {

			ArrayList<CartDTO> allList = new ArrayList<CartDTO>();
			KanriHistoryDAO dao = new KanriHistoryDAO();

			allList = dao.display(this.getTourName());

			int all = 0;
			all = allList.size();
			for(int i = 0; i < all; i++) {
				CartDTO dto = new CartDTO();
				dto = allList.get(i);
				String str = dto.getTourName();

				if(str.startsWith(tourName)) {
					searchList.add(dto);
				}
			}
		}

		number = searchList.size();

		if(number > 0) {
			//ページネーション処理
			ArrayList<PageObjectHistory> allPages = new ArrayList<PageObjectHistory>();
			AllPagesC allp = new AllPagesC();
			allPages = allp.paginate(searchList, 5);
			this.setMaxPage(allp.getMaxPage(searchList, 5));
			this.setDisplayList(allPages.get(pageNum-1).getPaginatedList());

			result = SUCCESS;
			}

		return result;
		}



	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId ユーザーID
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * ツアーIDを取得するメソッド
	 * @return tourId ツアーID
	 */
	public int getTourId() {
		return tourId;
	}

	/**
	 * ツアーIDを格納するメソッド
	 * @param tourId ツアーID
	 */
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	/**
	 * ツアー名を取得するメソッド
	 * @return tourName ツアー名
	 */
	public String getTourName() {
		return tourName;
	}

	/**
	 * ツアー名を格納するメソッド
	 * @param tourName ツアー名
	 */
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	/**
	 * 購入数を取得するメソッド
	 * @return quantity 購入数
	 */
	public int getQouantity() {
		return quantity;
	}

	/**
	 * 購入数を格納するメソッド
	 * @param quantity 購入数
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return totalPrice 合計金額
	 */
	public int getTotalPrice() {
		return totalPrice;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param totalPrice 合計金額
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * 名前(姓)を取得するメソッド
	 * @return familyNameKanji 名前(姓)
	 */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}

	/**
	 * 名前(姓)を格納するメソッド
	 * @param familyNameKanji 名前(姓)
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}

	/**
	 * 名前(名)を取得するメソッド
	 * @return givenNameKanji 名前(名)
	 */
	public String getGivenNameKanji() {
		return givenNameKanji;
	}

	/**
	 * 名前(名)を格納するメソッド
	 * @param givenNameKanji 名前(名)
	 */
	public void setGivennameKanji(String givenNameKanji) {
		this.givenNameKanji = givenNameKanji;
	}

	/**
	 * 検索ワードを取得するメソッド
	 * @return searchName 検索ワード
	 */
	public String getSearchName() {
		return searchName;
	}

	/**
	 * 検索ワードを格納するメソッド
	 * @param searchName 検索ワード
	 */
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	/**
	 * 検索結果リストを取得するメソッド
	 * @return searchList 検索結果リスト
	 */
	public ArrayList<CartDTO> getSearchList() {
		return searchList;
	}

	/**
	 * 検索結果リストを格納するメソッド
	 * @param searchList 検索結果
	 */
	public void getSearchList(ArrayList<CartDTO> searchList) {
		this.searchList = searchList;
	}

	/**
	 * 最大ページを取得するメソッド
	 * @return maxPage 最大ページ
	 */
	public int getMaxPage() {
		return maxPage;
	}

	/**
	 * 最大ページを格納するメソッド
	 * @param maxPage 最大ページ
	 */
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	/**
	 * ページ番号を取得するメソッド
	 * @return pageNum ページ番号
	 */
	public int getPageNum() {
		return pageNum;
	}

	/**
	 * ページ番号を格納するメソッド
	 * @param pageNum ページ番号
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * 結果を取得するメソッド
	 * @return displayList 結果
	 */
	public ArrayList<CartDTO> getDisplayList() {
		return displayList;
	}

	/**
	 * 結果を格納するメソッド
	 * @param displayList 結果
	 */
	public void setDisplayList(ArrayList<CartDTO> displayList) {
		this.displayList = displayList;
	}

}