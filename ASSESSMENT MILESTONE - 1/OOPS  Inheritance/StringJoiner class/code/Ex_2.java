import java.util.*;
import java.util.StringJoiner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cities for s1: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        StringJoiner s1 = new StringJoiner("-");
        System.out.println("Enter cities for s1:");
        for (int i = 0; i < n1; i++) {
            s1.add(sc.nextLine());
        }
        System.out.print("Enter number of cities for s2: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        StringJoiner s2 = new StringJoiner("-");
        System.out.println("Enter cities for s2:");
        for (int i = 0; i < n2; i++) {
            s2.add(sc.nextLine());
        }
        // i) s1 merged to s2
        StringJoiner merged1 = new StringJoiner("-");
        merged1.merge(s1);
        merged1.merge(s2);
        System.out.println("s1 merged to s2: " + merged1);
        // ii) s2 merged to s1
        StringJoiner merged2 = new StringJoiner("-");
        merged2.merge(s2);
        merged2.merge(s1);
        System.out.println("s2 merged to s1: " + merged2);
        sc.close();
    }
}
