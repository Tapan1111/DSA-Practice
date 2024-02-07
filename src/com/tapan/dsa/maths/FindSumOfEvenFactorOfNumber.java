package com.tapan.dsa.maths;

public class FindSumOfEvenFactorOfNumber {

	public static void main(String[] args) {
		FindSumOfEvenFactorOfNumber find = new FindSumOfEvenFactorOfNumber();
		int n = 30;
		System.out.println(find.solve(n));

	}

	public static int solve(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
