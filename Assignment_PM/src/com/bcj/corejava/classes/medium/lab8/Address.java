/**
 *  this is an entity class of Address
 */
package com.bcj.corejava.classes.medium.lab8;

/**
 * @author Boot Camp User 008
 *
 */
public class Address {

private String addressLine;
private String city;
private String zip;
private String state;
/**
 * @return the addressLine
 */
public String getAddressLine() {
	return addressLine;
}
/**
 * @param addressLine the addressLine to set
 */
public void setAddressLine(String addressLine) {
	this.addressLine = addressLine;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the zip
 */
public String getZip() {
	return zip;
}
/**
 * @param zip the zip to set
 */
public void setZip(String zip) {
	this.zip = zip;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}



}
