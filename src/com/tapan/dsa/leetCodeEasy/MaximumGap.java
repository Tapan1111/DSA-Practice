package com.tapan.dsa.leetCodeEasy;

import java.util.Arrays;

public class MaximumGap {
	public static void main(String[] args) {
		MaximumGap gap = new MaximumGap();
		int[] arr = { 3, 6, 9, 1 };
		System.out.println(gap.maxDifference(arr));

	}

	public int maxDifference(int[] arr) {
		if (arr.length < 2) {
			return 0;
		}
		Arrays.sort(arr);
		int maxdiff = 0;
		int ans = 0;
		for (int i = 1; i < arr.length; i++) {
			maxdiff = arr[i] - arr[i - 1];
			ans = Math.max(ans, maxdiff);
		}
		return ans;
	}

}
