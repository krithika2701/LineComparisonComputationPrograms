package com.bridgelabz.linecomparisoncomputationprograms;

import java.util.Scanner;

//* Welcome message for line comparison computation programs *//

public class LineComparisonPrograms {
	public static void main(String[] args) {
		System.out.println("Welcome message for line comparison computation programs");
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2, LengthOfLine;
		System.out.println("Enter the point one (x1,y1) ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		System.out.println("Enter the point two (x2,y2)");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		LengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Length of a line =" + LengthOfLine);

	}

}
