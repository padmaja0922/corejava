/**
 * This class encrypts the given number by adding 7 to each digit and getting reminder
 * by dividing by 10 then swapping first and third digits.
 */
package com.bcj.corejava.flowcontrol.lab10;

import java.util.Scanner;

/**
 * @author Boot Camp User 008 *
 */
public class EncryptText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int num[] = new int [4] ; 
		System.out.println("Enter 4 digits from 0-9");
	   for(int i=0;i<4;i++)
          num[i]=scan.nextInt();
	   getEncrptedNumber(num);
		System.out.println("The encrypted numbers are :");	
		for(int i : num)
		 System.out.print(i);	
		
          scan.close();
          
          
          
	}

	public static void getEncrptedNumber(int[] num){
	
	int temp=0;	
		
	for(int i=0;i<4;i++)
	{
		num[i]=num[i]+7;
		num[i]=num[i]%10;
	}
	temp=num[0]; num[0]=num[2];	 
	num[2]=temp;		
}
}