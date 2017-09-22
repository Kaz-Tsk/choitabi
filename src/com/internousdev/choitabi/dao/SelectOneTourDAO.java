package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.choitabi.dto.SelectTourDTO;
import com.internousdev.util.DBConnector;

/**
 * DBから1件分のツアー情報を検索・取得するDAOクラス
 * @author YUKA MATSUMURA
 * @since 2017/09/06
 * @version 1.1
 * */
public class SelectOneTourDAO {

	/**
	 * ツアー1件分の情報を検索・取得するメソッド
	 * @author YUKA MATSUMURA
	 * @since 2017/09/06
	 * @version 1.1
	 * @param toutId ツアーID
	 * @return SelectTourDTO ツアー1件分の情報を格納したDTOクラスのインスタンス
	 * */
	public SelectTourDTO selectOneTour(int tourId){

		SelectTourDTO stdto = null;

		try{
			/*SQLに接続し、コマンドを実行してもらいます*/
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
			 * エラーが出たら、返すDTOをnull=ツアー無しと合図させ、
			 * アクションクラスにSUCCESSとERRORを見分けさせます。
			 * */
			}catch(SQLException e){
				e.printStackTrace();
				return null;

			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
	}

}
