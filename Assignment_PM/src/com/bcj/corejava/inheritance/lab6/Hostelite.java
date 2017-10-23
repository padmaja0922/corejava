/**
 * 
 */
package com.bcj.corejava.inheritance.lab6;

/**
 * @author Boot Camp User 008
 *
 */
public class Hostelite extends Student{
	
	private String hostelName;
	private int roomNumber;
	private String roomType;
	
	/**
	 * @param studentId
	 * @param name
	 * @param qualifyingExamMarks
	 * @param residentialStatus
	 * @param branchName
	 * @param permanentAddress
	 * @param yearOfEngg
	 * @param hostelName
	 * @param roomNumber
	 * @param roomType
	 */
	public Hostelite(int studentId, String name, float qualifyingExamMarks, char residentialStatus, String branchName,
			Address permanentAddress, int yearOfEngg, String hostelName, int roomNumber, String roomType) {
		super(studentId, name, qualifyingExamMarks, residentialStatus, branchName, permanentAddress, yearOfEngg);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}
	/**
	 * @return the hostelName
	 */
	public String getHostelName() {
		return hostelName;
	}
	/**
	 * @param hostelName the hostelName to set
	 */
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	/**
	 * @return the roomNumber
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	/**
	 * @return the roomType
	 */
	public String getRoomType() {
		return roomType;
	}
	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	

}
