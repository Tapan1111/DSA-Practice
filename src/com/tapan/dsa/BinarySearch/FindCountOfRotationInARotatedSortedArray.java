package com.tapan.dsa.BinarySearch;

public class FindCountOfRotationInARotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(findRotation(arr));

	}

	public static int findRotation(int[] arr) {
		int pivot = findPivot(arr);
		return pivot + 1;
	}

	public static int findPivot(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (mid < e && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > s && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] < arr[s]) {
				return s;
			} else {
				s = mid + 1;
			}
		}
		return -1;
	}

}
