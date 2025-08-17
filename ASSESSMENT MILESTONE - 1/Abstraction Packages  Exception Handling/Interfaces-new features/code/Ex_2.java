// Ex_2.java
// Demonstrates interface and lambda expressions
import java.util.Scanner;

interface Test {
    int myFunction(int a, int b, int c);
}

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;
        
        System.out.println("Sum: " + t1.myFunction(x, y, z));
        System.out.println("Product: " + t2.myFunction(x, y, z));
        sc.close();
    }
}
