/**
 * 
 */
package com.bcj.corejava.inheritance.lab5;

/**
 * @author Boot Camp User 008
 *
 */
public class ClassB extends ClassA{
	
	/*public static void methodOne(int i) {
		System.out.println("ClassB Method One");
    }*/

    public void methodTwo(int i) {
    	System.out.println("ClassB Method Two");
    }

    /*public void methodThree(int i) {
    	System.out.println("ClassB Method Three");
    }
*/
    public static void methodFour(int i) {
    	System.out.println("ClassB Method Four");
    }
    public static void main(String[] args) {
		
    	ClassB classb = new ClassB();
    	methodFour(0);
       // methodOne(0);
    	classb.methodTwo(0);
    //	classb.methodThree(0);
    	methodFour(0);  	
    	
    	
	}
}
