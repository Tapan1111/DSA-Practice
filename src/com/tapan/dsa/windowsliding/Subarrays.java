package com.tapan.dsa.windowsliding;

public class Subarrays {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3 };
		pringSubarray(arr);
	}

	public static void pringSubarray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}

}
