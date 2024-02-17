package com.tapan.dsa.maths;

public class Prime {
	public static void main(String[] args) {
		Prime checkprime = new Prime();

		int n = 7;
		System.out.println(checkprime.check(n));
	}

	public boolean check(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

}
