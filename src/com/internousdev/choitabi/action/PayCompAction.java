package com.internousdev.choitabi.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * 決済を完了するためのクラス
 * @author SHUN NAGAO
 * @since 2017/09/25
 * @version 1.1
 */

public class PayCompAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -5426419966366456513L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * カート情報を入れるアレイリスト
	 */
	private ArrayList<CartDTO> cartList;
	/**
	 * ユーザーID
	 */
	private int user_id;
	/**
	 * カートID
	 */
	private int cart_id;
	/**
	 * 購入日
	 */
	private Date purchase_date;
	/**
	 * 小計
	 */
	private BigDecimal total_price;


	/**
     * 実行メソッド
     * 購入した商品の情報をインサートできればSUCCESSを返す
     * @return success or error or login
     * @author MARI KAMBE
     * @since 2017/09/07
     * @version 1.1
     */
    public String execute() throws SQLException {
        String result = ERROR;

        if (session.containsKey("userId")) {

            user_id = (int) session.get("userId");

            CartDoneDAO dao = new CartDoneDAO();

            //アレイリストに情報を入れる
            cartList = dao.cartSelect(user_id);
            userList = myDao.select(user_id);
            setPoint(userList.get(0).getPoint());

            int new_point = point + get_point - use_point;
            if(dao.pointUpdate(userList.get(0).getUser_id(),new_point) > 0){
				result=SUCCESS;
			}
			for(int i = 0; i < cartList.size(); i++ ){
				subtotal = cartList.get(i).getPrice().multiply(BigDecimal.valueOf(cartList.get(i).getOrder_count()));
            	int new_stock = cartList.get(i).getItem_stock() - cartList.get(i).getOrder_count();

            	if(new_stock >= 0){
            		if(dao.payInsert(user_id,cartList.get(i).getItem_id(),cartList.get(i).getOrder_count(),subtotal,get_point,use_point) != 0){
            			if(dao.stockUpdate(cartList.get(i).getItem_id(),new_stock) > 0){
            				result=SUCCESS;
            			}
	            	}
            	}
			}

			if(result==SUCCESS){
				if(dao.cartDelete(user_id) == 0){
					result = ERROR;
				}
			}

        }
        else{
        	result = LOGIN;
        }
		return result;
}

	/**
	 * セッションを取得するメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納するメソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
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
	 * @param user_id ユーザーID
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	 * ユーザー情報リストを取得するメソッド
	 * @return userList ユーザー情報リスト
	 */
	public ArrayList<UserDTO> getUserList() {
		return userList;
	}

	/**
	 * ユーザー情報リストを格納するメソッド
	 * @param userList ユーザー情報リスト
	 */
	public void setUserList(ArrayList<UserDTO> userList) {
		this.userList = userList;
	}

	/**
	 * カートリストを取得するメソッド
	 * @return cartList カートリスト
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カートリストを格納するメソッド
	 * @param cartList カートリスト
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * 購入日を取得するメソッド
	 * @return purchase_date 購入日
	 */
	public Date getPurchase_date() {
		return purchase_date;
	}

	/**購入日を格納するメソッド
	 * @param purchase_date 購入日
	 */
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	/**
	 * 小計を取得するメソッド
	 * @return subtotal 小計
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}

	/**
	 * 小計を格納するメソッド
	 * @param subtotal 小計
	 */
	public void setTotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * 獲得ポイントを取得するメソッド
	 * @return get_point 獲得ポイント
	 */
	public int getGet_point() {
		return get_point;
	}

	/**
	 * 獲得ポイントを格納するメソッド
	 * @param get_point 獲得ポイント
	 */
	public void setGet_point(int get_point) {
		this.get_point = get_point;
	}

	/**
	 * 利用ポイントを取得するメソッド
	 * @return use_point 利用ポイント
	 */
	public int getUse_point() {
		return use_point;
	}

	/**
	 * 利用ポイントを格納するメソッド
	 * @param use_point 利用ポイント
	 */
	public void setUse_point(int use_point) {
		this.use_point = use_point;
	}

	/**
	 * 保有ポイントを取得するメソッド
	 * @return point 保有ポイント
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * 保有ポイントを格納するメソッド
	 * @param point 保有ポイント
	 */
	public void setPoint(int point) {
		this.point = point;
	}

}