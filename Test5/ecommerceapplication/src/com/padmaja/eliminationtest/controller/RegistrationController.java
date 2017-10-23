/**
 * 
 */
package com.padmaja.eliminationtest.controller;

import com.padmaja.eliminationtest.entity.Customer;
import com.padmaja.eliminationtest.service.RegistrationService;

/**
 * @author Boot Camp User 008
 *
 */
public class RegistrationController {

	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param userId
	 * @param password
	 */
	public boolean registerUser(String firstName, String lastName, String email,String phone, String userId, String password) {
		Customer cust = new Customer(firstName,lastName,email,phone,userId,password);
		RegistrationService ressev = new RegistrationService();
	 boolean result = ressev.registerUser(cust);
	 
	 return result;
		
	}

}
