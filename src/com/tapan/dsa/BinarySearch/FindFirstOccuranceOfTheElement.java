package com.tapan.dsa.BinarySearch;

public class FindFirstOccuranceOfTheElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 4, 4, 5, 5, 6 };
		int target = 5;
		System.out.println(findFirst(arr, target));

	}

	public static int findFirst(int[] arr, int target) {
		int s = 0;
		int e = arr.length - 1;

		while (s <= e) {
			int mid = s + (e - s) / 2;
			// System.out.println("s: " + s + ", e: " + e + ", mid: " + mid);
			if (arr[mid] == target) {
				e = mid - 1;
			} else if (arr[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		if (s < arr.length && arr[s] == target) {
			return s;
		}
		return -1;
	}

}
