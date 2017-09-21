package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.db.mysql.MySqlConnector;

public class InsertTourDAO {


	/** @author YUKA MATSUMURA
	 * @sinse 2017/09/12
	 * @version 1.1
	 *
	 * 管理側でツアーの新規登録をする際、実際にDBにデータを書き込むためのDAOです。
	 * InsertTourActionが呼び出しています。
	 * */


	public int insertTour(String newTourName,String newPrice,
            String newPersons, String newDeparture, String newRegion, String newPrefectures,
            String newTheme, String newComment, String newImg)
            		throws IllegalAccessException, InstantiationException{

		int count = 0;

		try{
			/*SQLに接続し、コマンドを実行してもらいます*/
			MySqlConnector msc = new MySqlConnector("choitabi");
			Connection con = msc.getConnection();


			String sql = "INSERT INTO tour VALUES(0," //←※これでオートインクリメントになります
					+ " ?," //1
					+ " ?,"//2
					+ " ?,"//3
					+ " ?,"//4
					+ " ?,"//5
					+ " ?,"//6
					+ " ?,"//7
					+ " ?,"//8
					+ " ?"//9
					+ ");";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newTourName);
			ps.setInt(2, Integer.parseInt(newPrice));
			ps.setInt(3, Integer.parseInt(newPersons));
			ps.setString(4, newDeparture);
			ps.setString(5, newRegion);
			ps.setString(6, newPrefectures);
			ps.setString(7, newTheme);
			ps.setString(8, newComment);
			ps.setString(9, newImg);

			count = ps.executeUpdate();
			/*後消し*/System.out.println("InsertTourDAO - 取得データ数：" + count);
			/*SQL接続の後片付けです*/
			con.close();
			ps.close();


			/*以下はエラー時の処理です。
			 * エラーが出たら、返すリストをnull=「リスト作れなかったよ」と合図させ、SUCCESSとERRORを見分けます。
			 * */
			}catch(SQLException e){
				e.printStackTrace();
				return 0;

			}catch(ClassCastException e){
				e.printStackTrace();
				return 0;

			}catch(Exception e){
				e.printStackTrace();
				return 0;
			}

		return count;

	}




}
