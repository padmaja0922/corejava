/**
 * 
 */
package com.bcj.customercurd.service;

import com.bcj.customercurd.dao.DeletionDAO;

/**
 * @author Boot Camp User 008
 *
 */
public class DeletionService {

	

	/**
	 * @param custno
	 */
	public static boolean deleteCustomer(int custno,String jdbcCon) {
		
		int x = DeletionDAO.deleteCustomer(custno,jdbcCon);
		if(x>0)
			return true;
		else
			return false;
		
	}
	

	

}
