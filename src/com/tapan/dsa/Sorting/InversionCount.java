package com.tapan.dsa.Sorting;

public class InversionCount {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 3, 5 };
		System.out.println(inversionCount(arr));

	}

	public static int inversionCount(int[] arr) {
		int inversion = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					inversion++;
				}
			}
		}
		return inversion;
	}

}
