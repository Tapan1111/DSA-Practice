package com.tapan.dsa.BinarySearch;

public class SearchInRotatedArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
		System.out.println("Pivot in the arr : " + findPivot(arr));
		int target = 5;
		System.out.println("index of target  : " + findAns(arr, target));

	}

	public static int findAns(int[] arr, int target) {
		int pivot = findPivot(arr);
		int firstHalf = binarySearch(arr, target, 0, pivot);
		if (firstHalf != -1) {
			return firstHalf;
		}
		return binarySearch(arr, target, pivot + 1, arr.length - 1);
		
	}

	public static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		if (arr[start] < arr[end]) {
			return end;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[mid] < arr[start]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
