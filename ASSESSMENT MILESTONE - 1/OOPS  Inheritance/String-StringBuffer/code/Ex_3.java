import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int n = input.length();
        String firstTwo = input.length() < 2 ? input : input.substring(0, 2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(firstTwo);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
