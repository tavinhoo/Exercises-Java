import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        // DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        // Scanner sc = new Scanner(System.in);

        // System.out.printf("Enter contract data:");
        // System.out.print("Date (DD/MM/YYY): ");
        // String date = sc.next();

        // LocalDate dateFormatted = LocalDate.parse(date,
        // DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        // System.out.println(dateFormatted);

        if (true && (!true || (!true)) && !false) {
            System.out.println("Entrou aqui 1");
        }

        if (!!!true || (!false && !!true && 6 % 2 == 0)) {
            System.out.println("Entrou aqui 2");
        }

        if (!!!true || (!false && !true && !!true && 6 % 2 != 0)) {
            System.out.println("entrou aqui 3");
        }

        if (false || !(true && (!false || true))) {
            System.out.println("entrou aqui 4");
        }

    }
}
