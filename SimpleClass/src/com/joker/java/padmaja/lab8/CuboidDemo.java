/**
 * This class create the object for Cuboid class , set the values for of its data members
 * and displays them.
 */
package com.joker.java.padmaja.lab8;

/**
 * @author Boot Camp User 008
 *
 */
public class CuboidDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cuboid cu= new Cuboid();
		cu.setHeight(34);
	    cu.setLength(23);
	    cu.setWidth(12);
	    System.out.println("Height : "+ cu.getHeight());
	    System.out.println("Length : "+cu.getLength());
	    System.out.println("Width : "+cu.getWidth());
	}

}
