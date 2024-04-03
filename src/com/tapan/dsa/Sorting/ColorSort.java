package com.tapan.dsa.Sorting;

import java.util.Arrays;

public class ColorSort {
	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		int[] res = solve(arr);
		System.out.println(Arrays.toString(res));

	}

	public static int[] solve(int[] arr) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		while (mid <= end) {
			if (arr[mid] == 0) {
				swap(arr, start, mid);
				start++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, end);
				end--;
			}
		}
		return arr;
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
