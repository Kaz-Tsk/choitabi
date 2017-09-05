package src.com.internousdev.choitabi.util;

import java.util.ArrayList;

import com.internousdev.choitabi.dto.SelectTourDTO;


/*作成者：松村
 * 管理画面のツアー管理で、ページネートを行うためのクラスです。
 * 呼び出し元からツアーの一覧と現在のページ番号を渡されたら、
 * そこから必要な分のツアーのリストを抜き出して返します。
 *
 * ※動きはまだ未確認
 * */



public class TourListPagination {

	/*表示するリストの最初のインデックス番号*/
	private int firstIndex = 0;

	/*表示するリストの最後のインデックス番号*/
	private int lastIndex = 0;

	/*一度に表示するツアーの件数（可変になったときのために、ここにまとめておく）*/
	private int tourNumber = 10;

	/*呼び出し元に返すツアーのリスト*/
	ArrayList<SelectTourDTO> currentTourList;



	public ArrayList<SelectTourDTO> paginateTourList(ArrayList<SelectTourDTO> allTourList, int currentPage){
		lastIndex = lastIndex + (currentPage * tourNumber);
		currentPage -= 1;
		firstIndex = firstIndex * (currentPage * tourNumber);

		for(int i = firstIndex; i < lastIndex; i ++){
			currentTourList.add(allTourList.get(i));

			if(i == allTourList.size()){
				break;
			}

		}

		return currentTourList;

	}


}
