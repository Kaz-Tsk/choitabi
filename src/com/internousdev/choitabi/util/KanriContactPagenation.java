package com.internousdev.choitabi.util;

import java.util.ArrayList;

import com.internousdev.choitabi.dto.KanriContactDTO;

public class KanriContactPagenation {

	/**
	 * 1ページに表示する件数
	 * */
    private int contactNumber=5; //とりあえず10件

    /**最初に取得するアレイリストのインデックス番号（どこから）*/
	private int firstIndex = 0;

	/**最後に取得するアレイリストのインデックス番号（どこまで）*/
	private int lastIndex = 0;

	private int maxPage = 1;


	public ArrayList<KanriContactPages> paginateContactList(ArrayList<KanriContactDTO> contactList,int pageNum){

		ArrayList<KanriContactPages> smallContactList = new ArrayList<KanriContactPages>();

		/*動作確認*/System.out.println("ContactPagination - 現在のページ番号：" + pageNum );
		/*動作確認*/System.out.println("ContactPagination - お問い合わせ総データ数：" + contactList.size());

		firstIndex = firstIndex + ( (pageNum - 1) * contactNumber );  //firstIndex = 0 + ( 1 - 1 ) * 10; →0番目
		lastIndex = lastIndex + (pageNum * contactNumber); //lastIndex = 0 + ( 1 * 10 );→10番目

		if(contactList.size() == 0){
			return null;
		}

		for(int i = firstIndex; i < lastIndex; i++){
			/*すべてのお問い合わせリスト、の、「0番目」のデータから順番にデータを取り出しなさい
			 * インデック番号が「10番目」になる、1個手前で止めなさい*/
			if(i >= contactList.size()){
				break;
			}

			smallContactList.add(contactList.get(i));//小さい方のリストに、大きいほうの「？」番目のデータを移しなさい
		}

		return smallContactList;

	}

	public int returnMaxPage(ArrayList<KanriContactDTO> contactList){


		if(contactList.size() == 0){
			maxPage = 1;
		}else if(contactList.size() % contactNumber != 0){
			maxPage = (contactList.size() / contactNumber) + 1;
		}else{
			maxPage = (contactList.size() / contactNumber);
		}
		/*動作確認*/System.out.println("ContactPagenation - 最大ページ：" + maxPage);
		return maxPage;
	}

}
