import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i) == '*') {
                i++;
                continue;
            }
            if (i > 0 && input.charAt(i - 1) == '*') {
                i++;
                continue;
            }
            if (i < input.length() - 1 && input.charAt(i + 1) == '*') {
                i++;
                continue;
            }
            sb.append(input.charAt(i));
            i++;
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
