/**
 *  this class uses constructor overloading concept to load the date for data members
 */
package com.bcj.corejava.overloading.lab2;

import java.time.LocalDate;

/**
 * @author Boot Camp User 008
 *
 */
public class Employee {

	/**
	 * @param args
	 */
	private int employeeId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	
	
	/**
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 */
	
	
	public Employee(int employeeId, String firstName, String lastName, LocalDate dateOfBirth) {
		
		this(employeeId ,firstName ,lastName );
		this.dateOfBirth = dateOfBirth;
	}



	/**
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 */
	public Employee(int employeeId, String firstName, String lastName) {
		
		this(employeeId,firstName);
		this.lastName = lastName;
	}



	/**
	 * @param employeeId
	 * @param firstName
	 */
	public Employee(int employeeId, String firstName) {
		this(employeeId );
		this.firstName = firstName;
	}


	/**
	 * @param employeeId
	 */
	public Employee(int employeeId) {
	
		this.employeeId = employeeId;
	}

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2001, 12, 24);
		Employee emp1 = new Employee(1234);
		Employee emp2 = new Employee(3244,"John");
		Employee emp3 = new Employee(2534,"Edwin","Bold");
		Employee emp4 = new Employee(1549,"Katthy","Mark",d1);
		
		System.out.println("Fisrt Constuctor " + emp1.employeeId +" "+emp1.firstName+" "+emp1.lastName+" "+emp1.dateOfBirth);
		System.out.println("Second Constuctor " + emp2.employeeId +" "+emp2.firstName+" "+emp2.lastName+" "+emp2.dateOfBirth);
		System.out.println("Third Constuctor " + emp3.employeeId +" "+emp3.firstName+" "+emp3.lastName+" "+emp3.dateOfBirth);		
		System.out.println("Fourth Constuctor " + emp4.employeeId +" "+emp4.firstName+" "+emp4.lastName+" "+emp4.dateOfBirth);
	}
	

}
