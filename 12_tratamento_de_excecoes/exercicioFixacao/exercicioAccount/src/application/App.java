package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holderName = sc.nextLine();
            System.out.print("initial Balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();
            Account account = new Account(number, holderName, initialBalance, withdrawLimit);

            sc.nextLine();

            System.out.print("Enter the amount for withdraw: ");
            double amountForWithdraw = sc.nextDouble();
            account.withdraw(amountForWithdraw);
            System.out.printf("New Balance: %.2f", account.getBalance());

        } catch (DomainException e) {
            System.out.println("Withdraw error:" + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

    }
}
