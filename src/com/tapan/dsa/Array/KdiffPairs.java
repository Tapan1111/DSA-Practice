package com.tapan.dsa.Array;

import java.util.Arrays;

public class KdiffPairs {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 1, 5 };
		System.out.println(pairs(arr, 2));

	}

	public static int pairs(int[] arr, int k) {
		int count = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (j > i + 1 && arr[j] == arr[j - 1]) {
					continue;
				}
				if (Math.abs(arr[i] - arr[j]) == k) {
					count++;
				}
			}
		}
		return count;

	}

}
