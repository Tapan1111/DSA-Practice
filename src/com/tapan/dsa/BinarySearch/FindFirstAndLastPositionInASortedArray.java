package com.tapan.dsa.BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPositionInASortedArray {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] res = findFirstAndLast(arr, target);
		System.out.println(Arrays.toString(res));

	}

	public static int[] findFirstAndLast(int[] arr, int target) {
		int[] ans = { -1, -1 };
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == target) {
				ans[0] = mid;
				e = mid - 1;
			} else if (arr[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == target) {
				ans[1] = mid;
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
