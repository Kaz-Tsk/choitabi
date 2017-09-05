package src.com.internousdev.choitabi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*【松村】データベースとの接続…MySQLへのログイン（のみ）を行うクラスをテストで作ってみました。
 * 作った接続は戻り値に設定してあるので、呼び出すとそいつを投げ返してくれます。
 * DAOクラスの最初の処理で使いまわせる………かも。
 * */

public class DBConnecter {

//※↓単体で動きをチェックするためのメインメソッドです。プロジェクト起動時に勝手に動いてしまうと大変なので、普段はコメントにしてあります。
//	public static void main(String[] args)throws IllegalAccessException, InstantiationException{
//		Test_DBConnecter tdbc = new Test_DBConnecter();
//		tdbc.createConnection();
//	}

	//ここから本文----------------------------------------------------------------------

	private String className = "com.mysql.jdbc.Driver";			//←ロードするドライバー名
	private String connectUrl = "jdbc:mysql://localhost/test_choitabi";  //←接続先のデータベース
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
