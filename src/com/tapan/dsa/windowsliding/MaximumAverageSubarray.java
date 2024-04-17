package com.tapan.dsa.windowsliding;

public class MaximumAverageSubarray {
	public static void main(String[] args) {
		int[] arr = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		System.out.println(findMaxAverage(arr, k));

	}

	public static double findMaxAverage(int[] arr, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		int maxSum = sum;
		int startIndex = 0;
		int endIndex = k;
		while (endIndex < arr.length) {
			sum = sum - arr[startIndex];
			startIndex++;
			sum = sum + arr[endIndex];
			endIndex++;
			maxSum = Math.max(maxSum, sum);
		}

		return (double) maxSum / k;

	}

}
