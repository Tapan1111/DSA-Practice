package com.tapan.dsa.leetCodeEasy;

public class MaximumAverageSalary {
	public static void main(String[] args) {
		MaximumAverageSalary maximum = new MaximumAverageSalary();
		int[] arr = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		System.out.println(maximum.findMaxAverage(arr, k));
	}

	public double findMaxAverage(int[] arr, int k) {
		double avg = 0.0;
		double ans = 0.0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		avg = sum * 1.0 / k;
		ans = avg;

		for (int i = k; i < arr.length; i++) {
			sum += arr[i] - arr[i - k];
			avg = sum * 1.0 / k;
			ans = Math.max(ans, avg);
		}

		return ans;
	}

}
