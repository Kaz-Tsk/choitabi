package com.internousdev.choitabi.dto;



public class UsersDTO {

	private int userId;
	private String password;
	private String mailAddress;
	private boolean userdelFlg;
	private boolean loginFlg;
	private int userFlg;


	/**
	 * @return userId
	 */
	public int getUserId(){
		return userId;
	}
	/**
	 * @param userId set
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}
	/**
	 * @return password
	 */
	public String getPassword(){
		return password;
	}
	/**
	 * @param password set
	 */
	public void setPassword(String password){
		this.password = password;
	}
	/**
	 * @return mailAddress
	 */
	public String getMailAddress(){
		return mailAddress;
	}
	/**
	 * @param mailAddress set
	 */
	public void setMailAddress(String mailAddress){
		this.mailAddress = mailAddress;
	}
	/**
	 * @return userdelFlg
	 */
	public boolean isUserdelFlg(){
		return userdelFlg;
	}
	/**
	 * @param userdelFlg set
	 */
	public void setUserdelFlg(boolean userdelFlg){
		this.userdelFlg = userdelFlg;
	}
	/**
	 * @return loginFlg
	 */
	public boolean isLoginFlg(){
		return loginFlg;
	}
	/**
	 * @param loginFlg set
	 */
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}
	/**
	 * userFlg
	 */
	public int getUserFlg(){
		return userFlg;
	}
	/**
	 * @param userFlg set
	 */
	public void setUserFlg(int userFlg){
		this.userFlg = userFlg;
	}
	}

