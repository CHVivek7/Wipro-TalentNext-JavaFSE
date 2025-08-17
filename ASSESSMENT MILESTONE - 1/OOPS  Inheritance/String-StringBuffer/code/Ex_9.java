import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int minLen = Math.min(a.length(), b.length());
        for (int i = 0; i < minLen; i++) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }
        if (a.length() > minLen) sb.append(a.substring(minLen));
        if (b.length() > minLen) sb.append(b.substring(minLen));
        System.out.println(sb.toString());
        sc.close();
    }
}
