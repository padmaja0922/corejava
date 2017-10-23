/**
 * 
 */
package com.bcj.corejava.inheritance.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class Junior extends UnderGraduate{

	private String Year;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param course
	 * @param minQualification
	 * @param year
	 */
	public Junior(String firstName, String lastName, int age, String course, String minQualification, String year) {
		super(firstName, lastName, age, course, minQualification);
		Year = year;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return Year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		Year = year;
	}
	 public void printStudent(Junior junior) {
		
		   
		   if(junior.verifyQualification(junior.getMinQualification())==true)
		   {
			   super.printStudent(junior);
			   System.out.println("Year : "+junior.getYear());
		   }
	}	 
	 
}
