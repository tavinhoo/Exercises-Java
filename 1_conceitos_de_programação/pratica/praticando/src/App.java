import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        int id = 0;
        String nome = "Luiz Otávio Faria da Silva";
        int idade = 20;
        double altura = 1.77;

        System.out.println("Exibição de todos os cadastros");

        System.out.println();
        System.out.printf("Id: %d, Nome: %s, Idade: %d, Altura: %.2f%n", id, nome, idade, altura);

    }
}
