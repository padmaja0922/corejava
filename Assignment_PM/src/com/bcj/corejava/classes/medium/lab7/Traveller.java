/**
 * 
 */
package com.bcj.corejava.classes.medium.lab7;

/**
 * @author Boot Camp User 008
 *
 */
public class Traveller {
	
	private int trvellerId;
	private int baggageAmount;
	private int expiryYear;
	private boolean nocStatus;
	
	/**
	 * @return the trvellerId
	 */
	public int getTrvellerId() {
		return trvellerId;
	}
	/**
	 * @param trvellerId the trvellerId to set
	 */
	public void setTrvellerId(int trvellerId) {
		this.trvellerId = trvellerId;
	}
	/**
	 * @return the baggageAmount
	 */
	public int getBaggageAmount() {
		return baggageAmount;
	}
	/**
	 * @param baggageAmount the baggageAmount to set
	 */
	public void setBaggageAmount(int baggageAmount) {
		this.baggageAmount = baggageAmount;
	}
	/**
	 * @return the expiryYear
	 */
	public int getExpiryYear() {
		return expiryYear;
	}
	/**
	 * @param expiryYear the expiryYear to set
	 */
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	/**
	 * @return the nocStatus
	 */
	public boolean getNocStatus() {
		return nocStatus;
	}
	/**
	 * @param trvellerId
	 * @param baggageAmount
	 * @param expiryYear
	 * @param nocStatus
	 */
	public Traveller(int trvellerId, int baggageAmount, int expiryYear, boolean nocStatus) {
		super();
		this.trvellerId = trvellerId;
		this.baggageAmount = baggageAmount;
		this.expiryYear = expiryYear;
		this.nocStatus = nocStatus;
	}
	/**
	 * @param nocStatus the nocStatus to set
	 */
	public void setNocStatus(boolean nocStatus) {
		this.nocStatus = nocStatus;
	}

}
