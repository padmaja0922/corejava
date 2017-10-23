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
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bcj.inventoryCurd.entity.Food;
import com.bcj.inventoryCurd.entity.Inventory;

/**
 * @author Boot Camp User 008
 *
 */
public class ManageTranscation1 {

	static Map<String, Food> foodItem = new HashMap<String, Food>();
	static Map<String, ArrayList<Inventory>> warehouseInvTran = new HashMap<String, ArrayList<Inventory>>();
	static Date startDate;
	static Date nextDate;

	public static void main(String[] args) {

		Date currentTranDate = null;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the input file ");
		String file = scan.next();

		try {
			BufferedReader inputFile = new BufferedReader(new FileReader(file));

			String lineOfText = inputFile.readLine();

			while (lineOfText != null) {

				String recType = lineOfText.substring(0, 4);

				switch (recType) {
				case "Food":
					saveFood(lineOfText);
					break;
				case "Ware":
					saveWare(lineOfText);
					break;
				case "Star":
					saveStart(lineOfText);
					currentTranDate = startDate;
					break;
				case "Next":
					currentTranDate = dateUtil(currentTranDate, 1, "add");

				case "Rece":
					saveInventoryTran(lineOfText, currentTranDate);
					break;
				case "Requ" :	
					saveInventoryTran(lineOfText, currentTranDate);
					break;
				case "End " :
					break;
			   					
				}

				lineOfText = inputFile.readLine();
			}
			inputFile.close();

		} catch (IOException e) { e.printStackTrace(); 	}
		finally{ 
			scan.close(); }
         printProductDetails();
	}

	/**
	 * 
	 */
	private static void printProductDetails() {
		
		ArrayList<Inventory> invList  = new ArrayList<Inventory>();
		
		for(Map.Entry<String ,ArrayList<Inventory>> entry: warehouseInvTran.entrySet()){    
				  
		String key = entry.getKey();
		invList = entry.getValue();
		 
		 Collections.sort(invList, new UpcCodeComparator());		 
		 
		 System.out.println(invList);
		 
		 System.out.println("Items not avaliblae in each warehouse is :");
		 System.out.println(key);
		 for(Inventory inv : invList)
		 {
			 Date date = new Date();
			 
			 if(date .before(inv.getExpDate()))
			 {
				 
				 System.out.println(inv.getUpcCode());
			 }
		 }
		 
		}
		 
		
		
		
	}

	/**
	 * @param lineOfText
	 * @param currentTranDate
	 */
	private static void saveInventoryTran(String lineOfText, Date currentTranDate) {

		String str[] = lineOfText.split(":");

		int expDays = 0;
		Inventory inv = new Inventory();
		ArrayList<Inventory> invList = new ArrayList<Inventory>();
		Food fItem = new Food();

		String items[] = str[1].split("  ");
		for (int i = 0; i < items.length; i++)
			items[i] = items[i].trim();

		if (foodItem.containsKey(items[0])) {

			fItem = (Food) foodItem.get(items[0]);
			expDays = fItem.getShelfLife();
		}
		Date expDate = dateUtil(currentTranDate, expDays, "add");

		if ("Receive".equals(str[0].trim()) || "Request".equals(str[0].trim())) {

			if (warehouseInvTran.containsKey(items[2])) {

				inv.setExpDate(expDate);
				inv.setQuantity(Integer.parseInt(items[1]));
				inv.setReceiveDate(currentTranDate);
				inv.setType(str[0]);
				inv.setUpcCode(items[0]);

				invList = warehouseInvTran.get(items[2]);
				if (invList != null) {
					invList.add(inv);
					warehouseInvTran.put(items[2], invList);
				} else {
					ArrayList<Inventory> newList = new ArrayList<Inventory>();
					newList.add(inv);
					warehouseInvTran.put(items[2], newList);
				}
			}

		}
		

	}

	/**
	 * 
	 * @param lineOfText
	 * @throws ParseException
	 */
	private static void saveStart(String lineOfText) {

		String[] str = lineOfText.split(":");
		for (int i = 0; i < str.length; i++)
			str[i] = str[i].trim();

		try {
			startDate = (Date) new SimpleDateFormat("MM/dd/yyyy").parse(str[1]);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param lineOfText
	 */
	private static void saveWare(String lineOfText) {

		String[] str = lineOfText.split("-");

		warehouseInvTran.put(str[1].trim(), null);

	

	}

	/**
	 * @param lineOfText
	 */
	private static void saveFood(String lineOfText) {

		String str[] = lineOfText.split("-");

		String item[] = str[1].split(":");

		for (int i = 0; i < item.length; i++)
			item[i] = item[i].trim();

		Food fitem = new Food();

		if ("Shelf life".equals(item[2]))
			fitem.setShelfLife(Integer.parseInt(item[3]));
		if ("Name".equals(item[4].trim()))
			fitem.setDesc(item[5]);

		foodItem.put(item[1].trim(), fitem);
		
	}

	public static Date dateUtil(Date date, int days, String type) {

		Date newDate = null;
		GregorianCalendar cal = new GregorianCalendar();

		if ("add".equals(type)) {

			cal.setTime(date);
			cal.add(Calendar.DATE, days);
			newDate = (Date) cal.getTime();

		}

		else if ("sub".equals(type)) {

			cal.setTime(date);
			cal.add(Calendar.DATE, days);
			newDate = (Date) cal.getTime();

		}

		return newDate;

	}

}

/*
 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy"); LocalDate
 * dt = (LocalDate) dtf.parse(str[1]);
 * 
 * System.out.println(dt);
 */