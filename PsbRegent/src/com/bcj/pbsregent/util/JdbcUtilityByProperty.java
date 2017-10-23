/**
 * @author Boot Camp User 008
 */
package com.bcj.pbsregent.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * This class establishes the connection with DataBase and returns the connection
 *
 */
public class JdbcUtilityByProperty {

	/**
	 * @return connection
	 */
	public static Connection getConnectionByProperty() {
		
		 Connection con= null;
		 
		 Properties prop = new Properties();
			FileInputStream input = null;
		
		try{
			input = new FileInputStream("C:\\bcj-dec16\\workspace\\corejava\\PsbRegent\\src\\db.properties");
			
			 prop.load(input);			 
			 
			String driverClass = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			
			String password = prop.getProperty("password");
			
			Class.forName(driverClass);
		    con = DriverManager.getConnection(url ,username , password);
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
	
	
	

}
