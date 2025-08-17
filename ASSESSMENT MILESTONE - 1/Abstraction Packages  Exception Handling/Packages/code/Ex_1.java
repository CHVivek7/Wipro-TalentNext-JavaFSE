import testpackage.foundation;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 integers:");
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();
        int v4 = sc.nextInt();
        foundation f = new foundation(v1, v2, v3, v4);
        System.out.println("var4 (public): " + f.var4); // public: accessible
        sc.close();
    }
}
