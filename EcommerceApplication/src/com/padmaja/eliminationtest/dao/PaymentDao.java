/**
 * 
 */
package com.padmaja.eliminationtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.padmaja.eliminationtest.entity.CreditCard;

/**
 * @author Boot Camp User 008
 *
 */
public class PaymentDao {

	/**
	 * @return
	 */
	public CreditCard processPayment() {
		  CreditCard cc = new CreditCard();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/padmaja?autoReconnect=true&useSSL=false", "root", "anuchandu1");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from payment ");
			while(rs.next()){
				cc.setCcNo(rs.getInt(1));
				cc.setName( rs.getString(2));
				cc.setCcNo(rs.getInt(3));
				cc.setAmount(rs.getFloat(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return cc;
	}

}
