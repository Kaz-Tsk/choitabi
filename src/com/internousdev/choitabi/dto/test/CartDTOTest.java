package com.internousdev.choitabi.dto.test;

import java.math.BigDecimal;

import com.internousdev.choitabi.dto.CartDTO;

import junit.framework.TestCase;



public class CartDTOTest extends TestCase {


	/**
	 * ユーザーIDを取得するメソッド
	 * @return user_id ユーザーID
	 */

	public CartDTOTest(String name) {
		super(name);
	}

	public void testGetUser_id1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	public void testGetUser_id2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	public void testGetUser_id3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setUser_id(expected);

		assertEquals(expected, dto.getUser_id());
	}

	public void testGetUser_id4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     int postalMin = Integer.parseInt("-2147483649");
		     dto.setUser_id(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testGetUser_id5() throws Exception {
		CartDTO dto= new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setUser_id(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }

	}


	/**
	 * ユーザーIDを格納するメソッド
	 * @param user_id ユーザーID
	 */

	private void assertThat(String message, String string) {
		assertEquals(message, string);
	}

	public void testSetUser_id1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setUser_id(expected);
		int actual= dto.getUser_id();

		assertEquals(expected, actual);
	}

	public void testSetUser_id2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setUser_id(expected);
		int actual = dto.getUser_id();

		assertEquals(expected, actual);
	}

	public void testSetUser_id3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setUser_id(expected);
		int actual=dto.getUser_id();

		assertEquals(expected, actual);
	}

	public void testSetUser_id4()throws Exception {
		CartDTO dto = new CartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setUser_id(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSetUser_id5() throws Exception {
		CartDTO dto= new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setUser_id(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}


	/**
	 * ツアーIDを取得するメソッド
	 * @return tour_id ツアーID
	 */

	public void testGetTour_id1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setTour_id(expected);

		assertEquals(expected, dto.getTour_id());
	}

	public void testGetTour_id2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setTour_id(expected);

		assertEquals(expected, dto.getTour_id());
	}

	public void testGetTour_id3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setTour_id(expected);

		assertEquals(expected, dto.getTour_id());
	}

	public void testGetTour_id4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     int postalMin = Integer.parseInt("-2147483649");
		     dto.setTour_id(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testGetTour_id5() throws Exception {
		CartDTO dto = new CartDTO();
	    try {
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setTour_id(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}


	/**
	 * ツアーIDを格納するメソッド
	 * @param tour_id ツアーID
	 */

	public void testSetTour_id1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setTour_id(expected);
		int actual = test.getTour_id();

		assertEquals(expected, actual);
	}

	public void testSetTour_id2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setTour_id(expected);
		int actual = dto.getTour_id();

		assertEquals(expected, actual);
	}

	public void testSetTour_id3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setTour_id(expected);
		int actual = dto.getTour_id();

		assertEquals(expected, actual);
	}

	public void testSetTour_id4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setTour_id(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSetTour_id5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setTour_id(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}


	/**
	 * ツアー名を取得するメソッド
	 * @return tour_name ツアー名
	 */

	public void testGetTour_name1() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setTour_name(expected);
		String actual = dto.getTour_name();

		assertEquals(expected, actual);
	}

	public void testGetTour_name2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setTour_name(expected);
		String actual = dto.getTour_name();

		assertEquals(expected, actual);
	}

    public void testGetTour_name3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setTour_name(expected);
    	String actual=dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setTour_name(expected);
    	String actual= dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testGetTour_name8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }


    /**
     * ツアー名を格納するメソッド
     * @param tour_name ツアー名
     */

    public void testSetTour_name() {
    	CartDTO dto = new CartDTO();
    	String expected = null;

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testSetTour_name2() {
    	CartDTO dto = new CartDTO();
    	String expected = "";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testSetTour_name3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testSetTour_name4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testSetTour_name5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testSetTour_name6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testSetTour_name7() {
    	CartDTO dto = new  CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }

    public void testSetTour_name8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setTour_name(expected);
    	String actual = dto.getTour_name();

    	assertEquals(expected, actual);
    }


    /**
     * 予約人数を取得するメソッド
     * @return order_count 予約人数
     */

	public void testGetOrder_count1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setOrder_count(expected);

		assertEquals(expected, dto.getOrder_count());
	}

	public void testGetOrder_count2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setOrder_count(expected);

		assertEquals(expected, dto.getOrder_count());
	}

	public void testGetOrder_count3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setOrder_count(expected);

		assertEquals(expected, dto.getOrder_count());
	}

	public void testGetOrder_count4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     int postalMin = Integer.parseInt("-2147483649");
		     dto.setOrder_count(postalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testGetOrder_count5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setOrder_count(postalMax);

	    } catch (RuntimeException e) {
	    	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}


	/**
	 * 予約人数を格納するメソッド
	 * @param order_count 予約人数
	 */

	public void testSetOrder_count1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setOrder_count(expected);
		int actual = test.getOrder_count();

		assertEquals(expected, actual);
	}

	public void testSetOrder_count2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setOrder_count(expected);
		int actual = dto.getOrder_count();

		assertEquals(expected, actual);
	}

	public void testSetOrder_count3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setOrder_count(expected);
		int actual = dto.getOrder_count();

		assertEquals(expected, actual);
	}

	public void testSetOrder_count4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setOrder_count(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSetOrder_count5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setOrder_count(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}


	/**
	 * 価格を取得するメソッド
	 * @return price 価格BigDecimal price
	 */

	public void testGetPrice1() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	public void testGetPrice2() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	public void testGetPrice3() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	public void testGetPrice4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     BigDecimal postalMin = BigDecimal.valueOf(10000000.00);
		     dto.setPrice(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	public void testGetPrice5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	BigDecimal postalMax = BigDecimal.valueOf(-10000000.00);
	    	dto.setPrice(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"-10000000.00\"");
	    }
	}


	/**
	 * 価格を格納するメソッド
	 * @param price 価格BigDecimal price
	 */

    public void testSetPrice1() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	public void testSetPrice2() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	public void testSetPrice3() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		dto.setPrice(expected);

		assertEquals(expected, dto.getPrice());
	}

	public void testSetPrice4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
			BigDecimal postalMax = BigDecimal.valueOf(10000000.00);
			dto.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	public void testSetPrice5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	BigDecimal postalMin = BigDecimal.valueOf(-10000000.00);
	    	dto.setPrice(postalMin);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"-10000000.00\"");
	    }
	}


	/**
	 * 合計金額を取得するメソッド
	 * @return total_price 合計金額
	 */

	public void testGetTotal_price1() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		dto.setTotal_price(expected);

		assertEquals(expected, dto.getTotal_price());
	}

	public void testGetTotal_price2() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);

		dto.setTotal_price(expected);

		assertEquals(expected, dto.getTotal_price());
	}

	public void testGetTotal_price3() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		dto.setTotal_price(expected);

		assertEquals(expected, dto.getTotal_price());
	}

	public void testGetTotal_price4() throws Exception  {
		CartDTO dto = new CartDTO();
		try {
		     BigDecimal postalMax = BigDecimal.valueOf(10000000.00);
		     dto.setTotal_price(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testGetTotal_price5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	BigDecimal postalMin = BigDecimal.valueOf(-10000000.00);
	    	dto.setTotal_price(postalMin);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}


	/**
	 * 合計金額を格納するメソッド
	 * @param total_price 合計金額
	 */

	public void testSetTotal_price1() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		dto.setTotal_price(expected);
		BigDecimal actual = dto.getTotal_price();

		assertEquals(expected, actual);
	}

	public void testSetTotal_price2() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);

		dto.setTotal_price(expected);
		BigDecimal actual = dto.getTotal_price();

		assertEquals(expected, actual);
	}

	public void testSetTotal_price3() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		dto.setTotal_price(expected);
		BigDecimal actual = dto.getTotal_price();

		assertEquals(expected, actual);
	}

	public void testSetTotal_price4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
			BigDecimal postalMax = BigDecimal.valueOf(10000000.00);
			dto.setTotal_price(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	public void testSetTotal_price5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	BigDecimal postalMin = BigDecimal.valueOf(-10000000.00);
	    	dto.setPrice(postalMin);

	    } catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"-10000000.00\"");
	    }
	}


	/**
	 * 備考を取得するメソッド
	 * @return note 備考
	 */

	public void testGetNote1() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setNote(expected);
		String actual = dto.getNote();

		assertEquals(expected, actual);
	}

	public void testGetNote2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setNote(expected);
		String actual = dto.getNote();

		assertEquals(expected, actual);
	}

    public void testGetNote3() {
    	CartDTO dto = new CartDTO();
    	String expected =" ";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected, actual);
    }

    public void testGetNote4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected, actual);
    }

    public void testGetNote5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected, actual);
    }

    public void testGetNote6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected, actual);
    }

    public void testGetNote7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected, actual);
    }

    public void testGetNote8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected, actual);
    }


    /**
     * 備考を格納するメソッド
     * @param note 備考
     */

    public void testSetNote() {
    	CartDTO dto = new CartDTO();
    	String expected = null;

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected, actual);
    }

    public void testSetNote2() {
    	CartDTO dto = new CartDTO();
    	String expected = "";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected,actual);
    }

    public void testSetNote3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected,actual);
    }


    public void testSetNote4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected,actual);
    }

    public void testSetNote5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected,actual);
    }

    public void testSetNote6(){
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected, actual);
    }

    public void testSetNote7() {
    	CartDTO dto = new  CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected,actual);
    }

    public void testSetNote8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setNote(expected);
    	String actual = dto.getNote();

    	assertEquals(expected,actual);
    }


    /**
     * 画像パスを取得するメソッド
     * @return img 画像パス
     */

	public void testGetImg1() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setImg(expected);
		String actual = dto.getImg();

		assertEquals(expected, actual);
	}

	public void testGetImg2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setImg(expected);
		String actual = dto.getImg();

		assertEquals(expected, actual);
	}

    public void testGetImg3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testGetImg8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }


    /**
     * 画像パスを格納するメソッド
     * @param img 画像パス
     */

    public void testSetImg1() {
    	CartDTO dto = new CartDTO();
    	String expected = null;

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg2() {
    	CartDTO dto = new CartDTO();
    	String expected = "";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg6(){
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg7() {
    	CartDTO dto = new  CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected, actual);
    }

    public void testSetImg8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setImg(expected);
    	String actual = dto.getImg();

    	assertEquals(expected,actual);
    }


    /**
     * 登録日を取得するメソッド
     * @return registration_date 登録日
     */

	public void testGetRegistration_date1() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setRegistration_date(expected);
		String actual = dto.getRegistration_date();

		assertEquals(expected,actual);
	}

	public void testGetRegistration_date2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setRegistration_date(expected);
		String actual = dto.getRegistration_date();

		assertEquals(expected, actual);
	}

    public void testGetRegistration_date3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testGetRegistration_date4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testGetRegistration_date5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testGetRegistration_date6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testGetRegistration_date7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testGetRegistration_date8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }


    /**
     * 登録日を格納するメソッド
     * @param ragistration_date 登録日
     */

    public void testSetRegistration_date() {
    	CartDTO dto = new CartDTO();
    	String expected = null;

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testSetRegistration_date2() {
    	CartDTO dto = new CartDTO();
    	String expected = "";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testSetRegistration_date3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testSetRegistration_date4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testSetRegistration_date5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testSetRegistration_date6(){
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testSetRegistration_date7() {
    	CartDTO dto = new  CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setRegistration_date(expected);
    	String actual = dto.getRegistration_date();

    	assertEquals(expected, actual);
    }

    public void testSetRegistration_date8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setRegistration_date(expected);
    	String actual=dto.getRegistration_date();

    	assertEquals(expected, actual);
    }


    /**
     * 更新日を取得するメソッド
     * @return updated_date 更新日
     */

	public void testGetUpdated_date1() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setUpdated_date(expected);
		String actual = dto.getUpdated_date();

		assertEquals(expected, actual);
	}

	public void testGetUpdated_date2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setUpdated_date(expected);
		String actual = dto.getUpdated_date();

		assertEquals(expected, actual);
	}

    public void testGetUpdated_date3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testGetUpdated_date4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testGetUpdated_date5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testGetUpdated_date6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testGetUpdated_date7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testGetUpdated_date8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }


    /**
     * 更新日を格納するメソッド
     * @param updated_date 更新日
     */

    public void testSetUpdated_date() {
    	CartDTO dto = new CartDTO();
    	String expected = null;

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testSetUpdated_date2() {
    	CartDTO dto = new CartDTO();
    	String expected = "";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testSetUpdated_date3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testSetUpdated_date4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testSetUpdated_date5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testSetUpdated_date6(){
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testSetUpdated_date7() {
    	CartDTO dto = new  CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
    }

    public void testSetUpdated_date8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setUpdated_date(expected);
    	String actual = dto.getUpdated_date();

    	assertEquals(expected, actual);
          }


    /**
     * ツアーカテゴリーを取得するメソッド
     * @return tour_category ツアーカテゴリー
     */

	public void testGetTour_category1() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setTour_category(expected);
		String actual = dto.getTour_category();

		assertEquals(expected, actual);
	}

	public void testGetTour_category2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setTour_category(expected);
		String actual = dto.getTour_category();

		assertEquals(expected, actual);
	}

    public void testGetTour_category3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testGetTour_category4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testGetTour_category5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testGetTour_category6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testGetTour_category7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testGetTour_category8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }


    /**
     * ツアーカテゴリーを格納するメソッド
     * @param tour_category ツアーカテゴリー
     */

    public void testSetTour_category1() {
    	CartDTO dto = new CartDTO();
    	String expected = null;

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }


    public void testSetTour_category2() {
    	CartDTO dto = new CartDTO();
    	String expected = "";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testSetTour_category3() {
    	CartDTO dto = new CartDTO();
    	String expected =" ";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testSetTour_category4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testSetTour_category5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testSetTour_category6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testSetTour_category7() {
    	CartDTO dto = new  CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }

    public void testSetTour_category8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setTour_category(expected);
    	String actual = dto.getTour_category();

    	assertEquals(expected, actual);
    }


    /**
     * 小計を取得するメソッド
     * @return sub_total 小計
     */

	public void testGetSub_total1() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		dto.setSub_total(expected);

		assertEquals(expected, dto.getSub_total());
	}

	public void testGetSub_total2() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);

		dto.setSub_total(expected);

		assertEquals(expected, dto.getSub_total());
	}

	public void testGetSub_total3() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		dto.setSub_total(expected);

		assertEquals(expected, dto.getSub_total());
	}

	public void testGetSub_total4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     BigDecimal postalMax = BigDecimal.valueOf(10000000.00);
		     dto.setSub_total(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	public void testGetSub_total5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	BigDecimal postalMin = BigDecimal.valueOf(-10000000.00);
	    	dto.setSub_total(postalMin);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(),"For input string: \"-10000000.00\"");
	    }
	}


	/**
	 * 小計を格納するメソッド
	 * @param sub_total 小計
	 */

	public void testSetSub_total1() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		dto.setSub_total(expected);

		assertEquals(expected, dto.getSub_total());
	}

	public void testSetSub_total2() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);

		dto.setSub_total(expected);

		assertEquals(expected, dto.getSub_total());
	}

	public void testSetSub_total3() {
		CartDTO dto = new CartDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		dto.setSub_total(expected);

		assertEquals(expected, dto.getSub_total());
	}

	public void testSetSub_total4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
			BigDecimal postalMax = BigDecimal.valueOf(10000000.00);
			dto.setSub_total(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	public void testSetSub_total5() throws Exception {
		CartDTO dto = new CartDTO();
	    try {
	    	BigDecimal postalMin = BigDecimal.valueOf(-10000000.00);
	    	dto.setSub_total(postalMin);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"-10000000.00\"");
	    }
	}


	/**
	 * カートIDを取得するメソッド
	 * @return cart_id カートID
	 */

	public void testGetCart_id1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setCart_id(expected);

		assertEquals(expected, dto.getCart_id());

	}

	public void testGetCart_id2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setCart_id(expected);

		assertEquals(expected, dto.getCart_id());
	}

	public void testGetCart_id3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setCart_id(expected);

		assertEquals(expected, dto.getCart_id());
	}

	public void testGetCart_id4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     int postalMin = Integer.parseInt("-2147483649");
		     dto.setCart_id(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testGetCart_id5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setCart_id(postalMax);

	    } catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}


	/**
	 * カートIDを格納するメソッド
	 * @param cart_id カートID
	 */

	public void testSetCart_id1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setCart_id(expected);
		int actual = dto.getCart_id();

		assertEquals(expected, actual);
	}

	public void testSetCart_id2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setCart_id(expected);
		int actual = dto.getCart_id();

		assertEquals(expected, actual);
	}

	public void testSetCart_id3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setCart_id(expected);
		int actual = dto.getCart_id();

		assertEquals(expected, actual);
	}

	public void testSetCart_id4()throws Exception {
		CartDTO dto = new CartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCart_id(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSetCart_id5() throws Exception {
		CartDTO dto = new CartDTO();
	    try {
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setCart_id(postalMax);

	    } catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}


	/**
	 * 姓を取得するメソッド
	 * @return family _name_kanji 姓
	 */

	public void testGetFamily_name_kanji1() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setFamily_name_kanji(expected);
		String actual = dto.getFamily_name_kanji();

		assertEquals(expected, actual);
	}

	public void testGetFamily_name_kanji2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setFamily_name_kanji(expected);
		String actual = dto.getFamily_name_kanji();

		assertEquals(expected, actual);
	}

    public void testGetFamily_name_kanji3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetFamily_name_kanji4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetFamily_name_kanji5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetFamily_name_kanji6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetFamily_name_kanji7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetFamily_name_kanji8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }


    /**
     * 姓を格納するメソッド
     * @param family_name_kanji 姓
     */

    public void testSetFamily_name_kanji() {
    	CartDTO dto = new CartDTO();
    	String expected = null;

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetFamily_name_kanji2() {
    	CartDTO dto = new CartDTO();
    	String expected = "";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetFamily_name_kanji3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetFamily_name_kanji4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetFamily_name_kanji5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetFamily_name_kanji6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetFamily_name_kanji7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetFamily_name_kanji8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setFamily_name_kanji(expected);
    	String actual = dto.getFamily_name_kanji();

    	assertEquals(expected, actual);
    }


    /**
     * 名を取得するメソッド
     * @param given_name_kanji 名
     */

	public void testGetGiven_name_kanji1() {
		CartDTO dto = new CartDTO();
		String expected = null;

		dto.setGiven_name_kanji(expected);
		String actual = dto.getGiven_name_kanji();

		assertEquals(expected, actual);
	}

	public void testGetGiven_name_kanji2() {
		CartDTO dto = new CartDTO();
		String expected = "";

		dto.setGiven_name_kanji(expected);
		String actual = dto.getGiven_name_kanji();

		assertEquals(expected, actual);
	}

    public void testGetGiven_name_kanji3() {
    	CartDTO dto = new CartDTO();
    	String expected =" ";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetGiven_name_kanji4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetGiven_name_kanji5() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetGiven_name_kanji6() {
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetGiven_name_kanji7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testGetGiven_name_kanji8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }


    /**
     * 名を格納するメソッド
     * @param given_name_kanji 名
     */

    public void testSetGiven_name_kanji1() {
    	CartDTO dto = new CartDTO();
    	String expected = null;

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetGiven_name_kanji2() {
    	CartDTO dto = new CartDTO();
    	String expected = "";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetGiven_name_kanji3() {
    	CartDTO dto = new CartDTO();
    	String expected = " ";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetGiven_name_kanji4() {
    	CartDTO dto = new CartDTO();
    	String expected = "　";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetGiven_name_kanji5() {
    	CartDTO dto = new CartDTO();
    	String expected ="abc123";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetGiven_name_kanji6(){
    	CartDTO dto = new CartDTO();
    	String expected = "あいう１２３";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetGiven_name_kanji7() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }

    public void testSetGiven_name_kanji8() {
    	CartDTO dto = new CartDTO();
    	String expected = "abc123あいう１２３漢字";

    	dto.setGiven_name_kanji(expected);
    	String actual = dto.getGiven_name_kanji();

    	assertEquals(expected, actual);
    }


    /**]
     * 支払い方法を取得するメソッド
     * @return payment_method 支払い方法
     */

	public void testGetPayment_method1() {
		CartDTO dto = new CartDTO();
		int expected = 0;

		dto.setPayment_method(expected);

		assertEquals(expected, dto.getPayment_method());
	}

	public void testGetPayment_method2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setPayment_method(expected);

		assertEquals(expected, dto.getPayment_method());
	}

	public void testGetPayment_method3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setPayment_method(expected);

		assertEquals(expected, dto.getPayment_method());
	}

	public void testGetPaymentMethod4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
		     int postalMin =Integer.parseInt("-2147483649");
		     dto.setPayment_method(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testGetPaymentMethod5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setPayment_method(postalMax);

	    } catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}


	/**
	 * 支払い方法を格納するメソッド
	 * @param payment_method 支払い方法
	 */

	public void testSetPayment_method1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setPayment_method(expected);
		int actual = test.getPayment_method();

		assertEquals(expected, actual);
	}

	public void testSetPayment_method2() {
		CartDTO dto = new CartDTO();
		int expected = 2147483647;

		dto.setPayment_method(expected);
		int actual = dto.getPayment_method();

		assertEquals(expected, actual);
	}

	public void testSetPayment_method3() {
		CartDTO dto = new CartDTO();
		int expected = -2147483647;

		dto.setPayment_method(expected);
		int actual = dto.getPayment_method();

		assertEquals(expected, actual);
	}

	public void testSetPayment_method4() throws Exception {
		CartDTO dto = new CartDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setPayment_method(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSetPayment_method5() throws Exception {
		CartDTO dto = new CartDTO();
	    try{
	    	int postalMax = Integer.parseInt("2147483648");
	    	dto.setPayment_method(postalMax);

	    }catch (RuntimeException e) {
	    	assertThat(e.getMessage(), "For input string: \"2147483648\"");
	    }
	}
}