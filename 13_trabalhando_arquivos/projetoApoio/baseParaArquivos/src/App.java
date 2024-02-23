import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // File file = new File("D:\\LUIZO\\Documents\\texto.txt");
        // Scanner sc = null;

        // AULA 214
        // try {
        // sc = new Scanner(file);
        // while (sc.hasNextLine()) {
        // System.out.println(sc.nextLine());
        // }
        // } catch (IOException e) {
        // System.out.println("Unexpected error: " + e.getMessage());
        // } finally {
        // if (sc != null) {
        // sc.close();
        // }
        // }

        // AULA 215

        // String path = "D:\\LUIZO\\Documents\\texto.txt";

        // FileReader fr = null;
        // BufferedReader br = null;

        // try {
        // fr = new FileReader(path);
        // br = new BufferedReader(fr);

        // String line = br.readLine();

        // while (line != null) {
        // System.out.println(line);
        // line = br.readLine();
        // }

        // } catch (IOException e) {
        // System.out.println("Unexpected error: " + e.getMessage());
        // } finally {
        // try {
        // if (br != null) {
        // br.close();
        // }
        // if (fr != null) {
        // fr.close();
        // }
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // }

        // AULA 216

        // String path = "D:\\LUIZO\\Documents\\texto.txt";

        // try (BufferedReader br = new BufferedReader(new FileReader(path))) {

        // String line = br.readLine();

        // while (line != null) {
        // System.out.println(line);
        // line = br.readLine();
        // }

        // } catch (IOException e) {
        // System.out.println("Unexpected error: " + e.getMessage());

        // }

        // AULA 217

        // String[] lines = new String[] { "Good morning", "Good afternoon", "Good
        // night", "Good Evening" };

        // String path = "D:\\LUIZO\\Documents\\texto2.txt";

        // try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
        // for (String line : lines) {
        // bw.write(line);
        // bw.newLine();
        // }
        // } catch (IOException e) {
        // System.out.println("Unexpected error: " + e.getMessage());
        // }

        // AULA 218

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a path: ");
        // String strPath = sc.nextLine();

        // File path = new File(strPath);

        // File[] folders = path.listFiles(File::isDirectory);

        // System.out.println("FOLDERS: ");
        // for (File folder : folders) {
        // System.out.println(folder);
        // }

        // File[] files = path.listFiles(File::isFile);
        // System.out.println("FILES: ");
        // for (File file : files) {
        // System.out.println(file);
        // }

        // boolean success = new File(strPath + "\\subdir").mkdir();
        // System.out.println("DIrectory created successfully: " + success);

        // sc.close();

        // AULA 218

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String filePath = sc.nextLine();

        File path = new File(filePath);

        System.out.println("getName: " + path.getName());
        System.out.println("getName: " + path.getParent());
        System.out.println("getName: " + path.getPath());
        sc.close();

    }

}