/**
 * 
 */
package com.bcj.corejava.inheritance.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class MasterStudent extends Graduate{
	
	private String type;

	

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param course
	 * @param minQualification
	 * @param type
	 */
	public MasterStudent(String firstName, String lastName, int age, String course, String minQualification,
			String type) {
		super(firstName, lastName, age, course, minQualification);
		this.type = type;
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
	
	public void printStudent(MasterStudent master) {
		
		   
		   if(master.verifyQualification(master.getMinQualification())==true)
		   {
			   super.printStudent(master);
			   System.out.println("Type : "+master.getType());
		   }
	}

	
}
