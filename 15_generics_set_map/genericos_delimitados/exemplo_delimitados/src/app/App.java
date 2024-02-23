package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.CalculationService;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> listOfProducts = new ArrayList<>();

        File fileSrc = new File(
                "D:\\LUIZO\\Downloads\\Java - exercicios\\16_generics_set_map\\genericos_delimitados\\exemplo_delimitados\\src\\resource\\lista.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(fileSrc))) {

            String line = br.readLine();
            while (line != null) {
                String[] productString = line.split(",");
                listOfProducts.add(new Product(productString[0], Double.parseDouble(productString[1])));
                line = br.readLine();
            }

            // for (Product product : listOfProducts) {
            // System.out.println(product);
            // }

            Product mostExpensiveProduct = CalculationService.max(listOfProducts);
            System.out.println("MAX: ");
            System.out.println(mostExpensiveProduct);

        } catch (InputMismatchException e) {
            System.out.println("UNEXPECTED ERROR: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("UNEXPECTED ERROR: " + e.getMessage());
        }
    }
}
