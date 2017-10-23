/**
 * 
 */
package com.bcj.inventoryCurd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bcj.inventoryCurd.entity.Food;
import com.bcj.inventoryCurd.entity.Inventory;


public class manageTranscations {	

	
	static Map<String, Food> food = new HashMap<String, Food>();
	static Map<String, ArrayList<Inventory>> inventory = new HashMap<String,ArrayList< Inventory>>();

	static Date startDate = null;
	static Date nextDate = null;
	
	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the file : ");
		String fileName = scan.next();
		
		try {

			BufferedReader inputFile = new BufferedReader(new FileReader(fileName));

			String lineOfText = inputFile.readLine();

			while (lineOfText != null) {

				if (('F'==lineOfText.charAt(0))|| 'W'==lineOfText.charAt(0)) {
					String str[] = lineOfText.split("-");
					saveKey(str);

				} else if ('S' == lineOfText.charAt(0)) {
					
					String str[] = lineOfText.split(":");
					for(int i =0 ;i<str.length;i++)
						str[i]=str[i].trim();
				    	startDate =(Date) new SimpleDateFormat("MM/dd/yyyy").parse(str[1]);  
				    	
			       while ('N' != lineOfText.charAt(0)) {
			    	   
			    	   lineOfText = inputFile.readLine();
			    	   
			    	   String str1[] = lineOfText.split(":");
						for(int i =0;i<str.length;i++)
							 str1[i]=str1[i].trim();
						
			    	   saveReceive(str1,"start");
			       }
				
				} else if ('N' == lineOfText.charAt(0)) {
					String str[] = lineOfText.split(":");
					for(int i =0 ;i<str.length;i++)
						str[i]=str[i].trim();
					nextDate= (Date) new SimpleDateFormat("MM/dd/yyyy").parse(str[1]);  
					

				} else {
					
					String str[] = lineOfText.split(":");
					for(int i =0;i<str.length;i++)
					 str[i]=str[i].trim();
					saveReceive(str,"next");
					
					
				}

				lineOfText = inputFile.readLine();
	
							
			}

			inputFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

	}

	/**
	 * @param str
	 * @param startDate
	 */
	private static void saveReceive(String[] str, String type) {
	
		String[] receive = str[1].split("  ");
		for(int i=0;i<receive.length;i++)
			receive[i].trim();
		
	Food fItem = new Food();		
		int days =0;
		ArrayList<Inventory> invList = new ArrayList<Inventory>();
		
		if (food.containsKey(receive[0])){
			
			fItem = (Food)food.get(receive[0]);
			days = fItem.getShelfLife();		
		}
				
		GregorianCalendar cal = new GregorianCalendar();
	 	
		if(inventory.isEmpty()){
	 		
	 		cal.setTime(startDate);		
	 		cal.add(Calendar.DATE, days);
	 		Date expDate =  (Date) cal.getTime();
	 		
	 	     Inventory inv1 = new Inventory();	
	 	 	
	     inv1.setType(str[0]);
	     inv1.setUpcCode(receive[0]);
	     inv1.setQuantity(Integer.parseInt(receive[1]));
	     inv1.setReceiveDate(startDate);
	     inv1.setExpDate(expDate);
	     
	     invList.add(inv1);
	 	}  
     
	 	else if (inventory.containsKey(receive[2].trim())&& type.equals("start")){
	 			 		
	 		cal.setTime(startDate);		
			cal.add(Calendar.DATE, days);
			Date expDate =  (Date) cal.getTime();
						
	 		Inventory inv1 = new Inventory();
	 		inv1.setType(str[0]);
		     inv1.setUpcCode(receive[0]);
		     inv1.setQuantity(Integer.parseInt(receive[1]));
		     inv1.setReceiveDate(nextDate);
		     inv1.setExpDate(expDate);
		     
		     invList.add(inv1);
	 		
	 	}
	 	else{
	 		
	 		cal.setTime(nextDate);		
			cal.add(Calendar.DATE, days);
			Date expDate =  (Date) cal.getTime();
			
	 		Inventory inv1 = new Inventory();
	 		inv1.setType(str[0]);
		     inv1.setUpcCode(receive[0]);
		     inv1.setQuantity(Integer.parseInt(receive[1]));
		     inv1.setReceiveDate(nextDate);
		     inv1.setExpDate(expDate);
		     
		     invList.add(inv1);
	 		
	 		
	 		
	 	}
		
	 	inventory.put(receive[2],invList);
	 	System.out.println(inventory);
		
	}

	/**
	 * @param str
	 */
	private static void saveKey(String[] str) {
		
		String item[] = str[1].split(":");
		
        for(int i =0 ;i<item.length;i++)
		  item[i] = item[i].trim();
		
        Food fitem = new Food();
        
        if ("FoodItem".equals(str[0].trim())) {

			if ("Shelf life".equals(item[2]))
				 fitem.setShelfLife(Integer.parseInt(item[3]));
			if ("Name".equals(item[4].trim()))
			     	fitem.setDesc(item[5]);
			
			food.put(item[1].trim(), fitem);
			

		} 
	}

		
		
	}

	
	
	 
