/**
 * 
 */
package com.bcj.pbsregent.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.bcj.pbsregent.util.JdbcUtilityByProperty;
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
	public static  boolean verifyLogin(String userId, String password) {
		
		Connection con=null;
		int i =0;
		try {
						
			
			con = JdbcUtilityByProperty.getConnectionByProperty();
			
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("SELECT password FROM `company` WHERE `userid` = ?");
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
	


