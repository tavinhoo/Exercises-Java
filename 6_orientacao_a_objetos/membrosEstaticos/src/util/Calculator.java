package util;

public class Calculator {

	// versão 2
	public static final double PI = 3.14159;

	// versão 2
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}

	// versão 2
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
}
