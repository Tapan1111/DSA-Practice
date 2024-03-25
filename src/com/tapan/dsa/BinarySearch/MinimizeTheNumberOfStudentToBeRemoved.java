package com.tapan.dsa.BinarySearch;

import java.util.Arrays;

public class MinimizeTheNumberOfStudentToBeRemoved {
	public static void main(String[] args) {
		int[] arr = { 9, 1, 2, 3, 1, 5 };
		System.out.println(removeMinimum(arr));

	}

	public static int removeMinimum(int[] arr) {
		int n = arr.length;
		int lis = LengthOfLIS(arr);
		return n - lis;
	}

	public static int LengthOfLIS(int[] arr) {
		int[] a = new int[arr.length + 1];
		Arrays.fill(a, Integer.MAX_VALUE);
		System.out.println(Arrays.toString(a));
		a[0] = Integer.MIN_VALUE;
		System.out.println(Arrays.toString(a));
		for (int val : arr) {
			int idx = searchLess(a, val);
			a[idx + 1] = val;
		}
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != Integer.MAX_VALUE) {
				return i;
			}
		}
		return 0;
	}

	private static int searchLess(int[] a, int val) {
		int s = 0;
		int e = a.length - 1;
		int ans = 0;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (a[mid] < val) {
				s = mid + 1;
				ans = Math.max(ans, mid);
			} else {
				e = mid - 1;
			}
		}

		return ans;
	}

}
