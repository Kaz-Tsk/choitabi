package com.internousdev.choitabi.dto;



public class UsersDTO {

	private String password;
	private String mailAddress;
	private int userId;
	private int userFlg;




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
	 *@return userId
	 */
	public int getUserId(){
		return userId;
	}

	/**
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}

	/**
	 * @return userFlg
	 */
	public int getUserFlg(){
		return userFlg;
	}

	/**
	 * @param userFlg
	 */
	public void setUserFlg(int userFlg){
		this.userFlg = userFlg;
	}
}
