package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.internousdev.choitabi.util.DBConnector;

public class UpdateTourDAO {

	/**author : YUKA MATSUMURA
	 * @since : 2017/09/08
	 * @version : 1.1
	 *
	 * 管理画面で、編集画面から入力したツアーの編集情報を、実際にSQLのDBに書き込むクラスです。（削除操作も含みます）
	 * 呼び出しているクラス…UpdateTourAction.java
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * */

	public int updateTour(String editTourName, String editTourId, String editPrice, String editPersons, String editDeparture, String deleteCheck) throws IllegalAccessException, InstantiationException{
		int count = 0;

		Date today = new Date();
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyyMMdd");
		String formatedToday = sdf.format(today);
		/*後消し*/System.out.println("UpdateTourDAO - 現在の削除チェック：" + deleteCheck);



			/*削除チェックのボックスにチェックが入っていない＝ツアーデータ更新の場合*/
			if(deleteCheck.equals("false")){

				try{
					/*SQLに接続し、コマンドを実行してもらいます*/
					DBConnector dbc = new DBConnector();
					Connection con = dbc.createConnection();

					String sql = "UPDATE tour SET tour_name =   ?, price = ?, persons = ?, date = ?, departure = ? WHERE tour_id = ?";/*Update/DELETE文、文法確認中*/

					PreparedStatement ps = con.prepareStatement(sql);
					/*後消し*/System.out.println("UpdateTourDAO - 作成SQL文 : " + sql);
					ps.setString(1, editTourName);
					ps.setInt(2, Integer.parseInt(editPrice));
					ps.setInt(3, Integer.parseInt(editPersons));
					ps.setString(4, formatedToday);
					/*後消し*/System.out.println("UpdateTourDAO - 更新後の日付データ：" + formatedToday);
					ps.setString(5,editDeparture);
					ps.setInt(6, Integer.parseInt(editTourId));

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

			/*削除チェックのボック氏にチェックが入っていた＝ツアーデータ削除の場合*/
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
			}


		return count;
	}

}
