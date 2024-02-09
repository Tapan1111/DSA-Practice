package com.tapan.dsa.leetcodeMedium;

import java.util.Arrays;

public class FndFirstAndLastIndexOfElementInSortedArray {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		FndFirstAndLastIndexOfElementInSortedArray res = new FndFirstAndLastIndexOfElementInSortedArray();
		int[] nums = res.searchRange(arr, 7);
		System.out.println(Arrays.toString(nums));

	}

	public static int[] searchRange(int[] arr, int target) {
		int[] ans = new int[2];
		int n = arr.length;
		int f = -1;
		int l = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == target && f == -1) {
				f = i;
				l = i;
			} else if (arr[i] == target) {
				l = i;
			}
			ans[0] = f;
			ans[1] = l;
		}
		return ans;
	}
}
