/**
 * 
 */
package com.bcj.test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * This class inputs 10 customer details and sorts them based on there first
 * name, last name and age
 *
 */
public class DemoApplication {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Customer> custArray = new ArrayList<Customer>();
		
		System.out.println("Enter the number of Customers");
		int num = scan.nextInt();

		// for loop to enter details of 10 customers

		for (int i = 1; i <= num; i++) {

			Customer cust = new Customer();

			System.out.println("Enter the firstname , lastname ,age of Customer " + i);
			cust.setFirstName(scan.next());
			cust.setLastName(scan.next());
			cust.setAge(scan.nextInt());

			custArray.add(cust);

		}

		System.out.println("Enter the field on which to sort { firstName, lastName , age }");
		String field = scan.next();

		DemoApplicationService.sortCustomer(custArray, field);
		
      // for displaying the Customers
		
		for (Customer cust : custArray) {

			System.out.println(cust.toString());

		}

		scan.close();
	}

}
