/**
 *
 */
package com.internousdev.choitabi.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * MongoDBConnectorクラス
 * @author KANAKO MIYAZONO
 * @since 2017/09/05
 */
public class MongoDBConnector {

	private MongoClient client =null;

	/**
	 * MongoDBに接続するメソッド
	 * @return データベース名
	 * @throws UnknownHostException ホストの IP アドレスが判定できなかった場合にスローされます。
	 */
	public DB getConnection() throws UnknownHostException {

		/*Mongodbに接続
		*hostを指定しない場合は"localhost"
		*ポートを指定しない場合は27017
		*/
		client = new MongoClient("localhost",27017);

		/*
		 * 接続するデータベース名
		 */
		DB db =client.getDB("choitabi");

		return db;

	}

	}
