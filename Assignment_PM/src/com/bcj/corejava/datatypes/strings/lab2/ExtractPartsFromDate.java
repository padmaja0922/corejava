/**
 *  This class takes 
 */
package com.bcj.corejava.datatypes.strings.lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Boot Camp User 008
 *
 */
public class ExtractPartsFromDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		  	
	     Date date = new Date();
	     SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate= format1.format(date);  
	    System.out.println(strDate); 		 
	    String[] words = strDate.split("/");
	    System.out.println("Date in different Strings : ");
	    for(String s : words)
	    	System.out.print(s + "  ");
		 
		 
	}

}
