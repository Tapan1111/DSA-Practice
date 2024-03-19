package com.tapan.dsa.BinarySearch;

public class FindFirstElementSmallerThanAndEqual {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 8, 10, 12 };
		int x = 11;
		System.out.println(findFirstSmaller(arr, x));
	}

	public static int findFirstSmaller(int[] arr, int x) {
		int l = 0;
		int r = arr.length - 1;
		int ans = -1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (arr[mid] <= x) {
				ans = arr[mid];
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return ans;
	}

}
