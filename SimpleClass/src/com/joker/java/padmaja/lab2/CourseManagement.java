/**
 * 
 */
package com.joker.java.padmaja.lab2;

/**
 * @author Boot Camp User 008
 *
 */
public class CourseManagement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int stuId = 123;
		char stuType='F';
		Student student = new Student();
		student.setStudentId(stuId);
		student.setStudentType(stuType);
		System.out.println("Student Id : "+ student.getStudentId());
		System.out.println("Student Type : "+student.getStudentType());
	}

}
