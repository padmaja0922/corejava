/**
 * 
 */
package com.bcj.corejava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * This class implements the Comparator interface such even that positive numbers
 * are ordered as usual, but negative numbers are ordered  in reverse.
 *
 */
public class AlternateOrdering implements Comparator<Object>{

	
	public static void main(String[] args) {
		

		int listSize = 20;
	    int magnitude = 500;
	    Random rand = new Random(12345);
	    
		ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
	    for (int i=0; i < listSize; i++) {
	      numbers.add(rand.nextInt() % magnitude);
		}		
	    
	    Collections.sort(numbers, new AlternateOrdering());
		System.out.println("Elements after sorting");
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}
		
	
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1 >=0 && i2>=0){
		 if(i1 > i2)
			 return -1;
		 else if (i1<i2)
			 return 1;
		 else		
		   return 0;
		}
		else{
			if(i1 > i2)
				 return 1;
			 else if (i1<i2)
				 return -1;
			 else		
			   return 0;
		}
			
	}

}
