import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Student> alunos = new HashSet<>();

        String[] courseLetter = new String[]{"A", "B", "C"};

        for (String s : courseLetter) {
            System.out.printf("How many Students for course %s: ", s);
            int nStudents = sc.nextInt();
            for (int j = 1; j <= nStudents; j++) {
                Integer studentId = sc.nextInt();
                alunos.add(new Student(studentId));
            }
        }

        System.out.println("TOTAL STUDENTS: " + alunos.size());
    }
}