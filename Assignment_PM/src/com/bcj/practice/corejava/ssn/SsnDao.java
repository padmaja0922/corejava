/**
 * 
 */
package com.bcj.practice.corejava.ssn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

/**
 * @author Boot Camp User 008
 *
 */
public class SsnDao {
		
	public boolean validateSsn(Ssn ssn) {
		
		  int i=0;
		    
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja?autoReconnect=true&useSSL=false", "root", "anuchandu1");

			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("SELECT * FROM `ssn` WHERE `firstname` = ?");
			pstmt.setString(1,ssn.getFirstName());
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){ 			
		        
				  String sub = rs.getString("ssn").substring(8,11);
				  if(ssn.getFirstName().equals(rs.getString("firstname"))){
					  if(ssn.getLastName().equals(rs.getString("lastname")))
						  if(ssn.getEmail().equals(rs.getString("email")))
							  if(ssn.getPhone().equals(rs.getString("phone")))
								  if(ssn.getSsn().equals(sub));
								      i++ ;
				  }
											
	        	}
			
			con.close();
			
		} catch (Exception e) {
			System.out.println(e); }
		
		if(i==0)
			return false;
		else
			return true;
					
	}			
			
}

