package entities;

import java.time.LocalDate;

public final class UsedProduct extends Product {

	private LocalDate manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("- " + this.getName());
		sb.append("(Used) $ " + this.getPrice());
		sb.append("(Manufacture date: " + this.getManufactureDate() + ")");
		return sb.toString();
	}
}
