package com.tapan.dsa.DynamicProgramming;

import java.util.Scanner;

public class FrogJump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] height = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}
		int[] dp = new int[n + 1];
		System.out.println(minCost(n - 1, height, dp));

	}

	public static int minCost(int n, int[] height, int[] dp) {
		if (n == 0) {
			return 0;
		}
		if (dp[n] != 0) {
			dp[n] = n;
		}
		int cost = Integer.MAX_VALUE;
		cost = Math.min(cost, minCost(n - 1, height, dp) + Math.abs(height[n] - height[n - 1]));
		if (n - 2 > 0) {
			cost = Math.min(cost, minCost(n - 2, height, dp) + Math.abs(height[n] - height[n - 2]));
		}
		dp[n] = cost;
		return dp[n];
	}

}
