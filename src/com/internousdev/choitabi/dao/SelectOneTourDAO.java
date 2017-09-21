package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.choitabi.dto.SelectTourDTO;
import com.internousdev.util.DBConnector;
public class SelectOneTourDAO {


	/**@author YUKA MATSUMURA
	 * @since 2017/09/06
	 * @version 1.1
	 *
	 *DBからツアー1件分の情報を検索するためのクラスです。管理者画面のツアー編集・削除操作で使います。
	 * */



	public SelectTourDTO selectOneTour(int tourId){

		SelectTourDTO stdto = null;
		/*後消し*/System.out.println("SlectOneTour - tourId : " + tourId);

		try{
			/*SQLに接続し、コマンドを実行してもらいます*/
			//ChoitabiDBConnector tdc = new ChoitabiDBConnector();
			DBConnector dbc = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "choitabi", "root", "mysql");
			Connection con = dbc.getConnection();
			String sql = "SELECT * FROM tour WHERE tour_id =  ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, tourId);
			ResultSet rs = ps.executeQuery();


			if(rs.next()){
				stdto = new SelectTourDTO();

				stdto.setTourId(rs.getInt("tour_id"));
				stdto.setTourName(rs.getString("tour_name"));
				stdto.setPrice(rs.getInt("price"));
				stdto.setDeparture(rs.getString("departure"));
				stdto.setRegion(rs.getString("region"));
				stdto.setPrefectures(rs.getString("prefectures"));
				stdto.setTheme(rs.getString("theme"));
				stdto.setComment(rs.getString("comment"));
				stdto.setImg(rs.getString("img"));

			}

			/*SQL接続の後片付けです*/
			con.close();
			ps.close();
			rs.close();

			return stdto;


			/*以下はエラー時の処理です。
			 * エラーが出たら、返すリストをnull=「リスト作れなかったよ」と合図させ、SUCCESSとERRORを見分けます。
			 * */
			}catch(SQLException e){
				System.out.println("SQL上でエラーが発生しました");
				e.printStackTrace();
				return null;

			}catch(Exception e){
				System.out.println("その他のエラーです");
				e.printStackTrace();
				return null;
			}
	}

}
