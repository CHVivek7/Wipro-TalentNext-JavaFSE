import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your joining date (yyyy-mm-dd): ");
        String joinDateStr = sc.nextLine();
        LocalDate joinDate = LocalDate.parse(joinDateStr);
        LocalDate today = LocalDate.now();
        Period exp = Period.between(joinDate, today);
        System.out.println("Experience: " + exp.getYears() + " years, " + exp.getMonths() + " months, " + exp.getDays() + " days");
        sc.close();
    }
}
