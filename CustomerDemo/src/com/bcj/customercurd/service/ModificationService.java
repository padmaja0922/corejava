/**
 * 
 */
package com.bcj.customercurd.service;

import com.bcj.customercurd.dao.ModificationDao;

/**
 * @author Boot Camp User 008
 *
 */
public class ModificationService {

	/**
	 * @param custId
	 * @param feild
	 * @param newValue
	 * @param jdbcCon
	 */
	public static boolean modifyCustomer(int custId, String feild, String newValue, String jdbcCon) {
		
		int x =ModificationDao.modifyCustomer(custId,feild,newValue,jdbcCon);
		if(x>0)
			return true;
		else
			return false;
		
	}
	
	

}
