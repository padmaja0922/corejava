/**
 * This class takes string as input and split it on ',' and ':'.  
 */

package com.bcj.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *
 */

public class StringPattern {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<String[]> strList = new ArrayList<String[]>();

	public static void main(String[] args) {

		StringPattern stest = new StringPattern();
		stest.printString();
		stest.printInteger();
	}

	/**
	 * This method inputs String and splits them on ',' and then ':' and prints
	 * the result and adds the result to array list.
	 */

	public void printString() {

		System.out.println("Enter the String");
		String input = scan.nextLine();
		for (String str : input.split(",")) {
			String s[] = str.split(":");
			System.out.println(s[0] + " --> " + s[1]);
			strList.add(s);
		}
	}

	/**
	 * this method checks for the given string in array list, if string is
	 * present it prints the number
	 */

	public void printInteger() {

		int x = 0;
		System.out.println("Enter the string to print integer");
		String input = scan.nextLine();
		for (String[] s : strList) {
			if (input.equals(s[0])) {
				System.out.println(s[1]);
				x = x + 1;
				break;
			}
		}
		if (x == 0)
			System.out.println("String not found");
	}

}
