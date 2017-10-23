/**
 * 
 */
package com.bcj.corejava.inheritance.lab6;

/**
 * @author Boot Camp User 008
 *
 */
public class DayScholar extends Student{
	
	private Address residentialAddress;
	private float distance;
  /**
	 * @param studentId
	 * @param name
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param branchName
	 * @param permanentAddress
	 * @param yearOfEngg
	 * @param residentialAddress
	 * @param distance
	 */
	public DayScholar(int studentId, String name, float qualifyingExamMarks, char residentialStatus, String branchName,
			Address permanentAddress, int yearOfEngg, Address residentialAddress, float distance) {
		super(studentId, name, qualifyingExamMarks, residentialStatus, branchName, permanentAddress, yearOfEngg);
		this.residentialAddress = residentialAddress;
		this.distance = distance;
	}
/**
 * @return the residentialAddress
 */
public Address getResidentialAddress() {
	return residentialAddress;
}
/**
 * @param residentialAddress the residentialAddress to set
 */
public void setResidentialAddress(Address residentialAddress) {
	this.residentialAddress = residentialAddress;
}
/**
 * @return the distance
 */
public float getDistance() {
	return distance;
}
/**
 * @param distance the distance to set
 */
public void setDistance(float distance) {
	this.distance = distance;
}
	

}
