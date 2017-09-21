package com.internousdev.choitabi.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.choitabi.dto.SelectTourDTO;

public class SelectTourDTOTest {

	/*個人的メモ
	 * 旅癒さん参考
	 *
	 * 【セッターのテストのコード】
	 * 変数は「expected」「actual」の2つを用意。答えの予想値として設定した値と、実際の戻り値を表す。
	 * 「expected」をsetterでセットし、「actual」をgetterで取得する。
	 * 両者が同じであれば試験は成功と判断される。
	 * 判断するためのメソッドが「assertEquals（expected, actual）」引数として渡した値が同値であればOKと判断するもの。
	 *
	 * intで範囲外の数値を入れる場合…最大値は「2147483647」、最小値は「-2147483648」
	 * これより大きい/小さい数値を入れて例外を起こさせ、例外処理の中でテストが成功したかどうかの判断を行う。
	 * 旅癒さんのテストケースでは、範囲外の数値は最初、文字列として入れ、「Integer.parseInt()」で数値に変換させている。
	 * （数値を直接入れようとすると「その数値は範囲外です」とコンパイルエラーになりました。おそらくこのため）
	 *
	 * int 5、  String 8種類でテスト
	 *
	 * private int tourId;     getter-OK/ setter-OK
	 * private String tourName;     getter-OK/ setter
	 * private int price;     getter/ setter
	 * private int persons;     getter/ setter
	 * private String departure;     getter-OK/ setter
	 * private String region;     gette-OK/ setter
	 * private String prefectures;     getter-OK/ setter
	 * private String theme;     getter-OK/ setter
	 * private String comment;     getter-OK/ setter
	 * private String img;     getter-OK/ setter
	 */

	//TourIDゲッターのテストメソッド-----------------------------------------------------------------------------
	@Test //0
	public void testGetTourId1() {
		SelectTourDTO dto = new SelectTourDTO();
		int expected = 0;  //予想値を代入
		dto.setTourId(expected); //予想値をセット
		/*動作確認*/System.out.println("tourId getter:" + expected);
		assertEquals(expected, dto.getTourId()); //予想値とゲッターの戻り値が同じならば成功
	}

	@Test //Integer.MAX_VALUE
	public void testGetTourId2() {
		SelectTourDTO dto = new SelectTourDTO();
		int expected = Integer.MAX_VALUE;  //予想値を代入
		dto.setTourId(expected); //予想値をセット
		/*動作確認*/System.out.println("tourId getter:" + expected);
		assertEquals(expected, dto.getTourId()); //予想値とゲッターの戻り値が同じならば成功
	}

	@Test //Integer.MIN_VALUE
	public void testGetTourId3() {
		SelectTourDTO dto = new SelectTourDTO();
		int expected = Integer.MIN_VALUE;  //予想値を代入
		dto.setTourId(expected); //予想値をセット
		/*動作確認*/System.out.println("tourId getter:" + expected);
		assertEquals(expected, dto.getTourId()); //予想値とゲッターの戻り値が同じならば成功
	}

	@Test //レンジ範囲外（Exceptionを起こす）：最大値2147483647 + 1
	public void testGetTourId4() throws Exception{
		SelectTourDTO dto = new SelectTourDTO();
	    try{
	    	int postalMax= Integer.parseInt("2147483648");//最大値＋1を代入
	    	dto.setTourId(postalMax);

	    }catch (RuntimeException e) {//例外処理
	    	assertThat(e.getMessage(),"For input string: \"2147483648\"");//エラーメッセージが左のようになればテスト成功
	    }
	}

	@Test //レンジ範囲外（Exceptionを起こす）：最小値-2147483648 - 1
	public void testGetTourId5() {
		SelectTourDTO dto = new SelectTourDTO();
		try {
		     int postalMin =Integer.parseInt("-2147483649");//最小値-1を代入
		     dto.setTourId(postalMin);

		} catch (RuntimeException e) {//例外処理
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");//エラーメッセージが左のようになればテスト成功
		}
	}


	//↓TourIdセッターのテストメソッド-------------------------------------------------------------------------


	@Test //0
	public void testSetTourId1(){
		SelectTourDTO dto = new SelectTourDTO();
		int expected = 0;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		assertEquals(expected, actual);
	}

	@Test //MAX_VALUE
	public void testSetTourId2() {
		SelectTourDTO dto  = new SelectTourDTO();
		int expected = Integer.MAX_VALUE;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		/*動作確認*/System.out.println("testGetTourId expected:" + expected + "/ actual:" + actual );
		assertEquals(expected, actual);
	}

	@Test //MIN_VALUE
	public void testSetTourId3() {
		SelectTourDTO dto = new SelectTourDTO();
		int expected = Integer.MIN_VALUE;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		/*動作確認*/System.out.println("testGetTourId expected:" + expected + "/ actual:" + actual );
		assertEquals(expected, actual);
	}

	@Test //最大値＋1
	public void testSetTourId4() {
		SelectTourDTO dto = new SelectTourDTO();
		try {
			int postalMax= Integer.parseInt("2147483648");
			dto.setTourId(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test //最小値＋1
	public void testSetTourId5() {
		SelectTourDTO dto = new SelectTourDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setTourId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}



	//↓ツアー名ゲッターのテストメソッド----------------------------------
	@Test //null
	public void testGetTourName1() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=null;//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //""空文字
	public void testGetTourName2() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //" "半角スペース
	public void testGetTourName3() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=" ";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //"　"全角スペース
	public void testGetTourName4() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="　";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123
	public void testGetTourName5() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //あいう１２３
	public void testGetTourName6() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３
	public void testGetTourName7() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３漢字
	public void testGetTourName8() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３漢字";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}



	//↓ツアー名セッターのテストメソッド-----------------------------------
	@Test //null
	public void testSetTourName1() {
		fail("まだ実装されていません");
	}

	@Test //""空文字
	public void testSetTourName2() {
		fail("まだ実装されていません");
	}

	@Test //" "半角スペース
	public void testSetTourName3() {
		fail("まだ実装されていません");
	}

	@Test //"　"全角スペース
	public void testSetTourName4() {
		fail("まだ実装されていません");
	}

	@Test //abc123
	public void testSetTourName5() {
		fail("まだ実装されていません");
	}

	@Test //あいう１２３
	public void testSetTourName6() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３
	public void testSetTourName7() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３漢字
	public void testSetTourName8() {
		fail("まだ実装されていません");
	}

	//価格ゲッターのテストメソッド------------------------------------------
	@Test //0
	public void testGetPrice1() {
		fail("まだ実装されていません");
	}

	@Test //MAX_VALUE
	public void testGetPrice2() {
		fail("まだ実装されていません");
	}

	@Test //MIN_VALUE
	public void testGetPrice3() {
		fail("まだ実装されていません");
	}

	@Test //範囲外-最大値＋1
	public void testGetPrice4() {
		fail("まだ実装されていません");
	}

	@Test //範囲外-最小値-1
	public void testGetPrice5() {
		fail("まだ実装されていません");
	}

	//価格セッターのテストメソッド------------------------------------------
	@Test //0
	public void testSetPrice1() {
		fail("まだ実装されていません");
	}

	@Test //MAX_VALUE
	public void testSetPrice2() {
		fail("まだ実装されていません");
	}

	@Test //MIN_VALUE
	public void testSetPrice3() {
		fail("まだ実装されていません");
	}

	@Test //範囲外-最大値＋1
	public void testSetPrice4() {
		fail("まだ実装されていません");
	}

	@Test //範囲外-最小値-1
	public void testSetPrice5() {
		fail("まだ実装されていません");
	}



	//人数ゲッターのテストメソッド--------------------------------------------
	@Test //0
	public void testGetPersons1() {
		fail("まだ実装されていません");
	}

	@Test //MAX_VALUE
	public void testGetPersons2() {
		fail("まだ実装されていません");
	}

	@Test //MIN__VALUE
	public void testGetPersons3() {
		fail("まだ実装されていません");
	}

	@Test //範囲外-最大値+1
	public void testGetPersons4() {
		fail("まだ実装されていません");
	}

	@Test //範囲外-最小値-1
	public void testGetPersons5() {
		fail("まだ実装されていません");
	}

	//人数セッターのテストメソッド--------------------------------------------
	@Test //0
	public void testSetPersons1() {
		fail("まだ実装されていません");
	}

	@Test //MAX_VALUE
	public void testSetPersons2() {
		fail("まだ実装されていません");
	}

	@Test //MIN_VALUE
	public void testSetPersons3() {
		fail("まだ実装されていません");
	}

	@Test //範囲外-最大値＋1
	public void testSetPersons4() {
		fail("まだ実装されていません");
	}

	@Test //範囲外-最小値-1
	public void testSetPersons5() {
		fail("まだ実装されていません");

	}


	//出発地ゲッターのテストメソッド-------------------------------------------
	@Test //null
	public void testGetDeparture1() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected = null;//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //""空文字
	public void testGetDeparture2() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected = "";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //" "半角スペース
	public void testGetDeparture3() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected = " ";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //"　"全角スペース
	public void testGetDeparture4() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected = "　";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123
	public void testGetDeparture5() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected = "abc123";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //あいう１２３
	public void testGetDeparture6() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected = "あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３
	public void testGetDeparture7() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected = "abc123あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３漢字
	public void testGetDeparture8() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected = "abc123あいう１２３漢字";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}



	//出発地セッターのテストメソッド--------------------------------------------
	@Test //null
	public void testSetDeparture1() {
		fail("まだ実装されていません");
	}

	@Test //""空文字
	public void testSetDeparture2() {
		fail("まだ実装されていません");
	}

	@Test //" "半角スペース
	public void testSetDeparture3() {
		fail("まだ実装されていません");
	}

	@Test //"　"全角スペース
	public void testSetDeparture4() {
		fail("まだ実装されていません");
	}

	@Test //abc123
	public void testSetDeparture5() {
		fail("まだ実装されていません");
	}

	@Test //あいう１２３
	public void testSetDeparture6() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３
	public void testSetDeparture7() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３漢字
	public void testSetDeparture8() {
		fail("まだ実装されていません");
	}



	//エリアゲッターのテストメソッド----------------------------------------------
	@Test //null
	public void testGetRegion1() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=null;//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //""空文字
	public void testGetRegion2() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //" "半角スペース
	public void testGetRegion3() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=" ";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //"　"全角スペース
	public void testGetRegion4() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="　";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123
	public void testGetRegion5() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //あいう１２３
	public void testGetRegion6() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３
	public void testGetRegion7() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３漢字
	public void testGetRegion8() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３漢字";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}



	//エリアセッターのテストメソッド-----------------------------------------------
	@Test
	public void testSetRegion() {
		fail("まだ実装されていません");
	}

	@Test //null
	public void testSetRegion1() {
		fail("まだ実装されていません");
	}

	@Test //""空文字
	public void testSetRegion2() {
		fail("まだ実装されていません");
	}

	@Test //" "半角スペース
	public void testSetRegion3() {
		fail("まだ実装されていません");
	}

	@Test //"　"全角スペース
	public void testSetRegion4() {
		fail("まだ実装されていません");
	}

	@Test //abc123
	public void testSetRegion5() {
		fail("まだ実装されていません");
	}

	@Test //あいう１２３
	public void testSetRegion6() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３
	public void testSetRegion7() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３漢字
	public void testSetRegion8() {
		fail("まだ実装されていません");
	}




	//都道府県ゲッターのテストメソッド----------------------------------------------
	@Test //null
	public void testGetPrefectures1() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=null;//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //""空文字
	public void testGetPrefectures2() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //" "半角スペース
	public void testGetPrefectures3() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=" ";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //"　"全角スペース
	public void testGetPrefectures4() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="　";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123
	public void testGetPrefectures5() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //あいう１２３
	public void testGetPrefectures6() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３
	public void testGetPrefectures7() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３漢字
	public void testGetPrefectures8() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３漢字";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}





	//都道府県セッターのテストメソッド------------------------------------------------
	@Test //null
	public void testSetPrefectures1() {
		fail("まだ実装されていません");
	}

	@Test //""空文字
	public void testSetPrefectures2() {
		fail("まだ実装されていません");
	}

	@Test //" "半角スペース
	public void testSetPrefectures3() {
		fail("まだ実装されていません");
	}

	@Test //"　"全角スペース
	public void testSetPrefectures4() {
		fail("まだ実装されていません");
	}

	@Test //abc123
	public void testSetPrefectures5() {
		fail("まだ実装されていません");
	}

	@Test //あいう１２３
	public void testSetPrefectures6() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３
	public void testSetPrefectures7() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３漢字
	public void testSetPrefectures8() {
		fail("まだ実装されていません");
	}




	//テーマゲッターのテストメソッド---------------------------------------------
	@Test //null
	public void testGetTheme1() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=null;//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //""空文字
	public void testGetTheme2() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //" "半角スペース
	public void testGetTheme3() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=" ";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //"　"全角スペース
	public void testGetTheme4() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="　";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123
	public void testGetTheme5() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //あいう１２３
	public void testGetTheme6() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３
	public void testGetTheme7() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３漢字
	public void testGetTheme8() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３漢字";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	//テーマセッターのテストメソッド------------------------------------------------
	@Test //null
	public void testSetTheme1() {
		fail("まだ実装されていません");
	}

	@Test //""空文字
	public void testSetTheme2() {
		fail("まだ実装されていません");
	}

	@Test //" "半角スペース
	public void testSetTheme3() {
		fail("まだ実装されていません");
	}

	@Test //"　"全角スペース
	public void testSetTheme4() {
		fail("まだ実装されていません");
	}

	@Test //abc123
	public void testSetTheme5() {
		fail("まだ実装されていません");
	}

	@Test //あいう１２３
	public void testSetTheme6() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３
	public void testSetTheme7() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３漢字
	public void testSetTheme8() {
		fail("まだ実装されていません");
	}


	//コメントゲッターのテストメソッド-----------------------------------------------------
	@Test //null
	public void testGetComment1() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=null;//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //""空文字
	public void testGetComment2() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //" "半角スペース
	public void testGetComment3() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=" ";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //"　"全角スペース
	public void testGetComment4() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="　";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123
	public void testGetComment5() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //あいう１２３
	public void testGetComment6() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３
	public void testGetComment7() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３漢字
	public void testGetComment8() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３漢字";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}


	//コメントセッターのテストメソッド------------------------------------------------------
	@Test
	public void testSetComment() {
		fail("まだ実装されていません");
	}
	@Test //null
	public void testSetComment1() {
		fail("まだ実装されていません");
	}

	@Test //""空文字
	public void testSetComment2() {
		fail("まだ実装されていません");
	}

	@Test //" "半角スペース
	public void testSetComment3() {
		fail("まだ実装されていません");
	}

	@Test //"　"全角スペース
	public void testSetComment4() {
		fail("まだ実装されていません");
	}

	@Test //abc123
	public void testSetComment5() {
		fail("まだ実装されていません");
	}

	@Test //あいう１２３
	public void testSetComment6() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３
	public void testSetComment7() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３漢字
	public void testSetComment8() {
		fail("まだ実装されていません");
	}

	//画像URLゲッターのテストメソッド---------------------------------------------
	@Test //null
	public void testGetImg1() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=null;//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //""空文字
	public void testGetImg2() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //" "半角スペース
	public void testGetImg3() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected=" ";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);;
	}

	@Test //"　"全角スペース
	public void testGetImg4() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="　";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123
	public void testGetImg5() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //あいう１２３
	public void testGetImg6() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３
	public void testGetImg7() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}

	@Test //abc123あいう１２３漢字
	public void testGetImg8() {
		SelectTourDTO dto= new SelectTourDTO();
		String expected="abc123あいう１２３漢字";//代入

		dto.setTourName(expected);
		String actual=dto.getTourName();

		assertEquals(expected,actual);
	}



	//画像URLセッターのテストメソッド------------------------------------------------
	@Test //null
	public void testSetImg1() {
		fail("まだ実装されていません");
	}

	@Test //""空文字
	public void testSetImg2() {
		fail("まだ実装されていません");
	}

	@Test //" "半角スペース
	public void testSetImg3() {
		fail("まだ実装されていません");
	}

	@Test //"　"全角スペース
	public void testSetImg4() {
		fail("まだ実装されていません");
	}

	@Test //abc123
	public void testSetImg5() {
		fail("まだ実装されていません");
	}

	@Test //あいう１２３
	public void testSetImg6() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３
	public void testSetImg7() {
		fail("まだ実装されていません");
	}

	@Test //abc123あいう１２３漢字
	public void testSetImg8() {
		fail("まだ実装されていません");
	}



	//例外処理で使うassertThatメソッド------------------------------------------

	public void assertThat(String message, String string){
		assertEquals(message, string);
	}

}
