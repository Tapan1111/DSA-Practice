package com.tapan.dsa.hashMap;

import java.util.HashMap;

public class LargestSubarrayWithSum0 {
	public static void main(String[] args) {
		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println(maxlengthHash(arr));
	}

	// BruteForce TLE O(N^2)
	public static int maxlength(int[] arr) {
		int maxlength = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == 0) {
					maxlength = Math.max(maxlength, j - 1 + 1);
				}
			}
		}
		return maxlength;
	}

	// Optimized
	public static int maxlengthHash(int[] arr) {
		int sum = 0;
		int maxlength = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum == 0) {
				maxlength = i + 1;
			}
			Integer prev_i = map.get(sum);

			if (prev_i != null) {
				maxlength = Integer.max(maxlength, i - prev_i);
			} else {
				map.put(sum, i);
			}
		}

		return maxlength;
	}

}
