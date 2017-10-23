/**
 * 
 */
package com.padmaja.eliminationtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Boot Camp User 008
 *
 */
public class ShoppingCartDao {

	/**
	 * @param id
	 * @param quantity
	 */
	boolean result;
	public boolean saveShoppingCart(String id, int quantity) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
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

