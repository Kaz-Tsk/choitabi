package com.internousdev.choitabi.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.choitabi.dto.MypageDTO;

public class MypageDTOTest {
	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getUserId()}のためのテストメソッド。
	 */
	@Test
	public void testGetUserId1() {
		MypageDTO test = new MypageDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected,test.getUserId());

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getUserId()}のためのテストメソッド。
	 */
	@Test
	public void testGetUserId2() {
		MypageDTO test = new MypageDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected,test.getUserId());

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getUserId()}のためのテストメソッド。
	 */
	@Test
	public void testGetUserId3() {
		MypageDTO test = new MypageDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected,test.getUserId());

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getUserId()}のためのテストメソッド。
	 */
	@Test
	public void testGetUserId4() {
		MypageDTO test = new MypageDTO();
		try{
			int UserIdMin = Integer.parseInt("2147483648");
			test.setUserId(UserIdMin);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getUserId()}のためのテストメソッド。
	 */
	@Test
	public void testGetUserId5() {
		MypageDTO test = new MypageDTO();
		try{
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMin);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setUserId(int)}のためのテストメソッド。
	 */
	@Test
	public void testSetUserId1(){
		MypageDTO test = new MypageDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setUserId(int)}のためのテストメソッド。
	 */
	@Test
	public void testSetUserId2(){
		MypageDTO test = new MypageDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setUserId(int)}のためのテストメソッド。
	 */
	@Test
	public void testSetUserId3(){
		MypageDTO test = new MypageDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setUserId(int)}のためのテストメソッド。
	 */
	@Test
	public void testSetUserId4(){
		MypageDTO test = new MypageDTO();
		try{
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setUserId(int)}のためのテストメソッド。
	 */
	@Test
	public void testSetUserId5(){
		MypageDTO test = new MypageDTO();
		try{
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getPassword()}のためのテストメソッド。
	 */
	@Test
	public void testGetPassword1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getPassword()}のためのテストメソッド。
	 */
	@Test
	public void testGetPassword2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getPassword()}のためのテストメソッド。
	 */
	@Test
	public void testGetPassword3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getPassword()}のためのテストメソッド。
	 */
	@Test
	public void testGetPassword4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getPassword()}のためのテストメソッド。
	 */
	@Test
	public void testGetPassword5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getPassword()}のためのテストメソッド。
	 */
	@Test
	public void testGetPassword6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getPassword()}のためのテストメソッド。
	 */
	@Test
	public void testGetPassword7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getPassword()}のためのテストメソッド。
	 */
	@Test
	public void testGetPassword8() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setPassword(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetPassword1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setPassword(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetPassword2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setPassword(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetPassword3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setPassword(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetPassword4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setPassword(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetPassword5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setPassword(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetPassword6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setPassword(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetPassword7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setPassword(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetPassword8() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getFamilyNamekanji()}のためのテストメソッド。
	 */
	@Test
	public void testgetFamilyNameKanji1() {
		MypageDTO test = new MypageDTO();
		String expected =null;

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getFamilyNamekanji()}のためのテストメソッド。
	 */
	@Test
	public void testgetFamilyNameKanji2() {
		MypageDTO test = new MypageDTO();
		String expected ="";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getFamilyNamekanji()}のためのテストメソッド。
	 */
	@Test
	public void testgetFamilyNameKanji3() {
		MypageDTO test = new MypageDTO();
		String expected =" ";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getFamilyNamekanji()}のためのテストメソッド。
	 */
	@Test
	public void testgetFamilyNameKanji4() {
		MypageDTO test = new MypageDTO();
		String expected ="　";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getFamilyNamekanji()}のためのテストメソッド。
	 */
	@Test
	public void testgetFamilyNameKanji5() {
		MypageDTO test = new MypageDTO();
		String expected ="abc123";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getFamilyNamekanji()}のためのテストメソッド。
	 */
	@Test
	public void testgetFamilyNameKanji6() {
		MypageDTO test = new MypageDTO();
		String expected ="あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getFamilyNamekanji()}のためのテストメソッド。
	 */
	@Test
	public void testgetFamilyNameKanji7() {
		MypageDTO test = new MypageDTO();
		String expected ="abc123あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getFamilyNamekanji()}のためのテストメソッド。
	 */
	@Test
	public void testgetFamilyNameKanji8() {
		MypageDTO test = new MypageDTO();
		String expected ="abc123あいう１２３漢字";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}



	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setFamilyNamekanji(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetFamilyNameKanji1() {
		MypageDTO test = new MypageDTO();
		String expected =null;

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setFamilyNamekanij(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetFamilyNameKanji2() {
		MypageDTO test = new MypageDTO();
		String expected ="";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setFamilyNamekanij(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetFamilyNameKanji3() {
		MypageDTO test = new MypageDTO();
		String expected =" ";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setFamilyNamekanij(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetFamilyNameKanji4() {
		MypageDTO test = new MypageDTO();
		String expected ="　";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setFamilyNamekanij(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetFamilyNameKanji5() {
		MypageDTO test = new MypageDTO();
		String expected ="abc123";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setFamilyNamekanij(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetFamilyNameKanji6() {
		MypageDTO test = new MypageDTO();
		String expected ="あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setFamilyNamekanij(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetFamilyNameKanji7() {
		MypageDTO test = new MypageDTO();
		String expected ="abc123あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setFamilyNamekanij(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetFamilyNameKanji8() {
		MypageDTO test = new MypageDTO();
		String expected ="abc123あいう１２３漢字";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected,actual);
	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getGivenNameKanji()}のためのテストメソッド。
	 */
	@Test
	public void testGetGivenNameKanji1() {
		MypageDTO test =new MypageDTO();
		String expected = null;

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getGivenNameKanji()}のためのテストメソッド。
	 */
	@Test
	public void testGetGivenNameKanji2() {
		MypageDTO test =new MypageDTO();
		String expected = "";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getGivenNameKanji()}のためのテストメソッド。
	 */
	@Test
	public void testGetGivenNameKanji3() {
		MypageDTO test =new MypageDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getGivenNameKanji()}のためのテストメソッド。
	 */
	@Test
	public void testGetGivenNameKanji4() {
		MypageDTO test =new MypageDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getGivenNameKanji()}のためのテストメソッド。
	 */
	@Test
	public void testGetGivenNameKanji5() {
		MypageDTO test =new MypageDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getGivenNameKanji()}のためのテストメソッド。
	 */
	@Test
	public void testGetGivenNameKanji6() {
		MypageDTO test =new MypageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getGivenNameKanji()}のためのテストメソッド。
	 */
	@Test
	public void testGetGivenNameKanji7() {
		MypageDTO test =new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getGivenNameKanji()}のためのテストメソッド。
	 */
	@Test
	public void testGetGivenNameKanji8() {
		MypageDTO test =new MypageDTO();
		String expected = "abc123あいう１２３漢字";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setGivenNameKanji(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetGivenNameKanji1() {
		MypageDTO test =new MypageDTO();
		String expected = null;

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setGivenNameKanji(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetGivenNameKanji2() {
		MypageDTO test =new MypageDTO();
		String expected = "";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setGivenNameKanji(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetGivenNameKanji3() {
		MypageDTO test =new MypageDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setGivenNameKanji(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetGivenNameKanji4() {
		MypageDTO test =new MypageDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setGivenNameKanji(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetGivenNameKanji5() {
		MypageDTO test =new MypageDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setGivenNameKanji(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetGivenNameKanji6() {
		MypageDTO test =new MypageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setGivenNameKanji(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetGivenNameKanji7() {
		MypageDTO test =new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setGivenNameKanji(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetGivenNameKanji8() {
		MypageDTO test =new MypageDTO();
		String expected = "abc123あいう１２３漢字";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getAddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetAddress1() {
		MypageDTO test =new MypageDTO();
		String expected =null;

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getAddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetAddress2() {
		MypageDTO test =new MypageDTO();
		String expected ="";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getAddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetAddress3() {
		MypageDTO test =new MypageDTO();
		String expected =" ";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getAddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetAddress4() {
		MypageDTO test =new MypageDTO();
		String expected ="　";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getAddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetAddress5() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getAddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetAddress6() {
		MypageDTO test =new MypageDTO();
		String expected ="あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getAddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetAddress7() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getAddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetAddress8() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３漢字";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setAddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetAddress1() {
		MypageDTO test =new MypageDTO();
		String expected =null;

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setAddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetAddress2() {
		MypageDTO test =new MypageDTO();
		String expected ="";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setAddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetAddress3() {
		MypageDTO test =new MypageDTO();
		String expected =" ";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setAddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetAddress4() {
		MypageDTO test =new MypageDTO();
		String expected ="　";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setAddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetAddress5() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setAddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetAddress6() {
		MypageDTO test =new MypageDTO();
		String expected ="あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setAddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetAddress7() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setAddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetAddress8() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３漢字";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getTelNumber()}のためのテストメソッド。
	 */
	@Test
	public void testGetTelNumber1() {
		MypageDTO test =new MypageDTO();
		String expected =null;

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getTelNumber()}のためのテストメソッド。
	 */
	@Test
	public void testGetTelNumber2() {
		MypageDTO test =new MypageDTO();
		String expected ="";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getTelNumber()}のためのテストメソッド。
	 */
	@Test
	public void testGetTelNumber3() {
		MypageDTO test =new MypageDTO();
		String expected =" ";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getTelNumber()}のためのテストメソッド。
	 */
	@Test
	public void testGetTelNumber4() {
		MypageDTO test =new MypageDTO();
		String expected ="　";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getTelNumber()}のためのテストメソッド。
	 */
	@Test
	public void testGetTelNumber5() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getTelNumber()}のためのテストメソッド。
	 */
	@Test
	public void testGetTelNumber6() {
		MypageDTO test =new MypageDTO();
		String expected ="あいう１２３";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getTelNumber()}のためのテストメソッド。
	 */
	@Test
	public void testGetTelNumber7() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getTelNumber()}のためのテストメソッド。
	 */
	@Test
	public void testGetTelNumber8() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３漢字";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setTelNumber(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetTelNumber1() {
		MypageDTO test =new MypageDTO();
		String expected ="";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setTelNumber(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetTelNumber2() {
		MypageDTO test =new MypageDTO();
		String expected =" ";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setTelNumber(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetTelNumber3() {
		MypageDTO test =new MypageDTO();
		String expected ="　";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setTelNumber(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetTelNumber4() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setTelNumber(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetTelNumber5() {
		MypageDTO test =new MypageDTO();
		String expected ="あいう１２３";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setTelNumber(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetTelNumber6() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setTelNumber(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetTelNumber7() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setTelNumber(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetTelNumber8() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３漢字";

		test.setTelNumber(expected);
		String actual = test.getTelNumber();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getMailaddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetMailAddress1() {
		MypageDTO test =new MypageDTO();
		String expected =null;

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getMailaddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetMailAddress2() {
		MypageDTO test =new MypageDTO();
		String expected ="";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getMailaddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetMailAddress3() {
		MypageDTO test =new MypageDTO();
		String expected =" ";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getMailaddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetMailAddress4() {
		MypageDTO test =new MypageDTO();
		String expected ="　";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getMailaddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetMailAddress5() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getMailaddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetMailAddress6() {
		MypageDTO test =new MypageDTO();
		String expected ="あいう１２３";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getMailaddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetMailAddress7() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#getMailaddress()}のためのテストメソッド。
	 */
	@Test
	public void testGetMailAddress8() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３漢字";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setMailaddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetMailAddress1() {
		MypageDTO test =new MypageDTO();
		String expected =null;

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setMailaddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetMailAddress2() {
		MypageDTO test =new MypageDTO();
		String expected ="";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}


	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setMailaddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetMailAddress3() {
		MypageDTO test =new MypageDTO();
		String expected =" ";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setMailaddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetMailAddress4() {
		MypageDTO test =new MypageDTO();
		String expected ="　";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setMailaddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetMailAddress5() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setMailaddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetMailAddress6() {
		MypageDTO test =new MypageDTO();
		String expected ="あいう１２３";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setMailaddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetMailAddress7() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

	/**
	 * {@link com.internousdev.choitabi.dto.MypageDTO#setMailaddress(java.lang.String)}のためのテストメソッド。
	 */
	@Test
	public void testSetMailAddress8() {
		MypageDTO test =new MypageDTO();
		String expected ="abc123あいう１２３漢字";

		test.setMailAddress(expected);
		String actual = test.getMailAddress();

		assertEquals(expected,actual);

	}

}
