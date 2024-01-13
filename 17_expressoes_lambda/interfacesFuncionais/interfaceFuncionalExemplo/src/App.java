import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Smart Tv Samsung 40'", 2300.00));
        list.add(new Product("Iphone 14 Pro Max", 5000.00));
        list.add(new Product("Notebook Gamer G15 Dell", 4500.00));
        list.add(new Product("Mouse Dell", 45.00));
        list.add(new Product("Adaptador Bluetooth TP-Link", 50.00));
        list.add(new Product("Teclado Multilaser", 100.00));
        list.add(new Product("Teclado RedDragon", 340.00));
        list.add(new Product("Headset Corsair", 1200.00));
        list.add(new Product("Fone QCY", 56.00));
        list.add(new Product("Memoria XPG 2X8 3200MHZ", 576.00));
        list.add(new Product("Monitor AOC", 765.00));
        list.add(new Product("JBL FLIP 3", 234.00));

        list.sort(new MyComparator());

        // Interface Funcional Predicated:

        /*
         * Fazer um programa que, a partir de uma lista de produtos, remova da
         * lista somente aqueles cujo preço mínimo seja 100.
         */

        // Predicado -> Lambda
        // list.removeIf(x -> x.getPrice() >= 100.00);

        // Primeira forma -> Implementação da interface
        // list.removeIf(new ProductPredicated());

        // Segunda forma -> Método estático criado em Product (Method Reference)
        // list.removeIf(Product::staticProductPredicate);

        // Terceira forma -> Reference Method com método não estático
        // list.removeIf(Product::nonStaticProductPredicate);

        // Quarta forma -> Expressão lambda declarada

        // Predicate<Product> pred = ((p) -> p.getPrice() >= 100.0);

        // list.removeIf(pred);

        // Quinta forma -> Expressão lambda declarada

        // list.removeIf((p) -> p.getPrice() >= 100.0);

        // for (Product product : list) {
        // System.out.println(product);
        // }

        /* ---------------------------------- */

        // Interface Funcional Consumer:

        // 1 - Implementação da interface

        // list.forEach(new MyConsumer());

        // 2 - Reference method com método estático
        // list.forEach(Product::staticIncrease);

        // 3 - Reference method com método não estático
        // list.forEach(Product::nonStaticIncrease);

        // 4 - Expressão lambda declarada
        // Consumer<Product> consumer = (p) -> p.setPrice(p.getPrice() * 1.10);
        // list.forEach(consumer);

        // 5 - Expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.10));

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
