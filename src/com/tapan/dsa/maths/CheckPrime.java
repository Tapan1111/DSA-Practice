package com.tapan.dsa.maths;

public class CheckPrime {
	public static void main(String[] args) {
		CheckPrime prime = new CheckPrime();
		int n = 8;
		System.out.println(prime.check(n));

	}

	public static boolean check(int n) {
		for (int i = 2; i <= n; i++) {
			int count = 0;
			if (n % i == 0) {
				count++;
				if (count > 2) {
					return false;
				}
			}

		}
		return true;

	}

}
