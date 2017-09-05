package com.internousdev.choitabi.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.SelectCartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カートの中身をセレクトするアクション
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class SelectCartAction extends ActionSupport implements SessionAware {

	/**
	 * ユーザーID
	 */
	private int user_id;

	/**
	 * カートID
	 */
	private int cart_id;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 該当するカートの中身を格納する配列
	 */
	private ArrayList<SelectCartDTO> selectList = new ArrayList<>();

	/**
	 * 合計金額
	 */
	private int total = 0;


	/**
	 * エラーメッセージ
	 */
	private String errmsg;



	/**
	 * ユーザーIDからカートテーブル内の商品をセレクトできたらSUCCESSを返すメソッド
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/05
	 * @version 1.1
	 * @return SUCCESS
	 */
	public String execute() {
		String result = ERROR;
		user_id = (int) session.get("user_id");

		if (session.get("user_id") != null) {
			SelectCartDAO SCdao = new SelectCartDAO();
			result = SUCCESS;

			if (SCdao.selectCart(user_id)) {

				selectList = SCdao.getSelectList();

				total = SCdao.getTotalPrice();
			} else {
				setErrmsg("＊カートにツアーがありません");
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
	 * カートの中身を格納する配列を取得するメソッド
	 * @return selectList カートの中身を格納する配列
	 */
	public ArrayList<SelectCartDTO> getSelectList() {
		return selectList;
	}

	/**
	 * カートの中身を格納する配列を格納するメソッド
	 * @param selectList カートの中身を格納する配列
	 */
	public void setSelectList(ArrayList<SelectCartDTO> selectList) {
		this.selectList = selectList;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return total 合計金額
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param total  合計金額
	 */
	public void setTotal(int total) {
		this.total = total;
	}

		/**
		*	errmsgを取得するメソッド
		*	@return errmsg
		*/
	public String getErrmsg() {
		return errmsg;
	}

		/**
		*	errmsgを格納する
		*	@param errmsg
		*/
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

}