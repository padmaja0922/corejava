/**
 * 
 */
package com.bcj.collection.Ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import com.bcj.collection.entity.Student;


/**
 * @author Boot Camp User 008
 *
 */
public class BatchUi {

	/**
	 * @param batchMap
	 */
	public void printBatch(Map<String, ArrayList<Student>> batchMap) {		
		
		 for ( Entry <String,ArrayList<Student>> key : batchMap.entrySet()) {
			 
			   ArrayList <Student> student1 = key.getValue();
			   System.out.println(key.getKey()); 
			   for(Student st : student1)
                  System.out.println(st.getFirstName()+ " "+st.getLastName()+" "+st.getEmail()+" "+st.getPhoneNo());
		   }
	}
	
	public static void displayError( ){
		System.out.println("No batches found this year");
	}
	

}
