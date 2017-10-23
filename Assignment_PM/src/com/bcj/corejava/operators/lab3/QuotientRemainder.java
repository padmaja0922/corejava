package com.bcj.corejava.operators.lab3;

import java.util.Scanner;

/* Finding quotient and remainder for division and percentage */

public class QuotientRemainder {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Enter number two find remainder and quotient : ");
		 int x = scan.nextInt();
		 int y = scan.nextInt();
		 System.out.println(" Quotient and remainder are : ");
		 
		 System.out.println(x/y + "\t" + x%y);
		 scan.close();
		 
		
	}

}
