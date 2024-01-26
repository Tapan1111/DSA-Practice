package com.tapan.dsa.Array;

import java.util.Arrays;

public class FindTheMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		int m = arr.length + 1;
		int missingNumber = getMissingNumber(arr, m);
		System.out.printf("Missing Number in array %s is %d %n", Arrays.toString(arr), missingNumber);
	}

	private static int getMissingNumber(int[] arr, int m) {
		int expectedTotal = (m * (m + 1)) / 2;
		int actualToal = 0;
		for (int val : arr) {
			actualToal = actualToal + val;

		}
		return expectedTotal - actualToal;
	}
}
