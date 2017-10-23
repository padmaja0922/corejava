/**
 * 
 */
package com.bcj.customercurd.controller;

import com.bcj.customercurd.service.ModificationService;

/**
 * @author Boot Camp User 008
 *
 */
public class CustomerModification {
	
	/**
	 * @param custId
	 * @param newCustId
	 */
	public static boolean modifyCustomer(int custId, String feild, String newValue,String jdbcCon) {
		
		boolean result=ModificationService.modifyCustomer(custId,feild,newValue,jdbcCon);
		
		return result;
	}

	

}
