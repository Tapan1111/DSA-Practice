package com.tapan.dsa.Sorting;

import java.util.Arrays;

public class Slectionsort {
	public static void main(String[] args) {
		Slectionsort selectiionsort = new Slectionsort();
		int[] arr = { 7, 9, 99, 54, 2, 1 };
		int[] res = selectiionsort.sorting(arr);
		System.out.println(Arrays.toString(res));

	}

	public static int[] sorting(int[] arr) {
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int mi = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (isSmaller(arr, j, mi)) {
					mi = j;
				}
			}
			swap(arr, i, mi);
			ans[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		return ans;

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static boolean isSmaller(int[] arr, int i, int j) {
		if (arr[i] < arr[j]) {
			return true;
		}
		return false;
	}
}
