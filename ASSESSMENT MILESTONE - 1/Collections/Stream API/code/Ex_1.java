import java.util.*;
import java.util.stream.Collectors;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        ArrayList<Integer> negativeEven = numbers.stream()
                .filter(x -> x < 0 && x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Negative even numbers: " + negativeEven);
    }
}
