import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.NavigableSet;

public class Ex_3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string: ");
            String str = sc.nextLine();
            treeSet.add(str);
        }
        // a) Reverse the elements
        NavigableSet<String> reverseSet = treeSet.descendingSet();
        System.out.println("Reversed TreeSet: " + reverseSet);
        // b) Iterate using Iterator
        System.out.println("Iterating TreeSet:");
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // c) Check if element exists
        System.out.print("Enter element to search: ");
        String search = sc.nextLine();
        if (treeSet.contains(search)) {
            System.out.println(search + " exists in TreeSet.");
        } else {
            System.out.println(search + " does not exist in TreeSet.");
        }
        sc.close();
    }
}
