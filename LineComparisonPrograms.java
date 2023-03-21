package com.bridgelabz.linecomparisoncomputationprograms;

import java.util.Scanner;

//* Welcome message for line comparison computation programs *//

public class LineComparisonPrograms {
	public static void main(String[] args) {
		System.out.println("Welcome message for line comparison computation programs");
// length of the line using cartesian system
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2, LengthOfLineOne;
		System.out.println("Enter the point one (x1,y1) ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		System.out.println("Enter the point two (x2,y2)");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		LengthOfLineOne = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Length of a line =" + LengthOfLineOne);
		double a1, b1, a2, b2, LengthOfLineTwo;
		System.out.println("Enter the point three (a1,b1)");
		a1 = sc.nextDouble();
		b1 = sc.nextDouble();
		System.out.println("Enter the point four (a2,b2)");
		a2 = sc.nextDouble();
		b2 = sc.nextDouble();
		LengthOfLineTwo = Math.sqrt(((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1)));
		System.out.println("Length of line two is " + LengthOfLineTwo);
// Length comparison
		if (LengthOfLineOne == LengthOfLineTwo) {
			System.out.println("The two lengths are equal");
		} else {
			System.out.println("The two lengths are not equal");
		}

	}

}
