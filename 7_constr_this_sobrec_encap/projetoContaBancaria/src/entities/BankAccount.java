package entities;

public class BankAccount {

	private int accountNumber;
	private String accountHolder;
	private double currentBalance;

	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public BankAccount(int accountNumber, String accountHolder, double depositValue) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(depositValue);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void deposit(double value) {
		currentBalance += value;
	}

	public void withDraw(double value) {
		this.currentBalance -= value + 5.00;
	}

//	public String toString() {
//		return "Account " + this.getAccountNumber() + ", Holder: " + this.getAccountHolder() + ", Balance: $ "
//				+ this.getCurrentBalance();
//	}

}
