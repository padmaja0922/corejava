/**
 * 
 */
package com.bcj.corejava.inheritance.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class UnderGraduate extends Student{

	private String minQualification;

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param course
	 * @param minQualification
	 */
	public UnderGraduate(String firstName, String lastName, int age, String course, String minQualification) {
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
		if("High School".equalsIgnoreCase(qualify))
	      return true;
		else 
			return false;			
	}
	
	 public void printStudent(UnderGraduate gard) {
			
		  
		   if(gard.verifyQualification(gard.getMinQualification())==true)
		   {
			   super.printStudent(gard);
			   System.out.println("Course : "+gard.getCourse());
			  
		   }
	}
	
}
