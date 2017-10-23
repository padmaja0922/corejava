package com.bcj.corejava.introduction.lab1;

/* This class  Prints shape */

public class PrintShape {
	
   // printing the first and last line
    public void printLine() {
		System.out.print("  ");
		System.out.print("-------");
		System.out.println();
	}
 
     // printing first slash
    
	public void printSlash(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i == a)
				System.out.print("/");
			else if (i == b)
				System.out.println("\\");
			else
				System.out.print(" ");
		}
	}
     
	//printing back slash
	
	public void printBackSlash(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i == a)
				System.out.print("\\");
			else if (i == b)
				System.out.println("/");
			else
				System.out.print(" ");
		}
	}

	public static void main(String[] args) {

		PrintShape s = new PrintShape();
		s.printLine();
		System.out.print(" ");
		s.printSlash(3, 11);
		s.printSlash(4, 14);
		System.out.println("-\"-'-\"-'\"- ");
		s.printBackSlash(4, 14);
		System.out.print(" ");
		s.printBackSlash(5, 13);
		s.printLine();

	}
}