import java.util.Optional;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter address (or press Enter to leave it null): ");
        String address = sc.nextLine();
        if (address.isEmpty()) {
            address = null;
        }
        // Use Optional to print address or default
        String result = Optional.ofNullable(address).orElse("India");
        System.out.println("Address: " + result);
        sc.close();
    }
}
