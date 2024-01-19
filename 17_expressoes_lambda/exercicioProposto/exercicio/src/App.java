import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        File filesrc = new File("src\\dbExample\\in.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(filesrc))) {

            List<Employee> list = new ArrayList<>();

            System.out.print("Enter salary: ");
            Double salaryInput = sc.nextDouble();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.printf("Email of people whose salary is more than %.2f:%n", salaryInput);
            List<String> higherSalaryNames = list.stream().filter(emp -> emp.getSalary() > salaryInput)
                    .map(emp -> emp.getEmail()).sorted().collect(Collectors.toList());

            higherSalaryNames.forEach(System.out::println);

            Double sum = list.stream().filter(emp -> emp.getName().charAt(0) == 'M').map(emp -> emp.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
