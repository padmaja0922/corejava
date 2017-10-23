/**
 * 
 */
package com.bcj.customercurd.service;

import com.bcj.customercurd.dao.RegistrationDao;
import com.bcj.customercurd.entity.Customer;

/**
 * @author Boot Camp User 008
 *
 */
public class RegistrationService {
	
	
	/**
	 * @param cust
	 */
	public static boolean saveCustomer(Customer cust,String jdbcCon) {
		
	   int x = RegistrationDao.saveCustomer(cust,jdbcCon);
	   if(x>0)
		return true;
	   else
		   return false;
		
	}

	

}
