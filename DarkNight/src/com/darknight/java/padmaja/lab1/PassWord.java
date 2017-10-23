/**
 * This class generates random password using MATH RANDOM class
 */
package com.darknight.java.padmaja.lab1;

import java.util.Random;

/**
 * @author Boot Camp User 008
 *
 */
public class PassWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("The random password is : ");
		Random r = new Random();
		
		for(int i=0;i<4;i++){
			System.out.print((char)(r.nextInt(26) + 'a'));
			System.out.print((int)(Math.random()*9));
			
		}
		
		
	}

}
