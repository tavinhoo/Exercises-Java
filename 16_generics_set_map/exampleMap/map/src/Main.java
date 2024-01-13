import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


//        Map<String, String> cookies = new TreeMap<>();
////
////        cookies.put("userName", "Maria");
////        cookies.put("email", "maria@gmail.com");
////        cookies.put("phone", "99711122");
////
////        cookies.remove("email");
////        cookies.put("phone", "998113377"); // sobrescreve o phone ja colocado acima
////
////        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); //true
////
////        System.out.println("PHONE NUMBER: " + cookies.get("phone"));
////        System.out.println("Email: " + cookies.get("email"));
////        System.out.println("Size: " + cookies.size());
////
////        System.out.println("ALL COOKIES: ");
////        for(String key : cookies.keySet()) {
////            System.out.println(key + ": " + cookies.get(key));
////        }


        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);

        Product p2 = new Product("Notebook", 1200.0);

        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

        for(Product p : stock.keySet()) {
            System.out.println(p.getName() + " : " + p.getPrice() );
        }

        System.out.println(stock.values());
    }
}