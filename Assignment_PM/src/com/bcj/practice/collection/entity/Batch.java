/**
 * 
 */
package com.bcj.practice.collection.entity;

import java.sql.Date;

/**
 * @author Boot Camp User 008
 *
 */
public class Batch {

	String batchId;
	String year;
	Date startDate;
	Date endDate;
	
	
	public Batch() {
		super();
	}
	
	
	/**
	 * @param batchId
	 * @param year
	 * @param startDate
	 * @param endDate
	 */
	public Batch(String batchId, String year, Date startDate, Date endDate) {
		super();
		this.batchId = batchId;
		this.year = year;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	/**
	 * @return the batchId
	 */
	public String getBatchId() {
		return batchId;
	}
	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
