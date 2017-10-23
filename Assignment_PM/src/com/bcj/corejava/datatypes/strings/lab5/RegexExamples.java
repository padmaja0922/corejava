/**
 * This class validates whether email id , IP address and phone number entered by user is valid or not
 * Imported another class to validate email address and used the method in it.
 */
package com.bcj.corejava.datatypes.strings.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bcj.corejava.datatypes.strings.lab3.EmailValidation;

/**
 * @author Boot Camp User 008
 *
 */
public class RegexExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the phone number");
		String phone = scan.nextLine();
		validatePhonenumber(phone);
		System.out.println("Enter the IP Address ");
		String addr = scan.nextLine();
		validateIpAddress(addr);
		System.out.println("Enter Email Id :");
		String email = scan.nextLine();
		EmailValidation.validateEmailId(email);
		
		scan.close();
	}
/**  This method validates IP address is in the pattern x.x.x.x where x can 3 digits of 0-9 */	
	public static void validateIpAddress(String addr){
		
		String regex = "\\d{1,3}[-\\.]\\d{1,3}[-\\.]\\d{1,3}[-\\.]\\d";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(addr);
		if( matcher.find()==true )
			System.out.println(" IP address is valid");
		else
			System.out.println("IP address  is invalid");	
		
	}
	/** This method validates phone number regex compares whether phone number has 10 digits and in the pattern */
	public static void validatePhonenumber(String phone){
		
		String regex= "\\d{3}[-\\.\\s\\-]\\d{3}[-\\.\\s\\-]\\d{4}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phone);
		
		if(phone.length()!=10)
			System.out.println("Phone number should be 10 digits");
		else if( matcher.find()==true )
			System.out.println(" Phone number is valid");
		else
			System.out.println("Phone number is invalid");		
		  
	}

}
