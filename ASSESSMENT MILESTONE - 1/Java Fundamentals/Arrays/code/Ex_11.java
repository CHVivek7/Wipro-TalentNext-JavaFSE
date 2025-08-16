import java.util.Scanner;
public class Ex_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean only14 = true;
		for (int num : arr) {
			if (num != 1 && num != 4) {
				only14 = false;
				break;
			}
		}
		System.out.println(only14);
		sc.close();
	}
}
