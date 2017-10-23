/**
 * 
 */
package com.bcj.corejava.overloading.lab1;

/**
 * @author Boot Camp User 008
 *
 */
public class PrintDetails {
	
	public static void printHeader(char c){
		for (int i=0;i<80;i++)
			System.out.print(c);
	}
	public static void printHeader(char c, int no){
		System.out.println();
		for(int i =0;i<no;i++)
			System.out.print(c);
	}
	public static void printHeader(String s){
		System.out.println("\n"+s);
	}
  
}
