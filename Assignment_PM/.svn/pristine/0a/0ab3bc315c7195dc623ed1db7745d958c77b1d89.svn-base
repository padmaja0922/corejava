package com.bcj.corejava.operators.lab4;

import java.util.Scanner;

/* Convert temperature from Celsius to Fahrenheit  and Fahrenheit to Celsius. */

public class TemperatureConvertor {

	// converting from Celsius to Fahrenheit
	public void convertCelToFah(float f) {
		f = (f * 9 / 5) + 32;
		System.out.println("The temperature in Fahrenheit is : " + f);

	}

	// converting from Fahrenheit to Celsius
	public void convertFahToCel(float c) {
		c = (c - 32) * 5 / 9;
		System.out.println("The temperature in Celsius is : " + c);

	}

	public static void main(String[] args) {

		TemperatureConvertor tc = new TemperatureConvertor();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature to convert from Celsius to Fahrenheit ");
		float f = scan.nextFloat();
		tc.convertCelToFah(f);
		System.out.println("Enter temperature to convert from Fahrenheit to Celsius ");
		float c = scan.nextFloat();
		tc.convertFahToCel(c);
		scan.close();
	}

}
