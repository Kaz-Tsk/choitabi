package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.InsertCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート画面から購入画面へ遷移するクラス
 * @author SHUN NAGAO
 *　@since 2017/09/08
 * @version 1.1
 */

public class GoPaymentAction  extends ActionSupport implements SessionAware{

	/**
     * シリアルID
     */
    private static final long serialVersionUID = 8015241731370150943L;

    /**
     * ユーザーID
     */
    private int user_id;

    /**
     * ツアーID
     */
    private int tour_id;

    /**
     * ツアー名
     */
    private String tour_name;

    /**
     * 単価
     */
    private int price;

    /**
     * 注文数
     */
    private int order_count;

    /**
     * 画像パスファイル
     */
    private String img;

    /**
     * 合計金額
     */
    private int total_price;

    /**
     * カート内の商品情報を入れるリスト
     */
    private ArrayList<CartDTO> cartList=new ArrayList<>();

    /**
     *セッション情報
     */
    private Map<String,Object> session;

    /**
     * 実行メソッド
     * 処理内容と順番
     * 1：セッション情報を持っているか判断
     * 2：session内のuserIdを使用し、カートへ登録された情報を取得
     * 3：カート内の情報を元に合計金額を算出
     */
    public String execute() throws SQLException{
       // String result=ERROR;
    	String result="success";
        if (session.containsKey("user_id")) {
            user_id = (int)session.get("user_id");

            InsertCartDAO dao = new InsertCartDAO();
            cartList = dao.selected(user_id);

            for(int i = 0; i < cartList.size(); i++ ){
            	total_price += (cartList.get(i).getPrice())*(cartList.get(i).getOrder_count());
                }

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
     * @param user_id セットする ユーザーID
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
        }

    /**
     * ツアーIDを取得するメソッド
     * @return tour_id ツアーID
     */
    public int gettour_id() {
        return tour_id;
        }

    /**
     * ツアーIDを格納するメソッド
     * @param tour_id セットする ツアーID
     */
    public void settour_id(int tour_id) {
        this.tour_id = tour_id;
        }

    /**
     * ツアー名を取得するメソッド
     * @return tour_name ツアー名
     */
    public String gettour_name() {
        return tour_name;
        }

    /**
     * ツアー名を格納するメソッド
     * @param tour_name セットする ツアー名
     */
    public void settour_name(String tour_name) {
        this.tour_name = tour_name;
        }

    /**
     * 単価を格取得するメソッド
     * @return price 単価
     */
    public int getPrice() {
        return price;
        }

    /**
     * 単価を格納するメソッド
     * @param price セットする 単価
     */
    public void setPrice(int price) {
        this.price = price;
        }

    /**
     * 合計金額を取得するメソッド
     * @return total_price 合計金額
     */
    public int gettotal_price() {
        return total_price;
        }

    /**
     * 合計金額を格納するメソッド
     * @param total_price セットする 合計金額
     */
    public void setAmount(int total_price) {
        this.total_price = total_price;
        }

    /**
     * カート内のツアー情報を入れるリストを取得するメソッド
     * @return cartList カート内のツアー情報を入れるリスト
     */
    public ArrayList<CartDTO> getCartList() {
        return cartList;
        }

    /**
     * カート内のツアー情報を入れるリストを格納するメソッド
     * @param cartList セットする カート内のツアー情報を入れるリスト
     */
    public void setCartList(ArrayList<CartDTO> cartList) {
        this.cartList = cartList;
        }

    /**
     * セッション情報を取得するメソッド
     * @return session セッション情報
     */
    public Map<String, Object> getSession() {
        return session;
        }

    /**
     * セッションを格納するメソッド
     * @param session セットする セッション情報
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
        }

    /**
     * 注文数を取得するメソッド
     * @return order_count 注文数
     */
    public int getorder_count() {
        return order_count;
        }

    /**
     * 注文数を格納するメソッド
     * @param order_count セットする 注文数
     */
    public void setorder_count(int order_count) {
        this.order_count = order_count;
        }

    /**
     * 画像パスファイルを取得するメソッド
     * @return img 画像パス
     */
    public String getImg() {
        return img;
        }

    /**
     * 画像パスファイルを格納するメソッド
     * @param img セットする 画像パス
     */
    public void setImg(String img) {
        this.img = img;
        }

}
