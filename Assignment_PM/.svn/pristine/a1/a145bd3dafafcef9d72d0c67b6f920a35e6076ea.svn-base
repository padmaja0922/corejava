/**
 * 
 */
package com.bcj.corejava.lists;

import java.util.ArrayList;

/**
 * @author Boot Camp User 008
 *
 */
public class DoubleList {
	
	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("how");
		strList.add("are");
		strList.add("you");
		doubleTheList(strList);

	}

	/**
	 * @param strList
	 *  This method that takes an ArrayList of Strings as a parameter and that 
     *    replaces every string  with two of that string. 
	 */
	private static void doubleTheList(ArrayList<String> strList) {
		
		for(int i =0 ;i<strList.size();i+=2)
			strList.add(i,strList.get(i));
		System.out.println(strList);
		
	}

}
