import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Part A
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(num > 0) System.out.println("Positive");
        else if(num < 0) System.out.println("Negative");
        else System.out.println("Zero");

        // Part B
        System.out.print("Enter first non-negative integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second non-negative integer: ");
        int b = sc.nextInt();
        boolean sameLastDigit = (a % 10) == (b % 10);
        System.out.println("Same last digit: " + sameLastDigit);
    }
}
