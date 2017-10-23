/**
 * 
 */
package com.bcj.corejava.inheritance.lab3;

/**
 * @author Boot Camp User 008
 *
 */
public class Truck extends Car{
	
	 public void m1() {
	        System.out.println("truck 1");
	    }
	     
	    public void m2() {
	        super.m1();
	    }
	     
	    public String toString() {
	        return super.toString() + super.toString();
	    }

}
