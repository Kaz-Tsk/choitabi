package src.com.internousdev.choitabi.util;

import java.util.ArrayList;

import com.internousdev.choitabi.dto.SelectTourDTO;


/*作成者：松村
 * 管理画面のツアー管理で、ページネートを行うためのクラスです。
 * 呼び出し元からツアーの一覧と現在のページ番号を渡されたら、
 * そこから必要な分のツアーのリストを抜き出して返します。
 *
 * ※動き確認中。
 * */



public class TourListPagination {

	/*表示するリストの最初のインデックス番号*/
	private int firstIndex = 0;

	/*表示するリストの最後のインデックス番号*/
	private int lastIndex = 0;

	/*一度に表示するツアーの件数（可変になったときのために、ここにまとめておく）*/
	private int tourNumber = 10;





	public ArrayList<SelectTourDTO> paginateTourList(ArrayList<SelectTourDTO> allTourList, int currentPage, int maxPage){

		/*呼び出し元に返すツアーのリスト*/
		ArrayList<SelectTourDTO> currentTourList = new ArrayList<SelectTourDTO>();
		/*後消し*/System.out.println("TourListPagination.java - currentPage : " + currentPage);

		firstIndex = firstIndex + ( (currentPage - 1)  * tourNumber );
		lastIndex = lastIndex + (currentPage * tourNumber);

		for(int i = firstIndex; i < lastIndex; i ++){
			if(i >= allTourList.size()){
				break;
			}
			currentTourList.add(allTourList.get(i));
			System.out.println("firstIndex : " + firstIndex);
			System.out.println("lastIndex : " + lastIndex);
			System.out.println("paginate : " + currentTourList.size());
		}

		return currentTourList;

	}


	public int rerturnMaxPage(ArrayList<SelectTourDTO> allTourList){
		int maxPage;

		if( (allTourList.size() % tourNumber)  != 0 ){
			maxPage = (allTourList.size() / tourNumber) + 1;
		}else{
			maxPage = (allTourList.size() / tourNumber);
		}

		return maxPage;
	}




}
