package com.bcj.corejava.introduction.lab4;

/* program to refactor the method */

public class DemoRefactorMehod {

	// method for refactor

	public void printRefactoredDetails(String name, String city, String state) {

		System.out.println("Hello, My name is " + name);
		System.out.println("I live in " + city + "  " + state);
		System.out.println("I am a java instructor");
		System.out.println("I work for Nivtek");

	}

	public static void main(String[] args) {

		DemoRefactorMehod d = new DemoRefactorMehod();
		d.printRefactoredDetails("Boot Camp", "Dallas", "TX");

	}

}
