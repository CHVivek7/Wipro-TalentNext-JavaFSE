import java.util.Optional;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        // Optionally, take input for names[0] or leave it null to demonstrate
        System.out.print("Enter a name for names[0] (or press Enter to leave it null): ");
        String input = sc.nextLine();
        if (!input.isEmpty()) {
            names[0] = input;
        }
        // Use Optional to avoid NullPointerException
        Optional<String> nameOpt = Optional.ofNullable(names[0]);
        int length = nameOpt.map(String::length).orElse(0);
        System.out.println("Length: " + length);
        sc.close();
    }
}
