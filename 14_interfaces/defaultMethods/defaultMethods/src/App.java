import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        Double amount = sc.nextDouble();

        System.out.print("months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);

        double payment = is.payment(amount, months);

        System.out.print("Payment after " + months + " months: ");
        System.out.print(String.format(" %.2f", payment));

    }
}
