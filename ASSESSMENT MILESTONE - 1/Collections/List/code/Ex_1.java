import java.util.ArrayList;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the months of the year (12 months):");
        for (int i = 1; i <= 12; i++) {
            System.out.print("Enter month " + i + ": ");
            String month = sc.nextLine();
            months.add(month);
        }
        System.out.println("\nMonths in the year:");
        for (String m : months) {
            System.out.println(m);
        }
        sc.close();
    }
}
