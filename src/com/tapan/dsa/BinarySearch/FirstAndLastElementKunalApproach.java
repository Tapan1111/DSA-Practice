package com.tapan.dsa.BinarySearch;

import java.util.Arrays;

public class FirstAndLastElementKunalApproach {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 7, 8, 8, 9, 9, 10 };
		int target = 7;
		int[] res = searchRange(arr, target);
		System.out.println(Arrays.toString(res));

	}

	public static int[] searchRange(int[] arr, int target) {
		int[] ans = { -1, -1 };
		int start = search(arr, target, true);
		int end = search(arr, target, false);
		ans[0] = start;
		ans[1] = end;
		return ans;
	}

	public static int search(int[] arr, int target, boolean findfirstidx) {
		int ans = -1;
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] < target) {
				s = mid + 1;
			} else if (arr[mid] > target) {
				e = mid - 1;
			} else {
				ans = mid;
				if (findfirstidx) {
					e = mid - 1;
				} else {
					s = mid + 1;
				}
			}
		}
		return ans;
	}

}
