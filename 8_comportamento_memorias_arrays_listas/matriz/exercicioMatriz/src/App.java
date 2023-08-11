import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de linhas: ");
        int r = sc.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Insira os valores: [r: %d, c: %d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            System.out.printf("%n");
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println();

        System.out.printf("Digite o numero a ser pesquisado: ");
        int x = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (matrix[i][j] == x) {
                    System.out.printf("Position: %d,%d%n", i, j);

                    if (j - 1 < matrix[i].length && j - 1 >= 0) {
                        System.out.printf("LEFT: %d%n", matrix[i][j - 1]);
                    }

                    if (j + 1 < matrix[i].length) {
                        System.out.printf("RIGHT: %d%n", matrix[i][j + 1]);
                    }

                    if (i + 1 < matrix[i].length) {
                        System.out.printf("DOWN: %d%n", matrix[i + 1][j]);
                    }

                    if (i - 1 < matrix[i].length && i - 1 >= 0) {
                        System.out.printf("UP: %d%n", matrix[i - 1][j]);
                    }
                }
            }
        }
    }
}
