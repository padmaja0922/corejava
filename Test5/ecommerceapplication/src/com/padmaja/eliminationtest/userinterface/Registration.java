/**
 * 
 */
package com.padmaja.eliminationtest.userinterface;

import java.util.Scanner;

import com.padmaja.eliminationtest.controller.LoginController;
import com.padmaja.eliminationtest.controller.OrderController;
import com.padmaja.eliminationtest.controller.PaymentController;
import com.padmaja.eliminationtest.controller.ProductController;
import com.padmaja.eliminationtest.controller.RegistrationController;
import com.padmaja.eliminationtest.controller.ShoppingCartController;
import com.padmaja.eliminationtest.entity.Product;

/**
 * @author Boot Camp User 008
 *
 */
public class Registration {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Registration user = new Registration();
		
		System.out.println("1.Customer Registration");
		System.out.println("2.Login");
		System.out.println("3.Product Catalogue");
		System.out.println("4.Shopping Cart");
		System.out.println("5.Payment Processing");
		System.out.println("6.Order Generation");
		
		System.out.println("Enter your choice from the menu");
		int choice = scan.nextInt();
		
		if(choice==1)
			user.registerUser();        				
	
		System.out.println("Enter your choice from the menu");
		choice = scan.nextInt();
		if(choice==2)
			 user.validateLogin();
		
		System.out.println("Enter your choice from the menu");
		choice = scan.nextInt();
		
		if(choice ==3)			
			 user.getProductDetails();
		
		System.out.println("Enter your choice from the menu");
		choice = scan.nextInt();
		if(choice ==4)
		  user.saveShoppingCart();
		
		System.out.println("Enter your choice from the menu");
		choice = scan.nextInt();
		if (choice == 5)
			user.processPayment();
		
		
		scan.close();
	}

	/** this method takes customer id and calls saveOrderId of OrderController class */
	
	private void generateOrder() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter customer Id");
		int id = scan.nextInt();
		OrderController orc = new OrderController();
		orc.saveOrderId(id);
		scan.close();
				
	}	
	
	/** this method takes customer credit card details from scanner and calls processPayment method of
	 *  PaymentController class 
	 */
	private void processPayment() {
		
		  Registration rs= new Registration();
		 PaymentController pc = new PaymentController();
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Credit card number");
		 int ccno = scan.nextInt();
		 System.out.println("Enter Name on the card");
		 String name = scan.nextLine();
         System.out.println("Enter CVV number ");
         int cvv = scan.nextInt();
         System.out.println("Enter the Amount");
         float amount = scan.nextFloat();
         boolean result = pc.processPayment(ccno,name,cvv,amount);
         PaymentUi p =new PaymentUi();
         if(result == true){
        	 p.paySuccess();
        	 rs.generateOrder();        	 
         } 
         else
		     p.payFail();
         scan.close();
	}

	/**
	 * this method saves the selected products to shopping cart and generates the shopping cart id
	 */
	private void saveShoppingCart() {
		ShoppingCartController shop = new ShoppingCartController();
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the Product Id");
		 String id =scan.nextLine();
		 System.out.println("Enter Quantity");
		 int quantity = scan.nextInt();
		 boolean result = shop.saveShoppingCart(id,quantity);
		if (result==true)
		  System.out.println("Shopping cart Id "+ 568);
		else
		System.out.println("Error");	
		scan.close();
		
	}

	/**
	 * this method calls getProductDetails method of ProductController class to get product details
	 * and pass them to UI layer for printing 
	 */
	private void getProductDetails() {
		
		ProductController prodc = new ProductController();
		 Product prod = new Product();
		prod = prodc.getProductDetails();
		ProductUi pui = new ProductUi();
		pui.displayProduct(prod);		
	
	}

	/**
	 * this method takes userid and password from scanner and pass them to LoginController class and pass
	 * the result to UI layer
	 */
	
	private void validateLogin() {
		
		Scanner scan = new Scanner(System.in);
		LoginController login = new LoginController();
		System.out.println("Enter your User Id");
		String user = scan.nextLine();
		System.out.println("Enter Password");
		String password = scan.nextLine();
		boolean result = login.verifyLogin(user,password);
		LoginUi log = new LoginUi();
		if(result == true)
			log.printSucces();
		else
			log.printFail();
		scan.close();
	}

	/**
	 * this method takes customer details from scanner and pass them to RegisterController class
	 * to save them to database and prints the result.
	 */
	private void registerUser() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String  firstName=scan.nextLine();
		 System.out.println("Enter Last Name");
		 String lastName=scan.nextLine();
		 System.out.println("Enter Email Id");
		 String email = scan.nextLine();
		 System.out.println("Enter Phone Number");
		 String phone = scan.nextLine();
		 System.out.println("Enter UserId");
		 String userId = scan.nextLine();
		 System.out.println("Enter Password");
		 String password = scan.nextLine();
		 RegistrationController rs = new RegistrationController();
		  boolean result =rs.registerUser(firstName,lastName,email,phone,userId,password);
		 scan.close();
		 if(result == true){
			  System.out.println("Registration Sucess");
			  System.out.println("Customer Id  "+ 234);}
		 else
			 System.out.println("Customer Creation failed");
		
	}

}
