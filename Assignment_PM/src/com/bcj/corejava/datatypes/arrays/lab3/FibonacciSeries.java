package com.bcj.corejava.datatypes.arrays.lab3;

import java.util.Scanner;

/* Printing fibonacci series using method */
public class FibonacciSeries {

 // getting fibonacci series and returning to main method by array 
	public int[] getFibonacci(int a) {
		int[] b = new int[a];
		int c =1, d=2, e;

		System.out.println();
		b[0] = 1;
		b[1] = 2;
		for (int i = 2; i < a; i++) {
			b[i] = c + d;
			e = c + d;
			c = d;
			d = e;
		}
		return b;
	}

	public static void main(String args[]) {

		FibonacciSeries f = new FibonacciSeries();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		int a[] = f.getFibonacci(n);
		System.out.println("fibonacci series for " + n + " is : ");
		for (int i : a)
			System.out.print(i + " ");
		scan.close();

	}

}
