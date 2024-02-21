package com.tapan.dsa.leetCodeEasy;

public class MissingNumbers {
	public static void main(String[] args) {
		MissingNumbers numbers = new MissingNumbers();

		int[] nums = { 9,6,4,2,3,5,7,0,1 };
		//int n = 7;
		System.out.println(numbers.solve(nums));
	}

	public int solve(int[] nums) {
		int actualSum = 0;
		int n = nums.length;
		int expectedSum = n * (n + 1) / 2;
		for (int val : nums) {
			actualSum = actualSum + val;
		}
		int missingSum = expectedSum - actualSum;

		return missingSum;

	}

}
