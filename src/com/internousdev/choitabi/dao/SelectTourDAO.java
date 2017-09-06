package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.SelectTourDTO;

import src.com.internousdev.choitabi.util.DBConnecter;

public class SelectTourDAO {


	/* @author:YUKA MATSUMURA
	 * @since:2017/09/05
	 * @version:1.1
	 * */


	String tour_name = "ツアー";


	public ArrayList<SelectTourDTO> selectTour(String selectWord){

		/*呼び出し元に返すツアー情報のリストを作ります*/
			ArrayList<SelectTourDTO> allTourList = new ArrayList<SelectTourDTO>();

		try{
			/*SQLに接続し、コマンドを実行してもらいます*/
			DBConnecter tdc = new DBConnecter();
			Connection con = tdc.createConnection();
			String sql = "SELECT * FROM tour WHERE tour_name LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			/*後消し*/System.out.println("DAO : " + sql);
			ps.setString(1, "%" + selectWord + "%");
			ResultSet rs = ps.executeQuery();


			while(rs.next()){
				/*DBから検索された内容を、dtoに一つずつしまって、リストにしていきます*/
				/*箱を用意する→データ一式を入れる→リストに追加→また新しい箱を用意する…を必要な分だけ繰り返す処理*/
				SelectTourDTO tstdto = new SelectTourDTO();

				tstdto.setTourName(rs.getString("tour_name"));
				tstdto.setTourId(rs.getInt("tour_id"));
				tstdto.setPrice(rs.getInt("price"));
				tstdto.setPersons(rs.getInt("persons"));
				tstdto.setDate(rs.getString("date")); /*これString型で動くんだ……*/
				tstdto.setDeparture(rs.getString("departure"));
				allTourList.add(tstdto);
			}

			/*SQL接続の後片付けです*/
			con.close();
			ps.close();
			rs.close();

			/*作ったリストを、呼び出し元に返します*/
			/*後消し*/System.out.println("SelectTourDAO - 該当データ数 : " + allTourList.size());
			return allTourList;


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
