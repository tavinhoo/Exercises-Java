import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        List<Product> listOfProducts = new ArrayList<>();

        File sourceFile = new File("D:\\LUIZO\\Documents\\arquivo.csv");

        String parentFolder = sourceFile.getParent();

        boolean success = new File(parentFolder + "\\out").mkdir();

        String targetFileStr = parentFolder + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String line = br.readLine();
            while (line != null) {
                String[] lineWithResources = line.split(",");
                String nameProduct = lineWithResources[0];
                Double productPrice = Double.parseDouble(lineWithResources[1]);
                Integer productQuantity = Integer.parseInt(lineWithResources[2]);

                Product product = new Product(nameProduct, productPrice, productQuantity);
                listOfProducts.add(product);

                System.out.println(product.toString());
                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Product product : listOfProducts) {
                    bw.write(product.getName() + ", " + String.format("%.2f", product.totalValue()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");

            } catch (IOException e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

    }
}
