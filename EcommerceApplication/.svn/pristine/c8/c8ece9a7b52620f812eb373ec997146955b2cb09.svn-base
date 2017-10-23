/**
 * 
 */
package com.padmaja.eliminationtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja?autoReconnect=true&useSSL=false", "root", "anuchandu1");

			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("INSERT INTO `customer` (orderid) VALUE  (?)");
			pstmt.setInt(1,orderid );	  
			pstmt.executeUpdate();
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
		
	}


