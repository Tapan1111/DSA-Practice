package com.tapan.dsa.leetcodeMedium;

public class SubarraySumEqualK {
	public static void main(String[] args) {
		SubarraySumEqualK count = new SubarraySumEqualK();
		int[] arr = { 1, 1, 1 };
		int k = 2;
		System.out.println(count.solve(arr, k));

	}

	public int solve(int[] arr, int k) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}

}
