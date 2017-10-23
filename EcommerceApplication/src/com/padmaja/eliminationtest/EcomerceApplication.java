/**
 * 
 */
package com.padmaja.eliminationtest;

import java.util.Scanner;

import com.padmaja.eliminationtest.controller.LoginController;
import com.padmaja.eliminationtest.controller.PaymentController;
import com.padmaja.eliminationtest.controller.ProductController;
import com.padmaja.eliminationtest.controller.RegistrationController;
import com.padmaja.eliminationtest.controller.ShoppingCartController;
import com.padmaja.eliminationtest.entity.Product;
import com.padmaja.eliminationtest.userinterface.LoginUi;
import com.padmaja.eliminationtest.userinterface.OrderUi;
import com.padmaja.eliminationtest.userinterface.PaymentUi;
import com.padmaja.eliminationtest.userinterface.ProductUi;
import com.padmaja.eliminationtest.userinterface.Registration;
import com.padmaja.eliminationtest.userinterface.ShoppingCartUi;

/**
 * @author Boot Camp User 008
 *
 */
public class EcomerceApplication {
	
	 Scanner scan = new Scanner(System.in);
	
public static void main(String[] args) {
		
		EcomerceApplication user = new EcomerceApplication();		
		
		System.out.println("1.Customer Registration");
		System.out.println("2.Login");
		System.out.println("3.Product Catalogue");
		System.out.println("4.Shopping Cart");
		System.out.println("5.Payment Processing");
		System.out.println("6.Order Generation");
		
		System.out.println("Enter your choice from the menu");
		int choice = user.scan.nextInt();		
		if(choice==1)
			user.registerUser(); 
              				
		
		System.out.println("Enter your choice from the menu");
	     choice = user.scan.nextInt();
		if(choice==2)
			 user.validateLogin();
		
		System.out.println("Enter your choice from the menu");
		  choice = user.scan.nextInt();
		
		if(choice ==3)			
			user.getProductDetails();
		
		System.out.println("Enter your choice from the menu");
		int choice3 = user.scan.nextInt();
		if(choice3 ==4)
		   user.saveShoppingCart();
		
		System.out.println("Enter your choice from the menu");
		  choice =user. scan.nextInt();
		if (choice == 5)
			user.processPayment();		
		
		user.scan.close();
	}



/**
 * this method takes customer details from scanner and pass them to RegisterController class
 * to save them to database and prints the result.
 */

 private void registerUser() {
	 
	 EcomerceApplication user = new EcomerceApplication();	
	System.out.println("Enter First Name");
	String  firstName=user.scan.nextLine();	
	 System.out.println("Enter Last Name");
	 String lastName=user.scan.nextLine();
	 System.out.println("Enter Email Id");
	 String email = user.scan.nextLine();
	 System.out.println("Enter Phone Number");
	 String phone =user. scan.nextLine();
	 System.out.println("Enter UserId");
	 String userId =user. scan.nextLine();
	 System.out.println("Enter Password");
	 String password = user.scan.nextLine();
	 RegistrationController rs = new RegistrationController();
	  boolean result =rs.registerUser(firstName,lastName,email,phone,userId,password);
	 Registration reg= new Registration();
	 reg.postResult(result);
  }
 

	/**
	 * this method takes user id and password from scanner and pass them to LoginController class and pass
	 * the result to UI layer
	 */
	
 
  private void validateLogin() {
	  EcomerceApplication user = new EcomerceApplication();
		LoginController login = new LoginController();
		System.out.println("Enter your User Id");
		String userid = user.scan.nextLine();
		System.out.println("Enter Password");
		String password = user.scan.nextLine();
		boolean result = login.verifyLogin(userid,password);
		LoginUi log = new LoginUi();
		if(result == true)
			log.printSucces();
		else
			log.printFail();
		
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
	 * this method saves the selected products to shopping cart and generates the shopping cart id
	 */
	private void saveShoppingCart() {
		
		EcomerceApplication user = new EcomerceApplication();
		ShoppingCartController shop = new ShoppingCartController();
		ShoppingCartUi shUi = new ShoppingCartUi();
		System.out.println("Enter the Product Id");
		 String id =user.scan.nextLine();
		 System.out.println("Enter Quantity");
		 int quantity = user.scan.nextInt();
		 boolean result = shop.saveShoppingCart(id,quantity);
		 shUi.postResult(result);
				
		
	}
  
  
  
    /** this method takes customer credit card details from scanner and calls processPayment method of
	 *  PaymentController class 
	 */
  
	private void processPayment() {		
		 
		EcomerceApplication user = new EcomerceApplication();
		 PaymentController pc = new PaymentController();
		 PaymentUi p =new PaymentUi();
		 OrderUi order = new OrderUi();		
		 System.out.println("Enter Credit card number");
		 int ccno = user.scan.nextInt();
		 System.out.println("Enter Name on the card");
		 String name = user.scan.nextLine();
       System.out.println("Enter CVV number ");
       int cvv = user.scan.nextInt();
       System.out.println("Enter the Amount");
       float amount = user.scan.nextFloat();
       boolean result = pc.processPayment(ccno,name,cvv,amount);
       if(result == true){
      	 p.paySuccess();
      	 order.generateOrder();        	 
       } 
       else
		     p.payFail();
       
	}



}
