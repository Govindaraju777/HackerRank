package wipro;

import java.util.Arrays;
import java.util.HashSet;

public class PrintAllDistinctElements {

	public static void main(String[] args) {
		int arr[] = { 6, 10, 5, 4, 9, 120, 4, 6, 10 };
		int n = arr.length;
		printDistinct(arr, n);
		printDistinctAfterSort(Arrays.copyOf(arr, arr.length), n);
		// complexity is O(n) ");
		printDistinctUsingHash(arr);

	}

	// using Two for loops
	/*
	 * Time Complexity of above solution is O(n2). We can Use Sorting to solve
	 * the problem in O(nLogn) time
	 */
	static void printDistinct(int arr[], int n) {
		System.out.println("\nUsing 2 for loops complexity is  O(n^2) ");

		// Pick all elements one by one
		for (int i = 0; i < n; i++) {
			// Check if the picked element
			// is already printed
			int j;
			for (j = 0; j < i; j++)
				if (arr[i] == arr[j])
					break;

			// If not printed earlier,
			// then print it
			if (i == j)
				System.out.print(arr[i] + " ");
		}
	}

	static void printDistinctAfterSort(int arr[], int n) {

		System.out.println("\nUsing printDistinctAfterSort for loops complexity is  O(logn) ");

		// First sort the array so that
		// all occurrences become consecutive
		Arrays.sort(arr);

		// Traverse the sorted array
		for (int i = 0; i < n; i++) {
			// Move the index ahead while
			// there are duplicates
			while (i < n - 1 && arr[i] == arr[i + 1]) {
				i++;
			}

			// print last occurrence of
			// the current element
			System.out.print(arr[i] + " ");
		}
	}

	//

	static void printDistinctUsingHash(int arr[]) {
		System.out.println("\nUsing printDistinctUsingHash for loops");

		// Creates an empty hashset
		HashSet<Integer> set = new HashSet<>();

		// Traverse the input array
		for (int i = 0; i < arr.length; i++) {
			// If not present, then put it in hashtable and print it
			if (!set.contains(arr[i])) {
				set.add(arr[i]);
				System.out.print(arr[i] + " ");
			}
		}
	}

}
