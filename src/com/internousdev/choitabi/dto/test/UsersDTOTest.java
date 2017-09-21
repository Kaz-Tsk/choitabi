package com.internousdev.choitabi.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.choitabi.dto.UsersDTO;

public class UsersDTOTest {

	private static final int MAX_VALUE = 0;
	private static final int MIN_VALUE = 0;
	private static final int Exception = 0;

	@Test
	public void testGetPassword1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword3() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword4() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword5() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword6() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword8() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetPassword3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetPassword4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetPassword5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetPassword6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetPassword7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetPassword8() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetMailAddress1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetMailAddress2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetMailAddress3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetMailAddress4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetMailAddress5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetMailAddress6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetMailAddress7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetMailAddress8() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３漢字";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetMailAddress1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetMailAddress2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetMailAddress3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetMailAddress4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetMailAddress5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetMailAddress6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetMailAddress7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetMailAddress8() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３漢字";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId2() {
		UsersDTO test = new UsersDTO();
		int expected = MAX_VALUE;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId3() {
		UsersDTO test = new UsersDTO();
		int expected = MIN_VALUE;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId4() {
		UsersDTO test = new UsersDTO();
		int expected = Exception;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId2() {
		UsersDTO test = new UsersDTO();
		int expected = MAX_VALUE;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId3() {
		UsersDTO test = new UsersDTO();
		int expected = MIN_VALUE;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId4() {
		UsersDTO test = new UsersDTO();
		int expected = Exception;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserFlg1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserFlg2() {
		UsersDTO test = new UsersDTO();
		int expected = MAX_VALUE;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserFlg3() {
		UsersDTO test = new UsersDTO();
		int expected = MIN_VALUE;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserFlg4() {
		UsersDTO test = new UsersDTO();
		int expected = Exception;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserFlg1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserFlg2() {
		UsersDTO test = new UsersDTO();
		int expected = MAX_VALUE;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserFlg3() {
		UsersDTO test = new UsersDTO();
		int expected = MIN_VALUE;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserFlg4() {
		UsersDTO test = new UsersDTO();
		int expected = Exception;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected,actual);
	}

	@Test
	public void testIsLoginFlg1() {
		UsersDTO test = new UsersDTO();
		Boolean expected = true;

		test.setLoginFlg(expected);
		Boolean actual = test.isLoginFlg();

		assertEquals(expected,actual);
	}

	@Test
	public void testIsLoginFlg2() {
		UsersDTO test = new UsersDTO();
		Boolean expected = false;

		test.setLoginFlg(expected);
		Boolean actual = test.isLoginFlg();

		assertEquals(expected,actual);
	}
	@Test
	public void testSetLoginFlg1() {
		UsersDTO test = new UsersDTO();
		Boolean expected = true;

		test.setLoginFlg(expected);
		Boolean actual = test.isLoginFlg();

		assertEquals(expected,actual);

	}

	@Test
	public void testSetLoginFlg2() {
		UsersDTO test = new UsersDTO();
		Boolean expected = true;

		test.setLoginFlg(expected);
		Boolean actual = test.isLoginFlg();

		assertEquals(expected,actual);

	}
}
