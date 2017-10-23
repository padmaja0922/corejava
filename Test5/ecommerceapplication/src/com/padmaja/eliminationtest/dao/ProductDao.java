/**
 * 
 */
package com.padmaja.eliminationtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.padmaja.eliminationtest.entity.Product;

/**
 * @author Boot Camp User 008
 *
 */
public class ProductDao {
	
  public Product getProductDetails(){	
	  Product p =new Product();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja", "root", "anuchandu1");

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from  PRODUCT");
		
			
			p.setProductNo(rs.getString(1));
			p.setProductDesc(rs.getString(2));
			p.setAmount(rs.getFloat(3));
		
		con.close();
	} catch (Exception e) {
		System.out.println(e);
	}
	return p;
  }
	
}
