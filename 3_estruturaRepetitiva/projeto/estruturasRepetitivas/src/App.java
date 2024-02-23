import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner mySc = new Scanner(System.in);

        // Testando debug do vscode

        // System.out.println("Digite o numero da semana de 0 a 7: ");
        // int numeroSemana = mySc.nextInt();

        // switch (numeroSemana) {
        // case 1:
        // System.out.println("Hoje é domingo");
        // break;
        // case 2:
        // System.out.println("Hoje é segunda");
        // break;
        // case 3:
        // System.out.println("Hoje é terça");
        // break;
        // case 4:
        // System.out.println("Hoje é quarta");
        // break;
        // case 5:
        // System.out.println("Hoje é quinta");
        // break;
        // case 6:
        // System.out.println("Hoje é sexta");
        // break;
        // case 7:
        // System.out.println("Hoje é sábado");
        // break;

        // default:
        // System.out.println("Numero inválido....");
        // break;
        // }

        // int soma, numero;
        // soma = 0;
        // numero = mySc.nextInt();

        // while (!(numero == 0)) {
        // soma += numero;
        // numero = mySc.nextInt();
        // }
        // System.out.println(soma);

        // EXERCÍCIO 01

        // int senha = 2002;
        // System.out.println("Digite a senha: ");
        // int senhaDigitada = mySc.nextInt();

        // while (senhaDigitada != senha) {
        // System.out.printf("Senha Inválida.. %nDigite novamente: ");
        // senhaDigitada = mySc.nextInt();
        // }

        // System.out.println("Acesso Permitido!");

        // EXERCÍCIO 02

        // int x, y;
        // x = mySc.nextInt();
        // y = mySc.nextInt();

        // while (x != 0 && y != 0) {
        // if (x > 0 && y > 0) {
        // System.out.println("Primeiro");
        // } else if (x < 0 && y > 0) {
        // System.out.println("Segundo");
        // } else if (x < 0 && y < 0) {
        // System.out.println("Terceiro");
        // } else {
        // System.out.println("Quarto");
        // }

        // x = mySc.nextInt();
        // y = mySc.nextInt();
        // }

        // EXERCÍCIO 03
        // int codAlcool = 1;
        // int codGasolina = 2;
        // int codDiesel = 3;

        // int qtdAlcool = 0;
        // int qtdGasolina = 0;
        // int qtdDiesel = 0;

        // int resposta = mySc.nextInt();

        // while (resposta != 4) {
        // // if (resposta < 1 && resposta > 4) {
        // // resposta = mySc.nextInt();
        // // }

        // if (resposta == codAlcool) {
        // qtdAlcool++;
        // }

        // if (resposta == codGasolina) {
        // qtdGasolina++;
        // }

        // if (resposta == codDiesel) {
        // qtdDiesel++;
        // }

        // resposta = mySc.nextInt();

        // if (resposta == 4) {
        // System.out.printf("MUITO OBRIGADO %nAlcool: %d%nGasolina: %d%nDiesel: %d",
        // qtdAlcool, qtdGasolina,
        // qtdDiesel);
        // }
        // }

        /*
         * Crie um programa que leia vários números inteiros pelo teclado.
         * No final da execução, mostre a média entre todos os valores e qual foi o
         * maior e o menor valores lidos.
         * O programa deve perguntar ao usuário se ele quer ou não continuar a digitar
         * valores.
         */

        /*
         * int numero;
         * int soma = 0;
         * int nDivisoes = 0;
         * int maiorNumero = 0;
         * int menorNumero = 0;
         * double media = 0;
         * char resposta = 'S';
         * 
         * while (resposta != 'N') {
         * 
         * System.out.println("Digite um numero inteiro: ");
         * numero = mySc.nextInt();
         * nDivisoes++;
         * 
         * if (numero > maiorNumero || maiorNumero == 0) {
         * maiorNumero = numero;
         * }
         * 
         * if (numero < menorNumero || menorNumero == 0) {
         * menorNumero = numero;
         * }
         * 
         * soma += numero;
         * media = (double) soma / nDivisoes;
         * 
         * System.out.println("Deseja continuar inserindo? [S/N]");
         * resposta = mySc.next().charAt(0);
         * }
         * 
         * System.out.printf("Maior numero: %d, Menor numero: %d, Media: %.2f",
         * maiorNumero, menorNumero, media);
         */

        // estrutura repetitiva "para" (for);

        // int N = mySc.nextInt();
        // int soma = 0;

        // for (int i = 0; i < N; i++) {
        // int numerodaVez = mySc.nextInt();
        // soma += numerodaVez;
        // }
        // System.out.println(soma);

        // estrutura repetitiva do while

    }
}
