package com.bcj.corejava.datatypes.arrays.lab4;

import java.util.Scanner;

/* Finding the  exponential values of the ‘base’ to ‘power’. */

public class NPower {

	
	public static void main(String[] args) {
	
      NPower p =  new NPower();
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the base and power : ");
      int n = scan.nextInt();
      int m = scan.nextInt();
      int a[] = p.power(n,m);
      System.out.println("The number of power are : ");
      for(int i :a)
    	  System.out.print( i+ "  ");
      scan.close();
      
	}

	private int[] power(int n, int m) {
		
	
		int a[] = new int[m];
		a[0]=1;
		for(int i=1;i<m;i++){
			int x=n;
		  for(int j=1;j<=i;j++)
			  x=x*n;
		  a[i]=x;
	     }		
       return a;
      }
}