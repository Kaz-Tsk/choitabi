package src.com.internousdev.choitabi.util;

import java.util.ArrayList;

import com.internousdev.choitabi.dto.SelectTourDTO;

/*@author:YUKA MATSUMURA
 *@since:2017/09/05
 *@version:1.1
 * */



public class TourListPagination {

	/*表示するリストの最初のインデックス番号*/
	private int firstIndex = 0;

	/*表示するリストの最後のインデックス番号*/
	private int lastIndex = 0;

	/*一度に表示するツアーの件数（可変になったときのために、ここにまとめておく）*/
	private int tourNumber = 10;





	public ArrayList<SelectTourDTO> paginateTourList(ArrayList<SelectTourDTO> allTourList, int currentPage){

		/*呼び出し元に返すツアーのリスト*/
		ArrayList<SelectTourDTO> currentTourList = new ArrayList<SelectTourDTO>();
		/*後消し*/System.out.println("TourListPagination.java - 表示中ページ数 : " + currentPage);

		firstIndex = firstIndex + ( (currentPage - 1)  * tourNumber );
		lastIndex = lastIndex + (currentPage * tourNumber);

		/*後消し*/System.out.println("paginateTourList - allTourList " + allTourList.size() );

		if(allTourList.size() == 0){
			return null;
		}

		for(int i = firstIndex; i < lastIndex; i ++){
			if(i >= allTourList.size()){
				break;
			}
			currentTourList.add(allTourList.get(i));
//			System.out.println("firstIndex : " + firstIndex);
//			System.out.println("lastIndex : " + lastIndex);
//			System.out.println("paginate : " + currentTourList.size());
		}

		return currentTourList;

	}


	public int rerturnMaxPage(ArrayList<SelectTourDTO> allTourList){
		int maxPage;

		if(allTourList.size() == 0){
			maxPage = 1;
		}
		else if( (allTourList.size() % tourNumber)  != 0 ){
			maxPage = (allTourList.size() / tourNumber) + 1;
		}else{
			maxPage = (allTourList.size() / tourNumber);
		}
		System.out.println("returnMaxPage : " + maxPage);

		return maxPage;
	}




}
