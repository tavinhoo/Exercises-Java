package problema1.entities;

public class Circle implements Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        if (radius <= 0) {
            throw new IllegalStateException("UNEXPECTED RADIUS");
        }
        return Math.PI * Math.pow(radius, 2.0);
    }

}
