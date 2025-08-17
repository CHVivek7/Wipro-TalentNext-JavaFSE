import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-255): ");
        int num = sc.nextInt();
        if (num < 1 || num > 255) {
            System.out.println("Number must be between 1 and 255");
            return;
        }
        String binary = Integer.toBinaryString(num);
        String padded = String.format("%8s", binary).replace(' ', '0');
        System.out.println(padded);
    }
}
