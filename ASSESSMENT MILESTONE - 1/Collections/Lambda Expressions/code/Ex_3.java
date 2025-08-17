import java.util.*;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Enter 10 different words:");
        for (int i = 0; i < 10; i++) {
            al.add(sc.next());
        }
        System.out.println("Original List: " + al);
        System.out.println("Strings with odd length:");
        al.stream().filter(s -> s.length() % 2 != 0).forEach(s -> System.out.println(s));
    }
}
