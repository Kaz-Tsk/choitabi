package com.internousdev.choitabi.dao;
import java.net.UnknownHostException;

import com.internousdev.choitabi.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

/**
 * お問い合わせフォームに関するDAOクラス
 * @author kanako miyazono
 * @since 2017/9/5
 * @version 1.1
 */

public class ContactCompleteDAO {

	/**
	 * MongoDBにデータを追加するメソッド
	 * @author kanako miyazono
	 * @since 2017/9/5
	 *@version 1.1
	 */


	/**
	 * @param contact_name
	 * @param contact_mailAddress
	 * @param contact_contents
	 * @return result
	 */
	public boolean dbInsert(String contact_name, String contact_mailAddress, String contact_contents){

		boolean result = false;

		try{

	        // mongoDBサーバーに接続
			MongoDBConnector con = new MongoDBConnector();

			// 利用するDB（コレクション）を取得

			DB db = con.getConnection();
			DBCollection coll = db.getCollection("collection");

			//mongoDBにドキュメント記載
			BasicDBObject input = new BasicDBObject();

			input.put("contact_name", contact_name);
			input.put("contact_mailAddress", contact_mailAddress);
			input.put("contact_contents",contact_contents);

			coll.insert(input);

			result = true;

		}catch(UnknownHostException e){
				e.printStackTrace();}


		return result;

	}
}

