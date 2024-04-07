package com.tapan.dsa.twoPointer;

public class UglyNumber2 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(nthUglyNumber(n));

	}

	public static int nthUglyNumber(int n) {
		int[] arr = new int[n];
		int idx2 = 0, idx3 = 0, idx5 = 0;
		int nextMultipleOf2 = 2;
		int nextMultipleOf3 = 3;
		int nextMultipleOf5 = 5;

		for (int i = 1; i < n; i++) {
			int nextUglyNo = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
			arr[i] = nextUglyNo;
			if (nextUglyNo == nextMultipleOf2) {
				idx2++;
				nextMultipleOf2 = arr[idx2] * 2;
			}
			if (nextUglyNo == nextMultipleOf3) {
				idx3++;
				nextMultipleOf3 = arr[idx3] * 3;
			}
			if (nextUglyNo == nextMultipleOf5) {
				idx5++;
				nextMultipleOf5 = arr[idx2] * 5;
			}
		}
		return arr[n - 1];
	}

}
