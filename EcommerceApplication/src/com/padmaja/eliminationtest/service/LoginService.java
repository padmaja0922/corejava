/**
 * 
 */
package com.padmaja.eliminationtest.service;

import com.padmaja.eliminationtest.dao.LoginDao;

/**
 * @author Boot Camp User 008
 *
 */
public class LoginService {

	/**
	 * @param userId
	 * @param password
	 * @return boolean
	 */
	public boolean verifyLogin(String userId,String password) {
		
		LoginDao login =new LoginDao();
		  
		  boolean result = login.verifyLogin(userId,password);
	
		return result;
		 }
		 
	}


