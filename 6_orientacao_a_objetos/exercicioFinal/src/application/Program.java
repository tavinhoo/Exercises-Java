package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollarPrice = mySc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double amount = mySc.nextDouble();

		System.out.printf("Amount to be paid in reais =  R$ %.2f",
				CurrencyConverter.dollarConverter(amount, dollarPrice));

	}

}
