import java.io.*;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = sc.nextLine();
        System.out.println("Enter the character to be counted");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = br.read()) != -1) {
                if (Character.toLowerCase((char)c) == Character.toLowerCase(ch)) {
                    count++;
                }
            }
            System.out.printf("File '%s' has %d instances of letter '%c'.\n", fileName, count, ch);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
