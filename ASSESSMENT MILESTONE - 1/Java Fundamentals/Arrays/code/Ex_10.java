import java.util.Scanner;
public class Ex_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = new int[n];
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				result[idx++] = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				result[idx++] = arr[i];
			}
		}
		System.out.print("Result: ");
		for (int num : result) {
			System.out.print(num + " ");
		}
		System.out.println();
		sc.close();
	}
}
