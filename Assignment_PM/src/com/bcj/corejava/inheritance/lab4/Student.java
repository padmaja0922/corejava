/**
 * 
 */
package com.bcj.corejava.inheritance.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class Student {
	
	private String firstName;
	private String lastName;
	private int age;
	private String course;
	
  /**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param course
	 */
	public Student(String firstName, String lastName, int age, String course) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.course = course;
	}
 
/**
 * @return the course
 */
public String getCourse() {
	return course;
}
/**
 * @param course the course to set
 */
public void setCourse(String course) {
	this.course = course;
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

public void printStudent(Student student) {	
	  
		   System.out.println("First Name : "+student.getFirstName());
		   System.out.println("Last Name : "+student.getLastName());
		   System.out.println("Age : "+student.getAge());
		   System.out.println("Course : "+student.getCourse());
		   
	   
}  
}
