package com.tapan.dsa.BinarySearch;

public class MockInterview {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 5 };
		int n = 5;
		System.out.println(find(arr, n));
	}

	private static int find(int[] arr, int n) {
		int nSum = 0;
		for (int i = 1; i <= n; i++) {
			nSum = nSum + i;
		}

		int aSum = 0;
		for (int i = 0; i < arr.length; i++) {
			aSum = aSum + arr[i];
		}
		return nSum - aSum;
	}

}
