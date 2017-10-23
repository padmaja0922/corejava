/**
 * 
 */
package com.bcj.customercurd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bcj.customercurd.util.JdbcUtilityByHardCode;
import com.bcj.customercurd.util.JdbcUtilityByProperty;

/**
 * @author Boot Camp User 008
 *
 */
public class ModificationDao {

	/**
	 * @param custId
	 * @param feild
	 * @param newValue
	 * @param jdbcCon
	 */
	public static int modifyCustomer(int custId, String feild, String newValue, String jdbcCon) {		
		
			int x = 0;
			Connection con = null;
			try{	
				
				if ("hardcode".equals(jdbcCon)){
				 con = JdbcUtilityByHardCode.getConnectionByHardCode();
					x = modifyStatement(custId,feild,newValue,con);
				}
				else{
				 con = JdbcUtilityByProperty.getConnectionByProperty();
					x = modifyStatement(custId,feild,newValue,con);
				}
				
			con.close();	
			}catch (Exception e) {
				System.out.println(e);
			}

			return x;

		}
	

	/**
	 * @param custId
	 * @param feild
	 * @param newValue
	 * @return
	 */
	private static int modifyStatement(int custId, String feild, String newValue, Connection con) {		

		int x = 0;
		
		try {
			if(feild.equals("firstname")){
			PreparedStatement pstmt = (PreparedStatement) con
					.prepareStatement(" update `customer1`  set firstname = ? where custid = ? ");
			pstmt.setString(1, newValue);
			pstmt.setInt(2, custId);
			x = pstmt.executeUpdate();
			
			}
			else if(feild.equals("lastname")){
				PreparedStatement pstmt = (PreparedStatement) con
				.prepareStatement(" update `customer1`  set lastname = ? where custid = ? ");
				pstmt.setString(1, newValue);
				pstmt.setInt(2, custId);
				x = pstmt.executeUpdate();
			}
			else{
				PreparedStatement pstmt = (PreparedStatement) con
						.prepareStatement(" update `customer1`  set phone = ? where custid = ? ");
						pstmt.setString(1, newValue);
						pstmt.setInt(2, custId);
						x = pstmt.executeUpdate();
			}
				
		
		} catch (Exception e) {
			System.out.println(e);
			
		}

		return x;
	
		
	}
	

}
