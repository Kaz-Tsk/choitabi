package com.internousdev.choitabi.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;


/**
 *  入力された新規ツアーの情報を確認するアクション
 * @author YUKA MATSUMURA
 * @since 2017/09/08
 * @version 1.1
 * */
public class ConfirmTourInsertingAction extends ActionSupport implements ServletRequestAware{

	/*
	 * フォームから入力されたデータに漏れや不適切な部分（価格に文字列が入っている場合など）がないかをチェックし、
	 * OKならばSUCCESSを返します。
	 * */

	/**
	 *シリアルID
	 */
	private static final long serialVersionUID = 6481205050973520069L;

	/**
	 * 新規ツアー名
	 * */
	private String newTourName;

	/**
	 * 新規ツアーの価格
	 * */
	private String newPrice;

	/**
	 * 新規ツアーの出発地
	 * */
	private String newDeparture;

	/**
	 * 新規ツアーのエリア
	 * */
	private String newRegion;

	/**
	 * 新規ツアーの都道府県
	 * */
	private String newPrefectures;

	/**
	 * 新規ツアーのテーマ
	 * */
	private String newTheme;

	/**
	 * 新規ツアーのコメント
	 * */
	private String newComment;

	/**
	 * エラーメッセージ
	 * */
	private String errorMsg="";

	/*画像アップロード処理に必要な変数*/

    /**
     * リクエスト
     */
    private HttpServletRequest request;

    /**
     * 画像のファイルデータ
     * */
    private File newFile;

	/**
	 * 新規ツアーの画像URL/名前
	 * */
	private String newFileFileName;

	/**
	 * 新規ツアー画像のファイル形式
	 * */
	public String newFileContentType;


	/**
	 * 入力された新規ツアーの情報を確認するメソッド
	 * @return result(SUCCESS / ERROR)
	 * */
	public String execute(){
		String result = ERROR;

		/*もし、画像に何も指定されていなかったら、デフォルトで「NO IMAGE」の画像を入れます。*/
		if(newFile == null || newFile.length() == 0){
			newFileFileName = "img/no_image.jpg";
		}else{

			//テスト中-----------------------------------------------
			/*送られてきたリクエストから、画像の送り先ディレクトリを取得する*/

			try{
				String basePath = request.getServletContext().getRealPath("/");

				File destFile = new File(basePath + "img", newFileFileName);//このパスの場所に、この名前で画像を保存したい。
				FileUtils.copyFile(newFile, destFile);
				newFileFileName = "./img/" + newFileFileName;


			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (NullPointerException e2){
				e2.printStackTrace();
			}
		}




		//-------------------------------------------------

		try{
			if (	newTourName.equals("") || newPrice.equals("") || newDeparture.equals("") ||
				newRegion == null || newPrefectures.equals("") || newTheme == null || newComment.equals("") ) {

				errorMsg = "未入力の情報があります";

			}else{
				/*価格・定員に関して、入力された情報が数値に変換できるかをチェックしています。
				 * 変換できればOK。変換できない＝例外が起きた場合は、例外処理でエラーメッセージの表示に飛びます*/
				if(Integer.parseInt(newPrice) < 1){
					errorMsg = "価格は1円以上に設定してください";
				}
			}

		}catch(NumberFormatException e){
			errorMsg = "価格の欄には数値を入力してください";
		}catch(NullPointerException e){
			e.printStackTrace();
		}


		if(errorMsg.equals("")){
			result = SUCCESS;
		}
		return result;

	}

	/*以下、変数のgetter/setter-----------------------------------------------------*/

	/**
	 * 新規ツアー名を取得するメソッド
	 * @return newTourName 新規ツアー名
	 * */
	public String getNewTourName(){
		return newTourName;
	}

	/**
	 * 新規ツアー名を格納するメソッド
	 * @param newTourName 新規ツアー名
	 * */
	public void setNewTourName(String newTourName){
		this.newTourName = newTourName;
	}

	/**
	 * 新規ツアーの価格を取得するメソッド
	 * @return newPrice 新規ツアーの価格
	 * */
	public String getNewPrice(){
		return newPrice;
	}

	/**
	 * 新規ツアーの価格を格納するメソッド
	 * @param newPrice 新規ツアーの価格
	 * */
	public void setNewPrice(String newPrice){
		this.newPrice = newPrice;
	}

	/**
	 * 新規ツアーの出発地を取得するメソッド
	 * @return newDeparture 新規ツアーの出発地
	 * */
	public String getNewDeparture(){
		return newDeparture;
	}

	/**
	 * 新規ツアーの出発地を格納するメソッド
	 * @param newDeparture 新規ツアーの出発地
	 * */
	public void setNewDeparture(String newDeparture){
		this.newDeparture = newDeparture;
	}

	/**
	 * 新規ツアーのエリアを取得するメソッド
	 * @return newRegion 新規ツアーのエリア
	 * */
	public String getNewRegion(){
		return newRegion;
	}

	/**
	 * 新規ツアーのエリアを格納するメソッド
	 * @param newRegion 新規ツアーのエリア
	 * */
	public void setNewRegion(String newRegion){
		this.newRegion = newRegion;
	}

	/**
	 * 新規ツアーの都道府県を取得するメソッド
	 * @return newPrefectures 新規ツアーの都道府県
	 * */
	public String getNewPrefectures(){
		return newPrefectures;
	}

	/**
	 * 新規ツアーの都道府県を格納するメソッド
	 * @param newPrefectures 新規ツアーの都道府県
	 * */
	public void setNewPrefectures(String newPrefectures){
		this.newPrefectures = newPrefectures;
	}

	/**
	 * 新規ツアーのテーマを取得するメソッド
	 * @return newTheme 新規ツアーのテーマ
	 * */
	public String getNewTheme(){
		return newTheme;
	}

	/**
	 * 新規ツアーのテーマを格納するメソッド
	 * @param newTheme 新規ツアーのテーマ
	 * */
	public void setNewTheme(String newTheme){
		this.newTheme = newTheme;
	}

	/**
	 *新規ツアーのコメントを取得するメソッド
	 *@return newComment 新規ツアーのコメント
	 * */
	public String getNewComment(){
		return newComment;
	}

	/**
	 *新規ツアーのコメントを格納するメソッド
	 *@param newComment 新規ツアーのコメント
	 * */
	public void setNewComment(String newComment){
		this.newComment = newComment;
	}



	/*エラーメッセージのgetter/setter------------------*/


	/**
	 * エラーメッセージを取得するメソッド
	 * @return errorMsg エラーメッセージ
	 * */
	public String getErrorMsg(){
		return errorMsg;
	}

	/**
	 * エラーメッセージを格納するメソッド
	 * @param errorMsg エラーメッセージ
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
     * @return newFile 画像のファイルデータ
     * */
     public File getNewFile(){
    	 return newFile;
     }

     /**
      * 画像のファイルデータを格納するメソッド
      * @return fileFile 画像のファイルデータ
      * */
      public void setNewFile(File newFile){
     	 this.newFile =  newFile;
      }


  	/**
  	 *新規ツアーの画像URLを取得するメソッド
  	 *@return newFileFileName 新規ツアーの画像URL
  	 * */
  	public String getNewFileFileName(){
  		return newFileFileName;
  	}

  	/**
  	 *新規ツアーの画像URLを格納するメソッド
  	 *@param newFileFileName 新規ツアーの画像URL
  	 * */
  	public void setNewFileFileName(String newFileFileName){
  		this.newFileFileName = newFileFileName;
  	}

  	/**
  	 * 新規ツアー画像のファイル形式を取得するメソッド
  	 * @return newFileContentType 新規ツアー画像のファイル形式
  	 * */
  	public String getNewFileContentType(){
  		return newFileContentType;
  	}

  	/**
  	 * 新規ツアー画像のファイル形式を格納するメソッド
  	 * @return newFileContentType 新規ツアー画像のファイル形式
  	 * */
  	public void setNewFileContentType(String newFileContentType){
  		this.newFileContentType  = newFileContentType;
  	}








}
