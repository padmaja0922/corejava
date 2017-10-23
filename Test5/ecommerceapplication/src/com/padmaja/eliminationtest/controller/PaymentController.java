/**
 * 
 */
package com.padmaja.eliminationtest.controller;

import com.padmaja.eliminationtest.entity.CreditCard;
import com.padmaja.eliminationtest.service.PaymentService;

/**
 * @author Boot Camp User 008
 *
 */
public class PaymentController {

	/**
	 * @param ccno
	 * @param name
	 * @param cvv
	 * @param amount
	 * @return
	 */
	public boolean processPayment(int ccno, String name, int cvv, float amount) {
		
		CreditCard cc= new CreditCard();
		cc.setCcNo(ccno);
		cc.setName(name);
		cc.setCvv(cvv);
		cc.setAmount(amount);
		PaymentService ps = new PaymentService();
	    boolean result = ps.processPayment(cc);
	  
	return result;
	}

	
	

}
