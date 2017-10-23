/**
 * 
 */
package com.bcj.corejava.lists;

import java.util.ArrayList;

/**
 * This class deals with array list which deals with reverse of strings.
 *
 */

public class StringsInList {

	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("woh");
		strList.add("era");
		strList.add("uoy");
		strList = reverseList(strList);
		for (String str : strList)
			System.out.println(str);

	}

	/**
	 * @param strList
	 *            This method reverses each strings in Array List
	 */

	public static ArrayList<String> reverseList(ArrayList<String> strList) {

		int j = 0;
		for (String s : strList) {
			String str = "";
			for (int i = s.length() - 1; i >= 0; i--)
				str = str + s.charAt(i);
			strList.set(j, str);
			j++;
		}
		return strList;
	}

}
