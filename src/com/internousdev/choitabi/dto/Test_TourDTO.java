/**
 *
 */
package com.internousdev.choitabi.dto;

/**
 * ツアー情報に関するDTOクラス
 *
 * @author SHUN NAGAO
 * @since 2017/09/14
 * @version 1.0
 *
 */
public class Test_TourDTO {

	/**
	 * ツアー名
	 */
	private String tourName;

	/**
	 * ツアーID
	 */
	private int tourId;

	/**
	 * 単価
	 */
	private float price;

    /**
     * イメージパス
	 */
	private String imgPath;

	/**
	 * 在庫数
	 */
	private int stocks;

	/**
	 * ツアー詳細
	 */
	private String tourDetail;

	/**
	 * 売上数
	 */
	private int sales;

	/**
	 * 登録日
	 */
	private String createdAt;

	/**
	 * 更新日
	 */
	private String updatedAt;

	/**
	 * ツアー画像01
	 */
	private String tourImg01;

	/**
	 * ツアー画像02
	 */
	private String tourImg02;

	/**
	 * 種類ID
	 */
	private int sortId;

	/**
	 * 種類
	 */
	private String tourGenre;

	/**
	 * デリートキー
	 */
	private boolean delKey;


	//以下アクセサリー


	/**
	 * ツアー名を取得するメソッド
	 * @return tourName
	 */
	public String getTourName() {
		return tourName;
	}

	/**
	 * ツアー名を格納するメソッド
	 * @param tourName セットする tourName
	 */
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	/**
	 * ツアーIDを取得するメソッド
	 * @return tourId
	 */
	public int getTourId() {
		return tourId;
	}

	/**
	 * ツアーIDを格納するメソッド
	 * @param tourId セットする tourId
	 */
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	/**
	 * 単価を取得するメソッド
	 * @return price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * 単価を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * イメージパスを取得するメソッド
	 * @return imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * イメージパスを格納するメソッド
	 * @param imgPath セットする imgPath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * 在庫数を取得するメソッド
	 * @return stocks
	 */
	public int getStocks() {
		return stocks;
	}

	/**
	 * 在庫数を格納するメソッド
	 * @param stocks セットする stocks
	 */
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	/**
	 * ツアー詳細を取得するメソッド
	 * @return tourDetail
	 */
	public String getTourDetail() {
		return tourDetail;
	}

	/**
	 * ツアー詳細を格納するメソッド
	 * @param tourDetail セットする tourDetail
	 */
	public void setTourDetail(String tourDetail) {
		this.tourDetail = tourDetail;
	}

	/**
	 * 売上数を取得するメソッド
	 * @return sales
	 */
	public int getSales() {
		return sales;
	}

	/**
	 * 売上数を格納するメソッド
	 * @param sales セットする sales
	 */
	public void setSales(int sales) {
		this.sales = sales;
	}

	/**
	 *	登録日を取得するメソッド
	 * @return createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 登録日を格納するメソッド
	 * @param createdAt セットする createdAt
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 更新日を取得するメソッド
	 * @return updatedAt
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 更新日を格納するメソッド
	 * @param updatedAt セットする updatedAt
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * ツアー画像01を取得するメソッド
	 * @return tourImg01
	 */
	public String getTourImg01() {
		return tourImg01;
	}

	/**
	 * ツアー画像01を格納するメソッド
	 * @param tourImg01 セットする tourImg01
	 */
	public void setTourImg01(String tourImg01) {
		this.tourImg01 = tourImg01;
	}

	/**
	 * ツアー画像02を取得するメソッド
	 * @return tourImg02
	 */
	public String getTourImg02() {
		return tourImg02;
	}

	/**
	 * ツアー画像02を格納するメソッド
	 * @param tourImg02 セットする tourImg02
	 */
	public void setTourImg02(String tourImg02) {
		this.tourImg02 = tourImg02;
	}

	/**
	 * 種類IDを取得するメソッド
	 * @return sortId
	 */
	public int getSortId() {
		return sortId;
	}

	/**
	 * 種類IDを格納するメソッド
	 * @param sortId セットする sortId
	 */
	public void setSortId(int sortId) {
		this.sortId = sortId;
	}

	/**
	 * 種類を取得するメソッド
	 * @return tourGenre
	 */
	public String getTourGenre() {
		return tourGenre;
	}

	/**
	 * 種類を格納するメソッド
	 * @param tourGenre セットする tourGenre
	 */
	public void setTourGenre(String tourGenre) {
		this.tourGenre = tourGenre;
	}

	/**
	 * デリートキーを取得するメソッド
	 * @return delKey
	 */
	public boolean isDelKey() {
		return delKey;
	}

	/**
	 * デリートキーを格納するメソッド
	 * @param delKey セットする delKey
	 */
	public void setDelKey(boolean delKey) {
		this.delKey = delKey;
	}

}