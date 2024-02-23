package problema1.entities;

public class Rectangle implements Shape {

    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        if (width <= 0 || height <= 0) {
            throw new IllegalStateException("UNEXPECTED ERROR.");
        }

        return width * height;
    }

}
