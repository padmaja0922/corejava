/**
 * 
 */
package com.bcj.pbsregent.entity;

/**
 * @author Boot Camp User 008
 *
 */
public class Tenant {
	
	private String  firstName;
	private String lastName;
	private String email;
	private String phone;
	Address addr;
	
	
	
	/**
	 * 
	 */
	public Tenant() {
		super();
	}
	
	/**
	 * @return the addr
	 */
	public Address getAddr() {
		return addr;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddr(Address addr) {
		this.addr = addr;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phone
	 * @param addr
	 */
	public Tenant(String firstName, String lastName, String email, String phone, Address addr) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.addr = addr;
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
