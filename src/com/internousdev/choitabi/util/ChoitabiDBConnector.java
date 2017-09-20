package com.internousdev.choitabi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**@author:YUKA MATSUMURA
 *@since:2017/09/05
 *@version:1.1
 *
 *choitabiのデータベースへの接続を作るところまでしてくれる部品です。
 *インスタンスを作って、
 *Connection con = インスタンス名.createConnection();
 *とすればつなげてくれると思います。
 *
 *
 * */

public class ChoitabiDBConnector {

	private String className = "com.mysql.jdbc.Driver";			//←ロードするドライバー名
	private String connectUrl = "jdbc:mysql://localhost/choitabi";  //←接続先のデータベース（choitabiになっています）
	private String connectUser = "root";								//←接続するユーザー
	private String connectPassword = "mysql";						//←接続するときのパスワード



	public Connection createConnection() throws IllegalAccessException, InstantiationException{

			Connection con = null;

		try{
			Class.forName(className).newInstance();
			con = DriverManager.getConnection(connectUrl, connectUser, connectPassword);
			System.out.println("Test_DBConnecter.java:接続が完了しました");
		}catch(ClassNotFoundException e){
			System.out.println("指定されたクラスが見つかりません");
			e.printStackTrace();
		}catch(SQLException e){
			System.out.println("SQLでエラーが発生しました");
			e.printStackTrace();
		}

		return con;
	}

}
