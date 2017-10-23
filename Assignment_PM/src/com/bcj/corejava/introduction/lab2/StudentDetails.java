package com.bcj.corejava.introduction.lab2;

import java.util.Scanner;

/*  Program to Parse Integer to primitive type Int */

public class StudentDetails {

	public static void main(String[] args) {

		String fName, lName;
		int age;

		// getting details from keyboard

		System.out.println("Enter Students first name");
		Scanner scan = new Scanner(System.in);
		fName = scan.nextLine();
		System.out.println("Enter Students last name");
		lName = scan.nextLine();
		System.out.println("Enter Students age");
		age = scan.nextInt();

		System.out.println("Student details :");
		System.out.println(fName + "   " + lName + "    " + age);
		scan.close();
	}

}
