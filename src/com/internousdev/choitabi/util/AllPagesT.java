package com.internousdev.choitabi.util;

import java.util.ArrayList;

import com.internousdev.choitabi.dto.TourDTO;

/**
 * 渡されたリストに対してページネーションを行うクラス
 * @author SHUN NAGAO
 * @since 2017/09/13
 * @version 1.0
 */
public class AllPagesT {

	/**
	 * リストをページネーションして本の形に変換し、jspで表示するために格納する
	 */


	/**
	 * 渡されたリストを1ページにcount個までオブジェクトが掲載された本の形に変換して返す
	 * @param list DTOが格納されたArrayList
	 * @param count 1ページあたりに掲載されるオブジェクトの個数
	 * @return displayBook
	 */
	public ArrayList<PageObjectTour> paginate(ArrayList<TourDTO> list, int count) {

		ArrayList<PageObjectTour> displayBook =new ArrayList<PageObjectTour>();
		int itemCount = count;
		int index = 0;
		int maxPages = 0;

		if((list.size() % count) == 0) {
			maxPages = list.size() / count;
		} else {
			maxPages = (list.size() / count) + 1;
		}



		for(int i = 0; i < maxPages; i++) {
			PageObjectTour page = new PageObjectTour();

			for(int j = index; j < itemCount; j++) {
				if(list.size() == j) {
					break;
				}
				page.addPaginatedList(list,j);
			}


			page.setPageId(i);
			displayBook.add(page);

			index += count;
			itemCount += count;
		}
		return displayBook;
	}

	/**
	 * 渡されたリスト数と1ページあたりに掲載するオブジェクト数から総ページ数を返す
	 * @param list DTOが格納されたArrayList
	 * @param count 1ページあたりに掲載されるオブジェクトの個数
	 * @return maxPages
	 */
	public int getMaxPage(ArrayList<?> list, int count) {

		int maxPages = 0;

		if((list.size() % count) == 0) {
			maxPages = list.size() / count;
		} else {
			maxPages = (list.size() / count) + 1;
		}


		return maxPages;
	}


}