/**
 * 
 */
package com.bcj.test;

import java.util.Collections;
import java.util.List;

/**
 * @author Boot Camp User 008
 *
 */
public class DemoApplicationService {

	/**
	 * @param custArray
	 * @param field
	 */
	public static void sortCustomer(List<Customer> custArray, String field) {
		

		// Calling different class based on input field to sort

		if ("firstName".equals(field))
			Collections.sort(custArray, new FirstNameComparator());

		else if ("lastName".equals(field))
			Collections.sort(custArray, new LastNameComparator());

		else
			Collections.sort(custArray, new AgeComparator());

		System.out.println("Customers after sorting");

		
	}
	
	
	

}
