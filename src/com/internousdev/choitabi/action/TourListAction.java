package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.TourListDAO;
import com.internousdev.choitabi.dto.TourDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品一覧を表示するアクション
 * @author SHUN NAGAO
 * @since 2017/09/13
 * @version 1.1
 */

public class TourListAction extends ActionSupport {


    /**
	 * シリアルID
	 */
	private static final long serialVersionUID = -2317378109140954249L;

	/**
     * ツアーID
     */
    private int tour_id;

    /**
     * ツアー名
     */
    private String tour_name;

    /**
     * テーマ
     */
    private String theme;

    /**
     * 地方
     */
    private String region;

    /**
     * 価格
     */
    private int price;

    /**
     * 画像パス
     */
    private String img;

    /**
     * サーチリスト
     */
    public ArrayList<TourDTO> selectList=new ArrayList<TourDTO>();


    /**
     * 実行メソッド
     * @return success or error
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public String execute() throws IllegalAccessException, InstantiationException{
        String result=ERROR;

        TourListDAO dao =new TourListDAO();

        selectList=dao.display(theme,region);

        if(selectList.size()>0){
            result=SUCCESS;
        }
        return result;
    }


    /**
     * ツアーIDを取得するメソッド
     * @return item_id 商品ID
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
     * @return tourName ツアー名
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
     * テーマを取得するメソッド
     * @return thema テーマ
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
     * テーマを取得するメソッド
     * @return thema テーマ
     */
    public String getRegion() {
        return region;
    }

    /**
     * 地方を格納するメソッド
     * @param region 地方
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 地方を格納するメソッド
     * @param region 地方
     */
    public int getPrice() {
        return price;
    }

    /**
     * 価格を格納するメソッド
     * @param price 価格
     */
    public void setPrice(int price) {
        this.price = price;
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
     * セレクトリストを取得するメソッド
     * @return selectList セレクトリスト
     */
    public ArrayList<TourDTO> getSelectList() {
        return selectList;
    }

    /**
     * セレクトリストを格納するメソッド
     * @param selectList セレクトリスト
     */
    public void setSelectList(ArrayList<TourDTO> selectList) {
        this.selectList = selectList;
    }

    /**
     * シリアルIDを取得するメソッド
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}