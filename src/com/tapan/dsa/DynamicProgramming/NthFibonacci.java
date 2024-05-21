package com.tapan.dsa.DynamicProgramming;

public class NthFibonacci {

	public static void main(String[] args) {
		int n = 100;
		long[] dp = new long[n + 1];

		System.out.println(fibo(n, dp));

	}

	public static long fibo(int n, long[] dp) { 
		if(n == 0 || n==1) {
			return dp[n] = n;
		}
		if (dp[n] != 0) {
			dp[n] = n;
		}
		long nthFib = fibo(n - 1, dp) + fibo(n - 2, dp);
		dp[n] = nthFib;
		return nthFib;
		
	}

}
