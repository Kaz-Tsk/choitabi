package com.internousdev.choitabi.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.choitabi.dao.PaymentCompleteDAO;
import com.internousdev.choitabi.dao.SelectCartDAO;
import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.util.creditcard.manager.CreditUtil;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 決済をするアクション
 * @author SHUN NAGAO
 * @since 2017/09/08
 * @version 1.1
 */
public class PaymentCompleteAction extends ActionSupport implements SessionAware {

    /**
     * シリアルID
     */
    private static final long serialVersionUID = 3692422332609482760L;

    /**
     * ユーザー（お客様）ID
     */
    private int userId;

    /**
     * セッション情報
     */
    private Map<String, Object> session;

    /**
     * カード番号
     */
    private String creditNumber;

    /**
     * カード会社
     */
    private int creditId;

    /**
     * 合計金額
     */
    private int amount;

    /**
     * 商品名
     */
    private String itemName;

    /**
     * カート、クレジットのリスト
     */
    private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

    /**
     * 注文数
     */
    private int orderCount;

    /**
     * プロジェクト名
     */
    private String projectName;

    /**
     * 決済をするための実行メソッド
     * @return success or error or login
     */
    public String execute() {
    	projectName="choitabi";
        String result = LOGIN;

        //セッション切れでないか？ＯＫなら次へ進む
        userId=0;

        if (session.containsKey("userId")) {
            userId = (int)session.get("userId");
            CreditUtil util = new CreditUtil(creditId, creditNumber);

            int amountAll = amount;

            //クレジットカードの利用情報を、カード会社のDBに格納する
            if(util.selectInsert(projectName,amountAll) !=0){
                //成功した場合の処理
                PaymentCompleteDAO dao = new PaymentCompleteDAO();
                SelectCartDAO dao2 = new SelectCartDAO();
                cartList = dao2.selectCart(userId);

                if dao.payment(userId); //購入情報をインサート
                    dao.clean(userId); //カート情報を削除

                    for (int i = 0; i < cartList.size(); i++) {
                        amount += (cartList.get(i).getPrice()) * (cartList.get(i).getQuantity());
                        }

                    result = SUCCESS;

                }else if(dao.stockCheck(cartList)==3){
                	this.setItemName(cartList.get(0).getTourName());
//                    itemName = dao.stockCheck(cartList);
//                    System.out.println(dao.stockCheck(cartList));
    				System.out.println(itemName);
                    result = ERROR;
                    }
                }

            return result;
            }


    /**
     * ユーザー（お客様）IDを取得するメソッド
     * @return userId ユーザー（お客様）ID
     */
    public int getUserId() {
        return userId;
        }

    /**
     * ユーザー（お客様）IDを格納するメソッド
     * @param userId セットする userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
        }

    /**
     * セッション情報を取得するメソッド
     * @return session セッション情報
     */
    public Map<String, Object> getSession() {
        return session;
        }

    /**
     * セッション情報を格納するメソッド
     * @param session セットする session
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
        }

    /**
     * カード番号を取得するメソッド
     * @return creditNumber クレジット番号
     */
    public String getCreditNumber() {
        return creditNumber;
        }

    /**
     * カード番号を格納するメソッド
     * @param creditNumber セットする creditNumber
     */
    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
        }

    /**
     * カード会社を取得するメソッド
     * @return creditId カード会社
     */
    public int getCreditId() {
        return creditId;
        }

    /**
     * カード会社を格納するメソッド
     * @param creditId セットする creditId
     */
    public void setCreditId(int creditId) {
        this.creditId = creditId;
        }

    /**
     * カートリストを取得するメソッド
     * @return cartList カートリスト
     */
    public ArrayList<CartDTO> getCartList() {
        return cartList;
        }

    /**
     * カートリストを格納するメソッド
     * @param cartList セットする cartList
     */
    public void setCartList(ArrayList<CartDTO> cartList) {
        this.cartList = cartList;
        }

    /**
     * 合計金額を取得するメソッド
     * @return amount 合計金額
     */
    public int getAmount() {
        return amount;
        }

    /**
     * 合計金額を格納するメソッド
     * @param amount セットする amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
        }

    /**
     * 商品名を取得するメソッド
     * @return itemsName 商品名
     */
    public String getItemName() {
        return itemName;
        }

    /**
     * 商品名を格納するメソッド
     * @param itemName セットする itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
        }

    /**
     * 数量を取得するメソッド
     * @return orderCount 数量
     */
    public int getOrderCount() {
        return orderCount;
        }

    /**
     * 数量を格納するメソッド
     * @param orderCount セットする 数量
     */
    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
        }
}
