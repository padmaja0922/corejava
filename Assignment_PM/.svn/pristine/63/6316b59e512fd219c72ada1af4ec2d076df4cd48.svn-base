/**
 * 
 */
package com.bcj.corejava.inheritance.lab6;

/**
 * @author Boot Camp User 008
 *
 */
public class DemoInherit {

	public static void main(String[] args) {
		
	   Address addr= new Address("8231 carpenter pkwy","Irving","75038","Texas");
			   
		Hostelite hostel = new Hostelite(12,"Tommy",75.6f,'H',"CSE",addr,4, "Aadharya",105,"double");		
		if(validateStudentName(hostel)==true){
			if ((validateBranchName(hostel)==true) && (validateExamMarks(hostel)==true))
			     displayStudent(hostel);
		
	    Address residentaddr = new Address("501 Moroe St","Dallas","75080","Texas");
		Address addr1 = new Address("123 Greenway Dr","Irving","75039","Texas");		
		DayScholar scholar = new DayScholar(13,"Timmy",80.5f,'D',"CSE",addr1,4,residentaddr,10);
		if(validateStudentName(scholar)==true){
			if ((validateBranchName(scholar)==true) && (validateExamMarks(scholar)==true))
			     dispalyDayScholar(scholar);
		}		
			
		}	
		
	}
		
public static void dispalyDayScholar(DayScholar scholar)
{System.out.println("Student Id : "+ scholar.getStudentId());
System.out.println("Student Name : "+ scholar.getName());
System.out.println("Qualifying Marks : "+ scholar.getQualifyingExamMarks());
System.out.println("Residential Status : "+ scholar.getResidentialStatus());
System.out.println("Current Year of Engineering : "+scholar.getYearOfEngg());
System.out.println("Branch Name : "+scholar.getBranchName());
System.out.print("Permanent Address : "+ scholar.getPermanentAddress().getAddressLine1());
System.out.print("  "+ scholar.getPermanentAddress().getAddressLine2());
System.out.print("  "+scholar.getPermanentAddress().getState());
System.out.print("  "+scholar.getPermanentAddress().getZipcode());
	
	
	
}
		
	public static void displayStudent(Hostelite hostel){
		
		System.out.println("Student Id : "+ hostel.getStudentId());
		System.out.println("Student Name : "+ hostel.getName());
		System.out.println("Qualifying Marks : "+ hostel.getQualifyingExamMarks());
		System.out.println("Residential Status : "+ hostel.getResidentialStatus());
		System.out.println("Current Year of Engineering : "+hostel.getYearOfEngg());
		System.out.println("Branch Name : "+hostel.getBranchName());
		System.out.print("Permanent Address : "+ hostel.getPermanentAddress().getAddressLine1());
		System.out.print("  "+ hostel.getPermanentAddress().getAddressLine2());
		System.out.print("  "+hostel.getPermanentAddress().getState());
		System.out.print("  "+hostel.getPermanentAddress().getZipcode());
		System.out.println("\n Hostel Name : "+hostel.getHostelName());
		
	}
	
	public static boolean validateStudentName(Student hostel){
	
	  if( hostel.getName().length() < 3 && 	hostel.getName().length() >25)
		  return false;
	  else{
		  System.out.println("Student  name invalid");
		  return true;
	  }
      }
	public static boolean validateBranchName(Student hostel){
		
		if("CSE".equals(hostel.getBranchName()))
				return true;
		else{
			
			System.out.println("Invalid Branch name");
			return false;
		}
		
	}
	public static boolean validateExamMarks(Student hostel){
		
		if(hostel.getQualifyingExamMarks()>= 75 && hostel.getQualifyingExamMarks()<=100)
			return true;
		else{
			System.out.println("Invalid Qualifying marks");
			return false;
		}
	}

}