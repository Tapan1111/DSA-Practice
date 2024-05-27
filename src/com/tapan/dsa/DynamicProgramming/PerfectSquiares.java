package com.tapan.dsa.DynamicProgramming;

public class PerfectSquiares {
	static int[] dp;
	public static void main(String[] args) {
		System.out.println(solve(12));

	}

	public static int solve(int n) {
		dp = new int[n + 1];
		return helper(n);
	}

	private static int helper(int n) {
		if (n == 0) {
			return 0;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		int minCount = Integer.MAX_VALUE;
		for (int i = 1; i * i <= n; i++) {
			int result = 1 + helper(n - i * i);
			minCount = Math.min(minCount, result);
		}
		return dp[n] = minCount;
	}
}
