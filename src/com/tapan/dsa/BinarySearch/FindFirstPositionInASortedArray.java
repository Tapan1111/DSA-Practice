package com.tapan.dsa.BinarySearch;

public class FindFirstPositionInASortedArray {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		System.out.println(find(arr, target));

	}

	public static int find(int[] arr, int target) {
		int ans = -1;
		int l = 0;
		int r = arr.length-1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (arr[m] == target) {
				ans = m;
				r = m - 1;
			} else if (arr[m] < target) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return ans;
	}

}
