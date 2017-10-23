/**
 * 
 */
package com.bcj.pbsregent.service;

import com.bcj.pbsregent.dao.RegistrationDao;
import com.bcj.pbsregent.entity.Company;

/**
 * @author Boot Camp User 008
 *
 */
public class RegistrationService {

	/**
	 * @param company
	 */
	public static int  saveCompanyDetails(Company company) {
		
		int cid = RegistrationDao.saveComapnyDetails(company);
		
		
		return cid;	
		
	}	
	

}
