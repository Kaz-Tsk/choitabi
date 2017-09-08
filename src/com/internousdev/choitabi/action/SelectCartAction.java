package com.internousdev.choitabi.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート情報を取得するアクション
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class SelectCartAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 1L;

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
	 * 価格
	 */
	private int price;

	/**
	 * 購入数
	 */
	private int quantity;

	/**
	 * 合計金額
	 */
	private int total_price;

	/**
	 * カート情報
	 */
	private ArrayList<CartDTO> cartList = new ArrayList<>();

	/**
	 * セッション情報
	 */
	private Map<String, Object> session;

	/**
	 * 小計
	 */
	private int sub_total;



	/**
	 * 実行メソッド
	 * 1：セッション情報を持っているか判断
	 * 2：session内のuser_idを使用し、カートへ登録された情報を取得
	 * 3：カート内の情報を元に合計金額を算出
	 *
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/05
	 * @version 1.1
	 * @return SUCCESS
	 */
	public String execute() throws SQLException {
		String result = ERROR;

		if (session.containsKey("user_id")) {
			user_id = (int)session.get("user_id");
			SelectCartDAO scDao = new SelectCartDAO();
			cartList = scDao.selectCart(user_id);

			for(int i = 0; i <cartList.size(); i++) {
				total_price += (cartList.get(i).getPrice()) * (cartList.get(i).getQuantity());
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
	 * @param user_id   ユーザーID
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * ツアーIDを取得するメソッド
	 * @return tour_id ツアーID
	 */
	public int getTourId() {
		return tour_id;
	}

	/**
	 * ツアーIDを格納するメソッド
	 * @param tour_id ツアーID
	 */
	public void setTourId(int tour_id) {
		this.tour_id = tour_id;
	}

	/**
	 * ツアー名を取得するメソッド
	 * @return tour_name ツアー名
	 */
	public String getTourName() {
		return tour_name;
	}

	/**
	 * ツアー名を格納するメソッド
	 * @param tour_name ツアー名
	 */
	public void setTourName(String tour_name) {
		this.tour_name = tour_name;
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
	 * @oaram price 価格
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return total_price 合計金額
	 */
	public int getTotalPrice() {
		return total_price;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @oaram total_price 合計金額
	 */
	public void setTotalPrice(int total_price) {
		this.total_price = total_price;
	}

	/**
	 * カート内の商品情報を入れるリストを取得するメソッド
	 * @return cartList カート内の情報を入れるリスト
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カート内の情報を入れるリストを格納するメソッド
	 * @param cartList カート内の情報を入れるリスト
	 */
	public void setCratList(ArrayList<CartDTO> cartList) {
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
	 * セッション情報を格納するメソッド
	 * @param session セッション情報
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 購入数を取得するメソッド
	 * @return quantity 購入数
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * 購入数を格納するメソッド
	 * @param quantity 購入数
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 小計を取得するメソッド
	 * @return sub_total 小計
	 */
	public int getSubTotal() {
		return sub_total;
	}

	/**
	 * 小計を格納するメソッド
	 * @param sub_total 小計
	 */
	public void setSubTotal(int sub_total) {
		this.sub_total = sub_total;
	}
}