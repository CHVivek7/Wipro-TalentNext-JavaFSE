import java.util.*;
import java.util.function.Consumer;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }
        Consumer<Integer> printOddEven = n -> {
            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };
        numbers.forEach(printOddEven);
    }
}
