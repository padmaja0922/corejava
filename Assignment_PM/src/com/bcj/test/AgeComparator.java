/**
 * 
 */
package com.bcj.test;

import java.util.Comparator;

/**
 * This class implements Comparator interface and overrides compare method to
 * sort on age of Customer object
 *
 */
public class AgeComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		Customer c1 = (Customer) o1;
		Customer c2 = (Customer) o2;

		if (c1.getAge() == c2.getAge())
			return 0;
		else if (c1.getAge() < c2.getAge())
			return -1;
		else
			return 1;

	}

}
