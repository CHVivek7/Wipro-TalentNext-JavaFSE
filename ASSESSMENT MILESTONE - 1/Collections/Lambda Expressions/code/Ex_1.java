import java.util.*;
import java.util.stream.*;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1); // random numbers between 1 and 100
        }
        System.out.println("ArrayList: " + al);
        System.out.print("Prime numbers: ");
        al.stream().filter(n -> isPrime(n)).forEach(n -> System.out.print(n + " "));
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
