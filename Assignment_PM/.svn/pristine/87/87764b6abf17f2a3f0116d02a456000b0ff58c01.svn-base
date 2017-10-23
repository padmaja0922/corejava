/**
 * This program takes balance at the beginning of the month
 *  total of all items charged by the customer total of all credits applied to the customer’s account this month
 *  allowed credit limit as input and calculate weather customer exceeded his credit limit or not..
 */
package com.bcj.corejava.flowcontrol.lab6;

import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *
 */
public class CerditLimit {

	/**
	 * @param  accontno , balance, credits , charged, allowedcredit.
	 */
	public static void main(String[] args) {
		
		int accountno , balance, credits , charges, allowedcredit;
	      Scanner scan = new Scanner(System.in);	
		
		System.out.println("Enter the Account number :");
		 accountno=scan.nextInt();
		 System.out.println("Enter the Balance at start of month :");
		 balance=scan.nextInt();
		 System.out.println("Enter the total credits for this month :");
		 credits=scan.nextInt();
		 System.out.println("Enter the total debits for this month :");
		 charges=scan.nextInt();
		 System.out.println("Enter the Allowed credit limit for this card :");
		 allowedcredit=scan.nextInt();
		 int total =balance+( charges-credits);
		 System.out.println("new balance for this month is "+ total );
		 if (total > allowedcredit)
		  System.out.println("Credit limit Exceded");
		 scan.close();
		 
		 
		 
		 
		 

	}

}
