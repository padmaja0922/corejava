/**
 * 
 */
package com.bcj.corejava.lists;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Boot Camp User 008
 *
 */
public class ListOfFruit {

	
	public static void main(String[] args) {
		
        ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("pear");
		strList.add("banana");
		strList.add("tangerine");
		strList.add("strawberry");
		strList.add("blackberry");
		
		System.out.println("Elements in the order of insertion");
		displayList(strList);
		
		System.out.println("Elements in reverse order");
		displayreverseList(strList);
		 
		insertString(strList);
		System.out.println("Elements after insertion");
		displayList(strList);
		
		
	}

	/**
	 * @param strList
	 * this method adds string between 2 elements
	 */
	private static void insertString(ArrayList<String> strList) {
		
		for(int i = 0 ;i<strList.size()-1;i++)			
			if("tangerine".equals(strList.get(i))){
				strList.add(i+1,"bananna");
			    break;
			}
			
		
	}

	/**
	 * @param strList
	 * This method prints array list in reverse order
	 */
	private static void displayreverseList(ArrayList<String> strList) {
		
		for(int i = strList.size()-1;i>=0;i--)
			System.out.println(strList.get(i));
		
	}

	/**
	 * @param strList
	 * This method displays the array list using iterator
	 */
	private static void displayList(ArrayList<String> strList) {
		
		Iterator<String> itr=strList.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		
	}

}
