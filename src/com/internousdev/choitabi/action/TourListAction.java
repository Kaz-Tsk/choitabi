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
    private static final long serialVersionUID = 8119766214351162676L;

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
     */
    public String execute(){
        String result=ERROR;

        TourListDAO dao =new TourListDAO();

        selectList=dao.display(theme);

        if(selectList.size()>0){
            result=SUCCESS;
            }
        return result;
        }


    /**
     * ツアーIDを取得するメソッド
     * @return itemId 商品ID
     */
    public int getTourId() {
        return tour_id;
        }

    /**
     * ツアーIDを格納するメソッド
     * @param tourId ツアーID
     */
    public void setTourId(int tourId) {
        this.tour_id = tourId;
        }

    /**
     * ツアー名を取得するメソッド
     * @return tourName ツアー名
     */
    public String getTourName() {
        return tour_name;
        }

    /**
     * ツアー名を格納するメソッド
     * @param tourName ツアー名
     */
    public void setTourName(String tourName) {
        this.tour_name = tourName;
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
     * 価格を取得するメソッド
     * @return price 価格
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

}