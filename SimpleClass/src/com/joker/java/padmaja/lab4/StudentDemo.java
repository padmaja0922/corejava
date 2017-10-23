/**
 * 
 */
package com.joker.java.padmaja.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudentId(1001);
		student.setResidentialStatus('D');
		student.setQualifyingExamMarks(95.0f);
        student.setStudentId(2);
        
        System.out.println("Student Id : "+ student.getStudentId());
        System.out.println("Qualifying Marks : "+student.getQualifyingExamMarks());
        System.out.println("Residential Status : "+ student.getResidentialStatus());
        System.out.println("Current Year Of Engineering : "+ student.getYearOfEngg());
	}

}
