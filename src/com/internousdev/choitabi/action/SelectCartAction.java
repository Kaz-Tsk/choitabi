package com.internousdev.choitabi.action;

import java.math.BigDecimal;
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
	private static final long serialVersionUID = -2072179091622423816L;

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
	private BigDecimal price = BigDecimal.ZERO;

	/**
	 * 予約人数
	 */
	private int order_count;

	/**
	 * 合計金額
	 */
	private BigDecimal total_price = BigDecimal.ZERO;

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
	private BigDecimal sub_total = BigDecimal.ZERO;

	/**
	 * 画像パス
	 */
	private String img;



	/**
	 * 実行メソッド
	 * 1：セッション情報を持っているか判断
	 * 2：session内のuserIdを使用し、カートへ登録された情報を取得
	 * 3：カート内の情報を元に合計金額を算出
	 *
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/05
	 * @version 1.1
	 * @return SUCCESS
	 */

	public String execute() throws SQLException {
		String result = ERROR;

		if (session.containsKey("userId")) {
			user_id = (int) session.get("userId");

			SelectCartDAO dao = new SelectCartDAO();
			cartList = dao.selectCart(user_id);

			if(cartList.size()>0){
				for(int i = 0; i <cartList.size(); i++) {

					total_price = total_price.add(cartList.get(i).getPrice().multiply(BigDecimal.valueOf(cartList.get(i).getOrder_count())));

				}

			result = SUCCESS;

			}

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
	public int getTour_id() {
		return tour_id;
	}

	/**
	 * ツアーIDを格納するメソッド
	 * @param tour_id ツアーID
	 */
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}

	/**
	 * ツアー名を取得するメソッド
	 * @return tour_name ツアー名
	 */
	public String getTour_name() {
		return tour_name;
	}

	/**
	 * ツアー名を格納するメソッド
	 * @param tour_name ツアー名
	 */
	public void setTour_name(String tour_name) {
		this.tour_name = tour_name;
	}

	/**
	 * 価格を取得するメソッド
	 * @return price 価格
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 価格を格納するメソッド
	 * @oaram price 価格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
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
	 * @oaram total_price 合計金額
	 */
	public void setTotal_price(BigDecimal total_price) {
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
	 * 予約人数を取得するメソッド
	 * @return order_count 予約人数
	 */
	public int getOrder_count() {
		return order_count;
	}

	/**
	 * 予約人数を格納するメソッド
	 * @param order_count 予約人数
	 */
	public void setOrder_count(int order_count) {
		this.order_count = order_count;
	}

	/**
	 * 小計を取得するメソッド
	 * @return sub_total 小計
	 */
	public BigDecimal getSub_total() {
		return sub_total;
	}

	/**
	 * 小計を格納するメソッド
	 * @param sub_total 小計
	 */
	public void setSub_total(BigDecimal sub_total) {
		this.sub_total = sub_total;
	}

	/**
	 * 画像パスを取得するメソッド
	 * @return img 画像パス
	 */
	public String getImg() {
		return img;
	}

	/**
	 * 画像パスを格納するメソッド
	 * @param img 画像パス
	 */
	public void setimg(String img) {
		this.img = img;
	}

}