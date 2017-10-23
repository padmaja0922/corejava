/**
 * 
 */
package com.bcj.corejava.inheritance.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class Freshman extends UnderGraduate{
	
	private String year;

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param course
	 * @param minQualification
	 * @param year
	 */
	public Freshman(String firstName, String lastName, int age, String course, String minQualification, String year) {
		super(firstName, lastName, age, course, minQualification);
		this.year = year;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
   public void printStudent(Freshman freshman) {
	
	   
	   if(freshman.verifyQualification(freshman.getMinQualification())==true)
	   {
		   super.printStudent(freshman);
		   System.out.println("Year : "+freshman.getYear());
	   }
    }
   public static void main(String[] args) {
	
	   
	   
	   
}
	
}
