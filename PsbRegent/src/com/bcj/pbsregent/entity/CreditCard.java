/**
 * 
 */
package com.bcj.pbsregent.entity;

/**
 * @author Boot Camp User 008
 *
 */
public class CreditCard {

	private String cardNo;
	private String name;
	private String cvv;
	private String expDate;
	private float amount;
	
	
	
	
	/**
	 * 
	 */
	public CreditCard() {
		super();
	}
	/**
	 * @param cardNo
	 * @param name
	 * @param cvv
	 * @param expDate
	 * @param amount
	 */
	public CreditCard(String cardNo, String name, String cvv, String expDate, float amount) {
		super();
		this.cardNo = cardNo;
		this.name = name;
		this.cvv = cvv;
		this.expDate = expDate;
		this.amount = amount;
	}
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cvv
	 */
	public String getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}

	
	
}
