package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.choitabi.util.DBConnector;

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
            String newTheme, String newComment, String newImg,
            String deleteCheck)throws IllegalAccessException, InstantiationException{

		int count = 0;

		try{
			/*SQLに接続し、コマンドを実行してもらいます*/
			DBConnector dbc = new DBConnector();
			Connection con = dbc.createConnection();

			String sql = "INSERT INTO tour VALUES ("
					+ " tour_id = 0," //←※これでオートインクリメントになります
					+ " tour_name = ?," //1
					+ " price = ?,"//2
					+ " persons = ?,"//3
					+ " departure = ?,"//4
					+ " region = ?,"//5
					+ " prefectures = ?,"//6
					+ " theme = ?,"//7
					+ " comment = ?,"//8
					+ " img = ?"//9
					+ " );";

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
			/*後消し*/System.out.println("InsertTourDAO - 作成SQL文 : " + sql);

			count = ps.executeUpdate();
			/*後消し*/System.out.println("InsertTourDAO - 取得データ数：" + count);
			/*SQL接続の後片付けです*/
			con.close();
			ps.close();


			/*以下はエラー時の処理です。
			 * エラーが出たら、返すリストをnull=「リスト作れなかったよ」と合図させ、SUCCESSとERRORを見分けます。
			 * */
			}catch(SQLException e){
				System.out.println("SQL上でエラーが発生しました");
				e.printStackTrace();
				return 0;

			} catch (IllegalAccessException e) {
				System.out.println("アクセスエラーです");
				e.printStackTrace();
				return 0;

			} catch (InstantiationException e) {
				System.out.println("ドライバのロードに失敗しました");
				e.printStackTrace();
				return 0;

			}catch(ClassCastException e){
				System.out.println("変換できないデータがありました");
				e.printStackTrace();
				return 0;

			}catch(Exception e){
				System.out.println("その他のエラーです");
				e.printStackTrace();
				return 0;
			}

		return count;

	}




}
