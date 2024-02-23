package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Menu {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);
		BankAccount bankAccount;

		System.out.print("Enter account number: ");
		int accountNumber = mySc.nextInt();
		mySc.nextLine();

		System.out.println("Enter account holder: ");
		String accountHolder = mySc.nextLine();

		System.out.println("Is there an initial deposit? [y/n]");
		char makeInitialDep = mySc.next().charAt(0);

		if (makeInitialDep == 'y') {
			System.out.print("Enter intial value: ");
			double valueToDeposit = mySc.nextDouble();
			bankAccount = new BankAccount(accountNumber, accountHolder, valueToDeposit);
		} else {
			bankAccount = new BankAccount(accountNumber, accountHolder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println("Account " + bankAccount.getAccountNumber() + ", Holder: " + bankAccount.getAccountHolder()
				+ ", Balance: $ " + bankAccount.getCurrentBalance());

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = mySc.nextDouble();
		bankAccount.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println("Account " + bankAccount.getAccountNumber() + ", Holder: " + bankAccount.getAccountHolder()
				+ ", Balance: $ " + bankAccount.getCurrentBalance());

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withDrawValue = mySc.nextDouble();
		bankAccount.withDraw(withDrawValue);
		System.out.println("Updated account data: ");
		System.out.println("Account " + bankAccount.getAccountNumber() + ", Holder: " + bankAccount.getAccountHolder()
				+ ", Balance: $ " + bankAccount.getCurrentBalance());

	}
}
