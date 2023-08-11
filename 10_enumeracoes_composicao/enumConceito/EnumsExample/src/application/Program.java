package application;

import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order1 = new Order(90, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);

		System.out.print("Status do pedido: ");
		System.out.println(order1.toString());

		Order order2 = new Order(12, OrderStatus.PENDING_PAYMENT);
		System.out.println(order2.toString());

		OrderStatus os1 = OrderStatus.valueOf("PENDING_PAYMENT");
		System.out.println(os1);

		OrderStatus os2 = OrderStatus.DELIVERED;
		System.out.println(os2);

	}
}
