import java.util.Scanner;

// Functional interface for constructor reference
@FunctionalInterface
interface PrimeChecker {
    Ex_3 create(int n);
}

public class Ex_3 {
    public Ex_3(int n) {
        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Prime: ");
        int num = scanner.nextInt();
        // Constructor reference
        PrimeChecker checker = Ex_3::new;
        checker.create(num);
        scanner.close();
    }
}
