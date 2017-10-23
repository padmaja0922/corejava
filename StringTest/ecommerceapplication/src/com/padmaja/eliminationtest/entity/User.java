/**
 * 
 */
package com.padmaja.eliminationtest.entity;

/**
 * @author Boot Camp User 008
 *
 */
public class User {
	private String userId;
	private String password;
	
	/**
	 * @param userId
	 * @param password
	 */
	public User(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	/**
	 * 
	 */
	public User() {
		
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
