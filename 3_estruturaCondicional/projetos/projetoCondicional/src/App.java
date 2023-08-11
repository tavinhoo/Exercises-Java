import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner mySc = new Scanner(System.in);
        // int numero;
        // boolean par;
        // System.out.println("Digite um numero qualquer: ");
        // numero = mySc.nextInt();
        // par = numero % 2 == 0 ? true : false;
        // if (!par) {
        // System.out.println("É impar");
        // } else {
        // System.out.println("É par");
        // }

        // int hora;
        // System.out.println("Quantas horas? ");
        // hora = mySc.nextInt();

        // if (hora < 12)
        // System.out.println("Bom dia!!");
        // else if (hora >= 12 && hora < 18)
        // System.out.println("Boa tarde!!");
        // else
        // System.out.println("Boa noite!!");

        // EXERCÍCIOS

        // EXERCÍCIO 01
        // int numeroQualquer;
        // System.out.println("Digite um inteiro qualquer: ");
        // numeroQualquer = mySc.nextInt();

        // if (numeroQualquer == 0) {
        // System.out.println("Insira um numero maior que 0: ");
        // numeroQualquer = mySc.nextInt();
        // }

        // if (!(numeroQualquer > 0)) {
        // System.out.println("NEGATIVO");
        // } else {
        // System.out.println("POSITIVO");
        // }

        // // EXERCÍCIO 02

        // int numeroInteiro;
        // System.out.println("Digite um numero inteiro qualquer: ");
        // numeroInteiro = mySc.nextInt();

        // // if (numeroInteiro == 0) {
        // // System.out.println("Insira um numero maior ou menor que 0: ");
        // // numeroQualquer = mySc.nextInt();
        // // }

        // if (!(numeroInteiro % 2 != 0)) {
        // System.out.println("PAR");
        // } else {
        // System.out.println("ÍMPAR");
        // }

        // // EXERCÍCIO 03

        // int valor1, valor2;
        // System.out.println("Digite dois valores A, B: ");
        // valor1 = mySc.nextInt();
        // valor2 = mySc.nextInt();

        // if (!(valor2 % valor1 == 0)) {
        // System.out.println("Não são multiplos!");
        // } else {
        // System.out.println("São multiplos!!");
        // }

        // // EXERCÍCIO 04

        // int horaInicial, horaFinal;
        // System.out.println("Digite a hora de inicio: ");
        // horaInicial = mySc.nextInt();
        // System.out.println("Digite a hora final: ");
        // horaFinal = mySc.nextInt();

        // if (horaFinal > horaInicial) {
        // System.out.printf("O JOGO DUROU %d HORA(S)", horaFinal - horaInicial);
        // } else if (horaInicial > horaFinal) {
        // System.out.printf("O JOGO DUROU %d HORA(S)", horaFinal + 24 - horaInicial);
        // } else {
        // System.out.println("O JOGO DUROU 24 HORA(S)");
        // }

        // // EXERCÍCIO 05

        // int code, quantity;
        // System.out.println("Digite o código e a quantidade requerida: ");
        // code = mySc.nextInt();
        // quantity = mySc.nextInt();
        // if (code == 1)
        // System.out.printf("TOTAL: %.2f", 4.0 * quantity);
        // if (code == 2)
        // System.out.printf("TOTAL: %.2f", 4.5 * quantity);
        // if (code == 3)
        // System.out.printf("TOTAL: %.2f", 5.0 * quantity);
        // if (code == 4)
        // System.out.printf("TOTAL: %.2f", 2.0 * quantity);
        // if (code == 5)
        // System.out.printf("TOTAL: %.2f", 1.5 * quantity);

        // // EXERCÍCIO 06

        // double numero = mySc.nextDouble();

        // if (numero < 0.0 || numero > 100.0) {
        // System.out.println("Fora de intervalo");
        // } else if (numero <= 25.0) {
        // System.out.println("Intervalo [0,25]");
        // } else if (numero <= 50.0) {
        // System.out.println("Intervalo (25,50]");
        // } else if (numero <= 75.0) {
        // System.out.println("Intervalo (50,75]");
        // } else {
        // System.out.println("Intervalo (75,100]");
        // }

        // // EXERCÍCIO 07

        // double x, y;
        // System.out.println("Insira x e y");
        // x = mySc.nextDouble();
        // y = mySc.nextDouble();

        // if (x == 0 && y == 0) {
        // System.out.println("ORIGEM...");
        // } else if (x > 0 && y > 0) {
        // System.out.println("Q1");
        // } else if (x < 0 && y > 0) {
        // System.out.println("Q2");
        // } else if (x < 0 && y < 0) {
        // System.out.println("Q3");
        // } else if (x > 0 && y < 0) {
        // System.out.println("Q4");
        // }

        // // EXERCÍCIO 08

        // double salario, imposto;
        // System.out.println("Digite seu salário: ");
        // salario = mySc.nextDouble();
        // if (salario < 2000.0) {
        // System.out.println("ISENTO");
        // } else if (salario > 2000.00 && salario <= 3000.00) {
        // imposto = (salario - 2000) * 0.08;
        // System.out.printf("R$ %.2f", imposto);
        // } else if (salario > 3000.00 && salario < 4500.00) {
        // imposto = (1000.00) * 0.08 + (salario - 3000.00) * 0.18;
        // System.out.printf("R$ %.2f", imposto);
        // } else {
        // imposto = (1000.00) * 0.08 + (1500) * 0.18 + (salario - 4500.00) * 0.28;
        // System.out.printf("R$ %.2f", imposto);
        // }

        // System.out.println();
        // // OPERADOR DE ATRIBUIÇÃO COMULATIVA

        // System.out.println("Digite a quantidade de minutos utilizada: ");
        // int minutos = mySc.nextInt();
        // double conta = 50.0;

        // if (!(minutos < 100.0)) {
        // conta += (minutos - 100.00) * 2.00;
        // }

        // System.out.printf("Valor da conta = R$ %.2f%n", conta);

        // SINTAXE OPCIONAL SWITCH-CASE

        // escrever um programa em que cada numero de 1 a 7 represente um dia
        // da semana:

        System.out.println("Digite o numero de um dia da semana: ");
        int diaNumerico = mySc.nextInt();
        String diaString;
        switch (diaNumerico) {
            case 1:
                diaString = "Domingo";
                break;
            case 2:
                diaString = "Segunda";
                break;
            case 3:
                diaString = "Terça";
                break;
            case 4:
                diaString = "Quarta";
                break;
            case 5:
                diaString = "Quinta";
                break;
            case 6:
                diaString = "Sexta";
                break;
            case 7:
                diaString = "Sábado";
                break;
            default:
                diaString = "Valor Inválido....";
                break;
        }
        System.out.printf("Dia da Semana: %s", diaString);

        // EXPRESÃO CONDICIONAL TERNÁRIA:

        double preco = 34.5;
        double desconto;

        desconto = preco < 20 ? preco * 0.1 : preco * 0.05;
        System.out.printf("Valor total a pagar: %.2f", preco - desconto);

    }
}
