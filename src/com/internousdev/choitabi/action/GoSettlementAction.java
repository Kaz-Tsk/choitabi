package com.internousdev.choitabi.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.PaymentCompleteDAO;
import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.choitabi.dto.TourDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 決済入力画面に遷移するためのクラス
 * @author SHUN NAGAO
 * @since 2017/09/20
 * @version 1.0
 */

public class GoSettlementAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 7881086354836331748L;

	/**
	 * ユーザーID
	 */
	private int user_id;

	/**
	 * 合計金額
	 */
	private int total_price;

	/**
	 * カート内に入ってる合計ツアー数
	 */
	private int order;

	/**
	 * エラーメッセージ
	 */
	private String errorMessage;

	/**
	 * カート内情報をリスト化
	 */

	/**
	 * セッション情報
	 */
	private Map<String, Object> session;

	/**
	 * ツアー名
	 */
	private String tour_name;

	/**
	 * 数量
	 */
	private int order_count;



	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private ArrayList<CartDTO> stockList = new ArrayList<CartDTO>();

	private ArrayList<TourDTO> list = new ArrayList<TourDTO>();

	public String execute(){
		String result = LOGIN;

		user_id=0;

		 PaymentCompleteDAO paymentCompleteDAO = new PaymentCompleteDAO();

		 if (session.containsKey("user_id")) {
			 user_id = (int) session.get("user_id");



			 SelectCartDAO dao = new SelectCartDAO();
			 cartList = dao.selectCart(user_id);

			 if (paymentCompleteDAO.stockCheck(cartList) == 1) {

				 // 在庫切れでないか？ＯＫなら次へ進む

				 result = SUCCESS;

			 } else {

				 list = paymentCompleteDAO.getStockList();
				 this.setList(list);
				 result = ERROR;

			 }
			 return result;
		 }

		return result;
	}
	/**
	 * ユーザーIDを取得するメソッド
	 *
	 * @return user_id ユーザーID
	 */
	public int gettour_id() {
		return user_id;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 *
	 * @param user_id ユーザーID
	 */
	public void setuser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * 合計金額を取得するメソッド
	 *
	 * @return total_price 合計金額
	 */
	public int gettotal_price() {
		return total_price;
	}

	/**
	 * 合計金額を格納するメソッド
	 *
	 * @param total_price 合計金額
	 */
	public void settotal_price(int total_price) {
		this.total_price = total_price;
	}

	/**
	 * エラーメッセージを取得するメソッド
	 *
	 * @return errorMessage エラーメッセージ
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 *
	 * @param errorMessage エラーメッセージ
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * セッションを取得するメソッド
	 *
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納するメソッド
	 *
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * シリアルIDを取得するメソッド
	 *
	 * @return serialversionuid シリアルID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * カート内に入ってる合計商品数を取得するメソッド
	 *
	 * @return order カート内に入ってる合計商品数
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * カート内に入ってる合計商品数を格納するメソッド
	 *
	 * @param order カート内に入ってる合計商品数
	 */
	public void setOrder(int order) {
		this.order = order;
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
	 *@param tour_name ツアー名
	 */
	public void settour_name(String tour_name) {
		this.tour_name = tour_name;
	}


	 /**
     * 数量を取得するメソッド
     * @return order_count 数量
     */

	public int getorder_count() {
		return order_count;
	}

    /**
     * 数量を格納するメソッド
     * @param order_count 数量
     */
	public void setorder_count(int order_count) {
		this.order_count = order_count;
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
	 * @return stockList
	 */
	public ArrayList<CartDTO> getStockList() {
		return stockList;
	}
	/**
	 * @param stockList セットする stockList
	 */
	public void setStockList(ArrayList<CartDTO> stockList) {
		this.stockList = stockList;
	}
	/**
	 * @return list
	 */
	public ArrayList<TourDTO> getList() {
		return list;
	}
	/**
	 * @param list セットする list
	 */
	public void setList(ArrayList<TourDTO> list) {
		this.list = list;
	}

	}