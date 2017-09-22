package com.internousdev.choitabi.action;

import java.math.BigDecimal;
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
	private static final long serialVersionUID = -4207399845924861834L;

	/**
	 * ユーザーID
	 */
	private int user_id;

	/**
	 * 姓
	 */
	private String family_name_kanji;

	/**
	 * 名
	 */
	private String given_name_kanji;

	/**
	 * ツアーID
	 */
	private int tour_id;

	/**
	 * ツアー名
	 */
	private String tour_name;

	/**
	 * 予約人数
	 */
	private int order_count;

	/**
	 * 合計金額
	 */
	private BigDecimal total_price;;

	/**
	 * 検索ワード
	 */
	private String search_name;

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
		if(tour_name == null || tour_name.equals(null)) {
			tour_name = "";

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

		} else {

			ArrayList<CartDTO> allList = new ArrayList<CartDTO>();
			KanriHistoryDAO dao = new KanriHistoryDAO();

			allList = dao.display(this.getTour_name());

			int all = 0;
			all = allList.size();
			for(int i = 0; i < all; i++) {
				CartDTO dto = new CartDTO();
				dto = allList.get(i);
				String str = dto.getTour_name();

				if(str.startsWith(tour_name)) {
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
	 * @return user_id ユーザーID
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 * @param user_id ユーザーID
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * ツアーIDを取得するメソッド
	 * @return tour_id ツアーID
	 */
	public int getTour_id() {
		return tour_id;
	}

	/**
	 * ツアーIDを格納するメソッド
	 * @param tour_id ツアーID
	 */
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}

	/**
	 * ツアー名を取得するメソッド
	 * @return tour_name ツアー名
	 */
	public String getTour_name() {
		return tour_name;
	}

	/**
	 * ツアー名を格納するメソッド
	 * @param tour_name ツアー名
	 */
	public void setTour_name(String tour_name) {
		this.tour_name = tour_name;
	}

	/**
	 * 予約人数を取得するメソッド
	 * @return order_count 予約人数
	 */
	public int getOrder_count() {
		return order_count;
	}

	/**
	 * 予約人数を格納するメソッド
	 * @param order_count 予約人数
	 */
	public void setOrder_count(int order_count) {
		this.order_count = order_count;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return total_price 合計金額
	 */
	public BigDecimal getTotal_price() {
		return total_price;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param total_price 合計金額
	 */
	public void setTotal_price(BigDecimal total_price) {
		this.total_price = total_price;
	}

	/**
	 * 名前(姓)を取得するメソッド
	 * @return family_name_kanji 名前(姓)
	 */
	public String getFamily_name_kanji() {
		return family_name_kanji;
	}

	/**
	 * 名前(姓)を格納するメソッド
	 * @param family_name_kanji 名前(姓)
	 */
	public void setFamily_name_Kanji(String family_name_kanji) {
		this.family_name_kanji = family_name_kanji;
	}

	/**
	 * 名前(名)を取得するメソッド
	 * @return given_name_kanji 名前(名)
	 */
	public String getGiven_name_kanji() {
		return given_name_kanji;
	}

	/**
	 * 名前(名)を格納するメソッド
	 * @param given_name_kanji 名前(名)
	 */
	public void setGiven_name_kanji(String given_name_kanji) {
		this.given_name_kanji = given_name_kanji;
	}

	/**
	 * 検索ワードを取得するメソッド
	 * @return search_name 検索ワード
	 */
	public String getSearch_name() {
		return search_name;
	}

	/**
	 * 検索ワードを格納するメソッド
	 * @param search_name 検索ワード
	 */
	public void setSearch_name(String search_name) {
		this.search_name = search_name;
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

    /**
     * シリアルIDを取得するメソッド
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}