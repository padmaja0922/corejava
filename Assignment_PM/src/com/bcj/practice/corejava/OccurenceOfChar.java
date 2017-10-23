/**
 * 
 */
package com.bcj.practice.corejava;

/**
 * @author Boot Camp User 008
 *
 */
public class OccurenceOfChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	 System.out.println(findOccurence("asadaeasda"));	

	}
	
	
	public static int findOccurence(String str){
		
		 int count =0;
		 char a='a';
		 for(int i=0;i<str.length();i++){
			 if(str.charAt(i)==a)
				 count++;
		 }
		return count;
	}

}
