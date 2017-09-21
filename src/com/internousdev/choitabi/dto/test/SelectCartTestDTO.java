package com.internousdev.choitabi.dto.test;

import java.math.BigDecimal;

import com.internousdev.choitabi.dto.CartDTO;
import com.internousdev.choitabi.dto.SelectCartDTO;

import junit.framework.TestCase;



public class SelectCartTestDTO extends TestCase {


    /**
     * ツアーIDを取得するメソッド
     * @return tour_id ツアーID
     */

	private void assertThat(String message, String string) {
		assertEquals(message, string);
	}

    public void testGetTour_id1() {
    	SelectCartDTO test = new SelectCartDTO();
    	int expected = 0;

    	test.setTour_id(expected);

    	assertEquals(expected, test.getTour_id());
    }

    public void testGetTour_id2() {
    	SelectCartDTO test = new SelectCartDTO();
    	int expected = 2147483647;

    	test.setTour_id(expected);

    	assertEquals(expected, test.getTour_id());
    }

    public void testGetTour_id3() {
    	SelectCartDTO test = new SelectCartDTO();
    	int expected = -2147483647;

    	test.setTour_id(expected);

    	assertEquals(expected, test.getTour_id());
    }

	public void testGetTour_id4() throws Exception {
		SelectCartDTO test = new SelectCartDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setTour_id(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testGetTour_id5() throws Exception {
		SelectCartDTO test= new SelectCartDTO();
	    try{
	    	int postalMin = Integer.parseInt("-2147483649");
	    	test.setTour_id(postalMin);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"-2147483649\"");
	    }
	}


	/**
	 * ツアーIDを格納するメソッド
	 * @param tour_id ツアーID
	 */

	public void testSetTour_id1() {
		SelectCartDTO test = new SelectCartDTO();
		int expected = 0;

		test.setTour_id(expected);
		int actual = test.getTour_id();

		assertEquals(expected, actual);
	}

	public void testSetTour_id2() {
		SelectCartDTO test = new SelectCartDTO();
		int expected = 2147483647;

		test.setTour_id(expected);
		int actual = test.getTour_id();

		assertEquals(expected, actual);
	}

	public void testSetTour_id3() {
		SelectCartDTO test = new SelectCartDTO();
		int expected = -2147483647;

		test.setTour_id(expected);
		int actual = test.getTour_id();

		assertEquals(expected, actual);
	}

	public void testSetTour_id4() throws Exception {
		 SelectCartDTO test = new SelectCartDTO();
		 try {
			 int postalMax = Integer.parseInt("2147483648");
			 test.setTour_id(postalMax);

		 } catch (RuntimeException e) {
			 assertThat(e.getMessage(), "For input string: \"2147483648\"");
		 }
	}

	public void testSetTour_id5() throws Exception {
		SelectCartDTO test = new SelectCartDTO();
		try {
			 int postalMin = Integer.parseInt("-2147483649");
			 test.setTour_id(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


    /**
     * ツアー名を取得するメソッド
     * @return tour_name ツアー名
     */

    public void testGetTour_name1() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = null;

    	test.setTour_name(expected);
    	String actual = test.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name2() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "";

    	test.setTour_name(expected);
    	String actual = test.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name3() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = " ";

    	test.setTour_name(expected);
    	String actual = test.getTour_name();

    	assertEquals(expected, actual);
    }

	public void testGetTour_nama4() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "　";

		test.setTour_name(expected);
		String actual = test.getTour_name();

		assertEquals(expected, actual);
	}

	public void testGetTour_name5() {
		SelectCartDTO test = new SelectCartDTO();
	    String expected = "abc123";

	    test.setTour_name(expected);
	    String actual = test.getTour_name();

	    assertEquals(expected, actual);
	}

	public void testGetTour_name6() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "あいう１２３";

		test.setTour_name(expected);
		String actual = test.getTour_name();

		assertEquals(expected, actual);
	}

	public void testGetTour_name7() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "abc123あいう１２３";

		test.setTour_name(expected);
		String actual = test.getTour_name();

		assertEquals(expected, actual);
	}

	public void testGetTour_name8() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "abc123あいう１２３漢字";

		test.setTour_name(expected);
		String actual = test.getTour_name();

		assertEquals(expected, actual);
	}


	/**
	 * ツアー名を格納するメソッド
	 * @oaram tour_name ツアー名
	 */

	public void testSetTour_name1() {
	    SelectCartDTO test = new SelectCartDTO();
	    String expected = null;

	    test.setTour_name(expected);
	    String actual = test.getTour_name();

	    assertEquals(expected, actual);
	}

	public void testSetTour_name2() {
	    SelectCartDTO test = new SelectCartDTO();
	    String expected = "";

	    test.setTour_name(expected);
	    String actual = test.getTour_name();

	    assertEquals(expected, actual);
	}

	public void testSetTour_name3() {
	    SelectCartDTO test = new SelectCartDTO();
	    String expected = " ";

	    test.setTour_name(expected);
	    String actual = test.getTour_name();

	    assertEquals(expected, actual);
	}

	public void testSetTour_nama4() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "　";

		test.setTour_name(expected);
		String actual = test.getTour_name();

		assertEquals(expected, actual);
	}

	public void testSetTour_name5() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "abc123";

		test.setTour_name(expected);
		String actual = test.getTour_name();

		assertEquals(expected, actual);
	}

	public void testSetTour_name6() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "あいう１２３";

		test.setTour_name(expected);
		String actual = test.getTour_name();

		assertEquals(expected, actual);
	}

	public void testSetTour_name7() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "abc123あいう１２３";

		test.setTour_name(expected);
		String actual = test.getTour_name();

		assertEquals(expected, actual);
	}

	public void testSetTour_name8() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "abc123あいう１２３漢字";

		test.setTour_name(expected);
		String actual = test.getTour_name();

		assertEquals(expected, actual);
	}

	/**
	 * 価格を取得するメソッド
	 * @return price 価格BigDecimal price
	 */

	public void testGetPrice1() {
		SelectCartDTO test = new SelectCartDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	public void testGetPrice2() {
		SelectCartDTO test = new SelectCartDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	public void testGetPrice3() {
		SelectCartDTO test = new SelectCartDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	public void testGetPrice4() throws Exception {
		SelectCartDTO test = new SelectCartDTO();
		try {
			BigDecimal postalMax = BigDecimal.valueOf(10000000.00);
			test.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	public void testGetPrice5() throws Exception {
		CartDTO dto = new CartDTO();
		try{
		    BigDecimal postalMin = BigDecimal.valueOf(-10000000.00);
		    	dto.setPrice(postalMin);

		}catch (RuntimeException e) {
		    assertThat(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}


		/**
		 * 価格を格納するメソッド
		 * @param price 価格BigDecimal price
		 */

	public void testSetPrice1() {
		SelectCartDTO test = new SelectCartDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	public void testSetPrice2() {
		SelectCartDTO test = new SelectCartDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	public void testSetPrice3() {
		SelectCartDTO test = new SelectCartDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	public void testSetPrice4() throws Exception {
		SelectCartDTO test = new SelectCartDTO();
		try {
			BigDecimal postalMax = BigDecimal.valueOf(10000000.00);
			test.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	public void testSetPrice5() throws Exception {
		SelectCartDTO test = new SelectCartDTO();
		try{
		    BigDecimal postalMin = BigDecimal.valueOf(-10000000.00);
		    test.setPrice(postalMin);

		} catch (RuntimeException e) {
		    assertThat(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}


    /**
     * 予約人数を取得するメソッド
     * @return order_count 予約人数
     */

	public void testGetOrder_count1() {
		SelectCartDTO test= new SelectCartDTO();
		int expected = 0;

		test.setOrder_count(expected);

		assertEquals(expected, test.getOrder_count());
	}

	public void testGetOrder_count2() {
		SelectCartDTO test = new SelectCartDTO();
		int expected = 2147483647;

		test.setOrder_count(expected);

		assertEquals(expected, test.getOrder_count());
	}

	public void testGetOrder_count3() {
		SelectCartDTO test = new SelectCartDTO();
		int expected = -2147483647;

		test.setOrder_count(expected);

		assertEquals(expected, test.getOrder_count());
	}

	public void testGetOrder_count4() throws Exception {
		SelectCartDTO test = new SelectCartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	test.setOrder_count(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	public void testGetOrder_count5() throws Exception {
		SelectCartDTO test = new SelectCartDTO();
		try {
		     int postalMin = Integer.parseInt("-2147483649");
		     test.setOrder_count(postalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	/**
	 * 予約人数を格納するメソッド
	 * @param order_count 予約人数
	 */

	public void testSetOrder_count1() {
		SelectCartDTO test = new SelectCartDTO();
		int expected = 0;

		test.setOrder_count(expected);
		int actual = test.getOrder_count();

		assertEquals(expected, actual);
	}

	public void testSetOrder_count2() {
		SelectCartDTO test = new SelectCartDTO();
		int expected = 2147483647;

		test.setOrder_count(expected);
		int actual = test.getOrder_count();

		assertEquals(expected, actual);
	}

	public void testSetOrder_count3() {
		SelectCartDTO test = new SelectCartDTO();
		int expected = -2147483647;

		test.setOrder_count(expected);
		int actual = test.getOrder_count();

		assertEquals(expected, actual);
	}

	public void testSetOrder_count4() throws Exception {
		SelectCartDTO test = new SelectCartDTO();
	    try {
	    	int postalMax = Integer.parseInt("2147483648");
	    	test.setOrder_count(postalMax);

	    } catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}

	public void testSetOrder_count5() throws Exception {
		SelectCartDTO test = new SelectCartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setOrder_count(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


    /**
     * 画像パスを取得するメソッド
     * @return img 画像パス
     */

	public void testGetImg1() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = null;

		test.setImg(expected);
		String actual = test.getImg();

		assertEquals(expected, actual);
	}

	public void testGetImg2() {
		SelectCartDTO test = new SelectCartDTO();
		String expected = "";

		test.setImg(expected);
		String actual = test.getImg();

		assertEquals(expected, actual);
	}

    public void testGetImg3() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = " ";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg4() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "　";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg5() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "abc123";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg6() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "あいう１２３";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg7() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "abc123あいう１２３";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg8() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "abc123あいう１２３漢字";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }


    /**
     * 画像パスを格納するメソッド
     * @param img 画像パス
     */

    public void testSetImg1() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = null;

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg2() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg3() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = " ";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg4() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "　";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg5() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "abc123";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg6(){
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "あいう１２３";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg7() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "abc123あいう１２３";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg8() {
    	SelectCartDTO test = new SelectCartDTO();
    	String expected = "abc123あいう１２３漢字";

    	test.setImg(expected);
    	String actual = test.getImg();

    	assertEquals(expected,actual);
    }
}