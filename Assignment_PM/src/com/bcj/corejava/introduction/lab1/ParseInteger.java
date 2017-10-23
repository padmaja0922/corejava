package com.bcj.corejava.introduction.lab1;

/* Parsing the string to primitive type int by taking inputs from command line arguments */

public class ParseInteger {

          public static void main(String args[]){ 
        	  
        	        	  
        	  //parsing using parse method
        	  
      		  System.out.println("student first name : " + args[0] );
      		  System.out.println("student last name : " + args[1] );
      		  System.out.println("student age : " + Integer.parseInt(args[2]));
      		  		
      		  
        	  
        	  
          }


}
