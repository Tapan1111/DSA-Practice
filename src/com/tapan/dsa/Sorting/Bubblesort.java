package com.tapan.dsa.Sorting;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		Bubblesort bubblesort = new Bubblesort();
		int[] arr = { 7, 1, 3, 9, 2 };
		bubblesort.sorting(arr);

	}

	public static void sorting(int[] arr) {
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (isSmaller(arr, j + 1, j)) {
					swap(arr, j + 1, j);
				}
			}
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
