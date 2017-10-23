/**
 * 
 */
package com.bcj.corejava.abstractclass.lab1;

/**
 * @author Boot Camp User 008
 *
 */
public class WhaleWaterMammal extends WaterMammal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WhaleWaterMammal whale = new WhaleWaterMammal();
		whale.eat();
		whale.swim();
	
	}
	
    public void eat(){
    	System.out.println("Likes to eat fish and seals");
    }
    public void swim(){
    	
    	System.out.println("Likes to swim in ocean");
    }
    
}
