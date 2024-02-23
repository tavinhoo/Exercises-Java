import entities.LogEntry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        File filesrc = new File(
                "D:\\LUIZO\\Downloads\\Java - exercicios\\16_generics_set_map\\exercicioResolvido\\exemploResolvido\\src\\resources\\in.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(filesrc))) {

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(" ");
                set.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));
                line = br.readLine();
            }

            System.out.println("Total users: " + set.size());
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}