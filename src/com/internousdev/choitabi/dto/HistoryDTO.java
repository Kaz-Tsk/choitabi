/**
 *
 */
package com.internousdev.choitabi.dto;

import java.math.BigDecimal;

/**
 * 購入履歴に関するDTOクラス
 * @author KAZUYUKI TASAKI
 *@since 2017/9/15
 *@version 1.0
 */
public class HistoryDTO {

	/**
	 * userId
	 */
	private int userId;

	/**
	 * tourId
	 */
	private int tourId;

	/**
	 * price
	 */
	private BigDecimal price;

	/**
	 * counts
	 */
	private int counts;

	/**
	 * subtotal
	 */
	private BigDecimal subtotal;

	/**
	 * registrationAt
	 */
	private String registrationAt;

	/**
	 * tourName
	 */
	private String tourName;


	/**
	 * userId
	 * @return userId
	 */
	public int getUserId(){
		return userId;
	}

	/**
	 * userId
	 * @param userId
	 */
	public void setUserId(int userId){
		this.userId = userId;
	}

	/**
	 * tourId
	 * @return tourId
	 */
	public int getTourId(){
		return tourId;
	}

	/**
	 * tourId
	 * @param tourId
	 */
	public void setTourId(int tourId){
		this.tourId = tourId;
	}

	/**
	 *price
	 *@return price
	 */
	public BigDecimal getPrice(){
		return price;
	}

	/**
	 * price
	 * @param price
	 */
	public void setPrice(BigDecimal price){
		this.price = price;
	}

	/**
	 * counts
	 * @return counts
	 */
	public int getCounts(){
		return counts;
	}

	/**
	 * counts
	 * @param counts
	 */
	public void setCounts(int counts){
		this.counts = counts;
	}

	/**
	 * subtototal
	 * @return subtotal
	 */
	public BigDecimal getSubtotal(){
		return subtotal;
	}

	/**
	 * subtotal
	 * @param subtotal
	 */
	public void setSubtotal(BigDecimal subtotal){
		this.subtotal = subtotal;
	}

	/**
	 * registrationAt
	 * @return registrationAt
	 */
	public String getRegistrationAt(){
		return registrationAt;
	}

	public void setRegistrationAt(String registrationAt){
		this.registrationAt = registrationAt;
	}

	/**
	 * tourName
	 * @return tourName
	 */
	public String getTourName(){
		return tourName;
	}

	/**
	 * tourName
	 * @param tourName
	 */
	public void setTourName(String tourName){
		this.tourName = tourName;
	}

}
