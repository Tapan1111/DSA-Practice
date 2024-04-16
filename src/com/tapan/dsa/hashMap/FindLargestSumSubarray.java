package com.tapan.dsa.hashMap;

public class FindLargestSumSubarray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 3, 3 };
		System.out.println(maxSubarray(arr));
	}

	public static int maxSubarray(int[] input) {
		int largestSum = 0;

		for (int i = 0; i < input.length; i++) {
			int pSum = 0;
			for (int j = i; j < input.length; j++) {
				pSum = pSum + input[j];
			}
			largestSum = Math.max(pSum, largestSum);
		}
		return largestSum;
	}

}
