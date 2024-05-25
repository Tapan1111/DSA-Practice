package com.tapan.dsa.DynamicProgramming;

public class CoinChangeCombination {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5 };
		System.out.println(solve(arr, 11));
		
	}

	public static int solve(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		dp[0] = 0;
		for (int i = 0; i < dp.length; i++) {
			for (int c : coins) {
				if (i - c > 0) {
					dp[i] = Math.min(dp[i], 1 + dp[i - c]);
				}
			}
		}
//		for (int i = 0; i < coins.length; i++) {
//			for (int j = coins[i]; j < dp.length; j++) {
//				dp[j] = dp[j] + dp[j - coins[i]];
//			}
//		}
		return dp[amount];
	}

}
