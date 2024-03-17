package com.tapan.dsa.bitmanipulation;

public class CountTrailingZeros {
	public static void main(String[] args) {
		int n = 168;
		System.out.println(solve(n));

	}

	public static int solve(int n) {
		int count = 0;
		while (n % 2 == 0) {
			n = n >> 1;
			count++;
		}
		return count;
	}

}
