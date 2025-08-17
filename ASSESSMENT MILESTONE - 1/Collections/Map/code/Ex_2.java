import java.util.*;

public class Ex_2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (String): ");
            String key = sc.nextLine();
            System.out.print("Enter value (String): ");
            String value = sc.nextLine();
            map.put(key, value);
        }
        System.out.print("\nEnter key to check existence: ");
        String keyCheck = sc.nextLine();
        System.out.println("Key exists: " + map.containsKey(keyCheck));
        System.out.print("Enter value to check existence: ");
        String valueCheck = sc.nextLine();
        System.out.println("Value exists: " + map.containsValue(valueCheck));
        System.out.println("\nIterating using Iterator:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        sc.close();
    }
}
