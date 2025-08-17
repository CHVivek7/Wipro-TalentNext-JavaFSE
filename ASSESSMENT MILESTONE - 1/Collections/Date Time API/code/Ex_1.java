import java.time.LocalDate;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);
        System.out.println("Today's date: " + today);
        System.out.println("Date after 10 days: " + afterTenDays);
    }
}
