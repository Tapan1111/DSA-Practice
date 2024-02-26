package com.tapan.dsa.Array;

import java.util.Arrays;

public class SieveOfErathosthenes {
	public static void main(String[] args) {
		SieveOfErathosthenes sieve = new SieveOfErathosthenes();
		int n = 100;
		System.out.println(sieve.solution(n));

	}

	public int solution(int n) {
		int count = 0;
		boolean[] table = new boolean[n + 1];
		Arrays.fill(table, true);
		for (int i = 2; i * i < n; i++) {
			if (table[i]) {
				for (int j = i * i; j < n; j = j + i) {
					table[j] = false;
				}
			}
		}
		for (int i = 2; i < n; i++) {
			if (table[i] == true) {
				count++;
			}
		}
		return count;
	}

}
