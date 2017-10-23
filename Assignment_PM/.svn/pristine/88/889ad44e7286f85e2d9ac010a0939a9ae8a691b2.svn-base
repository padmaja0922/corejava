/**
 * 
 */
package com.bcj.corejava.classes.medium.lab7;

/**
 * @author Boot Camp User 008
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Traveller tr = new Traveller(1001,35,2000,true);
		boolean checkBag =Checks.checkBaggage(tr);
		boolean checkImm = Checks.checkImmgigration(tr);
		boolean checkSec=Checks.checkSecurity(tr);
		if(checkBag==true && checkImm==true && checkSec == true)
			System.out.println("Allow traveller to fly");
		else
			System.out.println("Detain Traveller fot Re-Checking");
		
	}

}
