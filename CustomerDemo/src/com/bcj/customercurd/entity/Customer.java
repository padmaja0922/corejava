/**
 * 
 */
package com.bcj.customercurd.entity;

/**
 * @author Boot Camp User 008
 *
 */
public class Customer {
	
	private int custId;
	private String firstName;
	private String lastName;
	private String phone;
	
	
	
	
	/**
	 * 
	 */
	public Customer() {

	}
	/**
	 * @param custId
	 * @param firstName
	 * @param lastName
	 * @param phone
	 */
	public Customer(int custId, String firstName, String lastName, String phone) {
	
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
