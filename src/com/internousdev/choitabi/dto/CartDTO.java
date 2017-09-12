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
    private int paymentMethod;

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
    private String tourCategory;

    /**
     * 小計
     */
    private int sub_total;



    /**
     * カートIDを取得するメソッド
     * @return cart_id カートID
     */
    public int getCartId() {
        return cart_id;
        }

    /**
     * カートIDを格納するメソッド
     * @param cart_id カートID
     */
    public void setCartId(int cart_id) {
        this.cart_id = cart_id;
        }

    /**
     * ユーザーIDを取得するメソッド
     * @return user_id ユーザーID
     */
    public int getUserId() {
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
     * 姓を取得するメソッド
     * @return family_name_kanji 姓
     */
    public String getFamilyNameKanji() {
    	return family_name_kanji;
    }

    /**
     * 姓を格納するメソッド
     * @parem family_name_kanji 姓
     */
    public void setFamilyNameKanji(String family_name_kanji) {
    	this.family_name_kanji = family_name_kanji;
    }

    /**
     * 名を取得するメソッド
     * @return given_name_kanji 名
     */
    public String getGivenNameKanji() {
    	return given_name_kanji;
    }

    /**
     * 名を格納するメソッド
     * @param given_name_kanji 名
     */
    public void setGivenNameKanji(String given_name_kanji) {
    	this.given_name_kanji = given_name_kanji;
    }

    /**
     * 支払い方法を取得するメソッド
     * @return paymentMethod 支払い方法
     */
    public int getPaymentMethod() {
    	return paymentMethod;
    }

    /**
     * 支払い方法を格納するメソッド
     * @param paymentMethod 支払い方法
     */
    public void setPaymentMethod(int paymentMethod) {
    	this.paymentMethod = paymentMethod;
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
     * 予約人数を取得するメソッド
     * @return order_count 予約人数
     */
    public int getOrderCount() {
        return order_count;
        }

    /**
     * 予約人数を格納するメソッド
     * @param order_count 予約人数
     */
    public void setOrderCount(int order_count) {
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
    public int getTotalPrice() {
        return total_price;
        }

    /**
     * 合計金額を格納するメソッド
     * @param total_price 合計金額
     */
    public void setTotalPrice(int total_price) {
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
    public String getRegistrationDate() {
        return registration_date;
        }

    /**
     * 登録日を格納するメソッド
     * @param registrationDate 登録日
     */
    public void setRegistrationDate(String registration_date) {
        this.registration_date = registration_date;
        }

    /**
     * 更新日を取得するメソッド
     * @return updated_date 更新日
     */
    public String getUpdatedDate() {
        return updated_date;
        }

    /**
     * 更新日を格納するメソッド
     * @param updated_date 更新日
     */
    public void setUpdatedDate(String updated_date) {
        this.updated_date = updated_date;
        }

    /**
     * ツアーカテゴリーを取得するメソッド
     * @return tourCategory ツアーカテゴリー
     */
    public String getTourCategory() {
    	return tourCategory;
    	}

    /**
     * ツアーカテゴリーを格納するメソッド
     * @oaram tourCategory ツアーカテゴリー
     */
    public void setTourCategory(String tourCategory) {
    	this.tourCategory = tourCategory;
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