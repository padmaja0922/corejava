/**
 * 
 */
package com.bcj.corejava.abstractclass.lab1;

/**
 * @author Boot Camp User 008
 *
 */
public class LionLandMammal extends LandMammal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LionLandMammal lion = new LionLandMammal();
		lion.eat();
		lion.run();
		lion.walk();
	}
	
	public void eat(){
		System.out.println("Likes to eat meat");
	}
	public void run(){
		System.out.println("Likes to run");
	}
	public void walk(){
		System.out.println("Lion likes to Walks ");
	}

}
