package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sSc = new Scanner(System.in);

        List<Employee> dbEmployees = new ArrayList<>();

        int menuOption = 1;
        try {
            do {
                System.out.printf(
                        " ................................................................ %n ------------- [1] - Add employee  %n ------------- [2] - Remove employee  %n ------------- [3] - Carry out salary increment  %n ------------- [4] - Carry out salary reduction  %n ------------- [5] - View employee information %n ------------- [6] - Exit %n ................................................................ %n");
                System.out.print("-> Selected option: ");
                menuOption = sSc.nextInt();

                switch (menuOption) {
                    case 1:
                        System.out.print("How many employees will be added? ");
                        int amountToBeAdded = sSc.nextInt();
                        sSc.nextLine();

                        for (int i = 1; i <= amountToBeAdded; i++) {
                            System.out.println("...........................");
                            System.out.printf(" -> '%d' employee added...%n", i - 1);
                            System.out.println("...........................");
                            System.out.print(" -> ID: ");
                            int id = sSc.nextInt();
                            sSc.nextLine();

                            boolean exists = dbEmployees.stream().anyMatch(employee -> employee.getId().equals(id));

                            if (!exists) {
                                System.out.print(" -> NAME: ");
                                String name = sSc.nextLine();
                                System.out.print(" -> SALARY: ");
                                Double salary = sSc.nextDouble();

                                dbEmployees.add(new Employee(id, name, salary));

                            } else {
                                System.out.println("this id is already being used...");
                            }

                        }
                        break;
                    case 2:
                        if (!(dbEmployees.isEmpty())) {
                            System.out.print("Enter the id of the employee to be removed: ");
                            int id = sSc.nextInt();
                            sSc.nextLine();

                            dbEmployees.removeIf(employee -> employee.getId() == id);
                        } else {
                            System.out.println("is empty...");
                        }
                        break;

                    case 3:
                        System.out.print("Enter the employee id that will have salary increase: ");
                        int id_1 = sSc.nextInt();
                        for (Employee employeeOfList : dbEmployees) {
                            if (employeeOfList.getId() == id_1) {
                                System.out.println("Enter the percentage: ");
                                double percentage = sSc.nextDouble();

                                employeeOfList.increaseSalary(percentage);
                            }
                        }
                        break;

                    case 5:
                        System.out.print("Enter employee id to display information: ");
                        int id_2 = sSc.nextInt();
                        sSc.nextLine();
                        if (!(dbEmployees.size() == 0))
                            for (Employee employeeSelected : dbEmployees) {
                                if (employeeSelected.getId() == id_2) {
                                    System.out.println("*****-------------------------------------*****");
                                    System.out.println(employeeSelected.toString());
                                    System.out.println("*****-------------------------------------*****");
                                }
                            }

                    default:
                        break;
                }
            } while (!(menuOption == 6));
        } catch (Exception e) {
            System.out.println("something went wrong, try again...");
        }
    }
}
