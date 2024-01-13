import java.util.function.Consumer;

public class MyConsumer implements Consumer<Product> {

    @Override
    public void accept(Product t) {
        t.setPrice(t.getPrice() * 1.10);
    }
}
