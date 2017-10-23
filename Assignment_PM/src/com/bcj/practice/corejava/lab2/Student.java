/**
 * 
 */
package com.bcj.practice.corejava.lab2;

/**
 * @author Boot Camp User 008
 *
 */
public class Student {
	
	private int studentId;
	private String firstName;
	private String lastName;
	private String eMail;
	private int age;
	private int grades[] = new int[3];
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the eMail
	 */
	public String geteMail() {
		return eMail;
	}
	/**
	 * @param eMail the eMail to set
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the grades
	 */
	public int[] getGrades() {
		return grades;
	}
	/**
	 * @param grades the grades to set
	 */
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	/**
	 * @param studentId
	 * @param firstName
	 * @param lastName
	 * @param eMail
	 * @param age
	 * @param grades
	 */
	public Student(int studentId, String firstName, String lastName, String eMail, int age, int grade1 ,int grade2 ,int grades) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.age = age;
		this.grades[0] = grade1;
		this.grades[1]=grade2;
		this.grades[2]=grades;
		
	}
  public void print(int studentId, String firstName, String lastName){
		
		System.out.println("Student Id : " + studentId);
		System.out.println("Student First Name : "+firstName);
		System.out.println("Student Last Name : "+lastName);
	}
	
	

}
