/**
 * 
 */
package com.bcj.practice.collection.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import com.bcj.practice.collection.Ui.BatchUi;
import com.bcj.practice.collection.entity.Student;

/**
 * This class connects to database gets all students details who match the given year and stores result in hash map
 *
 */
public class BatchDao {

	/**
	 * @param year
	 * @return HashMap
	 * 
	 */
	public HashMap<String, ArrayList<Student>> getBatchByYear(String year) {

		HashMap<String, ArrayList<Student>> batchMap = new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> student = new ArrayList<Student>();
		ArrayList<Student> stuList = new ArrayList<Student>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/padmaja?autoReconnect=true&useSSL=false", "root", "anuchandu1");
			PreparedStatement stmt = (PreparedStatement) con.prepareStatement(
					" SELECT firstname, lastname, email , phone, student.bid FROM STUDENT JOIN BATCH ON STUDENT.BID = BATCH.BID AND BATCH.YEAR=?  order by student.BID; ");
			stmt.setString(1, year);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				
  // Stores all the result set in array list
				
				while (rs.next()) {   
					Student stu = new Student();
					stu.setFirstName(rs.getString(1));
					stu.setLastName(rs.getString(2));
					stu.setEmail(rs.getString(3));
					stu.setPhoneNo(rs.getString(4));
					stu.setBid(rs.getString(5));
					student.add(stu);

				}
				
 // Stores result from array list to hash map with batch id as key
				
				for (Student st : student) {
					String bid = st.getBid();
					if (batchMap.containsKey(bid))
						batchMap.get((stuList).add(st));
					else {
						stuList = new ArrayList<Student>();
						stuList.add(st);
						batchMap.put(bid, stuList);

					}
				}
			} else
				BatchUi.displayError();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return batchMap;

	}

}
