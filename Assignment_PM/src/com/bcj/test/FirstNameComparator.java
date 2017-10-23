/**
 * 
 */
package com.bcj.test;

import java.util.Comparator;


/**
 * This class implements Comparator interface and overrides compare method to sort on first name of Customer object
 *
 */
public class FirstNameComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		Customer c1 = (Customer) o1;
		Customer c2 = (Customer) o2;

		return (c1.getFirstName().compareTo(c2.getFirstName()));

	}

}
