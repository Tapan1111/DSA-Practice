package com.tapan.dsa.leetCodeEasy;

import java.util.ArrayList;

public class SwBrute {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 2, 9, 7, 1 };
		ArrayList<Integer> sumStore = new ArrayList<Integer>();

		for (int i = 0; i < arr.length - 2; i++) {
			int sum = 0;

			for (int j = i; j < i + 3; j++) {
				sum = sum + arr[j];
			}
			sumStore.add(sum);
			}
			int max = Integer.MIN_VALUE;
			for (Integer val : sumStore) {
				if (val > max) {
					max = val;
				}

		}
		System.out.println(max);

	}
}
