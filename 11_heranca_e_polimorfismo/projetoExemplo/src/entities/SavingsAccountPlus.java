package entities;

public class SavingsAccountPlus extends SavingsAccount {

	@Override
	public void withdraw(double amount) {
		balance -= 2.0;
	}
}
