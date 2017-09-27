package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;

/**
 * DBに新規ツアーを登録するDAOクラス
 * @author YUKA MATSUMURA
 * @sinse 2017/09/12
 * @version 1.1
 * */
public class InsertTourDAO {

/**
 *DBに新規ツアーを登録するメソッド
 * @author YUKA MATSUMURA
 * @sinse 2017/09/12
 * @version 1.1
 * @param newTourName 新規ツアー名
 * @param newPrice 新規ツアーの価格
 * @param newDepartre 新規ツアーの出発地
 * @param newRegion 新規ツアーのエリア
 * @param newPrefectures 新規ツアーの都道府県
 * @param newTheme 新規ツアーのテーマ
 * @param newComment 新規ツアーのコメント
 * @param newImg 新規ツアーの画像URL
 * @return count 変更の完了したデータ数
 * */
	public int insertTour(String newTourName,String newPrice, String newDeparture,
								String newRegion, String newPrefectures,String newTheme, String newComment, String newImg){

		int count = 0;

		try{

			if(DupulicationCheck(newTourName, newPrice, newDeparture, newRegion, newPrefectures, newTheme, newComment, newImg) == false ){
				return count;

			}else{
				/*SQLに接続し、コマンドを実行してもらいます*/
				DBConnector dbc = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "choitabi", "root", "mysql");
				Connection con = dbc.getConnection();

				String sql = "INSERT INTO tour VALUES(0," //←※これでオートインクリメントになります
						+ " ?," //1
						+ " ?,"//2
						+ " 0," //定員の部分(現在未使用のため、仮で0の数値を入れています。)
						+ " ?,"//3
						+ " ?,"//4
						+ " ?,"//5
						+ " ?,"//6
						+ " ?,"//7
						+ " ?"//8
						+ ");";

				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, newTourName);
				ps.setInt(2, Integer.parseInt(newPrice));
				ps.setString(3, newDeparture);
				ps.setString(4, newRegion);
				ps.setString(5, newPrefectures);
				ps.setString(6, newTheme);
				ps.setString(7, newComment);
				ps.setString(8, newImg);

				count = ps.executeUpdate();

				/*SQL接続の後片付けです*/
				con.close();
				ps.close();

			}

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


	public boolean DupulicationCheck(String newTourName,String newPrice, String newDeparture,
			String newRegion, String newPrefectures,String newTheme, String newComment, String newImg){

		boolean result = false;

		try{
			/*SQLに接続し、コマンドを実行してもらいます*/
			DBConnector dbc = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "choitabi", "root", "mysql");
			Connection con = dbc.getConnection();


			String sql = "SELECT * FROM tour WHERE"
					+ " tour_name = ? AND" //1
					+ " price = ? AND"//2
					+ " departure = ? AND"//3
					+ " region = ? AND"//4
					+ " prefectures = ? AND"//5
					+ " theme = ? AND"//6
					+ " comment = ? AND"//7
					+ " img = ?"//8
					+ ";";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newTourName);
			ps.setInt(2, Integer.parseInt(newPrice));
			ps.setString(3, newDeparture);
			ps.setString(4, newRegion);
			ps.setString(5, newPrefectures);
			ps.setString(6, newTheme);
			ps.setString(7, newComment);
			ps.setString(8, newImg);

			ResultSet rs = ps.executeQuery();

			if(rs != null){
				result = true;
				return result;
			}else{
				return result;
			}


			}catch(SQLException e){
				e.printStackTrace();
				return false;

			}catch(ClassCastException e){
				e.printStackTrace();
				return false;

			}catch(Exception e){
				e.printStackTrace();
				return false;
			}


	}
}
