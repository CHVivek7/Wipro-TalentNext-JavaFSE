import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = input;
        if (input.length() > 0 && input.charAt(0) == 'x') {
            result = result.substring(1);
        }
        if (result.length() > 0 && result.charAt(result.length() - 1) == 'x') {
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
        sc.close();
    }
}
