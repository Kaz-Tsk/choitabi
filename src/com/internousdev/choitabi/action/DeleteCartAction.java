package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.DeleteCartDAO;
import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * カートの中身を削除するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.0
 */

public class DeleteCartAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 合計金額
     */
    private int totalPrice;

    /**
     * 購入数
     */
    private int quantity;

    /**
     * ユーザーID
     */
    private int userId;

    /**
     * カートID
     */
    private int cartId;

    /**
     * 削除処理をした件数
     */
    private int delCount;

    /**
     *  セッション情報
     */
    private Map<String, Object> session;

    /**
     * 検索したカート内の商品の情報を入れるリスト
     */
    private List<CartDTO> cartList = new ArrayList<>();



    /**
     * カートの商品を削除処理をする実行メソッド
     * @author HINAKO HAGIWARA
     * @since 2017/09/05
     * @version 1.0
     */

    public String execute() throws SQLException{
        String result =ERROR;

        if(session.get("userId") != null){
            int userId = (int) session.get("userId");

            DeleteCartDAO dao = new DeleteCartDAO();
            SelectCartDAO dao2 =new SelectCartDAO();

            delCount= dao.delete(userId, cartId);

            if(delCount>0){
                cartList =dao2.selectCart(userId);

                if(cartList.size() > 0){
                    for(int i = 0; i < cartList.size(); i++ ){
                        totalPrice += (cartList.get(i).getPrice())*(cartList.get(i).getQuantity());
                        }

                    result =SUCCESS;
                    }
                }
            }

        return result;
        }



    /**
     * ユーザーIDを取得するためのメソッド
     * @return userId ユーザーID
     */
    public int getUserId() {
        return userId;
        }

    /**
     * ユーザーIDを格納するためのメソッド
     * @param userId ユーザーID
     */
    public void setUserId(int userId) {
        this.userId = userId;
        }

    /**
     * セッションを取得するためのメソッド
     * @return session セッション情報
     */
    public Map<String, Object> getSession() {
        return session;
        }

    /**
     * セッションを格納するためのメソッド
     * @param session セッション情報
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
        }

    /**
     * カート内の商品情報を取得するためのメソッド
     * @return cartList カート内の商品情報
     */
    public List<CartDTO> getCartList() {
        return cartList;
        }

    /**
     * カート内の商品情報を格納するためのメソッド
     * @param cartList カート内の商品情報
     */
    public void setCartList(List<CartDTO> cartList) {
        this.cartList = cartList;
        }

    /**
     * 合計金額を取得するメソッド
     * @return totalPrice 合計金額
     */
    public int getTotalPrice() {
        return totalPrice;
        }

    /**
     * 合計金額を格納するメソッド
     * @param totalPrice 合計金額
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
        }

    /**
     * カート内の購入数を取得するメソッド
     * @return quantityt 購入数
     */
    public int getQuantity() {
        return quantity;
        }

    /**
     * カート内の購入数を格納するメソッド
     * @param quantity 購入数
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        }

    /**
     * 削除処理をした件数を取得するメソッド
     * @return delCount 削除処理をした件数
     */
    public int getDelCount() {
        return delCount;
        }

    /**
     * 削除処理をした件数を格納するメソッド
     * @param delCount 削除処理をした件数
     */
    public void setDelCount(int delCount) {
        this.delCount = delCount;
        }

    /**
     * カートIDを取得するメソッド
     * @return cartId カートID
     */
    public int getCartId() {
        return cartId;
        }

    /**
     * カートIDを格納するメソッド
     * @param cartId カートID
     */
    public void setCartId(int cartId) {
        this.cartId = cartId;
        }

    /**
     * シリアルIDを取得するメソッド
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
        }

}