package com.tapan.dsa.BinarySearch;

public class FindSigleInDoubleElementArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6 };
		System.out.println(find(arr));

	}

	public static int find(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		int ans = -1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (mid != arr.length - 1 && arr[mid] == arr[mid ^ 1]) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return arr[s];
	}

}
