package com.tapan.dsa.maths;

import java.util.ArrayList;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(solve(10));

	}

	public static ArrayList<Integer> solve(int n) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				ans.add(i);
			}
		}

		return ans;
	}

	private static boolean isPrime(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			return true;
		}
		return false;
	}
}
