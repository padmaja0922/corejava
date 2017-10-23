/**
 * 
 */
package com.bcj.corejava.flowcontrol.lab2;

import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *
 * This class Validate of the exam marks is to be done. The range of
 *        exam marks is between 65 and 100 (both inclusive). 
 */
public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks that need to be validated");
		int marks = scan.nextInt();
		IfElse ie = new IfElse();
		if (ie.haspassed(marks)=="TRUE")
		      System.out.println ( "Passed Successfully!");
		else
			System.out.println(" Failed");
		scan.close();
	}

	/** This method verifies given marks are in range 65 to 100 */
	
	public String haspassed(int marks) {
		
		 if ((marks >= 65) && (marks <= 100))		
		         return "TRUE";
		 else 
			  return "FAlSE";
		 
	}

}
