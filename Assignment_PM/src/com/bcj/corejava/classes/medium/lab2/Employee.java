/**
 * 
 */
package com.bcj.corejava.classes.medium.lab2;

/**
 * @author Boot Camp User 008
 *
 */
public class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
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
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}
	/**
	 * @param monthlySalary the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param monthlySalary
	 */
	public Employee(String firstName, String lastName, double monthlySalary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	
	
	
	

}
