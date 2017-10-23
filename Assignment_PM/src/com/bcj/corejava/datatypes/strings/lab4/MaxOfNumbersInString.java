/**
 * This class takes string of numbers as input and parse them to int array. Then it finds the sum
 * of all digits in each number and find the max number of the sum.
 */
package com.bcj.corejava.datatypes.strings.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class MaxOfNumbersInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "324,457,112,259,323,222";
		int num[][] = new int[6][2];
		int i = 0, max = 0;

		// Splitting the string and parsing it to integer array
		for (String w : str.split(",", 0)) {
			num[i][0] = Integer.parseInt(w);
			i++;
		}
		//finding the sum of all digits in each number and to find max number of sum
		for (i = 0; i < 6; i++) {
			int a = num[i][0], sum = 0;
			while (a > 0) {
				sum = sum + (a % 10);
				a = a / 10;
			}
			num[i][1] = sum;
			if (max < sum)
				max = sum;
		}

	
		System.out.print("maximum number :" + max + " for ");
		
		for (i = 0; i < 6; i++)
			if (num[i][1] == max)
				System.out.print(num[i][0] + " ");
	}

}
