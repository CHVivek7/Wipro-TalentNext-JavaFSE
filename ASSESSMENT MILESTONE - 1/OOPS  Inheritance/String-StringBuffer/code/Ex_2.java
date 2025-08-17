import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        String result = concatenateStrings(s1, s2);
        System.out.println(result);
        sc.close();
    }

    private static String concatenateStrings(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (!s1.isEmpty() && !s2.isEmpty() && s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1);
        } else {
            return s1 + s2;
        }
    }
}
