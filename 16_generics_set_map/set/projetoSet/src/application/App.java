package application;

import entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        // PRIMEIRA AULA

        // Set<String> set = new HashSet<>();
        // Set<String> set = new TreeSet<>();
        // Set<String> set = new LinkedHashSet<>();

        // set.add("TV");
        // set.add("Tablet");
        // set.add("Notebook");

        // // set.remove("Tablet");
        // // set.removeIf(x -> x.length() >= 3);
        // // System.out.println(set.contains(new String("Notebook")));

        // for (String p : set) {
        // System.out.println(p);
        // }

        // SEGUNDA AULA

        // Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        // Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // // union
        // Set<Integer> c = new TreeSet<>(a);
        // c.addAll(b);
        // System.out.println(c);

        // // intersection
        // Set<Integer> d = new TreeSet<>(a);
        // d.retainAll(b);
        // System.out.println(d);

        // // difference
        // Set<Integer> e = new TreeSet<>(a);
        // e.removeAll(b);
        // System.out.println(e);

        // AULA 244

//        Set<entities.Product> set = new HashSet<>();
//
//        set.add(new entities.Product("TV", 900.0));
//        set.add(new entities.Product("Notebook", 1200.0));
//        set.add(new entities.Product("Tablet", 400.0));
//
//        entities.Product prod = new entities.Product("Notebook", 1200.0);
//
//        System.out.println(set.contains(prod));

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        for(Product p : set) {
            System.out.println(p.toString());
        }
    }
}
