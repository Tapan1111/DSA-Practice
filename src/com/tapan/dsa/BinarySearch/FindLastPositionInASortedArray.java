package com.tapan.dsa.BinarySearch;

public class FindLastPositionInASortedArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5 };
		int target = 3;
		System.out.println(findLastPosition(arr, target));

	}

	public static int findLastPosition(int[] arr, int target) {
		int ans = -1;
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == target) {
				ans = mid;
				l = mid + 1;
			} else if (arr[mid] < target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return ans;
	}

}
