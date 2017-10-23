/**
 * 
 */
package com.bcj.practice.collection.Ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.bcj.practice.collection.controller.BatchController;
import com.bcj.practice.collection.entity.Student;

/**
 * @author Boot Camp User 008
 *
 */
public class SoftTech {
	
	public static void main(String[] args) {
		
		HashMap<String, ArrayList<Student>> batchMap = new HashMap<String,ArrayList<Student>>();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Year for Batches to be displayed");
		String year = scan.nextLine();
		batchMap=BatchController.getBatchByYear(year);
		BatchUi batchUi= new BatchUi();
		 batchUi.printBatch(batchMap);
		scan.close();
	}
	

}
