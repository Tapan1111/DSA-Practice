package com.tapan.dsa.DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(longestCount(arr));

	}

	public static int lengthOfLIS(int[] nums) {
		int[] LIS = new int[nums.length];
		for (int i = 0; i < LIS.length; i++) {
			LIS[i] = 1;
		}
		System.out.println(Arrays.toString(LIS));
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					LIS[j] = Math.max(LIS[j], 1 + LIS[i]);
				}
			}
		}
		System.out.println(Arrays.toString(LIS));
		int max = 0;
		for (int i = 0; i < LIS.length; i++) {
			if (LIS[i] > max) {
				max = LIS[i];
			}
		}
		return max;
	}

	public static int longestCount(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = 1;
		int ans = 0;
		for (int i = 0; i < dp.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					if (dp[j] > max) {
						max = dp[j];
					}
				}
				dp[i] = max + 1;
				if (dp[i] > ans) {
					ans = dp[i];
				}
			}
		}
		return ans;
	}

}
