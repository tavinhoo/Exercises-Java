package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

		Employee employee001 = new Employee();

		System.out.print("Name: ");
		employee001.name = mySc.nextLine();

		System.out.print("Gross Salary: ");
		employee001.grossSalary = mySc.nextDouble();

		System.out.print("Tax: ");
		employee001.tax = mySc.nextDouble();

		System.out.printf("Employee: %s%n", employee001);

		System.out.print("Witch percentage to increase salary?");
		double percentage = mySc.nextDouble();
		employee001.increaseSalary(percentage);

		System.out.printf("Employee: %s%n", employee001);

	}

}
