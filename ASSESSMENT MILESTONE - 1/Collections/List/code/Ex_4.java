import java.util.*;

public class Ex_4 {
    public static void main(String[] args) {
        ArrayList<Number> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number (int/float/double): ");
            String s = sc.next();
            try {
                if (s.contains(".")) {
                    if (s.length() - s.indexOf('.') > 2) {
                        numList.add(Double.parseDouble(s));
                    } else {
                        numList.add(Float.parseFloat(s));
                    }
                } else {
                    numList.add(Integer.parseInt(s));
                }
            } catch (Exception e) {
                System.out.println("Invalid input, skipping.");
            }
        }
        System.out.println("Numbers in the list:");
        for (Number num : numList) {
            System.out.println(num);
        }
        sc.close();
    }
}
