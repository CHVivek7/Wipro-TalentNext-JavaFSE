import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hero details: model, reg, owner, speed");
        Hero hero = new Hero(sc.next(), sc.next(), sc.next(), sc.nextInt());
        System.out.println("Hero: " + hero.getModelName() + ", " + hero.getRegistrationNumber() + ", " + hero.getOwnerName() + ", Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println("Enter Honda details: model, reg, owner, speed");
        Honda honda = new Honda(sc.next(), sc.next(), sc.next(), sc.nextInt());
        System.out.println("Honda: " + honda.getModelName() + ", " + honda.getRegistrationNumber() + ", " + honda.getOwnerName() + ", Speed: " + honda.getSpeed());
        honda.cdplayer();
        sc.close();
    }
}
