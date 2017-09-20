package com.internousdev.choitabi.action;

import java.math.BigDecimal;
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
    private BigDecimal total_price;

    /**
     * 予約人数
     */
    private int order_count;

    /**
     * ユーザーID
     */
    private int user_id;

    /**
     * カートID
     */
    private int cart_id;

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
            int user_id = (int) session.get("userId");

            DeleteCartDAO dao = new DeleteCartDAO();
            SelectCartDAO dao2 =new SelectCartDAO();

            delCount= dao.delete(user_id, cart_id);

            if(delCount>0){
                cartList =dao2.selectCart(user_id);

                if(cartList.size() > 0){
                    for(int i = 0; i < cartList.size(); i++ ){
                        total_price = (cartList.get(i).getPrice()).multiply(BigDecimal.valueOf(cartList.get(i).getOrder_count()));
                        }

                    result =SUCCESS;
                    }
                }
            }

        return result;
        }



    /**
     * ユーザーIDを取得するためのメソッド
     * @return user_id ユーザーID
     */
    public int getUser_id() {
        return user_id;
        }

    /**
     * ユーザーIDを格納するためのメソッド
     * @param user_id ユーザーID
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
     * @return total_price 合計金額
     */
    public BigDecimal getTotal_price() {
        return total_price;
        }

    /**
     * 合計金額を格納するメソッド
     * @param total_price 合計金額
     */
    public void setTotal_price(BigDecimal total_price) {
        this.total_price = total_price;
        }

    /**
     * カート内の予約人数を取得するメソッド
     * @return order_count 予約人数
     */
    public int getOrder_count() {
        return order_count;
        }

    /**
     * カート内の予約人数を格納するメソッド
     * @param order_count 予約人数
     */
    public void setOrder_count(int order_count) {
        this.order_count = order_count;
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
     * @return cart_id カートID
     */
    public int getCart_id() {
        return cart_id;
        }

    /**
     * カートIDを格納するメソッド
     * @param cart_id カートID
     */
    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
        }

    /**
     * シリアルIDを取得するメソッド
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
        }

}