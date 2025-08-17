import java.io.*;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();
        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File is copied.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
