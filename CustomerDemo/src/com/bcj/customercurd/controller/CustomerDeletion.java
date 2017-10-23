/**
 * 
 */
package com.bcj.customercurd.controller;

import com.bcj.customercurd.service.DeletionService;
import com.bcj.customercurd.ui.CustomerUi;

/**
 * @author Boot Camp User 008
 *
 */
public class CustomerDeletion{

	

	/**
	 * @param custno
	 * @param jdbcCon
	 */
	public static void deleteCustomer(int custno, String jdbcCon) {
		
	 boolean result = DeletionService.deleteCustomer(custno,jdbcCon);
	 
	 CustomerUi.displayResult(result);
		
	}

}
