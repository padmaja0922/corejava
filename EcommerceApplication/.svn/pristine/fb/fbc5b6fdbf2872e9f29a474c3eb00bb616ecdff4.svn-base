/**
 * 
 */
package com.padmaja.eliminationtest.service;

import com.padmaja.eliminationtest.dao.LoginDao;
import com.padmaja.eliminationtest.entity.User;

/**
 * @author Boot Camp User 008
 *
 */
public class LoginService {

	/**
	 * @param user
	 * @param password
	 * @return
	 */
	public boolean verifyLogin(String userId, String password) {
		
		LoginDao login =new LoginDao();
		  User user = new User();
		  user = login.verifyLogin(userId,password);
		 if(user != null){ 
		 if(user.equals(user.getUserId())&&password.equals(user.getPassword()))
		   return true;
		 else
		   return false;
		 }
		 else
			 return false;
	}

}
