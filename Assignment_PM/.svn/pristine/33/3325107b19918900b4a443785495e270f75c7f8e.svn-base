/**
 * 
 */
package com.bcj.practice.corejava.ssn;

/**
 * This class gets ssn details from UI layer sets then ssn entity class
 * 
 */
public class SsnController {

	
	public static boolean validateSsn(String firstName, String lastName, String email, String phone,String ssn) {
		
		Ssn ssncontrol = new Ssn();
		ssncontrol.setFirstName(firstName);
		ssncontrol.setLastName(lastName);
		ssncontrol.setEmail(email);
		ssncontrol.setPhone(phone);
		ssncontrol.setSsn(ssn);
		
	  boolean result =SsnService.validateSsn(ssncontrol);	
	 	
	return result;	
}

}
