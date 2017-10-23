/**
 * 
 */
package com.bcj.test;

import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *  This class prints the String in given pattern
 */
public class StringPattern {	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.next();
		
		String strPattern = getStringPattern(str);

		System.out.println(strPattern);
		scan.close();

	}

	/**
	 * @param str
	 * @return String
	 */

	private static String getStringPattern(String str) {

		int len = str.length() - 2;
		String str1 = ""+ str.charAt(0) + len + str.charAt(len + 1);
		String str2 = str + " => " + str1;
		System.out.println(str2);
		return str2;
	}
	
	

}
