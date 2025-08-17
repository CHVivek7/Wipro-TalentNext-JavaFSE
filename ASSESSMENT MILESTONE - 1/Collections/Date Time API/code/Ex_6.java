import java.time.LocalTime;
import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime beforeTime = now.minusHours(5).minusMinutes(30);
        System.out.println("Current time: " + now);
        System.out.println("Time before 5 hours and 30 minutes: " + beforeTime);
    }
}
