/**
 * 
 */
package com.bcj.pbsregent.service;

import com.bcj.pbsregent.dao.PaymentDao;
import com.bcj.pbsregent.entity.CreditCard;

/**
 * @author Boot Camp User 008
 *
 */
public class PaymentService {

	/**
	 * @param card
	 * @return
	 */
	public static int verifyCardDetails(CreditCard card) {		
		
		
		int x = PaymentDao.verifyCardDetails(card);
		
		return x;
	}

}
