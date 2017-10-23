/**
 * 
 */
package com.padmaja.eliminationtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

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
	public boolean verifyLogin(String userId,String password) {
		
		int i =0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja?autoReconnect=true&useSSL=false", "root", "anuchandu1");

			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("SELECT password FROM `customer` WHERE `userid` = ?");
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				if(rs.getString(1).equals(password))
					i=1;					    
			}
			con.close();
		} catch (Exception e) { System.out.println(e);	}
		
		if (i==1)
			return true;
		else
			return false;
		
	}

	

}
