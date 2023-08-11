package entities;

/* PROPOSTA DE MELHORIA (AULA 78) ENCAPSULAMENTO - MÉTODOS GET E SET */
public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

//	public Product() {
//
//	}
//
//	public Product(String name, double price) {
//		this.name = name;
//		this.price = price;
//		// quantity = 0; JAVA JÁ INICIA COM 0; O THIS TAMBÉM É OPCIONAL, POIS NÃO TEM
//		// PARÂMETRO
//	}
//
//	public Product(String name, double price, int quantity) {
//		this.name = name;
//		this.price = price;
//		this.quantity = quantity;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return quantity * price;
	}

	public void addProducts(int quantityToAdd) {
		this.quantity += quantityToAdd;
	}

	public void removeProducts(int quantityToRemove) {
		this.quantity -= quantityToRemove;
	}

	public String toString() {
		return this.name + ", $ " + String.format("%.2f, ", this.price) + this.quantity + " units, Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
	}
}
