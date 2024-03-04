package com.tapan.dsa.maths;

import java.util.Arrays;

public class LargestNumberTD {
	public static void main(String[] args) {
		int n = 24;
		// double h = Math.sqrt(n);
		int sum = -1 + 4;
		System.out.println(sum);
		// System.out.println(simpleDivCount(n));

	}

	public static int simpleDivCount(int n) {
		if (n < 1) {
			return -1;
		}
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static int divCount(int n) {
		boolean[] hash = new boolean[n + 1];
		Arrays.fill(hash, true);
		for (int i = 2; i * i < n; i++) {
			if (hash[i] == true) {
				for (int j = i * 2; j < n; j = j + i) {
					hash[j] = false;
				}
			}
		}
		int total = 1;
		for (int i = 2; i <= n; i++) {
			if (hash[i]) {
				int count = 0;
				if (n % i == 0) {
					while (n % i == 0) {
						n = n / i;
						count++;
					}
					total = total * (count + 1);
				}
			}
		}
		return total;

	}

}
