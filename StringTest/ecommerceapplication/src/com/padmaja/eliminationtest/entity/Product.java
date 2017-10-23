/**
 * 
 */
package com.padmaja.eliminationtest.entity;

/**
 * @author Boot Camp User 008
 *
 */
public class Product {
	
	private String productNo;
	private String productDesc;
	private float amount;
	
	/**
	 * @param productNo
	 * @param productDesc
	 * @param amount
	 */
	public Product(String productNo, String productDesc, float amount) {
		super();
		this.productNo = productNo;
		this.productDesc = productDesc;
		this.amount = amount;
	}
	/**
	 * 
	 */
	public Product() {
		
	}
	/**
	 * @return the productNo
	 */
	public String getProductNo() {
		return productNo;
	}
	/**
	 * @param productNo the productNo to set
	 */
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	/**
	 * @return the productDesc
	 */
	public String getProductDesc() {
		return productDesc;
	}
	/**
	 * @param productDesc the productDesc to set
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
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
