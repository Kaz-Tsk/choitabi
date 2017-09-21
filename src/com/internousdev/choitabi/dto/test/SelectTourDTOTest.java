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
	 * private int tourId;     getter/ setter
	 * private String tourName;     getter/ setter
	 * private int price;     getter/ setter
	 * private int persons;     getter/ setter
	 * private String departure;     getter/ setter
	 * private String region;     getter/ setter
	 * private String prefectures;     getter/ setter
	 * private String theme;     getter/ setter
	 * private String comment;     getter/ setter
	 * private String img;     getter/ setter
	 */

	//TourIDゲッターのテストメソッド-----------------------------------------------------------------------------
	@Test //0
	public void testGetTourId1() {
		SelectTourDTO dto = new SelectTourDTO();
		int expected = 0;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		assertEquals(expected, actual);
	}

	@Test //Integer.MAX_VALUE
	public void testGetTourId2() {
		SelectTourDTO dto  = new SelectTourDTO();
		int expected = Integer.MAX_VALUE;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		/*動作確認*/System.out.println("testGetTourId expected:" + expected + "/ actual:" + actual );
		assertEquals(expected, actual);
	}

	@Test //Integer.MIN_VALUE
	public void testGetTourId3() {
		SelectTourDTO dto = new SelectTourDTO();
		int expected = Integer.MIN_VALUE;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		/*動作確認*/System.out.println("testGetTourId expected:" + expected + "/ actual:" + actual );
		assertEquals(expected, actual);
	}

	@Test //レンジ範囲外（Exceptionを起こす）：最大値2147483647 + 1
	public void testGetTourId4() {
		SelectTourDTO dto = new SelectTourDTO();
		try {
			int postalMax= Integer.parseInt("2147483648");
			dto.setTourId(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test //レンジ範囲外（Exceptionを起こす）：最小値-2147483648 - 1
	public void testGetTourId5() {
		SelectTourDTO dto = new SelectTourDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setTourId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}


	//↓TourIdセッターのテストメソッド-------------------------------------------------------------------------


	@Test
	public void testSetTourId() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetTourName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetTourName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetPrice() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetPrice() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetPersons() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetPersons() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetDeparture() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetDeparture() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetRegion() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetRegion() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetPrefectures() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetPrefectures() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetTheme() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetTheme() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetComment() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetComment() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetImg() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetImg() {
		fail("まだ実装されていません");
	}


	//例外処理で使うassertThatメソッド------------------------------------------

	public void assertThat(String message, String string){
		assertEquals(message, string);
	}

}
