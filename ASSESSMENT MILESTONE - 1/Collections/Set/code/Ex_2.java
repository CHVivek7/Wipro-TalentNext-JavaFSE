import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            employees.add(name);
        }
        System.out.println("Employee names using Iterator:");
        Iterator<String> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        sc.close();
    }
}
