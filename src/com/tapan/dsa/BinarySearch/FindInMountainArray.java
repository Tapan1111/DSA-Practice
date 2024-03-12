package com.tapan.dsa.BinarySearch;

public class FindInMountainArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
		int target = 3;
		System.out.println(search(arr, target));

	}

	public static int search(int[] arr, int target) {
		int peak = findPeak(arr);
		int ansInFirstTry = orderAgnosticBS(arr, target, 0, peak);
		if (ansInFirstTry != -1) {
			return ansInFirstTry;
		}
		return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
	}

	public static int findPeak(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}

	public static int orderAgnosticBS(int[] arr, int target, int start, int end) {
		// find whether the array is sorted in ascending or descending order
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (arr[mid] < target) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if (arr[mid] < target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

}
