package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double dollarConverter(double amount, double dollarPrice) {
		return amount * dollarPrice * (1 + IOF);
	}
}
