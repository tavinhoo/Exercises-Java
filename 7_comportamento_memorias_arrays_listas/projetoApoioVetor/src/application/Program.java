package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

//		System.out.println("Insira a quantidade de alturas a ser digitadas: ");
//		int n = mySc.nextInt();
//
//		double[] vectHeights = new double[n];
//
//		for (int i = 0; i < n; i++) {
//			System.out.print("Insira uma altura: ");
//			vectHeights[i] = mySc.nextDouble();
//		}
//
//		double averageHeight = 0;
//		for (int i = 0; i < vectHeights.length; i++) {
//			averageHeight += vectHeights[i];
//		}
//
//		averageHeight /= vectHeights.length;
//		System.out.printf("AVERAGE HEIGHT: %.2f", averageHeight);

		System.out.println("Insira a quantidade de produtos a ser inseridos: ");
		int n = mySc.nextInt();

		Product[] productsVect = new Product[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Name of the product: ");
			mySc.next();
			String productName = mySc.nextLine();
			System.out.println("Price of the product: ");
			double productPrice = mySc.nextDouble();
			productsVect[i] = new Product(productName, productPrice);
		}

		double averagePrice = 0;
		for (int i = 0; i < productsVect.length; i++) {
			averagePrice += productsVect[i].getPrice();
		}

		averagePrice /= productsVect.length;
		System.out.printf("AVERAGE PRICE: %.2f", averagePrice);

		mySc.close();
	}
}
