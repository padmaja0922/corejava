/**
 * 
 */
package com.bcj.practice.collection.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.bcj.practice.collection.Dao.BatchDao;
import com.bcj.practice.collection.entity.Student;

/**
 * @author Boot Camp User 008
 *
 */
public class BatchService {

	
	/**
	 * @param year
	 * @return
	 */
	public static HashMap<String, ArrayList<Student>>  getBatchByYear(String year)  {
		
		HashMap <String , ArrayList<Student>> batchMap = new HashMap<String,ArrayList<Student>>();
		BatchDao batchDao = new BatchDao();
		batchMap = batchDao.getBatchByYear(year);
		return  batchMap;
	}

}
