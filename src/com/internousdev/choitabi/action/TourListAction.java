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
     * 商品カテゴリーを格納するメソッド
     * @param itemCategory 商品カテゴリー
     */
    public void setItemCategory(String itemCategory) {
        this.theme = itemCategory;
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
     * @return imgAddress001 画像パス
     */
    public String getImg() {
        return img;
        }

    /**
     * 画像パスを格納するメソッド
     * @param imgAddress001 画像パス
     */
    public void setImg(String img) {
        this.img = img;
        }

    /**
     * サーチリストを取得するメソッド
     * @return searchList サーチリスト
     */
    public ArrayList<TourDTO> getSelectList() {
        return selectList;
        }

    /**
     * サーチリストを格納するメソッド
     * @param searchList サーチリスト
     */
    public void setSelectList(ArrayList<TourDTO> searchList) {
        this.selectList = searchList;
        }

}