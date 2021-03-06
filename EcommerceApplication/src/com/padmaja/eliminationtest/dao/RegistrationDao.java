/**
 * 
 */
package com.padmaja.eliminationtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;
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
		
		int count =0;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja?autoReconnect=true&useSSL=false", "root", "anuchandu1");

			//Statement stmt = con.createStatement();
		      //  stmt.executeUpdate("insert into CUSTOMER(FIRSTNAME,LASTNAME,EMAIL,PHONE,USERID,PASSWORD)"+" values (firstName,cust.getLastName, cust.getEmail,cust.getPhone,cust.getUserId,cust.getPassword)");
		  
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("INSERT INTO `customer` (fisrtname,lastname,email,phone,userid,password,orderid) VALUE  (?,?,?,?,?,?,?)");
			pstmt.setString(1, cust.getFirstName() );
			pstmt.setString(2, cust.getLastName());
			pstmt.setString(3, cust.getEmail());
			pstmt.setString(4, cust.getPhone());
			pstmt.setString(5, cust.getUserId());
			pstmt.setString(6, cust.getPassword());
			pstmt.setInt(7, 0);
		     count =pstmt.executeUpdate();
					                               
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (count >0)
		  return true;
		else
			return false;
	}

}
