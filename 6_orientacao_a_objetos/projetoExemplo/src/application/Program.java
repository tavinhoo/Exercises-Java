package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle of x: ");
		x.a = mySc.nextDouble();
		x.b = mySc.nextDouble();
		x.c = mySc.nextDouble();

		System.out.println("Enter the measures of triangle of y: ");
		y.a = mySc.nextDouble();
		y.b = mySc.nextDouble();
		y.c = mySc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", x.area());

		System.out.printf("Triangle Y area: %.4f%n", y.area());

		String largerArea = (areaX > areaY) ? "X" : "Y";

		System.out.printf("Larger Area: %s", largerArea);

		mySc.close();
	}

}
