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
public class OrderDao {

	/**
	 * @param id
	 * @param orderid
	 */
	public void saveOrderId(int id, int orderid) {
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//properties.setProperty("useSSL", "false");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja", "root", "anuchandu1");

			Statement stmt = con.createStatement();
		        stmt.executeQuery("UPDATE CUSTOMER SET ORDERID = ORDERID WHERE CUSTID =ID ");		  		                               
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
		
	}


