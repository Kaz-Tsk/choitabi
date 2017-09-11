package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.choitabi.dto.SelectTourDTO;
import com.internousdev.choitabi.util.DBConnector;
public class SelectOneTourDAO {


	/*@author YUKA MATSUMURA
	 * @since 2017/09/06
	 * @version 1.1
	 *
	 *DBからツアー1件分の情報を検索するためのクラスです。管理者画面のツアー編集・削除操作で使います。
	 * */



	public SelectTourDTO selectOneTour(int tourId){

		SelectTourDTO dto = null;
		/*後消し*/System.out.println("SlectOneTour - tourId : " + tourId);

		try{
			/*SQLに接続し、コマンドを実行してもらいます*/
			DBConnector tdc = new DBConnector();
			Connection con = tdc.createConnection();
			String sql = "SELECT * FROM tour WHERE tour_id =  ?";
			PreparedStatement ps = con.prepareStatement(sql);
			/*後消し*/System.out.println("DAO : " + sql);
			ps.setInt(1, tourId);
			ResultSet rs = ps.executeQuery();


			if(rs.next()){
				dto = new SelectTourDTO();

				dto.setTourName(rs.getString("tour_name"));
				dto.setTourId(rs.getInt("tour_id"));
				dto.setPrice(rs.getInt("price"));
				dto.setPersons(rs.getInt("persons"));
				//dto.setDate(rs.getString("date")); /*これString型で動くんだ……*/
				dto.setDeparture(rs.getString("departure"));
			}

			/*SQL接続の後片付けです*/
			con.close();
			ps.close();
			rs.close();

			return dto;


			/*以下はエラー時の処理です。
			 * エラーが出たら、返すリストをnull=「リスト作れなかったよ」と合図させ、SUCCESSとERRORを見分けます。
			 * */
			}catch(SQLException e){
				System.out.println("SQL上でエラーが発生しました");
				e.printStackTrace();
				return null;

			} catch (IllegalAccessException e) {
				System.out.println("アクセスエラーです");
				e.printStackTrace();
				return null;

			} catch (InstantiationException e) {
				System.out.println("ドライバのロードに失敗しました");
				e.printStackTrace();
				return null;

			}catch(Exception e){
				System.out.println("その他のエラーです");
				return null;
			}
	}

}
