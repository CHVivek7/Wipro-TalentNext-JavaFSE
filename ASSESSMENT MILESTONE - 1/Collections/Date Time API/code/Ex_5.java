import java.time.LocalTime;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime after25Min = now.plusMinutes(25);
        System.out.println("Current time: " + now);
        System.out.println("Time after 25 minutes: " + after25Min);
    }
}
