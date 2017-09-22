package com.internousdev.choitabi.action;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.util.DBConnector;
import com.internousdev.util.creditcard.manager.CreditUtil;
import com.opensymphony.xwork2.ActionSupport;

/**
 * クレジットカードの種類を判別し情報が正しいかチェックするクラス
 * @author SHUN NAGAO
 * @since 2017/09/08
 * @version 1.1
 */

public class CheckCreditInfomationAction extends ActionSupport implements SessionAware {

    /**
     * シリアルID
     */
    private static final long serialVersionUID = 1160348426724511849L;

    /**
	 * ユーザーID
	 */
	private int user_id;

    /**
     * クレジット種類
     */
    private int creditId;

    /**
     * クレジット番号
     */
    private String creditNumber;

    private String num1;
    private String num2;
    private String num3;
    private String num4;

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
    private String errmsg2;

    /**
     * クレジットブランド
     */
    private String creditBrand;


    /**
	 * 合計金額
	 */
	private BigDecimal total_price = BigDecimal.ZERO;

    /**
     * カート内の商品情報を入れるリスト
     */
    private ArrayList<CartDTO> cartList=new ArrayList<>();

    /**
     * 実行メソッド クレジットの種類を判別し、合計金額を計算する。
     * @author SHUN NAGAO
     * @since 2017/09/08
     * @version 1.1
     * @return ERROR or SUCCESS
     */
    public String execute() {
    	creditNumber = num1 + num2 + num3 + num4;
    	String checkCreditResult = "FALSE";
    	try{
    	checkCreditResult = checkCredit();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}

    	if (checkCreditResult == SUCCESS){
    		BigDecimal totalPrice = totalPrice();

    		CartDTO dto = new CartDTO();
    		dto.setTotal_price(totalPrice);

    	}
    	return checkCreditResult;
    }


    /**
     * クレジットの種類を判別しカード情報をチェックする
     * @return
     */
    public String checkCredit() throws SQLException{
    	//処理を記述
    	System.out.println("てすと" + creditNumber);
    	if(creditNumber.startsWith("4")){
            creditId = 1;

        }else if(creditNumber.startsWith("5")){
            creditId = 2;

        } else if(creditNumber.startsWith("3")){
            creditId = 3;

        }else{
            errmsg2="*入力された情報に間違いがあります。1";

            return ERROR;
            }

        if(creditId == 1){
            creditBrand = "visa";

        }else if(creditId == 2){
            creditBrand = "masterCard";

        }else if(creditId == 3){
            creditBrand = "americanExpress";
            }

        expirationYear += 2000;

        CreditUtil util = new CreditUtil(creditId, creditNumber);

        //クレジットカード番号上6ケタの照合
        if(util.brandCheck()){
            //クレジットカード番号16ケタ、セキュリティコード、有効期限、名義人の照合
            if(creditCheck(securityCode, expirationYear, expirationMonth, nameE)){
                return SUCCESS;

            }else{
                errmsg2="*入力された情報に間違いがあります。2";

                return ERROR;
            }

        }else{
            errmsg2="*入力された情報に間違いがあります。3";

            return ERROR;
            }
    }

    /**
     * カート内の情報を元に合計金額を算出
     * @return
     */
    public BigDecimal totalPrice(){
    	try{

    		SelectCartDAO dao = new SelectCartDAO();
    		cartList = dao.selectCart(user_id);

    		for(int i = 0; i < cartList.size(); i++ ){
    			/*BigDecimal型の計算方法
    			 * + * - / などは使えず、加法はadd、減法はsubtract、乗法はmultiply、除法はdivideを使用する
    			 * BigDecimalと他の型の計算は出来ないので、int型などはvalueOfでBigDecimalに変換してあげる*/
    			total_price = total_price.add((cartList.get(i).getPrice().multiply(BigDecimal.valueOf(cartList.get(i).getOrder_count()))));
    		}
    	} catch (Exception e){
    	}return total_price;
    }


    public boolean creditCheck(String securityCode, int expirationYear, int expirationMonth, String nameE) throws SQLException{
    	DBConnector db = new DBConnector("com.mysql.jdbc.Driver","jdbc:mysql://localhost/?useSSL=true&requireSSL=true",this.creditBrand,"root","mysql");
		Connection con = db.getConnection();
		String query = "select * from credit_card where credit_number =?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, this.creditNumber);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (this.creditNumber.equals(rs.getString("credit_number"))) {
					if (Integer.parseInt(securityCode) == rs.getInt("security_code")) {
						if ((expirationMonth == rs.getInt("expiration_month"))
								&& (expirationYear == rs.getInt("expiration_year"))
								&& (nameE.equals(rs.getString("name_e")))) {
							return true;
						}
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return false;
	}



    /**
     * エラーメッセージ取得メソッド
     * @return mrrmsg2 エラーメッセージ
     */
    public String getErrmsg2() {
        return errmsg2;
        }

    /**
     * エラーメッセージ格納メソッド
     * @param errmsg2 エラーメッセージ
     */
    public void setErrmsg2(String errmsg2) {
        this.errmsg2 = errmsg2;
        }

    /**
     * クレジット種類取得メソッド
     * @return creditId クレジット種類
     */
    public int getCreditId() {
        return creditId;
        }

    /**
     * クレジット種類格納メソッド
     * @param creditId クレジット種類
     */
    public void setCreditId(int creditId) {
        this.creditId = creditId;
        }

    /**
     * クレジット番号取得メソッド
     * @return creditNumber クレジット番号
     */
    public String getCreditNumber() {
        return creditNumber;
        }

    /**
     * クレジット番号格納メソッド
     * @param creditNumber クレジット番号
     */
    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
        }


    public String getNum1() {
        return num1;
        }


    public void setNum1(String num1) {
        this.num1 = num1;
        }

    public String getNum2() {
        return num2;
        }


    public void setNum2(String num2) {
        this.num2 = num2;
        }

    public String getNum3() {
        return num3;
        }


    public void setNum3(String num3) {
        this.num3 = num3;
        }

    public String getNum4() {
        return num4;
        }


    public void setNum4(String num4) {
        this.num4 = num4;
        }

    /**
     * クレジット名義取得メソッド
     * @return nameE クレジット名義
     */
    public String getNameE() {
        return nameE;
        }

    /**
     * クレジット名義格納メソッド
     * @param nameE クレジット名義
     */
    public void setNameE(String nameE) {
        this.nameE = nameE;
        }

    /**
     * セキュリティコード取得メソッド
     * @return securityCode セキュリティコード
     */
    public String getSecurityCode() {
        return securityCode;
        }

    /**
     * セキュリティコード格納メソッド
     * @param securityCode セキュリティコード
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
        }

    /**
     * 有効期限（月）取得メソッド
     * @return expirationMonth 有効期限（月）
     */
    public int getExpirationMonth() {
        return expirationMonth;
        }

    /**
     * 有効期限（月）格納メソッド
     * @param expirationMonth 有効期限(月）
     */
    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
        }

    /**
     * 有効期限（年）取得メソッド
     * @return expirationYear 有効期限（年）
     */
    public int getExpirationYear() {
        return expirationYear;
        }

    /**
     * 有効期限（年）格納メソッド
     * @param expirationYear 有効期限 (年)
     */
    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
        }

    /**
     * セッション情報取得メソッド
     * @return session セッション情報
     */
    public Map<String, Object> getSession() {
        return session;
        }

    /**
     * セッション情報格納メソッド
     * @param session セッション情報
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
        }

    /**
     * クレジットブランド取得メソッド
     * @return creditBrand クレジットブランド
     */
    public String getCreditBrand() {
        return creditBrand;
        }

    /**
     * クレジットブランド格納
     * @param creditBrand クレジットブランド
     */
    public void setCreditBrand(String creditBrand) {
        this.creditBrand = creditBrand;
        }

}
