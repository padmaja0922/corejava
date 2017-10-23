/**
 * 
 */
package com.bcj.customercurd.ui;

import java.util.Scanner;

import com.bcj.customercurd.controller.CustomerDeletion;
import com.bcj.customercurd.controller.CustomerModification;
import com.bcj.customercurd.controller.RegisterCustomer;

/**
 * This 
 *
 */
public class CustomerUi {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		CustomerUi custUi = new CustomerUi();
		
		System.out.println("Enter the choice ");
		System.out.println("1. Insert "); 
		System.out.println("2. Delete  ");
		System.out.println("3. Modify  ");
		
		int select = custUi.scan.nextInt();
		
		if ( select ==1)
			saveCustomer();
		else if(select ==2)
            deleteCustomer();
		else
			modifyCustomer();
		
		
	}

	/**
	 * 
	 */
	
	private static void deleteCustomer() {
		
		CustomerUi custUi = new CustomerUi();
		
		System.out.println("Enter the way to connect to JDBC hardcode or properties");
		String jdbcCon =custUi.scan.nextLine();
		System.out.println("Enter customer number to be deleted");
		
		int custno = custUi.scan.nextInt();
		
		CustomerDeletion.deleteCustomer(custno,jdbcCon);	
		
		
	}

	/**
	 * 
	 */
	private static void modifyCustomer() {
		
		CustomerUi custUi = new CustomerUi();
		
	     
	    
	    System.out.println("Enter the way to connect to JDBC");
	    String jdbcCon = custUi.scan.nextLine();
	    
	    System.out.println("Field Names : firstname,lastname,phone "); 
	    System.out.println("Enter the field name to be modify");
	     String feild =custUi.scan.nextLine();
	     System.out.println("Enter the new value"); 
	     String newValue = custUi.scan.nextLine();
	     System.out.println("Enter the customer id to be modified ");
	     int custId = custUi.scan.nextInt();	
	    boolean result= CustomerModification.modifyCustomer(custId,feild,newValue,jdbcCon);		
	    
	    if(result == true)
	    	System.out.println("Modified customer sucess");
	    else
	    	System.out.println("Encounterd problem during modification");
		
	}
	

	/**
	 * 
	 */
	private static void saveCustomer() {
		
		CustomerUi custUi = new CustomerUi();
		System.out.println("Enter the customer details : ");
		
		System.out.println("Enter Customer first name");
		String firstName = custUi.scan.nextLine();
		System.out.println("Enter Customer last name");
		String lastName = custUi.scan.nextLine();
		System.out.println("Enter Customer phone number");
		String phone = custUi.scan.nextLine();
		System.out.println("Enter customer number");
		int custId = custUi.scan.nextInt();
		
		System.out.println("Enter the way to connect to JDBC");
		String jdbcCon =custUi.scan.next();
		
		boolean result=RegisterCustomer.saveCustomer(custId,firstName,lastName,phone,jdbcCon);
		  if(result == true)
		    	System.out.println("Registered customer sucess");
		    else
		    	System.out.println("Encounterd problem during registration");
		
	}

	/**
	 * @param result
	 */
	public static void displayResult(boolean result) {
		
		if(result == true)
			System.out.println("Customer deleted sucessfully");
		else
			System.out.println("Encountered Problem during deletion");
		
	}

}
