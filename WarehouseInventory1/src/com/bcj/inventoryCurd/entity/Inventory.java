/**
 * 
 */
package com.bcj.inventoryCurd;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Boot Camp User 008
 *
 */
public class Inventory {
	
	private String upcCode ;
	private String type;
	private Date receiveDate;
	private Date expDate;
	private int quantity;
	
	
	
	
	/**
	 * 
	 */
	public Inventory() {
		super();
	}
	/**
	 * @param upcCode
	 * @param type
	 * @param receiveDate
	 * @param expDate
	 * @param quantity
	 */
	
	public Inventory(String upcCode, String type, Date receiveDate, Date expDate, int quantity) {
		super();
		this.upcCode = upcCode;
		this.type = type;
		this.receiveDate = receiveDate;
		this.expDate = expDate;
		this.quantity = quantity;
	}
	
	
	public String toString(){
		
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String receive = df.format(receiveDate); 
		String exp = df.format(expDate);
		return (upcCode +" "+ type + " "+ receive +" "+exp + " " +quantity); 
	}
	
	/**
	 * @return the upcCode
	 */
	public String getUpcCode() {
		return upcCode;
	}
	/**
	 * @param upcCode the upcCode to set
	 */
	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the receiveDate
	 */
	public Date getReceiveDate() {
		return receiveDate;
	}
	/**
	 * @param receiveDate the receiveDate to set
	 */
	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}
	/**
	 * @return the expDate
	 */
	public Date getExpDate() {
		return expDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
