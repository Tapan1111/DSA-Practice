package com.tapan.dsa.bitmanipulation;

public class SumOfAllSubSetXor {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 8 };
		System.out.println(subsetXorsum(arr));

	}

	public static int subsetXorsum(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < (1 << n); i++) {
			int xor = 0;
			for (int j = 0; j < n; j++) {
				int k = i & (1 << j);
				if (k != 0) {
					xor = xor ^ arr[j];
				}
			}
			sum = sum + xor;

		}
		return sum;
	}

}
