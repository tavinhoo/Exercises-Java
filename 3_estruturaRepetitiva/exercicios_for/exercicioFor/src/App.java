import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner mySc = new Scanner(System.in);

        // exercício 01

        // int valorInteiro = mySc.nextInt();

        // for (int i = 0; i <= valorInteiro; i++) {
        // if (!(i % 2 == 0)) {
        // System.out.println(i);
        // }
        // }

        // exercício 02

        // int n = mySc.nextInt();
        // int in = 0;
        // int out = 0;
        // int numero;

        // for (int i = 0; i < n; i++) {
        // numero = mySc.nextInt();
        // if (numero >= 10 && numero <= 20) {
        // in++;
        // } else {
        // out++;
        // }
        // }
        // System.out.printf("%d in %n%d out", in, out);

        // exercício 03

        // int nVezes = mySc.nextInt();
        // for (int i = 0; i < nVezes; i++) {

        // double valor1, valor2, valor3, mediaPonderada;
        // valor1 = mySc.nextDouble();
        // valor2 = mySc.nextDouble();
        // valor3 = mySc.nextDouble();

        // mediaPonderada = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10;
        // System.out.printf("%.1f", mediaPonderada);
        // }

        // exercicio 04

        // int nVezes = mySc.nextInt();

        // for (int i = 1; i <= nVezes; i++) {

        // double n1, n2, resultado;

        // n1 = mySc.nextDouble();
        // n2 = mySc.nextDouble();

        // if (n2 == 0) {
        // System.out.println("Divisão impossível");
        // } else {
        // resultado = n1 / n2;
        // System.out.printf("%.1f%n", resultado);
        // }
        // }

        // exercicio 05

        // Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
        // N * (N-1) * (N-2) * (N-3) * ... * 1.
        // Lembrando que, por definição, fatorial de 0 é 1.

        // int n = mySc.nextInt();
        // int fatorialN = n;

        // for (int i = 1; i != n; i++) {
        // if (n == 0) {
        // fatorialN = 1;
        // break;
        // } else {
        // fatorialN *= n - i;
        // }
        // }

        // System.out.println(fatorialN);

        // exercicio 06

        // int n = mySc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // System.out.println(i);
        // }
        // }

        // exercicio 06

        int n = mySc.nextInt();
        for (int i = 1; i <= n; i++) {
            int n1, n2, n3;
            n1 = i;
            n2 = i * i;
            n3 = i * i * i;
            System.out.printf("%d %d %d%n", n1, n2, n3);
        }
    }
}
