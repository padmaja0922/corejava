/**
 * 
 */
package com.bcj.aopmavenlog;


public class ManuplateNumbers {
	
	
	public int addNumbers(int a, int b){
		return a+b;
		
	}
	
	public int multiplyNumbers(int a, int b){
		return a*b;
	}
	
    private float divideNumbers(float a, float b){
   
    	if(b!=0)	
    	return a/b;
    	else
    		return 0;
    	 
    }
}
