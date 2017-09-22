package com.internousdev.choitabi.util;


import java.util.ArrayList;

import com.internousdev.choitabi.dto.KanriContactDTO;

/**
 * 渡されたリストに対してページネーションを行うクラス
 * @author KANAKO MIYAZONO
 * @since 2017/09/11
 * @version 1.1
 */
public class KanriContactPagenation {

	/**
	 * 渡されたリストを1ページにcount個までオブジェクトが掲載された本の形に変換して返す
	 * @author KANAKO MIYAZONO
	 * @since 2017/09/11
	 * @param list DTOが格納されたArrayList
	 * @param count 1ページあたりに掲載されるオブジェクトの個数
	 * @return displayList
	 */



	public ArrayList<KanriContactPagenation2> paginate(ArrayList<KanriContactDTO> list/*←検索結果全部*/, int count/*←10*/) {

		ArrayList<KanriContactPagenation2> displayList =new ArrayList<KanriContactPagenation2>();
		int itemCount = count;//1ページに表示する件数
		int index = 0;
		int maxPage = 0;


		/*↓検索結果のすべてのデータ÷1ページに表示する件数　で、最大ページを求める*/
		if((list.size() % count) == 0) {
			maxPage = list.size() / count;
		} else {
			maxPage = (list.size() / count) + 1;
		}



		for(int i = 0; i < maxPage; i++) {
			/*動作確認*/System.out.println("KanriContactPagenation-検索中のリスト№" + count);

			KanriContactPagenation2 page = new KanriContactPagenation2();

			/*検索結果を10件ずつに区切る処理（10まで行かなくても、リストが終わったら処理を止めて良い）*/
			for(int j = index; j < itemCount; j++) {
				if(list.size() == j) {
					break;
				}
				page.addPaginatedList(list,j);
				//↑検索結果（すべて）の中からひとつずつデータを取り出して、それをpageに渡しなさい。
			}


			page.setPageId(i);
			displayList.add(page);

			index += count;//始まりを10ずつずらす
			itemCount += count;//終わりを10ずつずらす
		}
		return displayList;//検索結果をさらにページネートしたリスト
	}

	/**
	 * 渡されたリスト数と1ページあたりに掲載するオブジェクト数から総ページ数を返す
	 * @author KANAKO MIYAZONO
	 * @since 2017/09/11
	 * @param list DTOが格納されたArrayList
	 * @param count 1ページあたりに掲載されるオブジェクトの個数
	 * @return maxPage
	 */
	public int getMaxPage(ArrayList<KanriContactDTO> list, int count) {

		int maxPage = 0;

		if((list.size() % count) == 0) {
			maxPage = list.size() / count;
		} else {
			maxPage = (list.size() / count) + 1;
		}


		return maxPage;
	}


}
