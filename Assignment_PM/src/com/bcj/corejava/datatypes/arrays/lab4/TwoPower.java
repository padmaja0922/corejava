package com.bcj.corejava.datatypes.arrays.lab4;

import java.util.Scanner;

/* finding power of two for given number */
public class TwoPower {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		TwoPower t = new TwoPower();
		t.powerOfTwo(n);
		scan.close();

	}

	// finding and printing power of 2
	private void powerOfTwo(int n) {
		
		int a[] = new int[n];
		a[0]=1;
		for(int i=1;i<n;i++){
			int x=2;
		  for(int j=1;j<=i;j++)
			  x=x*2;
		  a[i]=x;
	}
	
	System.out.println("The Power of 2 for given number : "+n);

	for(int i : a)
		System.out.print(i+"  ");
  }
}