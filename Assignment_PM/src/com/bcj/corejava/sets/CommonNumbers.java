/**
 * 
 */
package com.bcj.corejava.sets;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Boot Camp User 008
 *  This class takes two collections of integers as parameters
 *  and returns the number of unique integers that occur in both lists. 
 */
public class CommonNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		System.out.println("Enter number Of values in first list ");
		int n = scan.nextInt();

		System.out.println("Enter values in first List");
		for (int i = 0; i < n; i++) {
			list1.add(scan.nextInt());
		}
		
		System.out.println("Enter number Of values in second list ");
		  n = scan.nextInt();
		  
		  System.out.println("Enter values in second List");
			for (int i = 0; i < n; i++) {
				list2.add(scan.nextInt());
			} 
			
		 Set<Integer> numberSet = new TreeSet<Integer>();	
	    		
		   numberSet = countCommon(list1,list2);
		  
		  System.out.println("Numbers in Set are : "); 
		   for(int i : numberSet)
			   System.out.print(i+"  ");
		   
		   
		scan.close();
	}

	/**
	 * @param list1
	 * @param list2
	 * @return
	 */
	private static Set<Integer> countCommon(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
		Set<Integer> numberSet = new TreeSet<Integer>();	
		
		for(int i : list1)			 
			numberSet.add(i); 
		 
		for (int i :list2)   
		   numberSet.add(i);
		
		
		
		return numberSet;
	}

}
