import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Logan details: model, reg, owner, speed");
        Logan logan = new Logan(sc.next(), sc.next(), sc.next(), sc.nextInt());
        System.out.println("Logan: " + logan.getModelName() + ", " + logan.getRegistrationNumber() + ", " + logan.getOwnerName() + ", Speed: " + logan.speed());
        logan.gps();

        System.out.println("Enter Ford details: model, reg, owner, speed");
        Ford ford = new Ford(sc.next(), sc.next(), sc.next(), sc.nextInt());
        System.out.println("Ford: " + ford.getModelName() + ", " + ford.getRegistrationNumber() + ", " + ford.getOwnerName() + ", Speed: " + ford.speed());
        ford.tempControl();
        sc.close();
    }
}
