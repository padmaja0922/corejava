/**
 *  this class creates object of Address class set values of datamembers using setters and displays
 *  them using getters
 */
package com.bcj.corejava.classes.medium.lab8;

/**
 * @author Boot Camp User 008
 *
 */
public class DemoAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Address adr = new Address();
		adr.setAddressLine("8231 Ranchview Dr");
		adr.setCity("Irving");
		adr.setZip("75063");
		adr.setState("Texas");

	  System.out.println("Address Line : "+adr.getAddressLine());	
	  System.out.println("City : "+adr.getCity());
	  System.out.println("Zip Code : "+adr.getZip());
	  System.out.println("State : "+adr.getState());
	  	  
	}

}
