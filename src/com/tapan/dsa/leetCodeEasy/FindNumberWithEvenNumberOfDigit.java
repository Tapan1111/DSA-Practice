package com.tapan.dsa.leetCodeEasy;

public class FindNumberWithEvenNumberOfDigit {
	public static void main(String[] args) {
		FindNumberWithEvenNumberOfDigit number = new FindNumberWithEvenNumberOfDigit();

		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(number.solve(nums));

	}

	public static int solve(int[] arr) {
		int count = 0;
		for (Integer val : arr) {
			if (String.valueOf(val).length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}
