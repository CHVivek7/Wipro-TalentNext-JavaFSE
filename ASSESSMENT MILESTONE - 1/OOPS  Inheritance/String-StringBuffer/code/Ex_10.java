import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n < 0 || n > input.length()) {
            System.out.println("");
        } else {
            String lastN = input.substring(input.length() - n);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(lastN);
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
