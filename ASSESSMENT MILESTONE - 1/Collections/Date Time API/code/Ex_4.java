import java.time.LocalDate;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        boolean isLeap = today.isLeapYear();
        System.out.println("Current year: " + year);
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
