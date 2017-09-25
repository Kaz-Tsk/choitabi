package com.internousdev.choitabi.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート画面から支払い画面に遷移するクラス
 * @author SHUN NAGAO
 * @since 2017/09/22
 * @version 1.1
 */
public class GoPaymentAction extends ActionSupport implements SessionAware {
	/**
	 * シリアル
	 */
	private static final long serialVersionUID = -4199669519568280545L;
	/**
	 * セッション
	 */
	private Map<String, Object> session;
	/**
	 * ユーザーID
	 */
	private int user_id;
	/**
	 * 合計金額
	 */
	private BigDecimal total_price = BigDecimal.ZERO;
	/**
	 * 小計
	 */
	private BigDecimal sub_total = BigDecimal.ZERO;
	/**
	 * カート内の商品情報を入れるリスト
	 */
	private ArrayList<CartDTO> cartList = new ArrayList<>();
	/**
	 * ユーザー情報を入れるリスト
	 */
	private ArrayList<CartDTO> userList = new ArrayList<>();

	/**
	 * カート・商品情報を格納する実行メソッド
	 * @author SHUN NAGAO
	 * @since 2017/09/22
	 * @version 1.1
	 */

	public String execute() {
		String result = ERROR;

		if (session.containsKey("userId")) {
			user_id = (int) session.get("userId");

			SelectCartDAO cartDao = new SelectCartDAO();

			cartList = cartDao.selectCart(user_id);

			for(int i=0;i<cartList.size();i++){
				total_price = total_price.add(cartList.get(i).getSub_total());
			}

			if (cartList.size() > 0) {
				return SUCCESS;
			}
		} else {
			return LOGIN;
		}
		return result;
	}

	/**
	 * セッション取得メソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return total_price 合計金額
	 */
	public BigDecimal getAmountAll() {
		return total_price;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param amountAll 合計金額
	 */
	public void settotal_price(BigDecimal total_price) {
		this.total_price = total_price;
	}

	/**
	 * 小計を取得するメソッド
	 * @return sub_total 小計
	 */
	public BigDecimal getSubtotal() {
		return sub_total;
	}

	/**
	 * 小計を格納するメソッド
	 * @param sub_total 小計
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.sub_total = subtotal;
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
	 * ユーザーリストを取得するメソッド
	 * @return userList ユーザーリスト
	 */
	public ArrayList<CartDTO> getUserList() {
		return userList;
	}

	/**
	 * ユーザーリストを格納するメソッド
	 * @param userList ユーザーリスト
	 */
	public void setUserList(ArrayList<CartDTO> userList) {
		this.userList = userList;
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
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}

	/**
	 *  ユーザーIDを格納するメソッド
	 * @param user_id　ユーザーID
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
}
