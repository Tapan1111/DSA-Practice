package com.tapan.dsa.maths;

public class FactorOfNumber {
	public static void main(String[] args) {
		checkEvenOrOdd(8);

	}

	public static void checkEvenOrOdd(int n) { 
		int count = solve(n);
		if (count % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static int solve(int n) {
		int count = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				if (i * i == n) {
					System.out.println(i);
					count++;
				} else {
					System.out.println(i + " " + n / i);
					count += 2;
				}
			}
		}
		System.out.println("this is the count " + count);
		return count;
	}

}
