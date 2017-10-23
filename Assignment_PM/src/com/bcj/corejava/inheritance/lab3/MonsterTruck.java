/**
 * 
 */
package com.bcj.corejava.inheritance.lab3;

/**
 * @author Boot Camp User 008
 *
 */
public class MonsterTruck extends Truck{
	
	public void m1(){
		System.out.println("Monster 1");
	}
	
	public void m2(){
		super.m1();
		super.m2();
	}
	
	public String toString(){
		
		return ("monster"+" "+super.toString());
	}
	public static void main(String[] args) {
		
		MonsterTruck monster = new MonsterTruck();
		monster.m1();
		monster.m2();
	    System.out.println(monster);
		
	}

}
