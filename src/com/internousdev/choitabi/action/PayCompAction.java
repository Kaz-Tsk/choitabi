package com.internousdev.choitabi.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.PayCompDAO;
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
	 * 合計金額
	 */
	private BigDecimal total_price;


	/**
     * 実行メソッド
     * 購入した商品の情報をインサートできればSUCCESSを返す
     * @return success or error or login
     * @author SHUN NAGAO
     * @since 2017/09/25
     * @version 1.1
     */
	public String execute() throws SQLException {
		String result = ERROR;

		if (session.containsKey("userId")) {
			CartDTO dto = new CartDTO();

			user_id = (int) session.get("userId");

			PayCompDAO dao = new PayCompDAO();

			//アレイリストに情報を入れる
			cartList = dao.cartSelect(user_id);

			for(int i = 0; i < cartList.size(); i++ ){
				total_price = dto.getTotal_price();
				if(dao.payInsert(user_id,cartList.get(i).getTour_id(),cartList.get(i).getOrder_count(),total_price) != 0){

					result=SUCCESS;
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
	 * 合計金額を取得するメソッド
	 * @return total_price 小計
	 */
	public BigDecimal gettotal_price() {
		return total_price;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param total_price 小計
	 */
	public void setTotal(BigDecimal total_price) {
		this.total_price = total_price;
	}

}