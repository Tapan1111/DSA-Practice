package com.tapan.dsa.Array;

import java.util.Arrays;

public class LargestAndSmallestElement {
	public static void main(String[] args) {
		int[] arr = { 45, 67, 43, 2, 79, 98, 21 };

		int smallestElement = Integer.MAX_VALUE;
		int largestElement = Integer.MIN_VALUE;
		for (int val : arr) {
			if (val < smallestElement) {
				smallestElement = val;
			}
			if (val > largestElement) {
				largestElement = val;
			}
		}
		System.out.println(smallestElement);
		System.out.println(largestElement);
		System.out.println();

		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);
	}
}
