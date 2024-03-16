package com.tapan.dsa.leetcodeMedium;

import java.util.HashMap;

public class CheckArrayPairsAreDivisibleByK {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int k = 10;
		System.out.println(check(arr, k));
	}

	public static boolean check(int[] arr, int k) {
		HashMap<Integer, Integer> remfq = new HashMap<Integer, Integer>();
		for (int val : arr) {
			int rem = val % k;
			int of = remfq.getOrDefault(rem, 0);
			remfq.put(rem, of + 1);
		}
		for (int val : arr) {
			int rem = val % k;

			if (rem == 0) {
				int fq = remfq.get(rem);
				if (fq % 2 == 1) {
					return false;
				}
			} else if (2 * rem == k) {
				int fq = remfq.get(rem);
				if (fq % 2 == 1) {
					return false;
				}
			} else {
				int fq = remfq.get(rem);
				int otherfq = remfq.getOrDefault(k - rem, 0);
				if (fq != otherfq) {
					return false;
				}
			}
		}
		return true;
	}

}
