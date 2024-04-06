package com.tapan.dsa.Sorting;

public class Sorting_QuickSort {
	public static void main(String[] args) {
		int[] arr = { 3, 78, 5, 23, 67, 11, 33, 9, 2, 8 };
		printarr(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.println();
		printarr(arr);

	}

	public static void printarr(int[] arr) {
		System.out.println("-----------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		}
		int pivot = partition(arr, start, end);
		quickSort(arr, 0, pivot - 1);
		quickSort(arr, pivot + 1, end);

	}


	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = 0;
		int j = 0;
		while (i < end) {
			if (arr[i] <= pivot) {
				swap(arr, i, j);
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		swap(arr, i, j);
		return j;

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
