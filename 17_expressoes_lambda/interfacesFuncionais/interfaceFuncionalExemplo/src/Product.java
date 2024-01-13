public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100.00;
    }

    public boolean nonStaticProductPredicate() {
        return price >= 100.00;
    }

    public static void staticIncrease(Product p) {
        p.setPrice(p.getPrice() * 1.10);
    }

    public void nonStaticIncrease() {
        price += price * 0.1;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", price='" + String.format("%.2f", getPrice()) + "'" +
                "}";
    }

}
