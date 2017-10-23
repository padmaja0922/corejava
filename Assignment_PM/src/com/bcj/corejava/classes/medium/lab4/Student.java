/**
 * 
 */
package com.bcj.corejava.classes.medium.lab4;

/**
 * @author Boot Camp User 008
 *
 */
public class Student {
	
	private int studentId;
	private String studentName;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	private String branchName;
	
	
	/**
	 * @param studentId
	 * @param studentName
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param yearOfEngg
	 * @param branchName
	 */
	public Student(int studentId, String studentName, float qualifyingExamMarks, char residentialStatus, int yearOfEngg,
			String branchName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.qualifyingExamMarks = qualifyingExamMarks;
		this.residentialStatus = residentialStatus;
		this.yearOfEngg = yearOfEngg;
		this.branchName = branchName;
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
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the qualifyingExamMarks
	 */
	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}
	/**
	 * @param qualifyingExamMarks the qualifyingExamMarks to set
	 */
	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}
	/**
	 * @return the residentialStatus
	 */
	public char getResidentialStatus() {
		return residentialStatus;
	}
	/**
	 * @param residentialStatus the residentialStatus to set
	 */
	public void setResidentialStatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	/**
	 * @return the yearOfEngg
	 */
	public int getYearOfEngg() {
		return yearOfEngg;
	}
	/**
	 * @param yearOfEngg the yearOfEngg to set
	 */
	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
