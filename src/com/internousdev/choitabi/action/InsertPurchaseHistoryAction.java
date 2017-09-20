package com.internousdev.choitabi.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.DeleteDAO;
import com.internousdev.choitabi.dao.InsertPurchaseHistoryDAO;
import com.internousdev.choitabi.dao.SelectTourIdDAO;
import com.internousdev.choitabi.dto.SelectTourIdDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入履歴をデータベースに登録するアクション
 * @author NORIO SAITO
 * @since 2017/8/22
 * @version 1.1
 */
public class InsertPurchaseHistoryAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -7368088529892943892L;

	/**
	 * ユーザーID
	 */
	private int user_id;

	/**
	 * ツアーID
	 */
	private int tour_id;

	/**
	 * 購入数
	 */
	private int quantity;

	/**
	 * 合計金額
	 */
	private int total;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * ツアー情報を格納する配列
	 */
	private ArrayList<SelectTourIdDTO> selectTourIdList = new ArrayList<>();

	/**
	 * エラーメッセージ
	 */
	private String errmsg = "a";

	/**
	 * カートテーブルとツアーテーブルの情報を結合し、購入履歴テーブルへ登録し、 カートの中身を削除できたらSUCCESSを返すメソッド
	 * @author NORIO SAITO
	 * @since 2017/8/22
	 * @version 1.1
	 * @return ERROR,SUCCESS
	 */
	public String execute() {
		String result = ERROR;
		user_id = (int) session.get("userId");
		// 内容確認画面で表示する項目をセレクトする。

		SelectTourIdDAO Sdao = new SelectTourIdDAO();
		InsertPurchaseHistoryDAO Idao = new InsertPurchaseHistoryDAO();

		if (Sdao.selectTourId(user_id)) {
			selectTourIdList = Sdao.getSelectTourIdList();
			for (SelectTourIdDTO dto : selectTourIdList) {

				tour_id = dto.getTour_id();
				quantity = dto.getQuantity();
				total = (dto.getUnit_price()) * (dto.getQuantity());


				// セレクトした内容を含めてpurchase_historyテーブルに登録する。
				if (Idao.insertPurchasehistory(user_id, tour_id, quantity, total) > 0) {

					// 購入したツアーをカートから削除する
					DeleteDAO Ddao = new DeleteDAO();

					// 購入したツアが削除する
					if (Ddao.deleteAllCart(user_id) > 0) {

						result = SUCCESS;
					}

				}
			}

		}else {
			errmsg = "カートに商品が存在しないため、無効です";
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
	 * ユーザーIDを格納する
	 * @param user_id  ユーザーID
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * ツアーIDを取得するメソッド
	 * @return tour_id ツアー名
	 */
	public int getTour_id() {
		return tour_id;
	}

	/**
	 * ツアーIDを格納する
	 * @param tour_id ツアーID
	 */
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}

	/**
	 * 購入数を取得するメソッド
	 * @return quantity 購入数
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * 購入数を格納する
	 * @param quantity  購入数
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * 合計金額を取得するメソッド
	 * @return total 合計金額
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * 合計金額を格納する
	 * @param total  合計金額
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * セッションを取得するメソッド
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッションを格納する
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 購入履歴一覧のリストを取得するメソッド
	 * @return selectTourIdList 購入履歴一覧のリスト
	 */
	public ArrayList<SelectTourIdDTO> getSelectTourIdList() {
		return selectTourIdList;
	}

	/**
	 * 購入履歴一覧のリストを格納する
	 * @param selectTourIdList  購入履歴一覧のリスト
	 */
	public void setSelectTourIdList(ArrayList<SelectTourIdDTO> selectTourIdList) {
		this.selectTourIdList = selectTourIdList;
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
