/**
 * 
 */
package com.bcj.customercurd.controller;

import com.bcj.customercurd.entity.Customer;
import com.bcj.customercurd.service.RegistrationService;

/**
 * @author Boot Camp User 008
 *
 */
public class RegisterCustomer {
	
	
	
	/**
	 * @param custId
	 * @param firstName
	 * @param lastName
	 * @param phone
	 */
	
	public static boolean saveCustomer(int custId, String firstName, String lastName, String phone, String jdbcCon) {
		
		Customer cust= new Customer(custId,firstName,lastName,phone);
		 boolean result= RegistrationService.saveCustomer(cust,jdbcCon);
		
		return result;
	}


}
