package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.SelectTourDTO;

import src.com.internousdev.choitabi.util.DBConnecter;

public class SelectTourDAO {

	/*作成者：松村
	 * 管理画面のツアー管理で使用するDAOクラスのテスト版です。
	 * SQLと接続し「Test_SelectTourDTO」クラスの雛形にデータを入れて返します。
	 */

	 // ↓単体で動きを確認するためのメインメソッドです。サイトを起動した際勝手に動いてしまうと大変なので、普段はコメントにしています。
//	public static void main(String[] args){
//		Test_SelectTourDAO dao = new Test_SelectTourDAO();
//		dao.selectTour();
//	}

	String tour_name = "ツアー";


	public ArrayList<SelectTourDTO> selectTour(){

		/*呼び出し元に返すツアー情報のリストを作ります*/
			ArrayList<SelectTourDTO> allTourList = new ArrayList<SelectTourDTO>();

		try{
			/*SQLに接続し、コマンドを実行してもらいます*/
			DBConnecter tdc = new DBConnecter();
			Connection con = tdc.createConnection();
			String sql = "SELECT * FROM tour";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("DAO : " + sql);
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
				/*↓System.out…挙動チェック用の記述です */
				System.out.println("Test_SelectTourDAO:" + tstdto.getTourName());
				System.out.println("Test_SelectTourDAO:" + tstdto.getDate());
				allTourList.add(tstdto);
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
			}






	}

}
