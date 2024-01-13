import java.util.function.Predicate;

public class ProductPredicated implements Predicate<Product> {

    @Override
    public boolean test(Product t) {
        return t.getPrice() >= 100.00;
    }

}
