package com.bcj.corejava.operators.lab2;

import java.util.Scanner;

/* calculating weight on moon */

public class MoonWeight {

	public double weightOnMoon(double w) {
		double p = w * 0.17;
		w = w - p;
		return w;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weight on earth :");
		double d = scan.nextDouble();
		MoonWeight m = new MoonWeight();
		d = m.weightOnMoon(d);
		System.out.println("Weight on moon is :  " + d);
		scan.close();
	}

}
