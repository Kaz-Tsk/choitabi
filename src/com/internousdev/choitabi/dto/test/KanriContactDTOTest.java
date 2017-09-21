package com.internousdev.choitabi.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.choitabi.dto.KanriContactDTO;

public class KanriContactDTOTest {

	@Test
	public void testGetContact_name() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = null;

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}



	public void testGetContact_name1() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
 	}



	public void testGetContact_name2() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = " ";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}



	public void testGetContact_name3() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "　";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}



	public void testGetContact_name4() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "abc123";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}


	public void testGetContact_name5() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "あいう１２３";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}




	public void testGetContact_name6() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "abc123あいう１２３";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}




	public void testGetContact_name7() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "abc123あいう１２３漢字";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}



	@Test
	public void testSetContact_name() {
		     KanriContactDTO test = new KanriContactDTO();
		     String expected = null;

		     test.setContact_name(expected);
		     String actual = test.getContact_name();

		     assertEquals(expected,actual);
	 	}



	public void testSetContact_name1() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}




	public void testSetContact_name2() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = " ";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}





	public void testSetContact_name3() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "　";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}



	public void testSetContact_name4() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "abc123";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}



	public void testSetContact_name5() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "あいう１２３";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}




	public void testSetContact_name6() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "abc123あいう１２３";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}




	public void testSetContact_name7() {
	     KanriContactDTO test = new KanriContactDTO();
	     String expected = "abc123あいう１２３漢字";

	     test.setContact_name(expected);
	     String actual = test.getContact_name();

	     assertEquals(expected,actual);
	}



	@Test
	public void testGetContact_mailAddress() {
		KanriContactDTO test = new KanriContactDTO();
		String expected =null ;

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}



	public void testGetContact_mailAddress1() {
		KanriContactDTO test = new KanriContactDTO();
		String expected ="" ;

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testGetContact_mailAddress3() {
		KanriContactDTO test = new KanriContactDTO();
		String expected =" " ;

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testGetContact_mailAddress4() {
		KanriContactDTO test = new KanriContactDTO();
		String expected ="　" ;

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testGetContact_mailAddress5() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "abc123";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}



	public void testGetContact_mailAddress6() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "あいう１２３";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testGetContact_mailAddress7() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "abc123あいう１２3";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}



	public void testGetContact_mailAddress8() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "abc123あいう１２３漢字";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_mailAddress() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = null;

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testSetContact_mailAddress1() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testSetContact_mailAddress2() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = " ";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testSetContact_mailAddress3() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "　";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testSetContact_mailAddress4() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "abc123";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testSetContact_mailAddress5() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "あいう１２３";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}


	public void testSetContact_mailAddress6() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "abc123あいう１２３";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	public void testSetContact_mailAddress7() {
		KanriContactDTO test = new KanriContactDTO();
		String expected = "abc123あいう１２３漢字";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_contents() {
        KanriContactDTO test =new KanriContactDTO();
        String expected = null;

        test.setContact_contents(expected);
        String actual = test.getContact_contents();

        assertEquals(expected,actual);
	}


	public void testGetContact_contents1() {
        KanriContactDTO test =new KanriContactDTO();
        String expected = "";

        test.setContact_contents(expected);
        String actual = test.getContact_contents();

        assertEquals(expected,actual);
	}



	public void testGetContact_content2s() {
        KanriContactDTO test =new KanriContactDTO();
        String expected = " ";

        test.setContact_contents(expected);
        String actual = test.getContact_contents();

        assertEquals(expected,actual);
	}



	public void testGetContact_contents3() {
        KanriContactDTO test =new KanriContactDTO();
        String expected = "　";

        test.setContact_contents(expected);
        String actual = test.getContact_contents();

        assertEquals(expected,actual);
	}



	public void testGetContact_contents4() {
        KanriContactDTO test =new KanriContactDTO();
        String expected = "abc123";

        test.setContact_contents(expected);
        String actual = test.getContact_contents();

        assertEquals(expected,actual);
	}



	public void testGetContact_contents5() {
        KanriContactDTO test =new KanriContactDTO();
        String expected = "あいう１２３";

        test.setContact_contents(expected);
        String actual = test.getContact_contents();

        assertEquals(expected,actual);
	}


	public void testGetContact_contents6() {
        KanriContactDTO test =new KanriContactDTO();
        String expected = "abc123あいう１２３";

        test.setContact_contents(expected);
        String actual = test.getContact_contents();

        assertEquals(expected,actual);
	}



	public void testGetContact_contents7() {
        KanriContactDTO test =new KanriContactDTO();
        String expected = "abc123あいう１２３漢字";

        test.setContact_contents(expected);
        String actual = test.getContact_contents();

        assertEquals(expected,actual);
	}



	@Test
	public void testSetContact_contents() {
		 KanriContactDTO test =new KanriContactDTO();
	        String expected =null;

	        test.setContact_contents(expected);
	        String actual = test.getContact_contents();

	        assertEquals(expected,actual);

	}


	public void testSetContact_contents1() {
		 KanriContactDTO test =new KanriContactDTO();
	        String expected ="";

	        test.setContact_contents(expected);
	        String actual = test.getContact_contents();

	        assertEquals(expected,actual);

	}


	public void testSetContact_contents2() {
		 KanriContactDTO test =new KanriContactDTO();
	        String expected =" ";

	        test.setContact_contents(expected);
	        String actual = test.getContact_contents();

	        assertEquals(expected,actual);

	}


	public void testSetContact_contents3() {
		 KanriContactDTO test =new KanriContactDTO();
	        String expected ="　";

	        test.setContact_contents(expected);
	        String actual = test.getContact_contents();

	        assertEquals(expected,actual);

	}



	public void testSetContact_contents4() {
		 KanriContactDTO test =new KanriContactDTO();
	        String expected ="abc123";

	        test.setContact_contents(expected);
	        String actual = test.getContact_contents();

	        assertEquals(expected,actual);

	}


	public void testSetContact_contents5() {
		 KanriContactDTO test =new KanriContactDTO();
	        String expected ="あいう１２３";

	        test.setContact_contents(expected);
	        String actual = test.getContact_contents();

	        assertEquals(expected,actual);

	}


	public void testSetContact_contents6() {
		 KanriContactDTO test =new KanriContactDTO();
	        String expected ="abc123あいう１２３";

	        test.setContact_contents(expected);
	        String actual = test.getContact_contents();

	        assertEquals(expected,actual);

	}


	public void testSetContact_contents7() {
		 KanriContactDTO test =new KanriContactDTO();
	        String expected ="abc123あいう１２３漢字";

	        test.setContact_contents(expected);
	        String actual = test.getContact_contents();

	        assertEquals(expected,actual);

	}
	@Test
	public void testGetRegistrationDate() {
		KanriContactDTO test =new KanriContactDTO();
        String expected =null;

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}


	public void testGetRegistrationDate1() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}


	public void testGetRegistrationDate2() {
		KanriContactDTO test =new KanriContactDTO();
        String expected =" ";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}



	public void testGetRegistrationDate3() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="　";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}



	public void testGetRegistrationDate4() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="abc123";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}



	public void testGetRegistrationDate5() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="あいう１２３";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}


	public void testGetRegistrationDate6() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="abc123あいう１２３";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}


	public void testGetRegistrationDate7() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="abc123あいう１２３漢字";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}



	@Test
	public void testSetRegistrationDate() {
		KanriContactDTO test =new KanriContactDTO();
        String expected =null;

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}



	public void testSetRegistrationDate2() {
		KanriContactDTO test =new KanriContactDTO();
        String expected =" ";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}



	public void testSetRegistrationDate3() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="　";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}



	public void testSetRegistrationDate4() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="abc123";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}



	public void testSetRegistrationDate5() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="あいう１２３";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}



	public void testSetRegistrationDate6() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="abc123 あいう１２３";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}




	public void testSetRegistrationDate7() {
		KanriContactDTO test =new KanriContactDTO();
        String expected ="abc123 あいう１２３漢字";

        test.setRegistrationDate(expected);
        String actual = test.getRegistrationDate();

        assertEquals(expected,actual);
	}

}
