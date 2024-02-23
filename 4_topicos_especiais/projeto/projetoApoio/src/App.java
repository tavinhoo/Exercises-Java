import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner mySc = new Scanner(System.in);
        // String palavra = "Ratoeira";
        // String palavraModificada = palavra.replace('a', 'o');
        // System.out.println(palavraModificada);

        // String frase = "O rato roeu a roupa do rei de roma";
        // int posicaoRoupa = frase.indexOf('r');
        // System.out.println(posicaoRoupa);

        // String emMaiusculo = frase.toUpperCase();
        // System.out.println(emMaiusculo);

        // String fraseNoSpace = frase.trim();
        // System.out.println(fraseNoSpace);

        // String fraseS = frase;
        // String[] vectorDeString = fraseS.split(" ");
        // String letter1 = vectorDeString[0];
        // System.out.println(letter1);

        // exercicioTeste

        // System.out.println("Entre com tres numeros: ");
        // int a = mySc.nextInt();
        // int b = mySc.nextInt();
        // int c = mySc.nextInt();
        // int higher;

        // if (a > b && a > c) {
        // higher = a;
        // } else if (b > c) {
        // higher = b;
        // } else {
        // higher = c;
        // }

        // System.out.println("Higher: " + higher);

        // com funções
        int a = mySc.nextInt();
        int b = mySc.nextInt();
        int c = mySc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

    }

    public static int max(int a, int b, int c) {
        int higher;
        if (a > b && a > c) {
            higher = a;
        } else if (b > c) {
            higher = b;
        } else {
            higher = c;
        }
        return higher;
    }

    public static void showResult(int num) {
        System.out.println("O maior numero: " + num);
    }
}
