/**
 * This class calculates and displays that salesperson’s earnings on a commission basis.
 * This program loops till u enter 0 to exit the program
 *
 */
package com.bcj.corejava.flowcontrol.lab5;

import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *
 */
public class SalesPersonEarnings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Item\t  Value ");
		System.out.println("----------------- ");
		System.out.println("  1\t  239.99");
		System.out.println("  2\t  129.75");
		System.out.println("  3\t   99.95");
		System.out.println("  4\t  350.89");
		System.out.println("select the item from above list : ");
		Scanner scan = new Scanner(System.in);
		double sum = 0.0;
		
	// This will loop  n times until u enter numbers other than 1-5 
		
		while (true) {
			int x = scan.nextInt();
			if (x > 0 && x < 5) {
				if (x == 1)
					sum = sum + 239.99;
				else if (x == 2)
					sum = sum + 129.75;
				else if (x == 3)
					sum = sum + 99.95;
				else
					sum = sum + 350.89;
				System.out.println("sum = " + sum);
				System.out.println("Do u want to enter another item else enter 0");
			} else {
				System.out.println(" commision is : " + (200 + (sum * 0.09)));
				scan.close();
				System.exit(0);

			}

		}

	}
}
