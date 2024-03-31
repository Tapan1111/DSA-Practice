package com.tapan.dsa.Sorting;

public class Sorting_BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 7, 2, 1, 3 };
		print(arr);
		selectionSort(arr);
		print(arr);
	}

	public static void sortIt(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}

		}
	}

	public static void selectionSort(int[] arr) {
		for (int usi = 0; usi < arr.length - 1; usi++) {
			int minidx = usi;
			for (int i = usi + 1; i < arr.length; i++) {
				if (arr[i] < arr[minidx]) {
					minidx = i;
				}
			}
			swap(arr, usi, minidx);
		}
	}

	private static void swap(int[] arr, int big, int sml) {
		int temp = arr[big];
		arr[big] = arr[sml];
		arr[sml] = temp;

	}

	public static void print(int[] arr) {
		System.out.println("------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
