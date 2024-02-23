package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

		Rectangle rectangle1 = new Rectangle();

		System.out.println("Enter rectangle width and height: ");

		rectangle1.width = mySc.nextDouble();
		rectangle1.height = mySc.nextDouble();

		System.out.println(rectangle1);

		mySc.close();
	}
}
