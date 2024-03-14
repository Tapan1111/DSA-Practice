package com.tapan.dsa.BinarySearch;

public class PeakInMountainArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 8, 0 };
		System.out.println(searchDepth(arr));
	}

	public static int searchRanger(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] > arr[mid + 1]) {
				e = mid;

			} else {
				s = mid + 1;
			}
		}
		return s;
	}

	public static int searchDepth(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[s] < arr[e]) {
				return s;
			}
			if (arr[e] < arr[s]) {
				return e;
			}
			else if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
				return mid;
			}
		}
		return -1;
	}

}
