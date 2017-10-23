/**
 * 
 */
package com.padmaja.eliminationtest.controller;

import com.padmaja.eliminationtest.service.LoginService;

/**
 * @author Boot Camp User 008
 *
 */
public class LoginController {

	/**
	 * @param user
	 * @param password
	 * @return
	 */
	public boolean verifyLogin(String user, String password) {
		 
		 LoginService login = new LoginService();
		  boolean result = login.verifyLogin(user,password);
		  
		return result;
	}

}
