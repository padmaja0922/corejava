/**
 * 
 */
package com.padmaja.eliminationtest.userinterface;

import java.util.Scanner;

import com.padmaja.eliminationtest.controller.OrderController;

/**
 * @author Boot Camp User 008
 *
 */
public class OrderUi {
	

	/** this method takes customer id and calls saveOrderId of OrderController class */
	
	public void generateOrder() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter customer Id");
		int id = scan.nextInt();
		OrderController orc = new OrderController();
		orc.saveOrderId(id);
		scan.close();
				
	}	

}
