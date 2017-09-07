package com.internousdev.choitabi.dto;

/**
 * @author KAZUYUKI TASAKI
 *@since 2017/9/6
 *@version 1.0
 */
public class MypageDTO {

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 姓（漢字）
	 */
	private String familyNameKanji;

	/**
	 * 名（漢字）
	 */
	private String givenNameKanji;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 電話番号
	 */
	private String phoneNumber;

	/**
	 * メールアドレス
	 */
	private String mailAddress;

	/**
	 * ツアーID
	 */
	private int tourId;

	/**
	 * ツアー名
	 */
	private String  tourName;

	/**
	 *
	 */


	/**
	 * userIdを取得するメソッド
	 * @return userId
	 */
	public int getUserId(){
		return userId;
	}

	/**
	 * userIdを格納するメソッド
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}

	/**
	 * パスワードを取得するメソッド
	 * @return password
	 */
	public String getPassword(){
		return password;
	}

	/**
	 * パスワードを格納するメソッド
	 * @param password
	 */
	public void setPassword(String password){
		this.password = password;
	}

	/**
	 * 姓（漢字）を取得するメソッド
	 * @return familyNameKanji
	 */
	public String getFamilyNameKanji(){
		return familyNameKanji;
	}

	/**
	 * 姓（漢字）を格納するメソッド
	 * @param familyNameKanji
	 */
	public void setFamilyNameKanji(String familyNameKanji){
		this.familyNameKanji = familyNameKanji;
	}

	/**
	 * 名（漢字）を取得するメソッド
	 * @return givenNameKanji
	 */
	public String getGivenNameKanji(){
		return givenNameKanji;
	}
	/**
	 * 名（漢字）を格納するメソッド
	 * @param givenNameKanji
	 */
	public void setGivenNameKanji(String givenNameKanji){
		this.givenNameKanji = givenNameKanji;
	}
	/**
	 * 住所を取得するメソッド
	 * @return address
	 */
	public String getAddress(){
		return address;
	}

	/**
	 * 住所を格納するメソッド
	 * @param address
	 */
	public void setAddress(String address){
		this.address = address;
	}

	/**
	 * 電話番号を取得するメソッド
	 * @return phoneNumber
	 */
	public String getPhoneNumber(){
		return phoneNumber;
	}

	/**
	 * 電話番号を格納するメソッド
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	/**
	 * メールアドレスを取得するメソッド
	 * @return mailaddress
	 */
	public String getMailAddress(){
		return mailAddress;
	}

	/**
	 * メールアドレスを格納するメソッド
	 * @param
	 */
	public void setMailAddress(String mailAddress){
		this.mailAddress = mailAddress;
	}

	/**
	 * ツアーIDを取得するメソッド
	 * @return tourID
	 */
	public int getTourId(){
		return tourId;
	}

	/**
	 * ツアーIDを格納するメソッド
	 * @param
	 */
	public void setTourId(int tourId){
		this.tourId = tourId;
	}

	/**
	 * ツアー名を取得するメソッド
	 * @return tourName
	 */
	public String getTourName(){
		return tourName;
	}

	/**
	 * ツアー名を格納するメソッド
	 * @param tourName
	 */
	public void setTourName(String tourName){
		this.tourName = tourName;
	}
}