/**
 * 
 */
package com.bcj.corejava.classes.medium.lab3;

/**
 * @author Boot Camp User 008
 *
 */
public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDate date = new MyDate(02,25,2017);
		printDate(date);
		

	}
	public static void printDate(MyDate date){
		System.out.println(date.getMonth()+"/"+ date.getDay()+"/"+date.getYear());
	}

}
