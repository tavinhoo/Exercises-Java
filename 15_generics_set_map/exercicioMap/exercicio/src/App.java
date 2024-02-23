import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {

        File filesrc = new File("D:\\LUIZO\\Downloads\\Java - exercicios\\16_generics_set_map\\exercicioMap\\exercicio\\src\\in.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(filesrc))) {

            Map<Candidact, Integer> votingLogs = new LinkedHashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                Candidact candidact = new Candidact(fields[0]);

                if(votingLogs.containsKey(candidact)) {
                    Integer newQuantity = votingLogs.get(candidact) + Integer.parseInt(fields[1]);
                    votingLogs.put(candidact, newQuantity);
                } else {
                    votingLogs.put(new Candidact(fields[0]), Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }

            for (Candidact c : votingLogs.keySet()) {
                System.out.println(c.getName() + ": " + votingLogs.get(c));
            }

        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }

    }
}
