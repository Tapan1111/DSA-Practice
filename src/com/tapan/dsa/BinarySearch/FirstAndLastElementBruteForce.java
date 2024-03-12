package com.tapan.dsa.BinarySearch;

import java.util.Arrays;

public class FirstAndLastElementBruteForce {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 7, 8, 8, 9, 9, 10 };
		int target = 0;
		int[] res = searchRange(arr, target);
		System.out.println(Arrays.toString(res));
	}

	public static int[] searchRange(int[] arr, int target) {
		int[] ans = { -1, -1 };
		if (target == 0 && arr.length == 0) {
			return ans;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				ans[0] = i;
				break;
			}
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			if (arr[j] == target) {
				ans[1] = j;
				break;
			}
		}
		return ans;
	}

}
