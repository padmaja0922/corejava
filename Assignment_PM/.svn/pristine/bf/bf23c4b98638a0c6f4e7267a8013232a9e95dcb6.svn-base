/**
 * 
 */
package com.bcj.corejava.classes.medium.lab1;

/**
 * @author Boot Camp User 008
 *
 */
public class InvoiceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	 	Invoice invoice = new Invoice("screw", "screwdriver",10,2.5);
	 	double invoiceAmount = getInvoiceAmount(invoice);
	 	System.out.println("Invoice Amount is : "+invoiceAmount);
	 	
		
	}

	/**
	 * @param invoice
	 * @return double
	 */
	
	private static double getInvoiceAmount(Invoice invoice) {
		
		if(invoice.getQuantity()<0)
			invoice.setQuatity(0);
		if(invoice.getPricePerItem()<0.0)
			invoice.setPricePerItem(0.0);
	double amount = invoice.getPricePerItem()*invoice.getQuantity();
	
		
		return amount;
	}

}
