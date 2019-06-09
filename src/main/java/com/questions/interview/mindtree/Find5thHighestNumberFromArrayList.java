package com.questions.interview.mindtree;

import java.util.Arrays;
import java.util.List;

/*
 *  program to find the 5th highest number. without using Collections.sort
 */
public class Find5thHighestNumberFromArrayList {

	private static final int HIGH_RANK = 5;
	private static int[] maxNumbrs = { 0, 0, 0, 0, 0 };

	public static void main(String[] args) {
		Integer[] nums = { 33, -1, 876, 100, 65, 22, 9 };
		List<Integer> numbers = Arrays.asList(nums); // arrayList of numbers

		
		for(int i=0;i<5;i++) {
			maxNumbrs[i] = numbers.get(i);
		}
		Arrays.sort(maxNumbrs);
		
		
		for (Integer num : numbers) {
			if (num > maxNumbrs[HIGH_RANK - 1]) {
				shiftNumbers(maxNumbrs, num);
			}
		}

		Arrays.stream(maxNumbrs).forEach(System.out::println);
		
		System.out.println();
		
	}

	private static void shiftNumbers(int[] maxNumbrs, int newMax) {
//		for (int i = maxNumbrs.length - 1; i > 1; i=i-2) {
//			maxNumbrs[i - 1] = maxNumbrs[i];
//		}
		maxNumbrs[maxNumbrs.length - 5] = maxNumbrs[maxNumbrs.length - 4];	// index = 0
		maxNumbrs[maxNumbrs.length - 4] = maxNumbrs[maxNumbrs.length - 3];	// index 1
		maxNumbrs[maxNumbrs.length - 3] = maxNumbrs[maxNumbrs.length - 2];	// index 2
		maxNumbrs[maxNumbrs.length - 2] = maxNumbrs[maxNumbrs.length - 1];  // index 3
		maxNumbrs[maxNumbrs.length - 1] = newMax ;  // index 4

	}

}
