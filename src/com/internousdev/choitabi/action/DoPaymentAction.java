package com.internousdev.choitabi.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入内容確認画面に必要な情報を取得し遷移するクラス
 * @author SHUN NAGAO
 * @since 2017/09/22
 * @version 1.1
 */

public class DoPaymentAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 9024076567819793679L;
	/**
	 * ユーザーID
	 */
	private int user_id;
	/**
	 * ツアーID
	 */
	private int tour_id;
	/**
	 * セッション情報
	 */
	private Map<String,Object>session;
	/**
	 * 合計金額
	 */
	private BigDecimal total_price=BigDecimal.ZERO;
	/**
	 * カート情報を入れるアレイリスト
	 */
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

	/**
	 * クレジットカード情報の照合、格納を実行するメソッド
	 * @author SHUN NAGAO
	 * @since 2017/09/22
	 * @version 1.1
	 */
	public String execute() {
		String result = ERROR;

		if(session.containsKey("userId")){
			user_id = (int)session.get("userId");

			SelectCartDAO cartDao = new SelectCartDAO();

			//アレイリストに情報を入れる
			cartList = cartDao.selectCart(user_id);

			if(cartList.size()>0){
				for(int i = 0; i <cartList.size(); i++) {

					total_price = total_price.add((cartList.get(i).getPrice().multiply(BigDecimal.valueOf(cartList.get(i).getOrder_count()))));

				}

				result = SUCCESS;
			}else{
				result = LOGIN;
			}
		}
		return result;
	}


	/**
	 * ユーザIDを取得するメソッド
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
	 * 合計金額を取得するメソッド
	 * @return Total_price 合計金額
	 */
	public BigDecimal getTotal() {
		return total_price;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param total_price 合計金額
	 */
	public void setTotal(BigDecimal total) {
		this.total_price = total;
	}

	/**
	 * カード情報リストを取得するメソッド
	 * @return cartList カード情報リスト
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カード情報リストを格納するメソッド
	 * @param cartList カード情報リスト
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
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
	 * @param tour_id ツアーID
	 */
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}

}