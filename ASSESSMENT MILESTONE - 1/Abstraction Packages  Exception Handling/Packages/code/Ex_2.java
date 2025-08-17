import com.wipro.automobile.ship.compartment;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height, width, breadth:");
        int h = sc.nextInt();
        int w = sc.nextInt();
        int b = sc.nextInt();
        compartment c = new compartment(h, w, b);
        c.display();
        sc.close();
    }
}
