import java.util.*;
import java.util.Properties;

public class Ex_3 {
    public static void main(String[] args) {
        Properties states = new Properties();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of state-capital pairs:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter state: ");
            String state = sc.nextLine();
            System.out.print("Enter capital: ");
            String capital = sc.nextLine();
            states.setProperty(state, capital);
        }
        System.out.println("\nListing all states and capitals using Iterator:");
        Set<Map.Entry<Object, Object>> entrySet = states.entrySet();
        Iterator<Map.Entry<Object, Object>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
        sc.close();
    }
}
