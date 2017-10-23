/**
 * 
 */
package com.bcj.corejava.classes.medium.lab5;

import java.util.Scanner;

/**
 * @author Boot Camp User 008
 *
 */
public class Point {
	
	public static void main(String[] args) {
		
		int x1,x2,y1,y2,z1,z2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the X and Y coordinates of First Point : ");
        x1=scan.nextInt();
		x2=scan.nextInt();
		System.out.println("Enter the X and Y coordinates Of Second point : ");
		y1=scan.nextInt();
		y2=scan.nextInt();
		System.out.println("Enter another Point to finding Collinear");
	     z1=scan.nextInt();
	     z2=scan.nextInt();
	     
		distanceFromAnotherPoint(x1,x2,y1,y2);
		slopeWithAnotherPoint(x1,x2,y1,y2);
		isCollinear(x1,x2,y1,y2,z1,z2);
		isVertical(x1,x2,y1,y2);
		isHorizontal(x1,x2,y1,y2);
		quadrant(x1,x2);
		
		scan.close();
		
	}
	
/** this method takes 2 point coordinates and finds the distance between them */	
	public static void distanceFromAnotherPoint(int x1, int x2, int y1, int y2){
		
	  double d =Math.round(Math.pow(x2-x1, 2.0)+ Math.pow(y2- y1,2.0));
	 
	  System.out.println("Distance from one point to another is "+ Math.sqrt(d)); 
	  
	}

	/** this method takes 2 points as inputs and finds the slope of it */
	public static void slopeWithAnotherPoint(int x1, int x2, int y1, int y2)
	{		
		double d = ((y2-y1)/(x2-x1));
		System.out.println("The slope of 2 point is "+ Math.round(d));
	}
	
	/** this method takes 3 points to find whether they are linear */
	public static void isCollinear(int x1,int x2,int y1, int y2,int z1,int z2){
		
		double d = ((y2-y1)/(x2-x1));
		double d1 = ((z2-z1)/(y2-y1));
		if(d==d1)
		 System.out.println("Points are collinear");
		else
			System.out.println("Not linear");
	}
	
	/** this method takes 2 points and finds whether they are vertical */
	public static void isVertical(int x1, int x2, int y1, int y2){
		
		if( x1==y1)
			System.out.println("Points are Vertical");
		else
			System.out.println("Points are not Vertical");
	}
	
	
   /** this method takes 2 points and finds whether they are horizontal */
	public static void isHorizontal(int x1, int x2,int y1 ,int y2){
		
		if(y1==y2)
			System.out.println("Points are Horizontal");
		else
			System.out.println("Points are not horizontal");
			
	}
	
	public static void quadrant(int x1, int x2){
		
		if(x1 <0 && x2 <0)
			System.out.println("Points are in 3rd Quadrant");
		else if(x1>0 && x2 >0)
			System.out.println("Points are in 1st Quadrant");
		else if(x1>0 && x2 <0)
			System.out.println("Points are in 4th Quadrant");
		else
			System.out.println("Points are in 2nd Quadrant");
			
	}
	
}
