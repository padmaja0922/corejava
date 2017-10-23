/**
 * 
 */
package com.bcj.customercurd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bcj.customercurd.util.JdbcUtilityByHardCode;
import com.bcj.customercurd.util.JdbcUtilityByProperty;

/**
 * @author Boot Camps User 008
 *
 */
public class DeletionDAO {

	/**
	 * @param custno
	 * @throws SQLException 
	 */
	public static int deleteCustomer(int custno, String jdbcCon)  {
    
		Connection con = null;
		int x = 0;
      try{
		if ("hardcode".equals(jdbcCon)){
			   con = JdbcUtilityByHardCode.getConnectionByHardCode();
			x = deleteStatement(custno,con);
			}
		else{
			con = JdbcUtilityByProperty.getConnectionByProperty();
			x = deleteStatement(custno,con);
		}
		con.close();
      }catch (Exception e) {
			System.out.println(e);
		}
     
		return x;

	}
	

	/**
	 * @param con
	 * @param jdbcCon
	 * @throws SQLException 
	 */
	private static int deleteStatement(int custno,Connection con) throws SQLException {

		int x = 0;
		
		
			PreparedStatement pstmt = (PreparedStatement) con
					.prepareStatement("delete from customer1 where custid = ? ");
			pstmt.setInt(1, custno);
			x = pstmt.executeUpdate();
		
			return x;

	}


	

	
		
	

	
	
}
