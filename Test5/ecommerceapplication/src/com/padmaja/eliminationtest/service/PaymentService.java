/**
 * 
 */
package com.padmaja.eliminationtest.service;

import com.padmaja.eliminationtest.dao.PaymentDao;
import com.padmaja.eliminationtest.entity.CreditCard;

/**
 * @author Boot Camp User 008
 *
 */
public class PaymentService {

	/**
	 * @param cc
	 * @return
	 */
	public boolean processPayment(CreditCard cc) {
		
		CreditCard card = new CreditCard();
		PaymentDao pay =new PaymentDao();
		card = pay.processPayment();
		if((card.getCcNo()== cc.getCcNo())&& (card.getName().equals(cc.getName())) && (card.getCvv()==cc.getCvv())&& (card.getAmount()<=cc.getAmount()) )
		
			 return true;
		else				
		    return false;
	}

}
