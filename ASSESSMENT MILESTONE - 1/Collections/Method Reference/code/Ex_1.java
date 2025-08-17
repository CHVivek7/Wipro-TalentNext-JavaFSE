import java.util.Scanner;

// Functional interface for factorial method reference
@FunctionalInterface
interface FactorialCalculator {
    int factorial(int n);
}

public class Ex_1 {
    // Instance method to calculate factorial
    public int factorial(int n) {
        if (n < 0) return -1; // Error for negative numbers
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        Ex_1 obj = new Ex_1();
        // Method reference to instance method
        FactorialCalculator calc = obj::factorial;
        int fact = calc.factorial(num);
        if (fact == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + fact);
        }
        scanner.close();
    }
}
