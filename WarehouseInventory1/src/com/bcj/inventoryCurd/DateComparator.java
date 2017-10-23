/**
 * 
 */
package com.bcj.inventoryCurd;

import java.util.Comparator;

import com.bcj.inventoryCurd.entity.Inventory;

/**
 * @author Boot Camp User 008
 *
 */
public class DateComparator implements Comparator<Object>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {

		Inventory inv1 = (Inventory) o1;
		Inventory inv2 = (Inventory) o2;

		  return (inv1.getReceiveDate().compareTo(inv2.getReceiveDate()));
		
		
	}
	
	

}
