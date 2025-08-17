import java.util.*;

public class Ex_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> contactList = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of contacts:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter phone number: ");
            int phone = Integer.parseInt(sc.nextLine());
            contactList.put(name, phone);
        }
        System.out.print("\nEnter name to check existence: ");
        String nameCheck = sc.nextLine();
        System.out.println("Name exists: " + contactList.containsKey(nameCheck));
        System.out.print("Enter phone number to check existence: ");
        int phoneCheck = Integer.parseInt(sc.nextLine());
        System.out.println("Phone number exists: " + contactList.containsValue(phoneCheck));
        System.out.println("\nIterating using Iterator:");
        Iterator<Map.Entry<String, Integer>> it = contactList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
        sc.close();
    }
}
