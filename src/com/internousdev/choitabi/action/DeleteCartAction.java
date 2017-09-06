package com.internousdev.choitabi.action;

import com.internousdev.choitabi.dao.DeleteCartDAO;
import com.opensymphony.xwork2.ActionSupport;



/**
 * カートの中身を削除するクラス
 * @author HINAKO HAGIWARA
 * @since 2017/09/05
 * @version 1.1
 */

public class DeleteCartAction extends ActionSupport {

	 /**
      * カートID
      */
     private int cart_id;

     /**
      * カートの中身を削除する為のメソッド
      * @author HINAKO HAGIWARA
      * @since 2017/09/05
      * @version 1.1
      * @return result データを削除できたらSUCCESS、できなかったらERRORを返す。
      */

     public String execute(){
			String result = ERROR;
    	      DeleteCartDAO dao = new DeleteCartDAO();
    	      if(dao.deleteCart(cart_id) > 0){
					result = SUCCESS;
    	      }
    	      return result;
     }
	/**
	*	カートIDを取得するメソッド
	*	@return cart_id カートID
	*/
	public int getCart_id() {
		return cart_id;
	}
	/**
	*	カートIDを格納する
	*	@param cart_id カートID
	*/
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

}
