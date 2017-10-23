/**
 * 
 */
package com.padmaja.eliminationtest.entity;

/**
 * @author Boot Camp User 008
 *
 */
public class CreditCard {
	
	private int ccNo;
	private String name;
	private int cvv;
	private float amount;
	
	/**
	 * 
	 */
	public CreditCard() {
		super();
	}
	/**
	 * @param ccNo
	 * @param name
	 * @param cvv
	 * @param amount
	 */
	public CreditCard(int ccNo, String name, int cvv, float amount) {
		super();
		this.ccNo = ccNo;
		this.name = name;
		this.cvv = cvv;
		this.amount = amount;
	}
	/**
	 * @return the ccNo
	 */
	public int getCcNo() {
		return ccNo;
	}
	/**
	 * @param ccNo the ccNo to set
	 */
	public void setCcNo(int ccNo) {
		this.ccNo = ccNo;
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
	public int getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
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
