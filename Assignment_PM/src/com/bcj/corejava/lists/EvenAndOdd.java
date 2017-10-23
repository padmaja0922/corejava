/**
 * 
 */
package com.bcj.corejava.lists;

import java.util.ArrayList;

/**
 * @author Boot Camp User 008 This class deals with reversing elements at odd
 *         positions with the elements at the even positions
 */
public class EvenAndOdd {

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();
		strList.add("how");
		strList.add("are");
		strList.add("you?");
		strList.add("I");
		strList.add("am");
		strList.add("doing");
		strList.add("fine");
		reverseOddAndEvenList(strList);

		System.out.print(strList);

	}

	/**
	 * @param strList
	 * This method takes arrayList as input and reverses  elements at odd
     *         positions with the elements at the even positions
	 */
	private static void reverseOddAndEvenList(ArrayList<String> strList) {

		for (int i = 0; i < strList.size() - 1; i++)
		{ 
			if (i % 2 == 0) {
				String s = strList.get(i);
				strList.set(i, strList.get(i + 1));
				strList.set(i + 1, s);
			}
		}  
	}

}
