package com.tapan.dsa.BinarySearch;

public class PeakInMountainArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 4 };
		System.out.println(searchRanger(arr));
	}

	public static int searchRanger(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] < arr[mid + 1]) {
				e = mid;
			}
		}
		return e;
	}

}
