/**
 * 
 */
package com.padmaja.eliminationtest.service;

import com.padmaja.eliminationtest.dao.RegistrationDao;
import com.padmaja.eliminationtest.entity.Customer;

/**
 * @author Boot Camp User 008
 *
 */
public class RegistrationService {	

	
	/**
	 * @param cust
	 * @return
	 */
	public boolean registerUser(Customer cust) {
		RegistrationDao resDao = new RegistrationDao();
		boolean result = resDao.registerUser(cust);
		
		return result;
	}

}
