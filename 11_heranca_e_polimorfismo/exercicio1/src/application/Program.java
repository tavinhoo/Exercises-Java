package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enther the number of products: ");
		int numberOfProducts = sc.nextInt();
		sc.nextLine();
		
		List<Product> listOfProducts = new ArrayList<>();
		
		for(int i = 0; i<numberOfProducts; i++) {
			System.out.printf("Product #%d data: %n", i + 1);
			System.out.print("Commom, used or imported (c/u/i)? ");
			char typeOfProduct = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String nameOfProduct = sc.nextLine();
			System.out.printf("Price: ");
			double priceOfProduct = sc.nextDouble();
			sc.nextLine();
		
			switch (typeOfProduct) {
				case 'c': {
					Product product = new Product(nameOfProduct, priceOfProduct);
					listOfProducts.add(product);
					break;
				}
				
				case 'u': {
					System.out.print("Manufature Date (DD/MM/YYYY): ");
					String dateNoConvert = sc.nextLine();
					LocalDate dateConvert = LocalDate.parse(dateNoConvert, DateTimeFormatter.ofPattern("dd/MM/yyyy"));;
					Product product = new UsedProduct(nameOfProduct, priceOfProduct, dateConvert);
					listOfProducts.add(product);
					break;
				}
				
				case 'i': {
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					Product product = new ImportedProduct(nameOfProduct, priceOfProduct, customsFee);
					listOfProducts.add(product);
					break;
				}
				
				default:
					break;
				}
			}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product p : listOfProducts) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
