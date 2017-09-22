package com.internousdev.choitabi.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.TourDetailDAO;
import com.internousdev.choitabi.dto.TourDTO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * ツアー詳細を表示するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/13
 * @since 1.1
 */

public class TourDetailAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1521502778776531460L;

	/**
	 * ツアーID
	 */
	private int tour_id;

	/**
	 * ツアー名
	 */
	private String tour_name;

	/**
	 * 価格
	 */
	private BigDecimal price;

	/**
	 * 予約人数
	 */
	private int persons;

	/**
	 * 出発地
	 */
	private String departure;

	/**
	 * 地方
	 */
	private String region;

	/**
	 * 都道府県
	 */
	private String prefectures;

	/**
	 * テーマ
	 */
	private String theme;

	/**
	 * 詳細文
	 */
	private String comment;

	/**
	 * 画像パス
	 */
	private String img;

	/**
    * ツアー一覧表示用リスト
    */
   private ArrayList<TourDTO> displayList = new ArrayList<TourDTO>();

	/**
	 * セッション
	 */
	private Map<String, Object> session;



	/**
	 * ツアー詳細を表示する実行メソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/13
	 * @version 1.1
	 */

	public String execute() throws SQLException {
		String result = ERROR;

		TourDetailDAO dao = new TourDetailDAO();
		displayList = dao.select(tour_id);

		if(displayList.size() != 0) {
			this.tour_name = displayList.get(0).getTour_name();
			this.img = displayList.get(0).getImg();

			result = SUCCESS;
		}

		return result;

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
	 * 価格を取得するメソッド
	 * @return price 価格
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 価格を格納するメソッド
	 * @oaram price 価格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 予約人数を取得するメソッド
	 * @return persons 予約人数
	 */
	public int getPersons() {
		return persons;
	}

	/**
	 * 予約人数を格納するメソッド
	 * @param persons 予約人数
	 */
	public void setPersons(int persons) {
		this.persons = persons;
	}

	/**
	 * 出発地を取得するメソッド
	 * @return departure 出発地
	 */
	public String getDeparture() {
		return departure;
	}

	/**
	 * 出発地を格納するメソッド
	 * @param departure 出発地
	 */
	public void setDeparture(String departure) {
		this.departure = departure;
	}

	/**
	 * 地方を取得するメソッド
	 * @return region 地方
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * 地方を格納するメソッド
	 * @oaram region 地方
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * 都道府県を取得するメソッド
	 * @return prefectures 都道府県
	 */
	public String getPrefectures() {
		return prefectures;
	}

	/**
	 * 都道府県を格納するメソッド
	 * @param prefectures 都道府県
	 */
	public void setPrefectures(String prefectures) {
		this.prefectures = prefectures;
	}

	/**
	 * テーマを取得するメソッド
	 * @return theme テーマ
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * テーマを格納するメソッド
	 * @param theme テーマ
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 * ツアー詳細文を取得するメソッド
	 * @return comment ツアー詳細文
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * ツアー詳細文を格納するメソッド
	 * @param comment ツアー詳細文
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 画像パスを取得するメソッド
	 * @return img 画像パス
	 */
	public String getImg() {
		return img;
	}

	/**
	 * 画像パスを格納するメソッド
	 * @param img 画像パス
	 */
	public void setImg(String img) {
		this.img = img;
	}

    /**
     * 商品一覧表示用リストを取得するメソッド
     * @return displayList 商品一覧表示用リスト
     */
    public ArrayList<TourDTO> getDisplayList() {
        return displayList;
    }

    /**
     * 商品一覧表示用リストを格納するメソッド
     * @param displayList 商品一覧表示用リスト
     */
    public void setDisplayList(ArrayList<TourDTO> displayList) {
        this.displayList = displayList;
    }

    /**
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    /**
     * シリアルIDを取得するメソッド
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}