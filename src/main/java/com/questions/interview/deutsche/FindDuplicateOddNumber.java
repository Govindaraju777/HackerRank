package com.questions.interview.deutsche;

/*
 Writer a java program to find the duplicate number from an array.
 	- only one odd number is repeated odd number of times in the array.
 */
public class FindDuplicateOddNumber {
	public static void main(String[] args) {
		int[] numsArray = { 5, 6, 7, 8, 9, 5, 5 };

		int duplicateNumber = 0;
		for (int i = 0; i < numsArray.length; i++) {
			duplicateNumber ^= numsArray[i];
		}
		System.out.println("duplicateNumber="+duplicateNumber);
	}
}
