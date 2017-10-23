/**
 * 
 */
package com.bcj.practice.collection.entity;

/**
 * @author Boot Camp User 008
 *
 */
public class Student {

	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
    private String bid;
	

    
    
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNo
	 * @param bid
	 */
	public Student(String firstName, String lastName, String email, String phoneNo, String bid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.bid = bid;
	}


	/**
	 * @return the bid
	 */
	public String getBid() {
		return bid;
	}


	/**
	 * @param bid the bid to set
	 */
	public void setBid(String bid) {
		this.bid = bid;
	}


	public Student() {
		
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	
}
