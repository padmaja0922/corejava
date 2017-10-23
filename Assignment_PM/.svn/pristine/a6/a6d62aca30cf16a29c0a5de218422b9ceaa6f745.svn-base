/**
 * 
 */
package com.bcj.practice.corejava.ssn;

import java.util.Scanner;

/**
 * This class deals with  ssn details and pass them to the controller layer
 *
 */
public class SsnUi {
	

	
 public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
    
	System.out.println("Enter first name : ");
	String firstName = scan.nextLine();
	System.out.println("Enter last name :");
	String lastName = scan.nextLine();
	System.out.println("Enter Email Id :");
	String email =scan.nextLine();
	System.out.println("Enter the Phone number");
	String phone = scan.nextLine();
	System.out.println("Enter Last four digits of SSN");
	String ssn= scan.nextLine(); 
	
	boolean result =SsnController.validateSsn(firstName,lastName,email,phone ,ssn);	
	if(result == true )
		System.out.println("SSN datails are correct");
	else
		System.out.println("Incorrect datails");
	
	scan.close();

 }
	
}
 
 
 
 
