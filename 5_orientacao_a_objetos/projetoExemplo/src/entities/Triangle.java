package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	public double area() {
		double semiP = (a + b + c) / 2.0;
		return Math.sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c));
	}
}
