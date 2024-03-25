package com.tapan.dsa.BinarySearch;

import java.util.Arrays;

public class AggresiveCowsOptimizedBS {
	public static void main(String[] args) {
		int[] stalls = { 10, 1, 2, 7, 5 };
		int k = 3;
		int n = 5;
		System.out.println(solve(stalls, k, n));

	}

	public static int solve(int[] stalls, int k, int n) {
		Arrays.sort(stalls);

		int min = stalls[0];
		int max = stalls[stalls.length - 1];
		int left = 1;
		int right = max - min;
		int ans = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (isPossible(stalls, k, mid)) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return ans;
	}

	private static boolean isPossible(int[] stalls, int k, int mid) {
		int lastPlacedCow = stalls[0];
		int count = 1;
		for (int i = 1; i < stalls.length; i++) {
			if (lastPlacedCow + mid <= stalls[i]) {
				lastPlacedCow = stalls[i];
				count++;
			}
		}
		if (count >= k) {
			return true;
		}
		return false;
	}

}
