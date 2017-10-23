/**
 * 
 */
package com.bcj.corejava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * This class implements the Comparator interface such that integers are ordered
 * in reverse from their usual ordering.
 *
 */
public class BackwardOrdering implements Comparator<Object> {

	public static void main(String[] args) {

		int listSize = 20;
		int magnitude = 500;
		Random rand = new Random(12345);

		ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
		for (int i = 0; i < listSize; i++) {
			numbers.add(rand.nextInt() % magnitude);
		}

		Collections.sort(numbers, new BackwardOrdering());

		System.out.println("Elements after reverse sorting :");
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {

		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) 02;
		return (i2.compareTo(i1));
	}

}
