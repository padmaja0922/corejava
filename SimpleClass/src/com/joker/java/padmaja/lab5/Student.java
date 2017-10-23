/**
 * 
 */
package com.joker.java.padmaja.lab5;

/**
 * @author Boot Camp User 008
 *
 */
public class Student {

	private int studentId;
	private char studentType;
	
	
	
	/**
	 * @param studentId
	 * @param studentType
	 */
	public Student(int studentId, char studentType) {
		this.studentId = studentId;
		this.studentType = studentType;
	}



	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}



	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	/**
	 * @return the studentType
	 */
	public char getStudentType() {
		return studentType;
	}



	/**
	 * @param studentType the studentType to set
	 */
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}



	public static void main(String[] args) {
		
		 Student student = new Student(10,'F');
		 System.out.println("Student Id : "+student.getStudentId());
		 System.out.println("Student Type : "+student.getStudentType());

	}

}
