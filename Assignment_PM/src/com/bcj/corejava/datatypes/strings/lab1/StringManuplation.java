/**
 * 
 */
package com.bcj.corejava.datatypes.strings.lab1;

/**
 * @author Boot Camp User 008
 *
 */
public class StringManuplation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*String s = "hello how are you?";

		System.out.println("\n No of words in the string " + countWords(s));
		System.out.println("Length of the string is : " + s.length());
		System.out.println("Replace hello with HELLO : " + s.replace("hello", "HELLO"));
		System.out.println("Replace all spaces with , : " + s.replace(" ", ","));
		System.out.println("First 3 characters of string : " + s.substring(0, 3));*/
		reverseString();
		/*occurenceOfA();
		findAndReplace();*/
	}

	// this method counts numbers of words in given sentence
	public static int countWords(String s) {

		String[] words = s.split("\\s");
		int i = 0;
		for (String w : words) {
			i++;
			System.out.print(w + "  ");
		}
		return i;
	}
	// this method takes 2 strings and compare whether they r equal or not

	public static void compareString() {
		String s1 = "hello", s2 = "HELLO";
		if (s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
	}

	// this method reverses string and it compares whether they r equal or not

	public static void reverseString() {

		String s = "NITIN";
		String s1 = "";
		
		for(int i = s.length()-1;i >=0;i--)
			s1=s1+ s.charAt(i);
		
		if (s1.equals(s))
			System.out.println("two strings are equal");
		else
			System.out.println("two strings are not equal");
	}
	

	// finding all occurrences of A in the given string
	public static void occurenceOfA() {

		String s = "HELLO HOW ARE YOU AND WHERE ARE YOU";
		int i = 0;
		for (int j = 0; j < s.length(); j++)
			if (s.charAt(j) == 'A')
				i++;
		System.out.println("number of occurrences of A in the string are : " + i);

	}
	
	//finding and replacing word 'institute' in the given sentence with 'JSS'
	public static void findAndReplace(){
		
		String s = "This  is a java institute of insurance and insu.";
		if (s.contains("institute") == true){
			s =s.replaceAll("institute", "JSS");
			System.out.println(s);
		}
		else
			System.out.println("There is no institute in given sentence");
			
		
	}

}
