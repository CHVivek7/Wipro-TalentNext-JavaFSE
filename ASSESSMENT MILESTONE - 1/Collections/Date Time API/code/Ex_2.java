import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstDayNextMonth = today.plusMonths(1).withDayOfMonth(1);
        int count = 0;
        LocalDate date = firstDayNextMonth;
        while (true) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
                if (count == 2) {
                    break;
                }
            }
            date = date.plusDays(1);
        }
        System.out.println("Second Sunday of next month: " + date);
    }
}
