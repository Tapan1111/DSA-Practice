package com.tapan.dsa.Sorting;

import java.util.Arrays;

public class Slectionsort {
	public static void main(String[] args) {
		Slectionsort selectiionsort = new Slectionsort();
		int[] arr = { 7, 9, 99, 54, 2, 1 };
		selectiionsort.sorting(arr);

	}

	public static void sorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int mi = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (isSmaller(arr, j, mi)) {
					mi = j;
				}
			}
			swap(arr, i, mi);
		}
		System.out.println(Arrays.toString(arr));

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
