package com.tapan.dsa.twoPointer;

import java.util.Arrays;

public class validTriangle {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 4 };
		System.out.println(validTrianglecount(arr));

	}

	public static int validTrianglecount(int[] arr) {
		if (arr.length < 3) {
			return 0;
		}
		int count = 0;
		Arrays.sort(arr);
		for (int k = arr.length - 1; k > 1; k--) {
			int i = 0;
			int j = k - 1;
			while (i < j) {
				if (arr[i] + arr[j] > arr[k]) {
					count = count + j - i;
					j--;
				}else {
					i++;
				}
			}

		}
		return count;
	}

}
