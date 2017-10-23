/**
 * 
 */
package com.padmaja.eliminationtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

/**
 * @author Boot Camp User 008
 *
 */
public class ShoppingCartDao {

	/**
	 * @param id
	 * @param quantity
	 */
	int count;
	public boolean saveShoppingCart(String pid, int quantity) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja?autoReconnect=true&useSSL=false", "root", "anuchandu1");

			Statement stmt = con.createStatement();
		       ResultSet rs = stmt.executeQuery("select amount from product where productno = 123");   
		    	
		    
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("INSERT INTO `shoppingcart` (productno,quantity,amount) VALUE(?,?,?)");
			pstmt.setString(1, pid );
			pstmt.setInt(2, quantity);
			while(rs.next())
			pstmt.setFloat(3,rs.getFloat(1)*quantity ); 
			count =pstmt.executeUpdate();
					                               
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (count > 0)
		  return true;
		else
			return false;
	}
		
	}

