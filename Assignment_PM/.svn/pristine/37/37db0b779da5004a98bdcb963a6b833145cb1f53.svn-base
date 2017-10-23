/**
 * 
 */
package com.bcj.test;


/**
 * This is an Entity class with fields firstName , lastName , age 
 *
 */
public class Customer implements Comparable<Object>{

	private String firstName;
	private String lastName;
	private int age;

	
	/**
	 * override the toString method to print Customer object
	 */
	
	public String toString() {

		return (this.firstName + "  " + this.lastName + "  " + this.age);

	}
	

	/**
	 * default constructor
	 */
	public Customer() {
		super();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public Customer(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
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
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param string
	 *            the age to set
	 */
	public void setAge(int string) {
		this.age = string;
	}


	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		
		Customer cust = (Customer)o;
		if(age>cust.getAge())
			return 1;
		else if(age < cust.getAge())
		  return -1;
		else
		return 0;
	}
	
	

}
