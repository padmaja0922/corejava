/**
 * 
 */
package com.joker.java.padmaja.lab6;

/**
 * @author Boot Camp User 008
 *
 */
public class TicketDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ticket newTicket=new Ticket();
	    Ticket newTicket1=new Ticket(18,1);
		Ticket newTicket2=new Ticket(2,18);
		validateTicket(newTicket);
		validateTicket(newTicket1);
		validateTicket(newTicket2);

}

 public static void validateTicket(Ticket newTicket){	
	if(newTicket.getEndPoint()==0 || newTicket.getStartPoint()==0)
		System.out.println("Start or End Point cannot be Zero ");
	else if(newTicket.getEndPoint()<=newTicket.getStartPoint())
		System.out.println("End Point cannot be less or equal to Start");
	else
		newTicket.setTicketAmount((newTicket.getEndPoint()-newTicket.getStartPoint())*20);
	
	System.out.println("Start Point : " +newTicket.getStartPoint() );
	System.out.println("End Point : "+newTicket.getEndPoint());
	System.out.println("Ticket Amount : "+newTicket.getTicketAmount());
}
}