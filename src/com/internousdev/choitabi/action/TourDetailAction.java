package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.TourListDAO;
import com.internousdev.choitabi.dto.TourDTO;
import com.internousdev.choitabi.dao.TourDetailDAO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * ツアー詳細を表示するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/13
 * @since 1.0
 */

public class TourDetailAction extends ActionSupport {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 予約人数
	 */
	private int persons;

	/**
	 * 検索したカート内のツアー情報を入れるリスト
	 */
	private ArrayList<TourDTO> tourList = new ArrayList<TourDTO>();

	/**
	 * ツアーID
	 */
	private int tour_id;



	/**
	 * ツアー詳細を表示する実行メソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/13
	 * @version 1.0
	 */

	public String execute() {
		String result = ERROR;
		int count = 0;
		ArrayList<TourDTO> selectList = new ArrayList<TourDTO>();
		TourListDAO tldao = new TourListDAO();
		selectList = tldao.select();

		for(int i = 0; i < selectList.size(); i++) {
			if(this.tour_id == selectList.get(i).getTourId() {
				count = 1;
			}
		}

		if(count == 0) {
			return ERROR;
		}

		TourDetailDAO tddao = new TourDetailDAO();
		tourList = tddao.select(tour_id );

		if(!(tourList.isEmpty())) {
			return SUCCESS;
		}

		return result;
	}



	/**
	 * ツアーIDを取得するメソッド
	 * @return tour_id ツアーID
	 */
	public int getTourId() {
		return tour_id;
	}

	/**
	 * ツアーIDを格納するメソッド
	 * @param tour_id ツアーID
	 */
	public void setTourId(int tour_id) {
		this.tour_id = tour_id;
	}

	/**
	 * ツアーリストを取得するメソッド
	 * @return tourList ツアーリスト
	 */
	public ArrayList<TourDTO> getTourList() {
		return tourList;
	}

	/**
	 * ツアーリストを格納するメソッド
	 * @param tourList ツアーリスト
	 */
	public void setTourList(ArrayList<TourDTO> tourList) {
		this.tourList = tourList;
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

}
