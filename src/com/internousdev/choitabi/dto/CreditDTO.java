package com.internousdev.choitabi.dto;

/**
 * クレジット情報に関するDTOクラス
 * @author SHUN NAGAO
 * @since 2017/09/11
 */
public class CreditDTO {

	/**
     * ユーザーID
     */
    private int userId;

    /**
     * ログインID
     */
    private String loginId;

    /**
     * クレジットの種類
     */
    private int creditName;

    /**
     * クレジット番号
     */
    private String creditNumber;

    /**
     * 姓名(ローマ字)
     */
    private String nameE;

    /**
     * セキュリティーコード
     */
    private int securityCode;

    /**
     * 有効期限（月）
     */
    private int expirationMonth;

    /**
     * 有効期限（年）
     */
    private int expirationYear;

    /**
     * クレジットタイプ
     */
    private String creditType;

    /**
     * 姓名（漢字）
     */
    private String lastName;

    /**
     * 名前(漢字)
     */
    private String firstName;

    /**
     * クレジット番号下4ケタ
     */
    private String creditNumberDown;

    /**
     * 登録日
     */
    private String registrationData;

    /**
     * 更新日
     */
    private String updatedData;


    /**
     * ユーザーIDを取得するメソッド
     * @return userId ユーザーID
     */
    public int getUserId() {
        return userId;
        }

    /**
     * ユーザーIDを格納するメソッド
     * @param userId セットする ユーザーID
     */
    public void setUserId(int userId) {
        this.userId = userId;
        }

    /**
     * クレジットの種類を取得するメソッド
     * @return creditId クレジットの種類
     */
    public int getCreditName() {
        return creditName;
        }

    /**
     * クレジットの種類を格納するメソッド
     * @param creditName セットする クレジット種類
     */
    public void setCreditName(int creditName) {
        this.creditName = creditName;
        }

    /**
     * ログインIDを取得するメソッド
     * @return loginId ログインID
     */
    public String getLoginId() {
        return loginId;
        }

    /**
     * ログインIDを格納するメソッド
     * @param loginId セットする ログインID
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
        }

    /**
     * クレジット番号を取得するメソッド
     * @return creditNumber クレジット番号
     */
    public String getCreditNumber() {
        return creditNumber;
        }

    /**
     * クレジット番号を格納するメソッド
     * @param creditNumber セットする クレジット番号
     */
    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
        }

    /**
     * 姓名(ローマ字)を取得するメソッド
     * @return nameE 姓名（ローマ字）
     */
    public String getNameE() {
        return nameE;
        }

    /**
     * 姓名(ローマ字)を格納するメソッド
     * @param nameE セットする 姓名（ローマ字）
     */
    public void setNameE(String nameE) {
        this.nameE = nameE;
        }

    /**
     * セキュリティコードを取得するメソッド
     * @return securityCode セキュリティコード
     */
    public int getSecurityCode() {
        return securityCode;
        }

    /**
     * セキュリティコードを格納するメソッド
     * @param securityCode セットする セキュリティコード
     */
    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
        }

    /**
     * 有効期限（月）を取得するメソッド
     * @return expirationMonth 有効期限（月）
     */
    public int getExpirationMonth() {
        return expirationMonth;
        }

    /**
     * 有効期限（月）を格納するメソッド
     * @param expirationMonth セットする 有効期限（月）
     */
    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
        }

    /**
     * 有効期限（年）を取得するメソッド
     * @return expirationYear 有効期限（年）
     */
    public int getExpirationYear() {
        return expirationYear;
        }

    /**
     * 有効期限（年）を格納するメソッド
     * @param expirationYear セットする 有効期限（年）
     */
    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
        }

    /**
     * クレジットタイプを取得するメソッド
     * @return creditType クレジットタイプ
     */
    public String getCreditType() {
        return creditType;
        }

    /**
     * クレジットタイプを格納するメソッド
     * @param creditType セットする クレジットタイプ
     */
    public void setCreditType(String creditType) {
        this.creditType = creditType;
        }

    /**
     * 姓名（漢字）を取得するメソッド
     * @return lastName 姓名（漢字）
     */
    public String getLastName() {
        return lastName;
        }

    /**
     * 姓名（漢字）を格納するメソッド
     * @param lastName セットする 姓名（漢字）
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
        }

    /**
     * 名前(漢字)を取得するメソッド
     * @return firstName 名前（漢字）
     */
    public String getFirstName() {
        return firstName;
        }

    /**
     * 名前(漢字)を格納するメソッド
     * @param firstName セットする 名前（漢字）
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        }

    /**
     * クレジット番号下4ケタを取得するメソッド
     * @return creditNumberDown クレジット番号下4ケタ
     */
    public String getCreditNumberDown() {
        return creditNumberDown;
        }

    /**
     * クレジット番号下4ケタを格納するメソッド
     * @param creditNumberDown セットする クレジット番号下4ケタ
     */
    public void setCreditNumberDown(String creditNumberDown) {
        this.creditNumberDown = creditNumberDown;
        }

    /**
     * 登録日を取得するメソッド
     * @return createdAt 登録日
     */
    public String getRegistrationData() {
        return registrationData;
        }

    /**
     * 登録日を格納するメソッド
     * @param registrationData セットする 登録日
     */
    public void setRegistrationData(String registrationData) {
        this.registrationData = registrationData;
        }

    /**
     * 更新日を取得するメソッド
     * @return updatedData 更新日
     */
    public String getUpdatedData() {
        return updatedData;
        }

    /**
     * 更新日を格納するメソッド
     * @param updatedData セットする 更新日
     */
    public void setUpdatedData(String updatedData) {
        this.updatedData = updatedData;
        }
}
