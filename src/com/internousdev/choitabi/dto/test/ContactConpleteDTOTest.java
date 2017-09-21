package com.internousdev.choitabi.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.choitabi.dto.ContactConpleteDTO;

public class ContactConpleteDTOTest {


	@Test
	public void testSetContact_name() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = null;

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_name2() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_name3() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = " ";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_name4() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "　";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_name5() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_name6() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "あいう１２３";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_name7() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123あいう１２３";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_name8() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123あいう１２３漢字";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetContact_name() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = null;

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_name2() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_name3() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = " ";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_name4() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "　";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_name5() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_name6() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "あいう１２３";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_name7() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123あいう１２３";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_name8() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123あいう１２３漢字";

		test.setContact_name(expected);
		String actual = test.getContact_name();

		assertEquals(expected,actual);
	}



	@Test
	public void testGetContact_mailAddress1() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = null;

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_mailAddress2() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_mailAddress3() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = " ";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_mailAddress4() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "　";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_mailAddress5() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_mailAddress6() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "あいう１２３";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_mailAddress7() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123あいう１２３";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_mailAddress8() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123あいう１２３漢字";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_mailAddress1() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = null;

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_mailAddress2() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_mailAddress3() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = " ";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_mailAddress4() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "　";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_mailAddress5() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_mailAddress6() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "あいう１２３";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_mailAddress7() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123あいう１２３";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_mailAddress8() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123あいう１２３漢字";

		test.setContact_mailAddress(expected);
		String actual = test.getContact_mailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetContact_contents1() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = null;

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_contents2() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_contents3() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = " ";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_contents4() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "　";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_contents5() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_contents6() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "あいう１２３";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_contents7() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "abc123あいう１２３";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetContact_contents8() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "adc123あいう１２３漢字";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_contents1() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = null;

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetContact_contents2() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetContact_contents3() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = " ";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetContact_contents4() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "　";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetContact_contents5() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "adc123";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetContact_contents6() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "あいう１２３";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetContact_contents7() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "adc123あいう１２３";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetContact_contents8() {
		ContactConpleteDTO test = new ContactConpleteDTO();
		String expected = "adc123あいう１２３漢字";

		test.setContact_contents(expected);
		String actual = test.getContact_contents();

		assertEquals(expected,actual);
	}
}
