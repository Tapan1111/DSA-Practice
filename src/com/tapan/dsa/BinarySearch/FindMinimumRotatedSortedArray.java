package com.tapan.dsa.BinarySearch;

public class FindMinimumRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2 };
		System.out.println(solve(arr));

	}

	public static int solve(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] < arr[e]) {
				e = mid;
			} else {
				s = mid + 1;
			}
		}
		return arr[e];
	}

}
