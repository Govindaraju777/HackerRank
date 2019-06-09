package com.questions.interview.xiaomi;

import java.util.Arrays;
import java.util.List;

/*
 
 write an program(efficient) to merge the list/array of sorted numbers
 
 */
public class XiaomiInterviewQuestions {

	public static void main(String[] args) {
		Integer na1[] = { 1, 4, 7 };
		Integer na2[] = { 2, 5, 8 };
		//Integer na3[] = { 3, 6, 9 };

		Integer result[] = solutino1(na1, na2);
		Arrays.stream(result).forEach(num -> {System.out.print(" "+num);} );
	}

	private static Integer[] solutino1(Integer[] na1, Integer[] na2) {
		// List<Integer> numbers1 = Arrays.asList(na1);
		// List<Integer> numbers2 = Arrays.asList(na1);
		// List<Integer> numbers3 = Arrays.asList(na1);

		Integer result[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int i = 0, j = 0, k = 0, r = 0;

		while (i < na1.length && j < na2.length) {
			int num = 0;
			if (na2[j] < na1[i]) {
				num = na2[j];
				j++;
			}else {
				num = na1[i];
				i++;
			}
			result[r++] = num;
		}
		return result;
	}
}
