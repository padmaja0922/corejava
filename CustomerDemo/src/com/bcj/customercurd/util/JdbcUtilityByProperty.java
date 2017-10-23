/**
 * 
 */
package com.bcj.customercurd.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author Boot Camp User 008
 *
 */
public class JdbcUtilityByProperty {

	/**
	 * @return
	 */
	public static Connection getConnectionByProperty() {
		
		 Connection con= null;
		 
		 Properties prop = new Properties();
			FileInputStream input = null;
		
		try{
			input = new FileInputStream("C:\\bcj-dec16\\workspace\\corejava\\CustomerDemo\\src\\db.properties");
			
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
