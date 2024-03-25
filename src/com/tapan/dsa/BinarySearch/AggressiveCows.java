package com.tapan.dsa.BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
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
		for (int dist = max - min; dist >= 1; dist--) {
			if (isPossible(stalls, k, dist)) {
				return dist;
			}
		}
//		int left = 1;
//		int right = max - min;
//		int ans = -1;
//		while (left <= right) {
//			int mid = (left + right) / 2;
//			if (isPossible(stalls, k, mid)) {
//				ans = mid;
//				left = mid + 1;
//			} else {
//				right = mid - 1;
//			}
//		}
		return -1;
	}

	private static boolean isPossible(int[] stalls, int k, int dist) {
		int lastPlacedCow = stalls[0];
		int cowCount = 1;
		for (int i = 1; i < stalls.length; i++) {
			if (lastPlacedCow + dist <= stalls[i]) {
				lastPlacedCow = stalls[i];
				cowCount++;
			}
		}
		if (cowCount == k) {
			return true;
		}

		return false;
	}

}
