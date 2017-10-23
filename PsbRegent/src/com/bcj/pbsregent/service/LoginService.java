/**
 * 
 */
package com.bcj.pbsregent.service;

import com.bcj.pbsregent.dao.LoginDao;

/**
 * @author Boot Camp User 008
 *
 */
public class LoginService {

	/**
	 * @param userId
	 * @param password
	 */
	public static boolean verifyLogin(String userId, String password) {
		
		boolean result =LoginDao.verifyLogin(userId,password);
		return result;
		
	}

}
