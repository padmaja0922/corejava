/**
 * This class reads three nonzero integers and determines and prints
 * whether they could represent the sides of a right angled triangle(Pythagoras Theorem.)
 */
package com.bcj.corejava.flowcontrol.lab9;

import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *
 */
public class RightAngledTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 3 sides : ");
		double s1= scan.nextDouble();
		double s2= scan.nextDouble();
		double s3= scan.nextDouble();
		findRightAngled(s1,s2,s3);
		scan.close();
		}
	
	public  static void findRightAngled(double s1, double s2, double s3)
	{
		  System.out.println((Math.pow(s1,2.0)+Math.pow(s2,2.0)));
		  System.out.println(Math.pow(s3,2.0));
		
		if(((s1*s1)+(s2*s2))== (s3*s3))
		
			System.out.println("The sides are in right rangled triangle");
		else
			
			System.out.println("The sides are not in right angled  ");
			
	} 

}
