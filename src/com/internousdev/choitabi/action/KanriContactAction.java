package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.KanriContactDAO;
import com.internousdev.choitabi.dto.KanriContactDTO;
import com.internousdev.choitabi.util.KanriContactPagenation;
import com.internousdev.choitabi.util.KanriContactPagenation2;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品の情報をセレクトするアクション
 * @author KANAKO MIYAZONO
 * @since 2017/9/11
 * @version 1.1
 * @par
 */
public class KanriContactAction extends ActionSupport {

    /**
	 * シリアルナンバーの生成
	 */
private static final long serialVersionUID = 1713916660493018447L;






 /**
     * 検索された単語
     */
    private String searchName;

    /**

    /**
     * ユーザー名
     */
    private String contact_name;

    /**
     * メールアドレス
     */
    private String contact_mailAddress;

    /**
     * 問い合わせ内容
     */
    private String contact_contents;



    /**
     * 検索結果リスト
     */
    private ArrayList<KanriContactDTO> searchList=new ArrayList<KanriContactDTO>();

    /**

    /**
     * MongoDBからのデータを格納したリスト
     */
    private ArrayList<KanriContactDTO> contactList;

    /**
     * ページネーション
     */
    private int maxPage;
    private int pageNum =1;//とりあえず1にしておきます。
    private int number;
    public ArrayList<KanriContactDTO> displayList = new ArrayList<KanriContactDTO>();



    /**
     * 問い合わせ情報を取得するメソッド
     * @author KANAKO MIYAZONO
     * @since 2017/09/11
     * @version 1.1
     * @return ERROR、SUCCESS
     */
	 public String execute() {
         String result=ERROR;
         KanriContactDAO dao =new KanriContactDAO();
         if(searchName == null){
	            searchName = "";
	     }

         searchName = searchName.trim();
         searchList = dao.display("searchName");//この名前で検索したデータすべてをsearchListに入れる

         if(searchName == null || searchName.equals("")) {
             searchList = dao.display("");
             result=SUCCESS;
         }

         else if(searchName != null) {
             searchList = dao.display(searchName);
             result=SUCCESS;
         }

         number=searchList.size();//searchListに入ったデータの個数をnumberに記録する



            if(number > 0){//記録されたデータが一つ以上あったら…

            	   ArrayList<KanriContactPagenation2> KanriPages = new ArrayList<KanriContactPagenation2>();
                   KanriContactPagenation Kanrip = new KanriContactPagenation();
                   KanriPages=Kanrip.paginate(searchList, 5);//peginateメソッド呼び出し
                   maxPage = Kanrip.getMaxPage(searchList, 5);

                   displayList = KanriPages.get(pageNum-1).getPaginatedList();

                   result = SUCCESS;
               }

               return result;
   }








    /**
     * ユーザー名を取得するメソッド
     * @return contact_name ユーザー名
     */
    public String getContact_name() {
        return contact_name;
    }

    /**
     * ユーザー名を格納するメソッド
     * @param contact_nameユーザー名
     */
    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    /**
     * メールアドレスを取得するメソッド
     * @return contact_mailAddress メールアドレス
     */
    public String getContact_mailAddress() {
        return contact_mailAddress;
    }

    /**
     * メールアドレスを格納するメソッド
     * @param contact_mailAddress セット メールアドレス
     */
    public void setContact_mailAddress(String contact_mailAddress) {
        this.contact_mailAddress= contact_mailAddress;
    }

    /**
     * 問い合わせ内容を取得するメソッド
     * @return contact_contents 問い合わせ内容
     */
    public String getContact_contents() {
        return contact_contents;
    }

    /**
     * 問い合わせ内容を格納するメソッド
     * @param contact_contents セット 問い合わせ内容
     */
    public void setContact_contents(String contact_contents) {
        this.contact_contents = contact_contents;
    }

    /**
     * お問い合わせリストを取得するメソッド
     * @return contactList 問い合わせリスト
     * */
    public ArrayList<KanriContactDTO> getContactList(){
    	return contactList;
    }

    /**
     * お問い合わせリストを格納するメソッド
     *  @param contactList 問い合わせリスト
     * */

    public void setContactList(ArrayList<KanriContactDTO> contactList){
    	this.contactList = contactList;
    }



    /**
     * 検索結果を取得するメソッド
     * @return searchList 検索結果
     */
    public ArrayList<KanriContactDTO> getSearchList() {
        return searchList;
    }

    /**
     * 検索結果を格納するメソッド
     * @param searchList セット 検索結果
     */
    public void setSearchList(ArrayList<KanriContactDTO> searchList) {
        this.searchList = searchList;
    }

    /**
     * 検索ワードを取得するメソッド
     * @return searchname 検索ワード
     */
    public String getSearchName() {
        return searchName;
    }

    /**
     * 検索ワードを格納するメソッド
     * @param searchName セット 検索ワード
     */
    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    /**
     * maxPageを取得するメソッド
     * @return maxPage 最後ページ
     */
    public int getMaxPage() {
        return maxPage;
    }

    /**
     * maxPageを格納するメソッド
     * @param maxPage セット 最後ページ
     */
    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    /**
     * pageNumを取得するメソッド
     * @return pageNum ページ番号
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * pageNumを格納するメソッド
     * @param pageNum セット ページ番号
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }


    /**
     * displayListを取得するメソッド
     * @return displayList 検索結果リスト
     */
    public ArrayList<KanriContactDTO> getDisplayList() {
        return displayList;
    }

    /**
     * displayListを格納するメソッド
     * @param displayList セット 検索結果リスト
     */
    public void setDisplayList(ArrayList<KanriContactDTO> displayList) {
        this.displayList = displayList;
    }




}