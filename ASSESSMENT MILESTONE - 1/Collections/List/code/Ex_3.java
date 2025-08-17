import java.util.*;

public class Ex_3 {
    public static void printAll(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i+1) + ": ");
            strList.add(sc.nextLine());
        }
        System.out.println("All elements:");
        printAll(strList);
        sc.close();
    }
}
