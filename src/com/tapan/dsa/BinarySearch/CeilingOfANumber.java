package com.tapan.dsa.BinarySearch;

public class CeilingOfANumber {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 19;
		System.out.println(findCeiling(arr, target));

	}

	public static int findCeiling(int[] arr, int target) {
		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return s;
	}

}
