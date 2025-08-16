import java.util.Scanner;
public class Ex_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		System.out.println("Enter 3 elements for array a:");
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter 3 elements for array b:");
		for (int i = 0; i < 3; i++) {
			b[i] = sc.nextInt();
		}
		int[] result = {a[1], b[1]};
		System.out.print("Result: [");
		System.out.print(result[0] + ", " + result[1]);
		System.out.println("]");
		sc.close();
	}
}
