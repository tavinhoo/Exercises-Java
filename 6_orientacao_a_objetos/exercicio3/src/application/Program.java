package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

		Student student01 = new Student();

		student01.name = mySc.nextLine();
		student01.firstNote = mySc.nextDouble();
		student01.secondNote = mySc.nextDouble();
		student01.thirdNote = mySc.nextDouble();

		System.out.println(student01);
	}

}
