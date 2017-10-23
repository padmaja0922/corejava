/**
 * 
 */
package com.joker.java.padmaja.lab6;

/**
 * @author Boot Camp User 008
 *
 */
public class Ticket {
	
	private int startPoint;
	private int endPoint;
	private int ticketAmount;
	
	public Ticket() {
		
	}
	
	/**
	 * @param startPoint
	 * @param endPoint
	 */
	public Ticket(int startPoint, int endPoint) {
		
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	/**
	 * @return the startPoint
	 */
	public int getStartPoint() {
		return startPoint;
	}
	/**
	 * @param startPoint the startPoint to set
	 */
	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}
	/**
	 * @return the endPoint
	 */
	public int getEndPoint() {
		return endPoint;
	}
	/**
	 * @param endPoint the endPoint to set
	 */
	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}
	/**
	 * @return the ticketAmount
	 */
	public int getTicketAmount() {
		return ticketAmount;
	}
	/**
	 * @param ticketAmount the ticketAmount to set
	 */
	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

}
