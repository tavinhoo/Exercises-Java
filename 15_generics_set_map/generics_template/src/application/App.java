package application;

import services.ServicePrint;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ServicePrint<Integer> ps = new ServicePrint<>();

        System.out.println("How many values? ");
        int nValues = sc.nextInt();

        for (int i = 0; i < nValues; i++) {
            ps.addValue(sc.nextInt());
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();

    }
}
