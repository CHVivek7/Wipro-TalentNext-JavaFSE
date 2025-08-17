import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (input.length() <= 2) {
            System.out.println("");
        } else {
            System.out.println(input.substring(1, input.length() - 1));
        }
        sc.close();
    }
}
