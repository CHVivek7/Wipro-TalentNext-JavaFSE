import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (input.length() % 2 == 0) {
            System.out.println(input.substring(0, input.length() / 2));
        } else {
            System.out.println("null");
        }
        sc.close();
    }
}
