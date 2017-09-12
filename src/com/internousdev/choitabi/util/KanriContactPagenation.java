package com.internousdev.choitabi.util;


import java.util.ArrayList;

import com.internousdev.choitabi.dto.KanriContactDTO;

/**
 * 渡されたリストに対してページネーションを行うクラス
 * @author kanako miyazono
 * @since 2017/09/11
 * @version 1.1
 */
public class KanriContactPagenation {

	/**
	 * 渡されたリストを1ページにcount個までオブジェクトが掲載された本の形に変換して返す
	 * @author kanako miyazono
	 * @since 2017/09/11
	 * @param list DTOが格納されたArrayList
	 * @param count 1ページあたりに掲載されるオブジェクトの個数
	 * @return displayList
	 */
	public ArrayList<PageContact> paginate(ArrayList<KanriContactDTO> list, int count) {

		ArrayList<PageContact> displayList =new ArrayList<PageContact>();
		int itemCount = count;
		int index = 0;
		int maxPages = 0;

		if((list.size() % count) == 0) {
			maxPages = list.size() / count;
		} else {
			maxPages = (list.size() / count) + 1;
		}



		for(int i = 0; i < maxPages; i++) {
			/*動作確認*/System.out.println("KanriContactPagenation-検索中のリスト№" + count);
			PageContact page = new PageContact();

			for(int j = index; j < itemCount; j++) {
				if(list.size() == j) {
					break;
				}
				page.addPaginatedList(list,j);
			}


			page.setPageId(i);
			displayList.add(page);

			index += count;
			//itemCount += count;
		}
		return displayList;
	}

	/**
	 * 渡されたリスト数と1ページあたりに掲載するオブジェクト数から総ページ数を返す
	 * @author kanako miyazono
	 * @since 2017/09/11
	 * @param list DTOが格納されたArrayList
	 * @param count 1ページあたりに掲載されるオブジェクトの個数
	 * @return maxPages
	 */
	public int getMaxPage(ArrayList<KanriContactDTO> list, int count) {

		int maxPages = 0;

		if((list.size() % count) == 0) {
			maxPages = list.size() / count;
		} else {
			maxPages = (list.size() / count) + 1;
		}


		return maxPages;
	}


}
