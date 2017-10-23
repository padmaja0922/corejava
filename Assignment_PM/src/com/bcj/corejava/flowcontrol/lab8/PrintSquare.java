/**
 *  This Program will print square when side of the square is given
 */
package com.bcj.corejava.flowcontrol.lab8;

import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *
 */
public class PrintSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the side of the square :");
		 int side = scan.nextInt();
		 printSquare(side);
		 scan.close();	  
		 
		
	}
	static void printSquare(int side)
	{
		 for (int i =1; i <= side; i++)
		 		 
		 System.out.print("*");
		 System.out.println();
		for(int i=1;i<=side-2 ;i++)
		{
		 for (int j=1;j<side-1;j++)
		 { 
		    if(j==1 || j== side-2)
		      System.out.print("*");	
		    else
		    	System.out.print("   ");
		 }
		 System.out.println( );
		}
				 for (int i =1; i <= side; i++)
			 System.out.print("*");
		 
	}
}
