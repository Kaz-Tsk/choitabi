/**
 *
 */
package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dao.Test_GoTourDetailDAO;
import com.internousdev.choitabi.dto.Test_TourDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ジャンル別にツアー一覧を表示するクラス
 * @author SHUN NAGAO
 * @since 2017/09/14
 * @version 1.0
 */
public class Test_GoTourDetailAction extends ActionSupport {


	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 265702236011588767L;

	/**
	 * ツアーID
     */

	private int tourId;

	/**
	 * ツアー名
     */

	private String tourName;

	/**
	 * 種類ID
     */
	private int sortId;

	/**
	 * 単価
     */

	private float price;

	/**
	 * ツアー画像01
     */

	private String tourImg01;
	/**
	 * ツアー画像02
     */

	private String tourImg02;

	/**
	 * ツアー詳細
     */

	private String tourDetail;

	/**
	 * ツアー一覧表示用リスト
     */

	private ArrayList<Test_TourDTO> displayList = new ArrayList<Test_TourDTO>();


	/**
	 * ツアー一覧表示用リストの生成
     */
	public String execute() throws SQLException {
		String result = ERROR;
		Test_GoTourDetailDAO dao = new Test_GoTourDetailDAO();
		displayList = dao.select(sortId);
		if(displayList.size() != 0) {
			result = SUCCESS;
		}
		return result;
	}




	/**
	 * ツアーIDを取得するメソッド
	 * @return tourId　ツアーID
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
	 * ツアー名を取得するメソッド
	 * @return tourName　ツアー名
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
	 * 種類IDを取得するメソッド
	 * @return sortId　種類ID
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
	 * 単価を取得するメソッド
	 * @return price　単価
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
	 * ツアー画像01を取得するメソッド
	 * @return tourImg01　ツアー画像01
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
	 * @return tourImg02　ツアー画像02
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
	 * ツアー詳細を取得するメソッド
	 * @return tourDetail　ツアー詳細
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
	 * ツアー一覧表示用リストを取得するメソッド
	 * @return displayList　ツアー一覧表示用リスト
	 */
	public ArrayList<Test_TourDTO> getDisplayList() {
		return displayList;
	}




	/**
	 * ツアー一覧表示用リストを格納するメソッド
	 * @param displayList セットする displayList
	 */
	public void setDisplayList(ArrayList<Test_TourDTO> displayList) {
		this.displayList = displayList;
	}

	}
