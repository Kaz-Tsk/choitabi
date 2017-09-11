package com.internousdev.choitabi.action;

import java.util.ArrayList;

import com.internousdev.choitabi.dao.KanriContactDAO;
import com.internousdev.choitabi.dto.KanriContactDTO;
import com.internousdev.choitabi.util.KanriContactPagenation;
import com.internousdev.choitabi.util.KanriContactPagenation2;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品の情報をセレクトするアクション
 * @author kanako miyazono
 * @since 2017/9/11
 * @version 1.1
 * @param <PageObjectContact>
 */
public class KanriContactAction extends ActionSupport {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -3027910285198171063L;

    /**

 /**
     * 検索された単語
     */
    private String searchName;

    /**

    /**
     * ユーザー名
     */
    private String contact_name
;

    /**
     * メールアドレス
     */
    private String contact_mailAddress
;

    /**
     * 問い合わせ内容
     */
    private String contact_contents;


    /**
     * 更新日
     */
    private String registrationDate;

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
    private int maxPage = 1;//とりあえず1
    private int pageNum =0;//とりあえず0にしておきます。
    public ArrayList<KanriContactDTO> displayList = new ArrayList<KanriContactDTO>();//ここが、画面に表示する小さいリスト
	private ArrayList<Integer> list = new ArrayList<>();




    /**
     * 問い合わせ情報を取得するメソッド
     * @author kanako miyazono
     * @since 2017/09/11
     * @version 1.1
     */
    public String execute() {
            String result=ERROR;


            KanriContactDAO dao = new KanriContactDAO();



            /*動作確認*/System.out.println("KanriContactAction - ページ番号：" + pageNum);

            contactList = dao.display("");
            /*まずは、DBから条件に当てはまるすべてのデータを取得します(でっかい巻物を取ってくる）
             * */

            KanriContactPagenation cp = new KanriContactPagenation();
            /*でかい巻物を小さく分けてくれるくらす(今回cpさん）を読んできます。
             * */

            /*用意しておいたdisplayListを置きます*/
            displayList = cp.KanriContactPagenation(contactList, pageNum);
            /*cpさんに仕事をお願いする。
             * 「contactList(でかい巻物)と、今のページ番号を教えるから、表示する小さいリストを作って」*/

            maxPage = cp.returnMaxPage(contactList);



            if(displayList.size() >= 1){



            ArrayList<KanriContactPagenation2> kanriPages =new ArrayList<KanriContactPagenation2>();
            KanriContactPagenation2 kanrip = new KanriContactPagenation2();
            kanriPages=kanrip.pagenateContactList(searchList, 10);
            maxPage = kanrip.getMaxPage(searchList,10);

            displayList = kanriPages.get(pageNum-1).pagenatedItemList();
            for(int i=0; i<maxPage; i++){list.add(i);}





            	result = SUCCESS;
            }



            /*動作確認用*/System.out.println("KanriContactAction - 現在のresult：" + result);
            return result;
}







    /**
     * ユーザー名を取得するメソッド
     * @return contactName ユーザー名
     */
    public String getContact_name() {
        return contact_name
;
    }

    /**
     * ユーザー名を格納するメソッド
     * @param contactName ユーザー名
     */
    public void setContact_name(String contact_name
) {
        this.contact_name
 = contact_name
;
    }

    /**
     * メールアドレスを取得するメソッド
     * @return email メールアドレス
     */
    public String getContact_mailAddress
() {
        return contact_mailAddress
;
    }

    /**
     * メールアドレスを格納するメソッド
     * @param email セット メールアドレス
     */
    public void setContact_mailAddress
(String contact_mailAddress
) {
        this.contact_mailAddress
 = contact_mailAddress
;
    }

    /**
     * 問い合わせ内容を取得するメソッド
     * @return comment 問い合わせ内容
     */
    public String getContact_contents() {
        return contact_contents;
    }

    /**
     * 問い合わせ内容を格納するメソッド
     * @param comment セット 問い合わせ内容
     */
    public void setContact_contents(String contact_contents) {
        this.contact_contents = contact_contents;
    }

    /**
     * お問い合わせリストを取得するメソッド
     * */
    public ArrayList<KanriContactDTO> getContactList(){
    	return contactList;
    }

    /**
     * お問い合わせリストを格納するメソッド*/
    public void setContactList(ArrayList<KanriContactDTO> contactList){
    	this.contactList = contactList;
    }

    /**
     * 登録日を取得するメソッド
     * @return registrationDate 登録日
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * 登録日を格納するメソッド
     * @param registrationDate セット 登録日
     */
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
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