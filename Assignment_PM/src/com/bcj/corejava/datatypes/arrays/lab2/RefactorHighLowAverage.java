package com.bcj.corejava.datatypes.arrays.lab2;

/* program to return array from method to main method */

public class RefactorHighLowAverage {

	// method to find odd numbers and return to main method
	public int[] getAllOddNumbers(int a[]) {

		int[] b = new int[a.length];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				b[j] = a[i];
				j++;
			}
         }
		return b;
	}

	public static void main(String args[]) {

		RefactorHighLowAverage r = new RefactorHighLowAverage();
		int a[] = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		int b[] = new int[a.length];

		b = r.getAllOddNumbers(a);
		System.out.println("The Odd numbers are : ");
		for (int i : b)
			if (i != 0)
				System.out.print(i + "  ");

	}

}
