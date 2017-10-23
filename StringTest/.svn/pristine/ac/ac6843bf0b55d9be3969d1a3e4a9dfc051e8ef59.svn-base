/**
 * 
 */
package com.padmaja.eliminationtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import com.padmaja.eliminationtest.entity.Customer;

/**
 * @author Boot Camp User 008
 *
 */
public class RegistrationDao {

	/**
	 * @param cust
	 * @return
	 */
	public boolean registerUser(Customer cust) {
		boolean result= false;
		Properties properties = new Properties();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			properties.setProperty("useSSL", "false");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja", "root", "anuchandu1");

			Statement stmt = con.createStatement();
		        stmt.executeQuery(" insert into CUSTOMER values (cust.getFirstName,cust.getLastName, cust.getEmail,cust.getPhone,cust.getUserId,cust.getPassword)");
		   result = true;		                               
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (result == true)
		  return true;
		else
			return false;
	}

}
