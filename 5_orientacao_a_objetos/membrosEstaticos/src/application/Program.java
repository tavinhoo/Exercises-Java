package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	// versão 1
	public static final double PI = 3.14159;

	public static void main(String[] args) {

		/*
		 * Membros estáticos: Uma classe possui membros: atributos e métodos São membros
		 * que fazem sentido independentemente da instanciação;
		 * 
		 * Versão1: método na própria classe do programa. Versão2: classe Calculator com
		 * membros de instância. Versão3: classe Calculator com método estático
		 */
		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

		// versão2 // posteriormente pode ser apagado... V3
//		Calculator calc = new Calculator();

		System.out.print("Enter radius: ");
		double radius = mySc.nextDouble();

//		double c = circumference(radius);
//
//		double v = volume(radius);

		// versão2
//		double c = calc.circumference(radius);
//		double v = calc.volume(radius);

		// versão 3
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		mySc.close();
	}

	// versão 1
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}

	// versão 1
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}

}
