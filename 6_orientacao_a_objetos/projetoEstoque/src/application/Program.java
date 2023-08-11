package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

		Product product1 = new Product();

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		product1.name = mySc.nextLine();
		System.out.print("Price: ");
		product1.price = mySc.nextDouble();
		System.out.print("Quantity in stock: ");
		product1.quantity = mySc.nextInt();

		System.out.printf("Product data: %s%n", product1);

		System.out.print("Enter the number of products to be added in stock: ");
		int quantityToAdd = mySc.nextInt();
		product1.addProducts(quantityToAdd);

		System.out.printf("Updated data: %s%n", product1);

		System.out.printf("Enter the number of products to be removed from stock: ");
		int quantityToRemove = mySc.nextInt();
		product1.removeProducts(quantityToRemove);

		System.out.printf("Updated data: %s%n", product1);

		mySc.close();

	}

}
