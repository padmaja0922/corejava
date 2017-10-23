/**
 * 
 */
package com.bcj.pbsregent.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bcj.pbsregent.entity.Company;
import com.bcj.pbsregent.util.JdbcUtilityByProperty;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


public class RegistrationDao {

	/**
	 * @param company
	 */
	
	public static int saveComapnyDetails(Company company) {

		int cid = 0;
		Connection con = null;
		int aid = 0;

		try {

			con = JdbcUtilityByProperty.getConnectionByProperty();

			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(
					"INSERT INTO `address` (addressline1,addressline2,city,state,zipcode) VALUE  (?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, company.getAddress().getAddrline1());
			pstmt.setString(2, company.getAddress().getAddrline2());
			pstmt.setString(3, company.getAddress().getCity());
			pstmt.setString(4, company.getAddress().getState());
			pstmt.setString(5, company.getAddress().getZipCode());

			pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();

			while (rs.next()) {
				aid = rs.getInt(1);
			}

			int tid = saveTenant(company, con);

			cid = saveCompany(company, con, aid, tid);

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return cid;

	}

	public static int saveTenant(Company company, Connection con) throws SQLException {

		int aid = 0, tid = 0;
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(
				"INSERT INTO `address` (addressline1,addressline2,city,state,zipcode) VALUE  (?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, company.getTent().getAddr().getAddrline1());
		pstmt.setString(2, company.getTent().getAddr().getAddrline2());
		pstmt.setString(3, company.getTent().getAddr().getCity());
		pstmt.setString(4, company.getTent().getAddr().getState());
		pstmt.setString(5, company.getTent().getAddr().getZipCode());

		pstmt.executeUpdate();

		ResultSet rs = pstmt.getGeneratedKeys();

		while (rs.next()) {
			aid = rs.getInt(1);
		}

		pstmt = (PreparedStatement) con.prepareStatement(
				"INSERT INTO `tenant` (firstname,lastname,email,phone,aid) VALUE  (?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, company.getTent().getFirstName());
		pstmt.setString(2, company.getTent().getLastName());
		pstmt.setString(3, company.getTent().getEmail());
		pstmt.setString(4, company.getTent().getPhone());
		pstmt.setInt(5, aid);

		pstmt.executeUpdate();
		rs = pstmt.getGeneratedKeys();

		while (rs.next()) {
			tid = rs.getInt(1);

		}
		return tid;

	}

	public static int saveCompany(Company company, Connection con, int aid, int tid) throws SQLException {

		int cid = 0;
		PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(
				"INSERT INTO `company` (name ,email,phone,userid,password,caid,tid) VALUE  (?,?,?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, company.getcName());
		pstmt.setString(2, company.getcEmail());
		pstmt.setString(3, company.getcPhone());
		pstmt.setString(4, company.getUserId());
		pstmt.setString(5, company.getPassword());
		pstmt.setInt(6, aid);
		pstmt.setInt(7, tid);

		pstmt.executeUpdate();
		ResultSet rs = pstmt.getGeneratedKeys();

		while (rs.next()) {
			cid = rs.getInt(1);
		}

		return cid;

	}

}
