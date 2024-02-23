package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	private Double height;
	private Double width;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double height, Double width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return height * width;
	}
}
