package com.internousdev.choitabi.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.InsertCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.choitabi.dto.SelectCartDTO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * ツアー詳細からカートに遷移するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/06
 *@version 1.1
 */

public class InsertCartAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -8676237918801761004L;

	/**
	 * カートID
	 */
	private int cart_id;

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
	private BigDecimal price;

	/**
	 * 予約人数
	 */
	private int order_count;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * 合計金額
	 */
	private BigDecimal total_price = BigDecimal.ZERO;

	/**
	 * カート情報
	 */
	private ArrayList<CartDTO> cartList;

	/**
	 * ツアー情報
	 */
	private ArrayList<SelectCartDTO> tourStatus;

	/**
	 * ツアー追加
	 */
	private int addCount;

	/**
	 * 小計
	 */
	private BigDecimal sub_total;

	/**
	 * 画像パス
	 */
	private String img;



	/**
	 * 実行メソッド
	 * 商品詳細からカートに購入情報を送る
	 * @return success or error
	 * @author HINAKO HAGIWARA
	 * @since 2017/09/06
	 * @version 1.1
	 */

	public String execute() throws SQLException {
		String result = ERROR;

		if(session.containsKey("userId")) {
			user_id = (int) session.get("userId");

			InsertCartDAO dao = new InsertCartDAO();

			tourStatus = dao.tourStatus(tour_id);
			this.price = tourStatus.get(0).getPrice();
			addCount = dao.addToCart(user_id, tour_id, order_count, price);
			cartList = dao.selected(user_id);

			if(cartList.size() > 0) {
				for(int i = 0; i < cartList.size(); i++) {

					total_price = total_price.add((cartList.get(i).getPrice().multiply(BigDecimal.valueOf(cartList.get(i).getOrder_count()))));

				}

				result = SUCCESS;

			}

		}

		return result;

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
	 * @param price 価格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
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
     * セッションを取得するメソッド
     * @return session セッション情報
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション情報
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
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
     * カート情報を取得するメソッド
     * @return cartList カート情報
     */
    public ArrayList<CartDTO> getCartList() {
    	return cartList;
    }

    /**
     * カート情報を格納するメソッド
     * @param cartList カート情報
     */
    public void setCartList(ArrayList<CartDTO> cartList) {
    	this.cartList = cartList;
    }

    /**
     * ツアー情報を取得するメソッド
     * @return tourStatus ツアー情報
     */
    public ArrayList<SelectCartDTO> getTourStatus() {
    	return tourStatus;
    }

    /**
     * ツアー情報を格納するメソッド
     * @param tourStatus ツアー情報
     */
    public void setTourStatus(ArrayList<SelectCartDTO> tourStatus) {
    	this.tourStatus = tourStatus;
    }

    /**
     * ツアー追加を取得するメソッド
     * @return addCount ツアー追加
     */
    public int getAddCount() {
    	return addCount;
    }

    /**
     * ツアー追加を格納するメソッド
     * @param addCount ツアー追加
     */
    public void setAddCount(int addCount) {
    	this.addCount = addCount;
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
    public void setImg(String img) {
    	this.img = img;
    }

    /**
     * シリアルIDを取得するメソッド
     * @return serialversionuid シリアルID
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}