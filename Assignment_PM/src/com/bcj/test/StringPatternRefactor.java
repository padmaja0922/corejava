/**
 * 
 */
package com.bcj.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * This Class deal with String manipulation and stores them in HashMap
 *
 */
public class StringPatternRefactor {

	static Scanner scan = new Scanner(System.in);
	static HashMap<String, String> stringMap = new HashMap<String, String>();
	
	public static void main(String[] args) {
		
		StringPatternRefactor stest = new StringPatternRefactor();
		stest.printString();
		stest.printInteger();
	}

 /**
  * this method takes String as input and Splits and stores the result in hash map
  * 
  */	
	
	public void printString() {

		ArrayList<String[]> strList = new ArrayList<String[]>();

		System.out.println("Enter the String");
		String input = scan.nextLine();
		String[] patter = input.split(",");

		for (String str : patter) {

			String s[] = str.split(":");
			strList.add(s);
			System.out.println(s[0] + " --> " + s[1]);
			for (String[] slist : strList)
				stringMap.put(slist[0], slist[1]);
		}
	}
	
	/**
	 * this method checks whether given string is present in hash map and prints the value.
	 */
	

	public void printInteger() {

		System.out.println("Enter the string to print integer");
		String input = scan.nextLine();
		if (stringMap.containsKey(input))
			System.out.println(stringMap.get(input));
		else
			System.out.println("String not found");
	}


}
