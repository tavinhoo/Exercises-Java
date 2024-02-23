import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        List<Employee> listOfEmployees = new ArrayList<>();
        File fileWithNames = new File(
                "D:\\LUIZO\\Downloads\\Java - exercicios\\15_interfaces\\apoio\\funcionarios.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(fileWithNames));) {

            String line = br.readLine();
            while (line != null) {

                String[] vectWLines = line.split(",");
                String name = vectWLines[0];
                Double salary = Double.parseDouble(vectWLines[1]);
                listOfEmployees.add(new Employee(name, salary));
                line = br.readLine();
            }
            // listOfEmployees.sort();
            Collections.sort(listOfEmployees);
            for (Employee emp : listOfEmployees) {
                System.out.println(emp.getName() + " -> " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("UNEXPECTED ERROR: " + e.getMessage());
        }
    }
}