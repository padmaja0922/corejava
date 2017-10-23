/**
 * 
 */
package com.bcj.corejava.flowcontrol.lab10;

import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *
 */
public class DecryptText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num[]= new int[4];
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number to Decrpt from 0-9");
		for(int i =0;i<4;i++)
			num[i]=scan.nextInt();
		
		 getDecrptedNumber(num);
		 scan.close();
		
	}
	public static void getDecrptedNumber(int[] num){
		
		int temp=num[2]; num [2]=num[0];
		num[0]=temp;
		for(int i=0;i<4;i++){
			num[i]=num[i]-7;
			num[i]=num[i]-10;
			
		}
	
	for(int i : num)
      System.out.println(i);
}
}
