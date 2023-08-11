package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.enums.OrderStatus;

public class Order {

	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	private Integer id;
	private LocalDateTime moment;
	private OrderStatus order;

	public Order() {

	}

	public Order(Integer id, OrderStatus order) {
		this.id = id;
		this.moment = LocalDateTime.now();
		this.order = order;
	}

	public Order(Integer id, LocalDateTime moment, OrderStatus order) {
		this.id = id;
		this.moment = moment;
		this.order = order;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment= " + fmt.format(moment) + ", order=" + order + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getOrder() {
		return order;
	}

	public void setOrder(OrderStatus order) {
		this.order = order;
	}

}
