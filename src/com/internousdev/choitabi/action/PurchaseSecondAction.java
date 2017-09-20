package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入確認画面への遷移するクラス
 * @author kanako miyazono
 * @since 2017/09/20
 * @version 1.1
 */

public class PurchaseSecondAction extends ActionSupport implements SessionAware{

    /**
     * シリアルID
     */
    private static final long serialVersionUID = 8015241731370150943L;

    /**
     * ユーザーID
     */
    private int user_id;

    /**
     * 商品ID
     */
    private int item_id;

    /**
     * 商品名
     */
    private String item_name;

    /**
     * 単価
     */
    private int price;

    /**
     * 注文数
     */
    private int order_count;

    /**
     * イメージパスファイル
     */
    private String imgAddress001;

    /**
     * 合計金額
     */
    private int amount;

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
        String result=ERROR;

        if (session.containsKey("userId")) {
            user_id = (int)session.get("userId");

            SelectCartDAO dao = new SelectCartDAO();
            cartList = dao.selectCart(user_id);

            for(int i = 0; i < cartList.size(); i++ ){
                amount += (cartList.get(i).getPrice())*(cartList.get(i).getOrder_count());
                }

            result = SUCCESS;
            }

        return result;
        }


    /**
     * ユーザーIDを取得するメソッド
     * @return userId ユーザーID
     */
    public int getUserId() {
        return user_id;
        }

    /**
     * ユーザーIDを格納するメソッド
     * @param userId セットする ユーザーID
     */
    public void setUserId(int userId) {
        this.user_id = userId;
        }

    /**
     * 商品IDを取得するメソッド
     * @return itemId 商品ID
     */
    public int getItem_id() {
        return item_id;
        }

    /**
     * 商品IDを格納するメソッド
     * @param itemId セットする 商品ID
     */
    public void setItem_id(int itemId) {
        this.item_id = itemId;
        }

    /**
     * 商品名を取得するメソッド
     * @return itemName 商品名
     */
    public String getItemName() {
        return item_name;
        }

    /**
     * 商品名を格納するメソッド
     * @param itemName セットする 商品名
     */
    public void setItemName(String itemName) {
        this.item_name = itemName;
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
     * @return amountAll 合計金額
     */
    public int getAmount() {
        return amount;
        }

    /**
     * 合計金額を格納するメソッド
     * @param amount セットする 合計金額
     */
    public void setAmount(int amount) {
        this.amount = amount;
        }

    /**
     * カート内の商品情報を入れるリストを取得するメソッド
     * @return cartList カート内の商品情報を入れるリスト
     */
    public ArrayList<CartDTO> getCartList() {
        return cartList;
        }

    /**
     * カート内の商品情報を入れるリストを格納するメソッド
     * @param cartList セットする カート内の商品情報を入れるリスト
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
     * @return orderCount 注文数
     */
    public int getOrderCount() {
        return order_count;
        }

    /**
     * 注文数を格納するメソッド
     * @param orderCount セットする 注文数
     */
    public void setOrder_count(int orderCount) {
        this.order_count = orderCount;
        }

    /**
     * 画像パスファイルを取得するメソッド
     * @return imgPath 画像パス
     */
    public String getImgAddress001() {
        return imgAddress001;
        }

    /**
     * 画像パスファイルを格納するメソッド
     * @param imgAddress001 セットする 画像パス
     */
    public void setImgAddress001(String imgAddress001) {
        this.imgAddress001 = imgAddress001;
        }

}