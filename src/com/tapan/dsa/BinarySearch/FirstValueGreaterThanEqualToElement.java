package com.tapan.dsa.BinarySearch;

public class FirstValueGreaterThanEqualToElement {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 8, 10, 12 };
		int x = 4;
		System.out.println(findElement(arr, x));
	}

	public static int findElement(int[] arr, int x) {
		int l = 0;
		int r = arr.length - 1;
		int ans = -1;
		while (l <= r) {
			int mid = l + (r - l) / 2;

			if (arr[mid] >= x) {
				ans = arr[mid];
				r = mid - 1;

			} else {
				l = mid + 1;

			}
		}
		return ans;
	}

}
