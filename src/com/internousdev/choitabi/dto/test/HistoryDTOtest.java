package com.internousdev.choitabi.dto.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.internousdev.choitabi.dto.HistoryDTO;

import junit.framework.TestCase;

public class HistoryDTOtest extends TestCase {
	public HistoryDTOtest(String name) {
		super(name);
	}

	/* ●・○・●・○・●・○・●・○ */
	/* 【int】setuserId */
	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */

	public void testGetuserId1() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 0;
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());

	}

	public void testGetuserId2() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 2147483647;
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	public void testGetuserId3() {
		HistoryDTO dto = new HistoryDTO();
		int expected = -2147483647;
		dto.setUserId(expected);
		assertEquals(expected, dto.getUserId());
	}

	public void testGetuserId4() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setUserId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testGetuserId5() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			dto.setUserId(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	private void assertThat(String message, String string) {
		assertEquals(message, string);
	}

	public void testSetuserId1() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 0;

		dto.setUserId(expected);
		int actual = dto.getUserId();

		assertEquals(expected, actual);
	}

	public void testSetuserId2() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 2147483647;

		dto.setUserId(expected);
		int actual = dto.getUserId();

		assertEquals(expected, actual);
	}

	public void testSetuserId3() {
		HistoryDTO dto = new HistoryDTO();
		int expected = -2147483647;

		dto.setUserId(expected);
		int actual = dto.getUserId();

		assertEquals(expected, actual);
	}

	public void testSetuserId4() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setUserId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSetuserId5() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			dto.setUserId(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */

	/* ●・○・●・○・●・○・●・○ */
	/* 【int】settourId */
	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */

	public void testGettourId1() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 0;
		dto.setTourId(expected);
		assertEquals(expected, dto.getTourId());

	}

	public void testGettourId2() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 2147483647;
		dto.setTourId(expected);
		assertEquals(expected, dto.getTourId());
	}

	public void testGettourId3() {
		HistoryDTO dto = new HistoryDTO();
		int expected = -2147483647;
		dto.setTourId(expected);
		assertEquals(expected, dto.getTourId());
	}

	public void testGettourId4() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setTourId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testGettourId5() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			dto.setTourId(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	public void testSettourId1() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 0;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		assertEquals(expected, actual);
	}

	public void testSettourId2() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 2147483647;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		assertEquals(expected, actual);
	}

	public void testSettourId3() {
		HistoryDTO dto = new HistoryDTO();
		int expected = -2147483647;

		dto.setTourId(expected);
		int actual = dto.getTourId();

		assertEquals(expected, actual);
	}

	public void testSettourId4() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setTourId(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSettourId5() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			dto.setUserId(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */

	/* ●・○・●・○・●・○・●・○ */
	/* 【int】setCounts */
	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */

	public void testGetCounts1() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 0;
		dto.setCounts(expected);
		assertEquals(expected, dto.getCounts());

	}

	public void testGetCounts2() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 2147483647;
		dto.setCounts(expected);
		assertEquals(expected, dto.getCounts());
	}

	public void testGetCounts3() {
		HistoryDTO dto = new HistoryDTO();
		int expected = -2147483647;
		dto.setCounts(expected);
		assertEquals(expected, dto.getCounts());
	}

	public void testGetCounts4() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCounts(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testGetCounts5() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			dto.setCounts(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	public void testSetCounts1() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 0;

		dto.setCounts(expected);
		int actual = dto.getCounts();

		assertEquals(expected, actual);
	}

	public void testSetCounts2() {
		HistoryDTO dto = new HistoryDTO();
		int expected = 2147483647;

		dto.setCounts(expected);
		int actual = dto.getCounts();

		assertEquals(expected, actual);
	}

	public void testSetCounts3() {
		HistoryDTO dto = new HistoryDTO();
		int expected = -2147483647;

		dto.setCounts(expected);
		int actual = dto.getCounts();

		assertEquals(expected, actual);
	}

	public void testSetCounts4() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCounts(postalMin);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	public void testSetCounts5() throws Exception {
		HistoryDTO dto = new HistoryDTO();
		try {
			int postalMax = Integer.parseInt("2147483648");
			dto.setUserId(postalMax);

		} catch (RuntimeException e) {
			assertThat(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */



	/* ●・○・●・○・●・○・●・○ */
	/* 【float】setPrice */
	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */


	@Test
	public void testGetPrice1() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	@Test
	public void testGetPrice2() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected =  BigDecimal.valueOf(9999999.99);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}


	@Test
	public void testGetPrice3() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);//1.4x(10の-45乗)

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}


	@Test
	public void testGetPrice4() {
		HistoryDTO test = new HistoryDTO();
		try {
			BigDecimal priceMax = BigDecimal.valueOf(10000000.00);
			test.setPrice(priceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}


	@Test
	public void testGetPrice5() {
		HistoryDTO test = new HistoryDTO();
		try {
			BigDecimal priceMin = BigDecimal.valueOf(-10000000.00);
			test.setPrice(priceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}


	@Test
	public void testSetPrice1() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}


	@Test
	public void testSetPrice2() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected =  BigDecimal.valueOf(9999999.99);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}


	@Test
	public void testSetPrice3() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	@Test
	public void testSetPrice4() {
		HistoryDTO test = new HistoryDTO();
		try {
			BigDecimal priceMin = BigDecimal.valueOf(10000000.00);
			test.setPrice(priceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetPrice5() {
		HistoryDTO test = new HistoryDTO();
		try {
			BigDecimal priceMin = BigDecimal.valueOf(-10000000.00);
			test.setPrice(priceMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}
	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */



	/* ●・○・●・○・●・○・●・○ */
	/* 【float】setsubtotal */
	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */


	@Test
	public void testGetsubtotal1() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}

	@Test
	public void testGetsubtotal2() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected =  BigDecimal.valueOf(9999999.99);//3.4x(10の38乗)

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}


	@Test
	public void testGetsubtotal3() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected = BigDecimal.valueOf(9999999.99);//1.4x(10の-45乗)

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}


	@Test
	public void testGetsubtotal4() {
		HistoryDTO test = new HistoryDTO();
		try {
			BigDecimal subtotalMax = BigDecimal.valueOf(10000000.00);
			test.setSubtotal(subtotalMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}


	@Test
	public void testGetsubtotal5() {
		HistoryDTO test = new HistoryDTO();
		try {
			BigDecimal subtotalMin = BigDecimal.valueOf(-10000000.00);
			test.setSubtotal(subtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}


	@Test
	public void testSetsubtotal1() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected = BigDecimal.valueOf(0.0);

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}


	@Test
	public void testSetsubtotal2() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected =  BigDecimal.valueOf(9999999.99);

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}


	@Test
	public void testSetsubtotal3() {
		HistoryDTO test = new HistoryDTO();
		BigDecimal expected = BigDecimal.valueOf(-9999999.99);

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}

	@Test
	public void testSetsubtotal4() {
		HistoryDTO test = new HistoryDTO();
		try {
			BigDecimal subtotalMin = BigDecimal.valueOf(10000000.00);
			test.setSubtotal(subtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetsubtotal5() {
		HistoryDTO test = new HistoryDTO();
		try {
			BigDecimal subtotalMin = BigDecimal.valueOf(-10000000.00);
			test.setSubtotal(subtotalMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}
	/*
	 * ●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・
	 */



	/*●・○・●・○・●・○・●・○*/
	/*【string】setRegistrationAt*/
	/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/
		public void testGetRegistrationAt1() {
			HistoryDTO dto= new HistoryDTO();
			String expected=null;

			dto.setRegistrationAt(expected);
			String actual=dto.getRegistrationAt();

			assertEquals(expected,actual);
		}

		public void testGetRegistrationAt2() {
			HistoryDTO dto= new HistoryDTO();
			String expected="";

			dto.setRegistrationAt(expected);
			String actual= dto.getRegistrationAt();

			assertEquals(expected, actual);
		}
	    public void testGetRegistrationAt3() {
	    	HistoryDTO dto=new HistoryDTO();
	    	String expected=" ";

	    	dto.setRegistrationAt(expected);
	    	String actual=dto.getRegistrationAt();

	    	assertEquals(expected, actual);
	    }
	    public void testGetRegistrationAt4() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected ="　";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected, actual);
	    }

	    public void testGetRegistrationAt5() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected ="abc123";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected, actual);
	    }

	    public void testGetRegistrationAt6() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected ="あいう１２３";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected, actual);
	    }

	    public void testGetRegistrationAt7() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected ="abc123あいう１２３";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected, actual);
	    }

	    public void testGetRegistrationAt8() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected ="abc123あいう１２３漢字";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected, actual);
	    }

	    public void testSetRegistrationAt() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected=null;

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected,actual);
	    }

	    public void testSetRegistrationAt2() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected="";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected,actual);
	    }

	    public void testSetRegistrationAt3() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected=" ";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected,actual);
	    }

	    public void testSetRegistrationAt4() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected="　";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected,actual);
	    }

	    public void testSetRegistrationAt5() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected="abc123";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected,actual);
	    }

	    public void testSetRegistrationAt6(){
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected= "あいう１２３";

	    	dto.setRegistrationAt(expected);
	    	String actual=dto.getRegistrationAt();

	    	assertEquals(expected, actual);
	    }

	    public void testSetRegistrationAt7() {
	    	HistoryDTO dto= new  HistoryDTO();
	    	String expected= "abc123あいう１２３";

	    	dto.setRegistrationAt(expected);
	    	String actual= dto.getRegistrationAt();

	    	assertEquals(expected,actual);
	    }

	    public void testSetRegistrationAt8() {
	    	HistoryDTO dto= new HistoryDTO();
	    	String expected= "abc１２３あいう漢字";

	    	dto.setRegistrationAt(expected);
	    	String actual=dto.getRegistrationAt();

	    	assertEquals(expected,actual);
	          }
	/*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/



	    /*●・○・●・○・●・○・●・○*/
	    /*【string】setTourName*/
	    /*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/
	    	public void testGetTourName1() {
	    		HistoryDTO dto= new HistoryDTO();
	    		String expected=null;

	    		dto.setTourName(expected);
	    		String actual=dto.getTourName();

	    		assertEquals(expected,actual);
	    	}

	    	public void testGetTourName2() {
	    		HistoryDTO dto= new HistoryDTO();
	    		String expected="";

	    		dto.setTourName(expected);
	    		String actual= dto.getTourName();

	    		assertEquals(expected, actual);
	    	}
	        public void testGetTourName3() {
	        	HistoryDTO dto=new HistoryDTO();
	        	String expected=" ";

	        	dto.setTourName(expected);
	        	String actual=dto.getTourName();

	        	assertEquals(expected, actual);
	        }
	        public void testGetTourName4() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected ="　";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected, actual);
	        }

	        public void testGetTourName5() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected ="abc123";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected, actual);
	        }

	        public void testGetTourName6() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected ="あいう１２３";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected, actual);
	        }

	        public void testGetTourName7() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected ="abc123あいう１２３";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected, actual);
	        }

	        public void testGetTourName8() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected ="abc123あいう１２３漢字";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected, actual);
	        }

	        public void testSetTourName() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected=null;

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected,actual);
	        }

	        public void testSetTourName2() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected="";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected,actual);
	        }

	        public void testSetTourName3() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected=" ";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected,actual);
	        }

	        public void testSetTourName4() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected="　";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected,actual);
	        }

	        public void testSetTourName5() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected="abc123";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected,actual);
	        }

	        public void testSetTourName6(){
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected= "あいう１２３";

	        	dto.setTourName(expected);
	        	String actual=dto.getTourName();

	        	assertEquals(expected, actual);
	        }

	        public void testSetTourName7() {
	        	HistoryDTO dto= new  HistoryDTO();
	        	String expected= "abc123あいう１２３";

	        	dto.setTourName(expected);
	        	String actual= dto.getTourName();

	        	assertEquals(expected,actual);
	        }

	        public void testSetTourName8() {
	        	HistoryDTO dto= new HistoryDTO();
	        	String expected= "abc１２３あいう漢字";

	        	dto.setTourName(expected);
	        	String actual=dto.getTourName();

	        	assertEquals(expected,actual);
	              }
	    /*●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・○・●・*/





}
