package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String bDate = sc.nextLine();
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String orderSelected = sc.nextLine();
		
		Order order1 = new Order(OrderStatus.valueOf(orderSelected), new Client(name, email, LocalDate.parse(bDate, dtf)));
		
		System.out.print("How many items to this order? ");
		int quantityItems = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<quantityItems; i++) {
			System.out.printf("Enter #%d item data: %n", i + 1);
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			Product productTemp = new Product(productName, productPrice);
			OrderItem orderItemTemp = new OrderItem(quantity, productPrice, productTemp);
			
			order1.addItem(orderItemTemp);
		}
		
//		for(OrderItem odrItm : order1.getListOfOrders()) {
//			System.out.println(odrItm.getProduct().getName());
//		}

		System.out.println("ORDER SUMARY: ");
		System.out.println(order1.toString());
		sc.close();
	}
}
