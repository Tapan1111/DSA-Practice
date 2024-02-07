package com.tapan.dsa.maths;

import java.util.Arrays;

public class AlternativeSorting {
	public static void main(String[] args) {
		int[] arr = { 7, 1, 2, 3, 4, 5, 6 };
		int[] nums = new int[arr.length];
		Arrays.sort(arr);
		int j = arr.length - 1;
		int k = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i = i + 2) {
			nums[i] = arr[k];
			k++;
		}
		for (int i = 0; i < arr.length; i = i + 2) {
			nums[i] = arr[j];
			j--;
		}

		System.out.println(Arrays.toString(nums));

	}

}
