/**
 * 
 */
package com.bcj.corejava.inheritance.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class Graduate extends Student{
	
     
      private String minQualification;

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param course
	 * @param minQualification
	 */
	public Graduate(String firstName, String lastName, int age, String course, String minQualification) {
		super(firstName, lastName, age, course);
		this.minQualification = minQualification;
	}

	/**
	 * @return the minQualification
	 */
	public String getMinQualification() {
		return minQualification;
	}

	/**
	 * @param minQualification the minQualification to set
	 */
	public void setMinQualification(String minQualification) {
		this.minQualification = minQualification;
	}	

	
	public boolean verifyQualification(String qualify)
	{
		if("Under Graduate".equalsIgnoreCase(qualify))
	      return true;
		else 
		{
			System.out.println("Minimum Qualification is /under Graduate");
			return false;
		}	
	}
	
	public void printStudent(Graduate grad) {
		
		   
		   if(grad.verifyQualification(grad.getMinQualification())==true)
		   {
			   super.printStudent(grad);
			   System.out.println("Course : "+grad.getCourse());
			  
		   }
	}
}
