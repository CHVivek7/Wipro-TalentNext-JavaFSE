import java.util.*;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Enter 10 different words:");
        for (int i = 0; i < 10; i++) {
            al.add(sc.next());
        }
        System.out.println("Original List: " + al);
        System.out.println("Strings in reverse order:");
        Collections.reverse(al);
        al.forEach(s -> System.out.println(s));
    }
}
