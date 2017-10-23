/**
 *  this class is written to print the following table of values: 10 10n 100n 1000n using loops
 */
package com.bcj.corejava.flowcontrol.lab4;

import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *
 */
public class LoopPrintTable {

	/**
	 * This method loops n times to print the table
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 System.out.println(" Enter number : ");
		 int n = scan.nextInt();
		 System.out.println("N\t10*N\t100*N\t1000*N");
		 
		// for loop for printing the table  
		 for(int i=1;i<=n;i++)
		 	 System.out.println(i+"\t"+10*i+"\t"+100*i+"\t"+1000*i);
		 
		scan.close();
		
	}

}
