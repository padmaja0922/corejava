/**
 * 
 */
package com.bcj.practice.corejava.lab2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Boot Camp User 008
 *
 */
public class StudentRoster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Student> studentlist = new ArrayList<Student>();
		int id=0;
		Scanner scan = new Scanner(System.in);

		studentlist.add(new Student(1, "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59));
		studentlist.add(new Student(2, "Suzan", "Erickson", "Erickson_1990@gmail.com", 19, 91, 72, 85));
		studentlist.add(new Student(3, "Jack", "Black", "The_lawyer99yahoo.com", 19, 85, 84, 87));
		studentlist.add(new Student(4, "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82));
		studentlist.add(new Student(5, "Padmaja", "Mutthooju", "Padmaja_22@yahoo.com", 36, 78, 89, 67));
        
		
		System.out.println("Enter Student Id to find Average Grade : ");
		id = scan.nextInt();
		print_Average_Grade(id,studentlist);
		
		print_Invalid_Emails(studentlist);
		
		System.out.println("Enter  student Id to be removed");
		 id = scan.nextInt();
		remove(id, studentlist);

		print_All(studentlist);

		scan.close();
	}

	/** this method removes the student from array list based on the id */
	public static void remove(int studentId, ArrayList<Student> list) {
	 
        boolean  state=false;
        Iterator<Student> iter = list.iterator();
        while(iter.hasNext()){
        	Student st = iter.next();
        	if (studentId == st.getStudentId()){
  			  iter.remove();
  				state = true;
  				}        
           }		
		 if(state==false)
			 System.out.println("Student Id doesn't exist");
	}

	public static void print_All(ArrayList<Student> list) {

		for(Student st : list){
			System.out.print("\nFirst Name : " + st.getFirstName());
			System.out.print("\tLast Name : " + st.getLastName());
			System.out.print("\tAge : " + st.getAge());
			System.out.print(
					"\tGrades : {" + st.getGrades()[0] + "," + st.getGrades()[1] + "," + st.getGrades()[2] + "}");

		}
	}

	/** this method finds the average of given student grades and prints them */
	public static void print_Average_Grade(int stuId, ArrayList<Student> list) {

		double average = 0.0d;
		for (Student str : list) {
			if (str.getStudentId() == stuId)
				average = (str.getGrades()[0] + str.getGrades()[1] + str.getGrades()[2])/ 3;
		}
		System.out.println("\nAverage : is " + average);
		
	}
	
	
/** this method checks for  valid email's  and prints all the students with invalid email's */	
	public static void print_Invalid_Emails(ArrayList<Student> list){
		
		String patternEmail = "^[(\\w-\\_)]+@[(a-z-A-z)]+\\.[(a-z-A-z)]{2,3}";
		Pattern pattern1 = Pattern.compile(patternEmail);	
		for(Student str:list){
			Matcher matcher = pattern1.matcher(str.geteMail());
		  if(matcher.find()==false)
			System.out.println("Invalid Email Id for Student : "+str.getFirstName());  
		 
		}
	}

}