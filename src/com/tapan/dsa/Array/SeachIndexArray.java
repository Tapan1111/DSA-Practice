package com.tapan.dsa.Array;

public class SeachIndexArray {

	public static void main(String[] args) {
		SeachIndexArray search = new SeachIndexArray();
		int[] arr = { 1, 12, 44, 45, 56, 99 };
		search.searchIndexBinarySearch(arr, 44, 0, arr.length - 1);

		System.out.println(search.searchIndexBinarySearch(arr, 45, 0, arr.length - 1));

//		System.out.println(search.searchIndex(arr, 12));
		

	}

//	public int searchIndex(int[] arr, int val) {
//		if (arr.length == 0) {
//			return -1;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == val) {
//				return i;
//			}
//		}
//		return -1;
//	}

	public int searchIndexBinarySearch(int[] arr, int val, int start, int end) {
		if (arr.length == 0 || start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		if (arr[mid] == val) {
			return mid;
		}

		if (val > arr[mid]) {
			return searchIndexBinarySearch(arr, val, mid + 1, end);
		} else {
			return searchIndexBinarySearch(arr, val, start, mid - 1);
		}
	}

}
