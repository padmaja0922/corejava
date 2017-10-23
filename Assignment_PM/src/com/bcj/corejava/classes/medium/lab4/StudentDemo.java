/**
 * 
 */
package com.bcj.corejava.classes.medium.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 	
          Student studentOne = new Student(1001,"Jackson",95.0f,'D',2,"CSE");
       boolean name =  validateStudentName(studentOne.getStudentName());
       boolean branch = validateBranchName(studentOne.getBranchName());
       if(name==true  && branch==true)       
    	    validateExamMarks(studentOne);
       Student studentTwo = new Student(1002,"Jen",68.0f,'H',3,"ABC");
        name =  validateStudentName(studentTwo.getStudentName());
        branch = validateBranchName(studentTwo.getBranchName());
       if(name==true  && branch==true)       
    	    validateExamMarks(studentOne);
        
          
          
	}
	public static boolean validateStudentName(String name){
		
		if(name.length()<5 || name.length()>25){
		  System.out.println("Name must of lenght between 5 and 25");	
		   return false;
		}
		else
			return true;
		
	}
	public static boolean validateBranchName(String branch){
		
		String s[] = {"CSE","ECE","EEE","MECH","Vio-Tech"};
		int i=0;
		for(String str : s)
		  if(branch.equals(str))
			   i=1;
		  if(i==1)
			  return true;		  
		  else{
			  System.out.println("Branch is not Valid");
			  return false;
		  }
	}
	
  public static void validateExamMarks(Student s){
	  if(s.getQualifyingExamMarks() < 65 || s.getQualifyingExamMarks()  > 100)
		  System.out.println("Invalid Marks , the range of marks is between 65 and 100");
	  else
	  {
		  System.out.println("Student Id : "+s.getStudentId());
		  System.out.println("Student Name : "+s.getStudentName());
		  System.out.println("Qualifying Marks : "+s.getQualifyingExamMarks());
		  System.out.println("Residential Ststus : "+s.getResidentialStatus());
	      System.out.println("Current Year Of Engineering : "+ s.getYearOfEngg());
	      System.out.println("Branch Name : "+s.getBranchName());
	      
	  }  
  }
	  
}
