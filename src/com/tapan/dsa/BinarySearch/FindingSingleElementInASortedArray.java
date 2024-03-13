package com.tapan.dsa.BinarySearch;

//Brute Force
public class FindingSingleElementInASortedArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
		System.out.println(solve3(arr));

	}

	public static int Solve(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			if (i == 0) {
				if (arr[i] != arr[i + 1]) {
					return arr[i];
				}
			} else if (i == arr.length - 1) {
				if (arr[i] != arr[i - 1]) {
					return arr[i];
				}
			} else if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
				return arr[i];
			}
		return -1;
	}

	public static int solve2(int[] arr) {
		for (int i = 0; i < arr.length - 1; i = i + 2) {
			if(arr[i] != arr[i+1]) {
				return arr[i];
			}
		}
		return arr[arr.length - 1];
	}

	public static int solve3(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (mid == 0 || mid == arr.length - 1) {
				return arr[mid];
			} else if (arr[mid] < arr[mid + 1] && arr[mid] < arr[mid - 1]) {
				return arr[mid];
			} else if (arr[mid] < arr[mid + 1]) {
				e = mid - 1; // Update end pointer
			} else {
				s = mid + 1; // Update start pointer
			}
		}
		return arr[e];
	}

}
