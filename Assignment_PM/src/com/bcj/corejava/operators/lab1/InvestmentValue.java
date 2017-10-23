/**
 *  This class takes investment value as input and calculates investment for 3 years.
 */
package com.bcj.corejava.operators.lab1;

/**
 * @author Boot Camp User 008
 */
public class InvestmentValue {
	/**
	 * @param args
	 */
    public static void main(String args[]){
		
		double inv = 14000;		
		
		inv = inv + inv * (0.4);
		System.out.println("first year : "+inv);
		inv = inv - 1500;
		System.out.println("second year : "+inv);
		inv = inv + inv *(0.12);
		System.out.println("Total investment after 3 years : "+ inv);
		
		
	}

}
