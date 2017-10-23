/**
 * 
 */
package com.bcj.practice.corejava.ssn;

/**
 * This class calls DAO layer and pass the ssn details to it
 *
 */
public class SsnService {

	/**
	 * 	 * @param ssn
	 */
	public static boolean validateSsn(Ssn ssn){
		
	
		SsnDao sd = new SsnDao();
		boolean result = sd.validateSsn(ssn);
		
		 return result;
		
		
		/*Random r = new Random();
		for(int i=0;i<9;i++){			
			if(i==0)
				ssn=ssn+(r.nextInt(8)+1);
			else if (i==3|| i==5){
				ssn=ssn+"-";
				ssn=ssn+r.nextInt(10);
			}
			else
				ssn=ssn+r.nextInt(10);
					
		}
		s.setSsn(ssn);*/
				
	}

}
