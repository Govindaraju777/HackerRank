package hackerrank;

import java.util.Scanner;

public class PlusMinus {
	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {

		float pCount = 0.00000f;
		float nCount = 0.00000f;
		float zCount = 0.00000f;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				pCount++;
			else if (arr[i] < 0)
				nCount++;
			else
				zCount++;
		}
		System.out.printf("%.6f\n",pCount / arr.length);
		System.out.printf("%.6f\n",nCount / arr.length);
		System.out.printf("%.6f\n",zCount / arr.length);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
