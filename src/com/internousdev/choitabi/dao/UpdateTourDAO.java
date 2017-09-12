package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.choitabi.util.DBConnector;

public class UpdateTourDAO {

	/**@author : YUKA MATSUMURA
	 * @since : 2017/09/08
	 * @version : 1.1
	 *
	 * 管理画面で、編集画面から入力したツアーの編集情報を、実際にSQLのDBに書き込むクラスです。（削除操作も含みます）
	 * 呼び出しているクラス…UpdateTourAction.java
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * */

	public int updateTour(String editTourId, String editTourName,String editPrice,
	                           String editPersons, String editDeparture, String editRegion, String editPrefectures,
	                           String editTheme, String editComment, String editImg,
	                           String deleteCheck)throws IllegalAccessException, InstantiationException{
		int count = 0;

		/*Date today = new Date();
		*SimpleDateFormat sdf  = new SimpleDateFormat("yyyyMMdd");
		*String formatedToday = sdf.format(today);
		*
		*※↑ 商品編集の「最終編集日」なんかでその日の日付をSQL文に入れるための文でした。
		*取得した日付はものすごく長い（または別の形の）データになっているようで、そのままだとSQLが受け付けてくれません。
		*フォーマットのAPIと文字列の関数を使って「20170101」のような形の文字列にすると、うまく実行してもらえるようです。
		*
		*/

		/*動作確認*/System.out.println("UpdateTourDAO - 現在の削除チェック：" + deleteCheck);

			/*削除チェックのボックスにチェックが入っていない＝ツアーデータ更新の場合*/
			if(deleteCheck.equals("false")){

				try{
					/*SQLに接続し、コマンドを実行してもらいます*/
					DBConnector dbc = new DBConnector();
					Connection con = dbc.createConnection();


					/*動作確認*/
					System.out.println("UpdateTourDAO : " + editTourId);
					System.out.println("UpdateTourDAO : " + editPrice);
					System.out.println("UpdateTourDAO : " + editPersons);

					String sql = "UPDATE tour SET"
							+ " tour_name = ?," //1
							+ " price = ?,"//2
							+ " persons = ?,"//3
							+ " departure = ?,"//4
							+ " region = ?,"//5
							+ " prefectures = ?,"//6
							+ " theme = ?,"//7
							+ " comment = ?,"//8
							+ " img = ?"//9
							+ " WHERE tour_id = ?;";//10

					PreparedStatement ps = con.prepareStatement(sql);
					/*後消し*/System.out.println("UpdateTourDAO - 作成SQL文 : " + sql);
					ps.setString(1, editTourName);
					ps.setInt(2, Integer.parseInt(editPrice));
					ps.setInt(3, Integer.parseInt(editPersons));
					ps.setString(4, editDeparture);
					ps.setString(5, editRegion);
					ps.setString(6,  editPrefectures);
					ps.setString(7, editTheme);
					ps.setString(8, editComment);
					ps.setString(9, editImg);
					ps.setInt(10, Integer.parseInt(editTourId));
					/*後消し*/System.out.println("UpdateTourDAO - 作成SQL文 : " + sql);

					count = ps.executeUpdate();
					/*後消し*/System.out.println("UpdateTourDAO - 取得データ数：" + count);
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

			/*削除チェックのボックスにチェックが入っていた＝ツアーデータ削除の場合*/
			}else if(deleteCheck.equals("true")){

				try{

				/*SQLに接続し、コマンドを実行してもらいます*/
				DBConnector dbc = new DBConnector();
				Connection con = dbc.createConnection();

				String sql = "DELETE FROM tour WHERE tour_id =  ?";/*Update/DELETE文、文法確認中*/
				PreparedStatement ps = con.prepareStatement(sql);
				/*後消し*/System.out.println("UpdateTourDAO - 作成SQL文 : " + sql);
				ps.setInt(1, Integer.parseInt(editTourId));
				count = ps.executeUpdate();
				/*後消し*/System.out.println("UpdateTourDAO - 取得データ数：" + count);
				/*SQL接続の後片付けです*/
				con.close();
				ps.close();

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

			/*万一、何らかのエラーによってチェックボックスの値がうまく渡ってこなかった場合*/
			}else{
				/*後消し*/System.out.println("UpdateTourDAO - エラー：チェックボックスの値が反映されていません");
				return 0;
			}


		return count;
	}

}
