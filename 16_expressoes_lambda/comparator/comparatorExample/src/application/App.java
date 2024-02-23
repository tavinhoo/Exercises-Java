package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // 1ª Forma de se fazer, passando como argumento
        // list.sort(new MyComparator());

        // 2ª Forma de se fazer
        // Comparator<Product> comp = new Comparator<Product>() {
        // @Override
        // public int compare(Product o1, Product o2) {
        // return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
        // }
        // };

        // 3ª Forma de se fazer Lambda - Função anonima
        // Comparator<Product> comp = (o1, o2) -> {
        // return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
        // };

        Comparator<Product> comp = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());

        list.sort((o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p.getName() + " : " + p.getPrice());
        }
    }
}
