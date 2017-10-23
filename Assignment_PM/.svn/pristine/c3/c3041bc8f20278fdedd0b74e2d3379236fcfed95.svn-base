/**
 * 
 */
package com.bcj.practice.collection.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.bcj.practice.collection.entity.Student;
import com.bcj.practice.collection.service.BatchService;

/**
 * @author Boot Camp User 008
 *
 */
public class BatchController {

	/**
	 * @param year
	 * @return 
	 */
	public static HashMap<String,ArrayList<Student>> getBatchByYear(String year) {		
	     
		HashMap <String , ArrayList<Student>> batchMap = new HashMap<String,ArrayList<Student>>();		
		batchMap = BatchService.getBatchByYear(year);		
		
		return batchMap;
			
	}

}
