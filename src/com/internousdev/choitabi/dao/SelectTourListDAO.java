package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.SelectTourDTO;
import com.internousdev.util.DBConnector;

public class SelectTourListDAO {


	/** @author:YUKA MATSUMURA
	 * @since:2017/09/05
	 * @version:1.1
	 *
	 * 管理側で、ツアーの一覧を表示するときに使うDAO。
	 * 「IndicateTourListAction」はこれを使って表示するデータを用意しています。
	 * */


	public ArrayList<SelectTourDTO> selectTourList(String selectWord, String selectTheme){

		/*呼び出し元に返すツアー情報のリストを作ります*/
			ArrayList<SelectTourDTO> allTourList = new ArrayList<SelectTourDTO>();

		try{
			/*SQLに接続し、コマンドを実行してもらいます*/
			DBConnector dbc = new DBConnector("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/", "choitabi", "root", "mysql");
			Connection con = dbc.getConnection();
			String sql = "SELECT * FROM tour WHERE tour_name LIKE ? AND theme LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + selectWord + "%");
			ps.setString(2, "%" + selectTheme + "%");
			ResultSet rs = ps.executeQuery();


			while(rs.next()){
				/*DBから検索された内容を、dtoに一つずつしまって、リストにしていきます*/
				/*箱を用意する→データ一式を入れる→リストに追加→また新しい箱を用意する…を必要な分だけ繰り返す処理*/
				SelectTourDTO stdto = new SelectTourDTO();

				stdto.setTourId(rs.getInt("tour_id"));
				stdto.setTourName(rs.getString("tour_name"));
				stdto.setPrice(rs.getInt("price"));
				stdto.setDeparture(rs.getString("departure"));
				stdto.setRegion(rs.getString("region"));
				stdto.setPrefectures(rs.getString("prefectures"));
				stdto.setTheme(rs.getString("theme"));
				stdto.setComment(rs.getString("comment"));
				stdto.setImg(rs.getString("img"));

				allTourList.add(stdto);
			}

			/*SQL接続の後片付けです*/
			con.close();
			ps.close();
			rs.close();

			/*作ったリストを、呼び出し元に返します*/
			return allTourList;


			/*以下はエラー時の処理です。
			 * エラーが出たら、返すリストをnull=「リスト作れなかったよ」と合図させ、SUCCESSとERRORを見分けます。
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
