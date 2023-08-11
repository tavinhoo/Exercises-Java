import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner mySc = new Scanner(System.in);

        // EXERCICIO 01

        // int n1, n2, resultado;
        // System.out.println("Digite o primeiro numero: ");
        // n1 = mySc.nextInt();
        // System.out.println("Digite o segundo numero: ");
        // n2 = mySc.nextInt();
        // resultado = n1 + n2;
        // System.out.printf("SOMA = %d", resultado);

        // EXERCICIO 02

        // double PI = Math.PI;
        // double raioCirculo, areaCirculo;

        // System.out.println("Digite o raio da circunferência: ");
        // raioCirculo = mySc.nextDouble();
        // areaCirculo = PI * Math.pow(raioCirculo, 2.0);
        // System.out.printf("A = %.4f", areaCirculo);

        // EXERCICIO 03

        // int A, B, C, D, resultado;
        // A = mySc.nextInt();
        // B = mySc.nextInt();
        // C = mySc.nextInt();
        // D = mySc.nextInt();
        // resultado = A * B - C * D;
        // System.out.printf("DIFERENCA = %d", resultado);

        // EXERCICIO 04

        // int numeroFuncionario, horasTrabalhadas;
        // double salarioHora, salarioFinal;

        // System.out.println("Digite o numero de identificação: ");
        // numeroFuncionario = mySc.nextInt();
        // System.out.println("Digite o numero de horas trabalhadas: ");
        // horasTrabalhadas = mySc.nextInt();
        // System.out.println("Valor da hora trabalhada: ");
        // salarioHora = mySc.nextDouble();

        // salarioFinal = horasTrabalhadas * salarioHora;

        // System.out.printf("NUMBER = %d%nSALARY = U$ 1%.2f", numeroFuncionario,
        // salarioFinal);

        // EXERCICIO 05

        // int codigo, codigo2, numero_pecas, numero_pecas2;
        // double valorUnitario, valorUnitario2, valorFinal;

        // System.out.println("Digite: [ Código, Quantidade, Valor ]");
        // codigo = mySc.nextInt();
        // numero_pecas = mySc.nextInt();
        // valorUnitario = mySc.nextDouble();

        // codigo2 = mySc.nextInt();
        // numero_pecas2 = mySc.nextInt();
        // valorUnitario2 = mySc.nextDouble();

        // valorFinal = numero_pecas * valorUnitario + numero_pecas2 * valorUnitario2;
        // System.out.printf("VALOR A PAGAR: R$ %.2f", valorFinal);

        // EXERCÍCIO 06

        double A, B, C, areaTriangulo,
                areaCircunferencia, areaTrapezio,
                areaQuadrado, areaRetangulo;

        System.out.println("Digite em sequência A, B e C");
        A = mySc.nextDouble();
        B = mySc.nextDouble();
        C = mySc.nextDouble();

        areaTriangulo = (A * C) / 2;
        areaCircunferencia = Math.PI * Math.pow(C, 2.0);
        areaTrapezio = (A + B) / 2 * C;
        areaQuadrado = Math.pow(B, 2.0);
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f %nCIRCULO: %.3f %nTRAPEZIO: %.3f %nQUADRADO: %.3f %nRETANGULO: %.3f",
                areaTriangulo, areaCircunferencia, areaTrapezio, areaQuadrado, areaRetangulo);
        mySc.close();

    }
}
