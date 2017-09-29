package com.internousdev.choitabi.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ツアー編集画面で入力された内容を確認するアクション。
 * @author YUKA MATSUMURA
 * @since 2017/09/07
 * @version 1.1
 * */
public class ConfirmTourEditingAction extends ActionSupport implements ServletRequestAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -1258679400956968932L;


	/**
	 * 編集前（選択した）のツアーID
	 * */
	private int currentTourId;

	/**
	 * 編集前のツアー名
	 * */
	private String currentTourName;

	/**
	 * 編集前の価格
	 * */
	private int currentPrice;

	/**
	 * 編集前の出発地
	 * */
	private String currentDeparture;

	/**
	 * 編集前のエリア
	 * */
	private String currentRegion;

	/**
	 * 編集前の都道府県
	 * */
	private String currentPrefectures;

	/**
	 * 編集前のテーマ
	 * */
	private String currentTheme;

	/**
	 * 編集前のコメント
	 * */
	private String currentComment;

	/**
	 *編集前の画像URL
	 * */
	private String currentImg;



	/*編集後の情報＝入力されたデータを格納する変数です(すべて文字列として受け取るようにしています)
	 * 編集画面から、価格・人数を入れる欄に文字列を入力したところ、javaに渡される際に数値に変換できずStrutsエラーがでてしまいました。
	 * そのため、一度文字列として受け取らせ、javaのInteger.Parseint()関数を使って数値に変換するステップを踏んでいます。
	 *
	 *こっちには、ツアーIDはありません。
	 * （IDは変わらない＝現在のデータだけを保持すればOKなので）
	 * 「UodateTourAction」まで、↑で用意したcurrentTourIdを持っていきます。*/

	/**
	 *編集後のツアー名
	 * */
	private String editTourName;

	/**
	 *編集後の価格
	 * */
	private String editPrice;

	/**
	 *編集後の出発地
	 * */
	private String editDeparture;

	/**
	 *編集後のエリア
	 * */
	public String editRegion;

	/**
	 *編集後の都道府県
	 * */
	public String editPrefectures;

	/**
	 *編集後のテーマ
	 * */
	public String editTheme;

	/**
	 *編集後のコメント
	 * */
	public String editComment;


	/**
	 * 削除用チェックボックスの状態
	 * */
	private String deleteCheck = "false";

	/**
	 * エラーメッセージ
	 * */
	private String errorMsg = "";


	/*default変数（確認ボタンを押してエラーが出た場合、これがないとフォームが空っぽに戻ってしまう）*
		/*↓入力画面で、フォームに最初から入っている情報。最初は「編集前」と同じものが、確認画面から戻ったときは編集した内容が入ってきます。--------------------------------------------*/


	/**
	 *フォームに表示するツアー名
	 * */
	private String defaultTourName;

	/**
	 *フォームに表示する価格
	 * */
	private int defaultPrice;

	/**
	 *フォームに表示する出発地
	 * */
	private String defaultDeparture;

	/**
	 *フォームに表示するエリア
	 * */
	public String defaultRegion;

	/**
	 *フォームに表示する都道府県
	 * */
	public String defaultPrefectures;

	/**
	 *フォームに表示するテーマ
	 * */
	public String defaultTheme;

	/**
	 *フォームに表示するコメント
	 * */
	public String defaultComment;




	/*画像アップロード処理に必要な変数--------------------*/

    /**
     * リクエスト
     */
    private HttpServletRequest request;

    /**
     * 画像のファイルデータ
     * */
    private File editFile;

	/**
	 * 編集後ツアーの画像名
	 * */
	private String editFileFileName;

	/**
	 * 編集後ツアー画像のファイル形式
	 * */
	public String editFileContentType;





	/**
	 *入力内容を確認するメソッド。
	 * *@author YUKA MATSUMURA
	 * @since 2017/09/07
	 * @return result (SUCCESS/ERROR)
	 * */
	public String execute(){
		String result = ERROR;

		/*最初に画像の処理*/
		/*もし、画像URLに何も書かれていなかったら、デフォルトの「NO IMAGE」画像のURLを入れておきます。*/
		if(editFile == null || editFile.length() == 0){
			editFileFileName = "img/no_image.jpg";
		}else{

			try{
				/*送られてきたリクエストから、画像の送り先ディレクトリを取得する*/
				String basePath = request.getServletContext().getRealPath("/");

				File destFile = new File(basePath + "img", editFileFileName);//このパスの場所に、この名前で画像を保存したい。
				FileUtils.copyFile(editFile, destFile);
				editFileFileName = "./img/" + editFileFileName;


			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (NullPointerException e2){
				e2.printStackTrace();
			}
		}

		/*ここから、フォームに入力された値のチェック*/
		//削除のチェックボックスにチェックが入っていたら、そのままSUCCESS
		if(deleteCheck.equals("true")){
			result = SUCCESS;
		}

				//チェックが入っていなかった場合は、編集内容の入力チェック。
			try{
				if (	editTourName.equals("") || editPrice.equals("") || editDeparture.equals("") ||
						editRegion == null || editPrefectures.equals("") || editTheme == null || editComment.equals("") ) {

					errorMsg = "未入力の情報があります";
					defaultTourName = editTourName;
					defaultPrice = Integer.parseInt(editPrice);
					defaultDeparture = editDeparture;
					defaultRegion = editRegion;
					defaultPrefectures = editPrefectures;
					defaultTheme = editTheme;
					defaultComment = editComment;

				}else{
					/*価格・定員に関して、入力された情報が数値に変換できるかをチェックしています。
					 * 変換できればOK。変換できない＝例外が起きた場合は、例外処理でエラーメッセージの表示に飛びます*/
					defaultTourName = editTourName;
					defaultPrice = Integer.parseInt(editPrice);
					defaultDeparture = editDeparture;
					defaultRegion = editRegion;
					defaultPrefectures = editPrefectures;
					defaultTheme = editTheme;
					defaultComment = editComment;



					if(Integer.parseInt(editPrice) < 1){
						errorMsg = "価格は1円以上に設定してください";
					}
				}

			}catch(NumberFormatException e){
				errorMsg = "価格の欄には数値を入力してください";
				defaultTourName = editTourName;
				defaultPrice = currentPrice; //ここだけ編集前の価格に戻るようにしています。;
				defaultDeparture = editDeparture;
				defaultRegion = editRegion;
				defaultPrefectures = editPrefectures;
				defaultTheme = editTheme;
				defaultComment = editComment;
			}catch(NullPointerException e){
				e.printStackTrace();
			}

			/*エラーメッセージが空白だったら、OKとしてSUCCESSを返します*/
			if(errorMsg.equals("")){
				result = SUCCESS;
			}

			return result;

		}



	/*編集前の情報のgetter/setter---------------------------------------------*/

	/**
	 * 編集前のツアーIDを取得するメソッド
	 * @return currentTourId 編集前のツアーID
	 * */
	public int getCurrentTourId(){
		return currentTourId;
	}

	/**
	 *編集前のツアーIDを格納するメソッド
	 *@param currentTourId 編集前のツアーID
	 * */
	public void setCurrentTourId(int currentTourId){
		this.currentTourId = currentTourId;
	}

	/**
	 *編集前のツアー名を取得するメソッド
	 *@return currentTourName 編集前のツアー名
	 * */
	public String getCurrentTourName(){
		return currentTourName;
	}

	/**
	 *編集前のツアー名を格納するメソッド
	 *@param currentTourName 編集前のツアー名
	 * */
	public void setCurrentTourName(String currentTourName){
		this.currentTourName = currentTourName;
	}

	/**
	 *編集前の価格を取得するメソッド
	 *@return currentprice 編集前の価格
	 * */
	public int getCurrentPrice(){
		return currentPrice;
	}

	/**
	 *編集前の価格を格納するメソッド
	 *@param 編集前の価格
	 * */
	public void setCurrentPrice(int currentPrice){
		this.currentPrice = currentPrice;
	}

	/**
	 *編集前の出発地を取得するメソッド
	 *@retrurn currentDeparture 編集前の出発地
	 * */
	public String getCurrentDeparture(){
		return currentDeparture;
	}

	/**
	 *編集前の出発地を格納するメソッド
	 *@param curentDeparture 編集前の出発地
	 * */
	public void setCurrentDeparture(String currentDeparture){
		this.currentDeparture = currentDeparture;
	}

	/**
	 *編集前のエリアを取得するメソッド
	 *@return currentRegion 編集前のエリア
	 * */
	public String getCurrentRegion(){
		return currentRegion;
	}

	/**
	 *編集前のエリアを格納するメソッド
	 *@param currentRegion 編集前のエリア
	 * */
	public void setCurrentRegion(String currentRegion){
		this.currentRegion = currentRegion;
	}

	/**
	 *編集前の都道府県を取得するメソッド
	 *@return currentPrefectures 編集前の都道府県
	 * */
	public String getCurrentPrefectures(){
		return currentPrefectures;
	}

	/**
	 *編集前の都道府県を格納するメソッド
	 *@param currentPrefectures 編集前の都道府県
	 * */
	public void setCurrentPrefectures(String currentPrefectures){
		this.currentPrefectures = currentPrefectures;
	}

	/**
	 *編集前のテーマを取得するメソッド
	 *@return currentTheme 編集前
	 * */
	public String getCurrentTheme(){
		return currentTheme;
	}

	/**
	 *編集前のテーマを格納するメソッド
	 *@param currentTheme 編集前のテーマ
	 * */
	public void setCurrentTheme(String currentTheme){
		this.currentTheme = currentTheme;
	}

	/**
	 *編集前のコメントを取得するメソッド
	 *@return currentComment 編集前のコメント
	 * */
	public String getCurrentComment(){
		return currentComment;
	}

	/**
	 *編集前のコメントを格納するメソッド
	 *@param currentComment 編集前のコメント
	 * */
	public void setCurrentComment(String currentComment){
		this.currentComment = currentComment;
	}

	/**
	 *編集前の画像URLを取得するメソッド
	 *@return currentImg 編集前の画像URL
	 * */
	public String getCurrentImg(){
		return currentImg;
	}

	/**
	 *編集前の画像URLを格納するメソッド
	 *@param currentImg 編集前の画像URL
	 * */
	public void setCurrentImg(String currentImg){
		this.currentImg = currentImg;
	}



	/*編集後の情報のgetter/setter---------------------------------------------*/

	/**
	 *編集後のツアー名を取得するメソッド
	 *@return editTourName 編集後のツアー名
	 * */
	public String getEditTourName(){
		return editTourName;
	}

	/**
	 *編集後のツアー名を格納するメソッド
	 *@param editTourName 編集後のツアー名
	 * */
	public void setEditTourName(String editTourName){
		this.editTourName = editTourName;
	}

	/**
	 *編集後の価格を取得するメソッド
	 *@return editPrice 編集後の価格
	 * */
	public String getEditPrice(){
		return editPrice;
	}

	/**
	 *編集後の価格を格納するメソッド
	 *@parama editPrice 編集後の価格
	 * */
	public void setEditPrice(String editPrice){
			this.editPrice = editPrice;
	}

	/**
	 *編集後の出発地を取得するメソッド
	 *@return editDeparture 編集後の出発地
	 * */
	public String getEditDeparture(){
		return editDeparture;
	}

	/**
	 *編集後の出発地を格納するメソッド
	 *@param editDeparture 編集後の出発地
	 * */
	public void setEditDeparture(String editDeparture){
		this.editDeparture = editDeparture;
	}

	/**
	 *編集後のエリアを取得するメソッド
	 *@return editRegion 編集後のエリア
	 * */
	public String getEditRegion(){
		return editRegion;
	}

	/**
	 *編集後のエリアを格納するメソッド
	 *@param editRegion 編集後のエリア
	 * */
	public void setEditRegion(String editRegion){
		this.editRegion = editRegion;
	}

	/**
	 *編集後の都道府県を取得するメソッド
	 *@return editPrefrectures 編集後の都道府県
	 * */
	public String getEditPrefectures(){
		return editPrefectures;
	}

	/**
	 *編集後の都道府県を格納するメソッド
	 *@param editPrefectures 編集後の都道府県
	 * */
	public void setEditPrefectures(String editPrefectures){
		this.editPrefectures = editPrefectures;
	}

	/**
	 *編集後のテーマを取得するメソッド
	 *@return editTheme 編集後のテーマ
	 * */
	public String getEditTheme(){
		return editTheme;
	}

	/**
	 *編集後のテーマを格納するメソッド
	 *@param editTheme 編集後のテーマ
	 * */
	public void setEditTheme(String editTheme){
		this.editTheme = editTheme;
	}

	/**
	 *編集後のコメントを取得するメソッド
	 *@return editComment 編集後のコメント
	 * */
	public String getEditComment(){
		return editComment;
	}

	/**
	 *編集後のコメントを格納するメソッド
	 *@param editComment 編集後のコメント
	 * */
	public void setEditComment(String editComment){
		this.editComment = editComment;
	}



	/*フォームに入る情報のgetter/setter---------------------------------------------*/

	/**
	 *フォームに表示するツアー名を取得するメソッド
	 *@return defaultTourName フォームに表示するツアー名
	 * */
	public String getDefaultTourName(){
		return defaultTourName;
	}

	/**
	 *フォームに表示するツアー名を格納するメソッド
	 *@param defaultTourName フォームに表示するツアー名
	 * */
	public void setDefaultTourName(String defaultTourName){
		this.defaultTourName = defaultTourName;
	}

	/**
	 *フォームに表示する価格を取得するメソッド
	 *@return defaultPrice フォームに表示する価格
	 * */
	public int getDefaultPrice(){
		return defaultPrice;
	}

	/**
	 *フォームに表示する価格を格納するメソッド
	 *@param defaultPrice フォームに表示する価格
	 * */
	public void setDefaultPrice(int defaultPrice){
		this.defaultPrice = defaultPrice;
	}

	/**
	 *フォームに表示する出発地を取得するメソッド
	 *@return defaultDeparture フォームに表示する出発地
	 * */
	public String getDefaultDeparture(){
		return defaultDeparture;
	}

	/**
	 *フォームに表示する出発地を格納するメソッド
	 *@param defaultDeparture フォームに表示する出発地
	 * */
	public void setDefaultDeparture(String defaultDeparture){
		this.defaultDeparture = defaultDeparture;
	}

	/**
	 *フォームに表示するエリアを取得するメソッド
	 *@return defaultRegion フォームに表示するエリア
	 * */
	public String getDefaultRegion(){
		return defaultRegion;
	}

	/**
	 *フォームに表示するエリアを格納するメソッド
	 *@return defaultRegion フォームに表示するエリア
	 * */
	public void setDefaultRegion(String defaultRegion){
		this.defaultRegion = defaultRegion;
	}

	/**
	 *フォームに表示する都道府県を取得するメソッド
	 *@return defaultPrefectures フォームに表示する都道府県
	 * */
	public String getDefaultPrefectures(){
		return defaultPrefectures;
	}

	/**
	 *フォームに表示する都道府県を格納するメソッド
	 *@param defaultPrefectures フォームに表示する都道府県
	 * */
	public void setDefaultPrefectures(String defaultPrefectures){
		this.defaultPrefectures = defaultPrefectures;
	}

	/**
	 *フォームに表示するテーマを取得するメソッド
	 *@return defaultTheme フォームに表示するテーマ
	 * */
	public String getDefaultTheme(){
		return this.defaultTheme;
	}

	/**
	 *フォームに表示するテーマを格納するメソッド
	 *@param defaultTheme フォームに表示するテーマ
	 * */
	public void setDefaultTheme(String defaultTheme){
		this.defaultTheme = defaultTheme;
	}

	/**
	 *フォームに表示するコメントを取得するメソッド
	 *@return defaultComment フォームに表示するコメント
	 * */
	public String getDefaultComment(){
		return defaultComment;
	}

	/**
	 *フォームに表示するコメントを格納するメソッド
	 *@param defaultComment フォームに表示するコメント
	 * */
	public void setDefaultComment(String defaultComment){
		this.defaultComment = defaultComment;
	}



	/*編集時のチェック項目（削除チェックボックス、エラーメッセージ）のgetter/setter--------------------*/

	/**
	 *削除用チェックボックスの状態を取得するメソッド
	 *@return deleteCheck 削除用チェックボックスの状態
	 * */
	public String getDeleteCheck(){
		return deleteCheck;
	}

	/**
	 *削除用チェックボックスの状態を格納するメソッド
	 *@param deleteCheck 削除用チェックボックスの状態
	 * */
	public void setDeleteCheck(String deleteCheck){
		this.deleteCheck = deleteCheck;
	}

	/**
	 *エラーメッセージを取得するメソッド
	 *@return errorMsg エラーメッセージ
	 * */
	public String getErrorMsg(){
		return errorMsg;
	}

	/**
	 *エラーメッセージを格納するメソッド
	 *@param errorMsg
	 * */
	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}

	/*画像アップロードに使う変数のgetter/setter----*/

    /**リクエストを取得するメソッド
     * @return request リクエスト
     */
    public HttpServletRequest getRequest() {
        return request;
    }

    /**
     * リクエストを格納するメソッド
     * @param request リクエスト
     */
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    /**
     * 画像のファイルデータを取得するメソッド
     * @return editFile 画像のファイルデータ
     * */
     public File getEditFile(){
    	 return editFile;
     }

     /**
      * 画像のファイルデータを格納するメソッド
      * @return fileFile 画像のファイルデータ
      * */
      public void setEditFile(File editFile){
     	 this.editFile =  editFile;
      }


  	/**
  	 *新規ツアーの画像名を取得するメソッド
  	 *@return editFileFileName 新規ツアーの画像名
  	 * */
  	public String getEditFileFileName(){
  		return editFileFileName;
  	}

  	/**
  	 *新規ツアーの画像名を格納するメソッド
  	 *@param editFileFileName 新規ツアーの画像名
  	 * */
  	public void setEditFileFileName(String editFileFileName){
  		this.editFileFileName = editFileFileName;
  	}

  	/**
  	 * 新規ツアー画像のファイル形式を取得するメソッド
  	 * @return editFileContentType 新規ツアー画像のファイル形式
  	 * */
  	public String getEditFileContentType(){
  		return editFileContentType;
  	}

  	/**
  	 * 新規ツアー画像のファイル形式を格納するメソッド
  	 * @return editFileContentType 新規ツアー画像のファイル形式
  	 * */
  	public void setEditFileContentType(String editFileContentType){
  		this.editFileContentType  = editFileContentType;
  	}





}
