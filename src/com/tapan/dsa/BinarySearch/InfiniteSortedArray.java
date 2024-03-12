package com.tapan.dsa.BinarySearch;

public class InfiniteSortedArray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 6, 19, 20, 24, 38, 57, 60, 89, 98, 100, 101 };
		int target = 24;
		System.out.println(ans(arr, target));

	}

	public static int ans(int[] arr, int target) {
		int start = 0;
		int end = 1;
		while (target > arr[end]) {
			int newstart = end + 1;
			end = end + (end - start + 1) * 2;
			start = newstart;
		}
		return binarySearch(arr, target, start, end);
	}

	public static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
