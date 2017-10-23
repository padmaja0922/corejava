/**
 * 
 */
package com.bcj.corejava.inheritance.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class DoctoralStudent extends Graduate{
	
	private String Type;

	/**
	 * @return the type
	 */
	public String getType() {
		return Type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		Type = type;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param course
	 * @param minQualification
	 * @param type
	 */
	public DoctoralStudent(String firstName, String lastName, int age, String course, String minQualification,
			String type) {
		super(firstName, lastName, age, course, minQualification);
		Type = type;
	}
	
	public void printStudent (DoctoralStudent doctor) {
		
		   
		   if(doctor.verifyQualification(doctor.getMinQualification())==true)
		   {
			   super.printStudent(doctor);
			   System.out.println("Type : "+doctor.getType()); 
		   }	
	}
	
  public static void main(String[] args) {
	
	
	Graduate doctor = new DoctoralStudent("John","Watson",30,"Graduate","Under Graduate","Master");
          doctor.printStudent(doctor); 
    DoctoralStudent doctor1 = new DoctoralStudent("Mike","Paxston",35,"Graduate","Under Graduate","Master");
       doctor1.printStudent(doctor1);
   Student stu = new Graduate("Harry","Donald",29,"Graduate","Under Graduate");   
         stu.printStudent(stu);
  }          
}
