import java.util.*;
import java.util.function.Predicate;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }
        Predicate<Integer> isPerfectSquare = n -> {
            if (n < 0) return false;
            int sqrt = (int)Math.sqrt(n);
            return sqrt * sqrt == n;
        };
        ArrayList<Integer> perfectSquares = new ArrayList<>();
        for (int num : numbers) {
            if (isPerfectSquare.test(num)) {
                perfectSquares.add(num);
            }
        }
        System.out.println("Perfect squares: " + perfectSquares);
    }
}
