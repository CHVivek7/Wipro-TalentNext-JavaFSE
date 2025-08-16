import java.util.Scanner;
public class Ex_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of ASCII values: ");
		int n = sc.nextInt();
		int[] ascii = new int[n];
		System.out.println("Enter the ASCII values:");
		for (int i = 0; i < n; i++) {
			ascii[i] = sc.nextInt();
		}
		for (int val : ascii) {
			System.out.print((char)val + " ");
		}
		System.out.println();
		sc.close();
	}
}
