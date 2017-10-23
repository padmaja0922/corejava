package com.bcj.corejava.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.bcj.corejava.datatypes.arrays.lab2.RefactorHighLowAverage;

public class TestRefactorHighLowAverage {

	@Test
	public void testOddNumbers() {
		 int a[] = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
		 int b[]={9,21,5,3,0,0,0,0,0,0};
		RefactorHighLowAverage t = new RefactorHighLowAverage();
		assertArrayEquals(t.getAllOddNumbers(a),b);
		
	}

}

