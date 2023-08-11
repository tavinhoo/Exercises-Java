import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // // problema com . e , nos decimais, definindo Locale para US
        // // Locale.setDefault(Locale.US);

        // // println - quebra linha
        // // print - não quebra linha
        // System.out.println("Bom dia!!");
        // System.out.println("Boa tarde!!!");
        // System.out.print("Boa noite!!");
        // System.out.print("Boa madrugada!!");

        // System.out.println();

        // // exibindo variável
        // int y = 32;
        // System.out.println(y);

        // // controlando o numero de casas decimais
        // double x = 10.35784;
        // System.out.printf("%.2f%n", x);
        // System.out.printf("%.4f%n", x);

        // // concatenando elementos
        // double distancia = 10 + x;
        // System.out.println("RESULTADO: " + distancia + " metros");

        // // concatenando com printf
        // System.out.printf("Distancia = %.2f metros%n", distancia);

        // /*
        // * %f = ponto flutuante
        // * %d = inteiro
        // * %s = texto/string
        // * %n = quebra de linha
        // */

        // String nome = "Maria";
        // int idade = 20;
        // double renda = 4000.0;
        // System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);

        // System.out.println();

        // // EXERCÍCIO
        // String product1 = "Computer";
        // String product2 = "Office desk";

        // int age = 30;
        // int code = 5290;
        // char gender = 'F';

        // double price1 = 2100.0;
        // double price2 = 650.50;
        // double measure = 53.234567;

        // System.out.println("Products: ");
        // System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        // System.out.printf("%s, which price is $ %.2f%n", product2, price2);

        // System.out.println();
        // System.out.printf("Record: %d years old, code %d and gender %s %n", age,
        // code, gender);
        // System.out.println();

        // System.out.printf("Measue with eight decimal palces: %.8f%n", measure);
        // System.out.printf("Rouded (three decimal places): %.8f%n", measure);
        // Locale.setDefault(Locale.US);
        // System.out.printf("US decimal point: %.3f%n", measure)

        // CASTING, COVERSÃO EXPLICITA DE TIPOS DE DADOS

        // int a, b;
        // double resultado;

        // a = 5;
        // b = 2;

        // resultado = a / b;
        // System.out.println(resultado);

        // double myDouble = 13.45;
        // int myInt = (int) myDouble;

        // System.out.println(myDouble);
        // System.out.println(myInt);

        // ENTRADA DE DADOS;

        // Locale.setDefault(Locale.US);
        // Scanner mySc = new Scanner(System.in);

        // // situação: quero digitar uma palavra:

        // String palavra;
        // System.out.println("Escreva uma palavra: ");
        // palavra = mySc.nextLine();

        // System.out.printf("Sua palavra: %s", palavra);
        // mySc.nextLine();
        // // mySc.close();

        // System.out.println();

        // int idade;
        // System.out.println("Digite sua idade: ");
        // idade = mySc.nextInt();
        // // mySc.close();

        // System.out.println();

        // // para inputar altura e output com ponto, declarar Locale ^
        // double altura;
        // System.out.println("Digite sua altura: ");
        // altura = mySc.nextDouble();
        // System.out.printf("Altura: %.2f m", altura);
        // // mySc.close();

        // System.out.println();

        // char gender;
        // System.out.println("Digite a letra do seu genero: ");
        // gender = mySc.next().charAt(0);
        // // mySc.close();

        // System.out.println();

        // String x;
        // int y;
        // double z;

        // x = mySc.nextLine();
        // y = mySc.nextInt();
        // z = mySc.nextDouble();

        // System.out.println();

        // int x;
        // String s1, s2, s3;
        // x = mySc.nextInt();
        // s1 = mySc.nextLine();
        // s2 = mySc.nextLine();
        // s3 = mySc.nextLine();

        // System.out.println();
        // System.out.println("Dados digitados: ");

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        // ALGUMAS FUNÇÕES MATEMÉTICAS;
        /*
         * A = Math.sqrt(x); - raíz quadrada de x;
         * A = Math.pow(x, y); - x elevado a y;
         * A = Math.abs(x); a recebe o valor absoluto de x;
         * 
         * 
         */

    }
}
