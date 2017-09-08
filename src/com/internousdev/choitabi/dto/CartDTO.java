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
    private int cartId;

    /**
     * ユーザーID
     */
    private int userId;

    /**
     * 姓
     */
    private String familyNameKanji;

    /**
     * 名
     */
    private String givenNameKanji;

    /**
     * 支払い方法
     */
    private int paymentMethod;

    /**
     * ツアーID
     */
    private int tourId;

    /**
     * ツアー名
     */
    private String tourName;

    /**
     * 購入数
     */
    private int quantity;

    /**
     * 価格
     */
    private int price;

    /**
     * 合計金額
     */
    private int totalPrice;

    /**
     * 備考
     */
    private String note;

    /**
     * 画像パス
     */
    private String imgAddress001;

    /**
     * 登録日
     */
    private String registrationDate;

    /**
     * 更新日
     */
    private String updatedDate;

    /**
     * ツアーカテゴリー
     */
    private String tourCategory;

    /**
     * 小計
     */
    private int subTotal;



    /**
     * カートIDを取得するメソッド
     * @return cartId カートID
     */
    public int getCartId() {
        return cartId;
        }

    /**
     * カートIDを格納するメソッド
     * @param cartId カートID
     */
    public void setCartId(int cartId) {
        this.cartId = cartId;
        }

    /**
     * ユーザーIDを取得するメソッド
     * @return userId ユーザーID
     */
    public int getUserId() {
        return userId;
        }

    /**
     * ユーザーIDを格納するメソッド
     * @param userId ユーザーID
     */
    public void setUserId(int userId) {
        this.userId = userId;
        }

    /**
     * 姓を取得するメソッド
     * @return familyNameKanji 姓
     */
    public String getFamilyNameKanji() {
    	return familyNameKanji;
    }

    /**
     * 姓を格納するメソッド
     * @parem familyNameKanji 姓
     */
    public void setFamilyNameKanji(String familyNameKanji) {
    	this.familyNameKanji = familyNameKanji;
    }

    /**
     * 名を取得するメソッド
     * @return givenNameKanji 名
     */
    public String getGivenNameKanji() {
    	return givenNameKanji;
    }

    /**
     * 名を格納するメソッド
     * @param givenNameKanji 名
     */
    public void setGivenNameKanji(String givenNameKanji) {
    	this.givenNameKanji = givenNameKanji;
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
     * @return tourId ツアーID
     */
    public int getTourId() {
        return tourId;
        }

    /**
     * ツアーIDを格納するメソッド
     * @param tourId ツアーID
     */
    public void setTourId(int tourId) {
        this.tourId = tourId;
        }

    /**
     * ツアー名を取得するメソッド
     * @return tourName ツアー名
     */
    public String getTourName() {
        return tourName;
        }

    /**
     * ツアー名を格納するメソッド
     * @param tourName ツアー名
     */
    public void setTourName(String tourName) {
        this.tourName = tourName;
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
     * @return totalPrice 合計金額
     */
    public int getTotalPrice() {
        return totalPrice;
        }

    /**
     * 合計金額を格納するメソッド
     * @param totalPrice 合計金額
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
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
    * @return imgAddress001 画像パス
    */
   public String getImgAddress001() {
	   return imgAddress001;
   }

   /**
    * 画像パスを格納するメソッド
    * @param imgAddress001 画像パス
    */
   public void setImgAddress(String imgAddress) {
	   this.imgAddress001 = imgAddress;
   }

    /**
     * 登録日を取得するメソッド
     * @return registrationDate 登録日
     */
    public String getRegistrationDate() {
        return registrationDate;
        }

    /**
     * 登録日を格納するメソッド
     * @param registrationDate 登録日
     */
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        }

    /**
     * 更新日を取得するメソッド
     * @return updatedDate 更新日
     */
    public String getUpdatedDate() {
        return updatedDate;
        }

    /**
     * 更新日を格納するメソッド
     * @param updatedDate 更新日
     */
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
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
     * @return subTotal 小計
     */
    public int getSubTotal() {
        return subTotal;
        }

    /**
     * 小計を格納するメソッド
     * @param subTotal 小計
     */
    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
        }

}