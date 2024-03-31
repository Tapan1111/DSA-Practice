package com.tapan.dsa.Array;

import java.util.Arrays;

public class CountOfSmallerNumberAfterSelf {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 1 };
		int[] res = solve(arr);
		System.out.println(Arrays.toString(res));
	}

	public static int[] solve(int[] arr) {
		int[] count = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					count[i]++;
				}
			}
		}
		return count;

	}
}
