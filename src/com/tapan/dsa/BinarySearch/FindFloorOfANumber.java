package com.tapan.dsa.BinarySearch;

public class FindFloorOfANumber {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 1;
		System.out.println(findFloor(arr, target));
	}

	private static int findFloor(int[] arr, int target) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return e;

	}

}
