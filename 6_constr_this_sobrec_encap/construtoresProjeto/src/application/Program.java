package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

//		System.out.println(product1.name); retorna null
//		System.out.println(product1.price); retorna 0.0
//		System.out.println(product1.quantity); retorna 0

		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		String name = mySc.nextLine();
		System.out.print("Price: ");
		double price = mySc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = mySc.nextInt(); -- APAGADO PARA PROPOSTA DE MELHORIA (AULA 77)

		mySc.nextLine();
		Product product1 = new Product(name, price);

		System.out.println("Insira um novo nome para o produto: ");
		String newName = mySc.nextLine();
		product1.setName(newName);

		System.out.println("O nome do produto foi atualizado: " + product1.getName());

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
