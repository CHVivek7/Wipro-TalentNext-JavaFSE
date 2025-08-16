import java.util.Scanner;
public class Ex_9 {
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
			if (arr[i] != 10) {
				result[idx++] = arr[i];
			}
		}
		while (idx < n) {
			result[idx++] = 0;
		}
		System.out.print("Result: ");
		for (int num : result) {
			System.out.print(num + " ");
		}
		System.out.println();
		sc.close();
	}
}
