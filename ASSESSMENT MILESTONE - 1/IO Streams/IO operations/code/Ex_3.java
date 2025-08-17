import java.io.*;
import java.util.*;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();
        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();
        Map<String, Integer> wordCount = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        try (PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                pw.println(entry.getKey() + " : " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
