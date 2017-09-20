package com.internousdev.choitabi.dto;



/**
 * カート情報に関するDTOクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.0
 */

public class CartDTO {

    /**
     * カートID
     */
    private int cart_id;

    /**
     * ユーザーID
     */
    private int user_id;

    /**
     * 姓
     */
    private String family_name_kanji;

    /**
     * 名
     */
    private String given_name_kanji;

    /**
     * 支払い方法
     */
    private int payment_method;

    /**
     * ツアーID
     */
    private int tour_id;

    /**
     * ツアー名
     */
    private String tour_name;

    /**
     * 予約人数
     */
    private int order_count;

    /**
     * 価格
     */
    private int price;

    /**
     * 合計金額
     */
    private int total_price;

    /**
     * 備考
     */
    private String note;

    /**
     * 画像パス
     */
    private String img;

    /**
     * 登録日
     */
    private String registration_date;

    /**
     * 更新日
     */
    private String updated_date;

    /**
     * ツアーカテゴリー
     */
    private String tour_category;

    /**
     * 小計
     */
    private int sub_total;



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
     * 姓を取得するメソッド
     * @return family_name_kanji 姓
     */
    public String getFamily_name_kanji() {
    	return family_name_kanji;
    }

    /**
     * 姓を格納するメソッド
     * @parem family_name_kanji 姓
     */
    public void setFamily_name_kanji(String family_name_kanji) {
    	this.family_name_kanji = family_name_kanji;
    }

    /**
     * 名を取得するメソッド
     * @return given_name_kanji 名
     */
    public String getGiven_name_kanji() {
    	return given_name_kanji;
    }

    /**
     * 名を格納するメソッド
     * @param given_name_kanji 名
     */
    public void setGiven_name_kanji(String given_name_kanji) {
    	this.given_name_kanji = given_name_kanji;
    }

    /**
     * 支払い方法を取得するメソッド
     * @return paymentMethod 支払い方法
     */
    public int getPayment_method() {
    	return payment_method;
    }

    /**
     * 支払い方法を格納するメソッド
     * @param paymentMethod 支払い方法
     */
    public void setPayment_method(int payment_method) {
    	this.payment_method = payment_method;
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
     * 価格を取得するメソッド
     * @return price 価格
     */
    public int getPrice() {
        return price;
        }

    /**
     * 価格を格納するメソッド
     * @param price 価格
     */
    public void setPrice(int price) {
        this.price = price;
        }

    /**
     * 合計金額を取得するメソッド
     * @return total_price 合計金額
     */
    public int getTotal_price() {
        return total_price;
        }

    /**
     * 合計金額を格納するメソッド
     * @param total_price 合計金額
     */
    public void setTotal_price(int total_price) {
        this.total_price = total_price;
        }

    /**
    * 備考を取得するメソッド
    * @return note 備考
    */
   public String getNote() {
	   return note;
   }

   /**
    * 備考を格納するメソッド
    * @oaram note 備考
    */
   public void setNote(String note) {
	   this.note = note;
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
     * 登録日を取得するメソッド
     * @return registration_date 登録日
     */
    public String getRegistration_date() {
        return registration_date;
        }

    /**
     * 登録日を格納するメソッド
     * @param registration_date 登録日
     */
    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
        }

    /**
     * 更新日を取得するメソッド
     * @return updated_date 更新日
     */
    public String getUpdated_date() {
        return updated_date;
        }

    /**
     * 更新日を格納するメソッド
     * @param updated_date 更新日
     */
    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
        }

    /**
     * ツアーカテゴリーを取得するメソッド
     * @return tourCategory ツアーカテゴリー
     */
    public String getTour_category() {
    	return tour_category;
    	}

    /**
     * ツアーカテゴリーを格納するメソッド
     * @oaram tourCategory ツアーカテゴリー
     */
    public void setTour_category(String tour_category) {
    	this.tour_category = tour_category;
    }

    /**
     * 小計を取得するメソッド
     * @return sub_total 小計
     */
    public int getSub_total() {
        return sub_total;
        }

    /**
     * 小計を格納するメソッド
     * @param sub_total 小計
     */
    public void setSub_total(int sub_total) {
        this.sub_total = sub_total;
        }

}