package com.internousdev.choitabi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.util.creditcard.manager.CreditUtil;
import com.opensymphony.xwork2.ActionSupport;


	/**
	 * クレジットカードの種類を判別し情報が正しいかチェックするクラス
	 * @author SHUN NAGAO
	 * @since 2017/09/22
	 * @version 1.1
	 *
	 */
	public class CheckCreditAction extends ActionSupport implements SessionAware{
		/**
		 * シリアルID
		 */
		private static final long serialVersionUID = -6567654743580086515L;
		/**
		 * クレジット種類
		 */
		private int creditId;
		/**
		 * クレジット番号
		 */
		private String creditNumber;
		/**
		 * クレジット名義
		 */
		private String nameE;
		/**
		 * セキュリティコード
		 */
		private String securityCode;
		/**
		 * 有効期限（月）
		 */
		private int expirationMonth;
		/**
		 * 有効期限（年）
		 */
		private int expirationYear;
		/**
		 * セッション情報
		 */
		private Map<String,Object>session;
		/**
		 * エラーメッセージ
		 */
		private String errmsg1;
		/**
		 * クレジットブランド
		 */
		private String creditBrand;


		/**
		 * 実行メソッド クレジットの種類を判別
		 * @author SHUN NAGAO
		 * @return ERROR SUCCESS
		 * @since 2017/09/22
		 * @version 1.1
		 */
		public String execute() {

			if(creditNumber.startsWith("4")){
				creditId = 1;
			}else if(creditNumber.startsWith("5")){
				creditId = 2;
			} else if(creditNumber.startsWith("3")){
				creditId = 3;
			}else{
				errmsg1="*入力された情報に間違いがあります。";
				return ERROR;
			}

			if(creditId == 1){
				creditBrand = "Visa";
			}else if(creditId == 2){
				creditBrand = "MasterCard";
			}else if(creditId == 3){
				creditBrand = "AmericanExpress";
			}



			CreditUtil util = new CreditUtil(creditId, creditNumber);
			//クレジットカード番号上6ケタの照合
			if(util.brandCheck()){
				//クレジットカード番号16ケタ、セキュリティコード、有効期限、名義人の照合
				if(util.creditCheck(securityCode, expirationYear, expirationMonth, nameE)){

					return SUCCESS;

				}else{
					errmsg1="*入力された情報に間違いがあります。";
					return ERROR;
				}
			}else{
				errmsg1="*入力された情報に間違いがあります。";
				return ERROR;
			}
		}



		/**
		 * エラーメッセージを取得するメソッド
		 * @return errmsg1 エラーメッセージ
		 */
		public String getErrmsg1() {
			return errmsg1;
		}

		/**
		 * エラーメッセージを格納するメソッド
		 * @param errmsg1 エラーメッセージ
		 */
		public void setErrmsg1(String errmsg1) {
			this.errmsg1 = errmsg1;
		}

		/**
		 * クレジット種類を取得するメソッド
		 * @return creditId クレジット種類
		 */
		public int getCreditId() {
			return creditId;
		}

		/**
		 * クレジット種類を格納するメソッド
		 * @param creditId クレジット種類
		 */
		public void setCreditId(int creditId) {
			this.creditId = creditId;
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
		 * @param creditNumber クレジット番号
		 */
		public void setCreditNumber(String creditNumber) {
			this.creditNumber = creditNumber;
		}

		/**
		 * クレジット名義を取得するメソッド
		 * @return nameE クレジット名義
		 */
		public String getNameE() {
			return nameE;
		}

		/**
		 * クレジット名義を格納するメソッド
		 * @param nameE クレジット名義
		 */
		public void setNameE(String nameE) {
			this.nameE = nameE;
		}

		/**
		 * セキュリティコードを取得するメソッド
		 * @return securityCode セキュリティコード
		 */
		public String getSecurityCode() {
			return securityCode;
		}

		/**
		 * セキュリティコードを格納するメソッド
		 * @param securityCode セキュリティコード
		 */
		public void setSecurityCode(String securityCode) {
			this.securityCode = securityCode;
		}

		/**
		 * 有効期限（月）を取得するメソッド
		 * @return expirationMonth  有効期限（月）
		 */
		public int getExpirationMonth() {
			return expirationMonth;
		}

		/**
		 * 有効期限（月）を格納するメソッド
		 * @param expirationMonth  有効期限（月）
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
		 * @param expirationYear 有効期限（年）
		 */
		public void setExpirationYear(int expirationYear) {
			this.expirationYear = expirationYear;
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
		 * クレジットブランドを取得するメソッド
		 * @return creditBrand クレジットブランド
		 */
		public String getCreditBrand() {
			return creditBrand;
		}

		/**
		 * クレジットブランドを格納するメソッド
		 * @param creditBrand クレジットブランド
		 */
		public void setCreditBrand(String creditBrand) {
			this.creditBrand = creditBrand;
		}

	}