import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        // List<Product> list = new ArrayList<>();
        // list.add(new Product("Smart Tv Samsung 40'", 2300.00));
        // list.add(new Product("Iphone 14 Pro Max", 5000.00));
        // list.add(new Product("Notebook Gamer G15 Dell", 4500.00));
        // list.add(new Product("Mouse Dell", 45.00));
        // list.add(new Product("Adaptador Bluetooth TP-Link", 50.00));
        // list.add(new Product("Teclado Multilaser", 100.00));
        // list.add(new Product("Teclado RedDragon", 340.00));
        // list.add(new Product("Headset Corsair", 1200.00));
        // list.add(new Product("Fone QCY", 56.00));
        // list.add(new Product("Memoria XPG 2X8 3200MHZ", 576.00));
        // list.add(new Product("Monitor AOC", 765.00));
        // list.add(new Product("JBL FLIP 3", 234.00));

        // list.sort(new MyComparator());

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

        // list.forEach(new PriceUpdate());

        // 2 - Reference method com método estático
        // list.forEach(Product::staticProductUpdate);

        // 3 - Reference method com método não estático
        // list.forEach(Product::nonStaticProductUpdate);

        // 4 - Expressão lambda declarada

        // Consumer<Product> consumer = p -> {
        // p.setPrice(p.getPrice() * 1.10)
        // };

        // list.forEach(consumer);

        // 5 - Expressão lambda inline
        // list.forEach(p -> p.setPrice(p.getPrice() * 1.10));

        // list.forEach(System.out::println);

        /* ---------------------------------- */

        // Function (Exemplo com map)

        // 1 - Implementação da interface
        // List<String> names = list.stream().map(new
        // UpperCaseName()).collect(Collectors.toList());

        // 2 -Método estático
        // List<String> names =
        // list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // 3 -Método não estático
        // List<String> names =
        // list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        // 4 - Expressão lambda declarada

        // Function<Product, String> func = (p) -> p.getName().toUpperCase();
        // List<String> names = list.stream().map(func).collect(Collectors.toList());

        // 5 - Expressão lambda inline
        // List<String> names = list.stream().map((p) ->
        // p.getName().toUpperCase()).collect(Collectors.toList());

        // names.forEach(System.out::println);

        // ProductService ps = new ProductService();

        // double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        // System.out.println("Sum = " + String.format("%.2f", sum));

        /* ---------------------------------- */

        // Stream

        // List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // Stream<Integer> st1 = list.stream().map(x -> x * 10);
        // System.out.println(Arrays.toString(st1.toArray()));

        // Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        // System.out.println(Arrays.toString(st2.toArray()));

        // Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        // System.out.println(Arrays.toString(st3.limit(10).toArray()));

        // Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] {
        // p[1], p[0] + p[1] }).map(p -> p[0]);
        // System.out.println(Arrays.toString(st4.limit(10).toArray()));

        /* ---------------------------------- *//* ---------------------------------- */

        // Pipeline

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map((x) -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        // int sum = list.stream().map(x -> x * 10).reduce(0, (x, y) -> x + y);
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum: " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
