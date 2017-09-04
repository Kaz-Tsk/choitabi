package com.internousdev.choitabi.dao;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.internousdev.util.db.mongodb.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

/**
 * お問い合わせフォームに関するDAOクラス
 * @author kanako miyazono
 * @since 2017/9/4
 * @version 1.1
 */

public class InsertContactDAO {

	/**
	 * MongoDBにデータを追加するメソッド
	 * @author KOSUKE MAEDA
	 * @since 2017/08/22
	 * @version 1.1
	 * @param contactName お問い合わせ者の名前
	 * @param email メールアドレス
	 * @param comment お問い合わせ本文
	 * @return result 更新できたらtrue、できなかったfalse0を返す
	 * @throws UnknownHostException ホストの IP アドレスが判定できなかった場合にスローされます。
	 */
	public boolean dbInsert(String contactName, String email, String comment) throws UnknownHostException {

		boolean result = false;

		// 管理者が日本人であることを想定しているため、日本のタイムゾーンで現在の日付を取得
		Calendar cal = Calendar.getInstance();
		TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
		cal.setTimeZone(tz);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String dt = sdf.format(cal.getTime());

		// DBサーバーに接続
		MongoDBConnector con = new MongoDBConnector();

		// 利用するDB（コレクション）を取得

		DB db = con.getConnection();
		DBCollection coll = db.getCollection("contact");
		BasicDBObject input = new BasicDBObject();

		input.put("contactName", contactName);
		input.put("email", email);
		input.put("comment", comment);
		input.put("registrationDate", dt);

		coll.insert(input);

		// DB内の件数が100件以上の場合、最初の行の問い合わせを削除

		long count = coll.getCount();

		if (count == 101) {
			DBObject doc = coll.findOne();

			coll.remove(doc);
		}

		count = coll.getCount();

		result = true;

		return result;

	}
}
