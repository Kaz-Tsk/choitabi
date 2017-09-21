package com.internousdev.choitabi.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.choitabi.dto.SelectTourDTO;

public class SelectTourDTOTest {

	/*個人的メモ
	 * 旅癒さん参考
	 * 変数は「expected」「actual」の2つを用意。答えの予想値として設定した値と、実際の戻り値を表す。
	 * 「expected」をsetterでセットし、「actual」をgetterで取得する。
	 * 両者が同じであれば試験は成功と判断される。
	 * 判断するためのメソッドが「assertEquals（expected, actual）」引数として渡した値が同値であればOKと判断するもの
	 * private int tourId;
	 * private String tourName;
	 * private int price;
	 * private int persons;
	 * private String departure;
	 * private String region;
	 * private String prefectures;
	 * private String theme;
	 * private String comment;
	 * private String img;
	 */

	@Test
	public void testGetTourId1() {
		SelectTourDTO dto = new SelectTourDTO();
		int expected = 0;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		assertEquals(expected, actual);
	}

	public void testGetTourId2() {
		fail("まだ実装されていません");
	}
	public void testGetTourId3() {
		fail("まだ実装されていません");
	}
	public void testGetTourId4() {
		fail("まだ実装されていません");
	}


	//------------------------------------------------


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

}
