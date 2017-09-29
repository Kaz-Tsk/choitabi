package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.util.DBConnector;
import com.internousdev.util.db.mysql.MySqlConnector;

/**
 * DBに登録されているツアーに対し、編集・削除の操作を行うDAOクラス
 * @author : YUKA MATSUMURA
 * @since : 2017/09/08
 * @version : 1.1
 * */

public class UpdateTourDAO {


	/**
	 * DBに登録されているツアーを操作するメソッド
	 * @author YUKA MATSUMURA
	 * @since 2017/09/08
	 * @version 1.1
	 * @param editTourID 編集するツアーのID
	 * @param editTourName 編集後のツアー名
	 * @param editPrice 編集後の価格
	 * @param editDeparture 編集後の出発地
	 * @param editRegion 編集後のエリア
	 * @param editPrefectures 編集後の都道府県
	 * @param editTheme 編集後のテーマ
	 * @param editComment 編集後のコメント
	 * @param editFileFileName 編集後の画像名
	 * @param deleteCheck 削除用チェックボックスの状態
	 * @return count 操作の完了したデータ数
	 * */
	public int updateTour(String editTourId, String editTourName,String editPrice, String editDeparture,
								String editRegion, String editPrefectures,String editTheme, String editComment, String editFileFileName,
								String deleteCheck){
		int count = 0;

			/*削除チェックのボックスにチェックが入っていない＝ツアーデータ更新の場合*/
			if(deleteCheck.equals("false")){

				try{
					/*SQLに接続し、コマンドを実行してもらいます*/
					DBConnector dbc = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "choitabi", "root", "mysql");
					Connection con = dbc.getConnection();
					editFileFileName = editFileFileName.replace("./img/","img/");

					String sql = "UPDATE tour SET"
							+ " tour_name = ?," //1
							+ " price = ?,"//2
							+ " departure = ?,"//3
							+ " region = ?,"//4
							+ " prefectures = ?,"//5
							+ " theme = ?,"//6
							+ " comment = ?,"//7
							+ " img = ?"//8
							+ " WHERE tour_id = ?;";//9

					PreparedStatement ps = con.prepareStatement(sql);

					ps.setString(1, editTourName);
					ps.setInt(2, Integer.parseInt(editPrice));
					ps.setString(3, editDeparture);
					ps.setString(4, editRegion);
					ps.setString(5,  editPrefectures);
					ps.setString(6, editTheme);
					ps.setString(7, editComment);
					ps.setString(8, editFileFileName);
					ps.setInt(9, Integer.parseInt(editTourId));

					count = ps.executeUpdate();

					/*SQL接続の後片付けです*/
					con.close();
					ps.close();


					/*エラー時の処理です。*/
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

			/*削除チェックのボックスにチェックが入っていた＝ツアーデータ削除の場合*/
			}else if(deleteCheck.equals("true")){

				try{

				/*SQLに接続し、コマンドを実行してもらいます*/
				MySqlConnector msc = new MySqlConnector("choitabi");
				Connection con = msc.getConnection();

				String sql = "DELETE FROM tour WHERE tour_id =  ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, Integer.parseInt(editTourId));
				count = ps.executeUpdate();

				/*SQL接続の後片付けです*/
				con.close();
				ps.close();

				/*エラー時の処理です*/
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

			/*万一、何らかのエラーによってチェックボックスの値がうまく渡ってこなかった場合*/
			}else{
				return 0;
			}


		return count;
	}

}
