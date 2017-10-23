/**
 * 
 */
package com.padmaja.eliminationtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.padmaja.eliminationtest.entity.User;

/**
 * @author Boot Camp User 008
 *
 */
public class LoginDao {

	/**
	 * @param userId
	 * @param password
	 * @return
	 */
	public User verifyLogin(String userId, String password) {
		
		User user = new User();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja", "root", "anuchandu1");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select USERID, PASSWORD from COUSTMER ");
			
				user.setUserId(rs.getString(1));
			    user.setPassword( rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return user;
	}

	

}
