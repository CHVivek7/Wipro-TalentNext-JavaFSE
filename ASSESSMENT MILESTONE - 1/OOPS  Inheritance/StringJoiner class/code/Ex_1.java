import java.util.*;
import java.util.StringJoiner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }
        StringJoiner sj = new StringJoiner(", ", "{", "}");
        names.forEach(sj::add);
        System.out.println("Joined names: " + sj);
        sc.close();
    }
}
