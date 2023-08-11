package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime moment = LocalDateTime.now();
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> listOfOrders = new ArrayList<>();
	
	public Order() {
		
	}
	
	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getListOfOrders() {
		return listOfOrders;
	}
	
	public void addItem(OrderItem orderItem) {
		listOfOrders.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		listOfOrders.remove(orderItem);
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrderItem orderItemInfo : listOfOrders) {
			total += orderItemInfo.subTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-----------------------------\n");
		sb.append("Order moment: ");
		sb.append(dtf.format(moment) + "\n");
		sb.append("-----------------------------\n");
		sb.append("Order status: ");
		sb.append(this.status + "\n");
		sb.append("Client: ");
		sb.append(client.getName() + "\n");
		sb.append("-----------------------------\n");
		sb.append("Order items:\n");
		for (OrderItem item : listOfOrders) {
			sb.append(item.getProduct().getName());
			sb.append(", R$" + item.getPrice() + ", Quantity: " + item.getQuantity() + ", Subtotal: R$" + item.subTotal() + "\n");
		}
		sb.append("-----------------------------\n");
		sb.append("Total price: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}