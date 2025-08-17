import java.util.*;
import java.util.function.Function;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }
        Function<ArrayList<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (int n : list) sum += n;
            return sum;
        };
        int sum = sumFunction.apply(numbers);
        System.out.println("Sum: " + sum);
    }
}
