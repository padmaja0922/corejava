/**
 * 
 */
package com.bcj.customercurd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bcj.customercurd.entity.Customer;
import com.bcj.customercurd.util.JdbcUtilityByHardCode;
import com.bcj.customercurd.util.JdbcUtilityByProperty;

/**
 * @author Boot Camp User 008
 *
 */
public class RegistrationDao {

	/**
	 * @param cust
	 * @param jdbcCon
	 * @return
	 */
	public static int saveCustomer(Customer cust, String jdbcCon) {

		int x = 0;
		Connection con = null;

		try {

			if ("hardcode".equals(jdbcCon)) {
				con = JdbcUtilityByHardCode.getConnectionByHardCode();
				x = modifyStatement(cust, con);
			} else {
				con = JdbcUtilityByProperty.getConnectionByProperty();
				x = modifyStatement(cust, con);
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return x;
	}

	/**
	 * @param cust
	 * @param con
	 * @return
	 */
	private static int modifyStatement(Customer cust, Connection con) {

		int x = 0;
		if (con != null) {
			try {
				PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(
						" insert into `customer1` (custid,firstname,lastname,phone) value (?, ?, ?,? )");
				pstmt.setInt(1, cust.getCustId());
				pstmt.setString(2, cust.getFirstName());
				pstmt.setString(3, cust.getLastName());
				pstmt.setString(4, cust.getPhone());

				x = pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}

		}
		return x;

	}

}
