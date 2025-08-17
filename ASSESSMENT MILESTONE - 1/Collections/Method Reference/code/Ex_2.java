import java.util.Scanner;

// Functional interface for digit count static method reference
@FunctionalInterface
interface DigitCounter {
    int count(int n);
}

public class Ex_2 {
    // Static method to count digits
    public static int digitCount(int n) {
        n = Math.abs(n); // Handle negative numbers
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int num = scanner.nextInt();
        // Method reference to static method
        DigitCounter counter = Ex_2::digitCount;
        int digits = counter.count(num);
        System.out.println("Number of digits in " + num + " is: " + digits);
        scanner.close();
    }
}
