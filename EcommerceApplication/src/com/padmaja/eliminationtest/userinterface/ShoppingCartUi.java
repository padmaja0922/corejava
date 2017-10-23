/**
 * 
 */
package com.padmaja.eliminationtest.userinterface;

import java.util.Random;

/**
 * @author Boot Camp User 008
 *
 */
public class ShoppingCartUi {
	
	public void postResult(boolean result){
	if (result==true){
		  System.out.println("Shopping cart saved");
		  Random rn = new Random();
		  System.out.println("Shopping Id is : "+rn.nextInt(100)+1 );
	}
		else
		System.out.println("Error");	
	}

}
