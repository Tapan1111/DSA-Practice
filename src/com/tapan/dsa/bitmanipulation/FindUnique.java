package com.tapan.dsa.bitmanipulation;

public class FindUnique {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 5, 7, 3, 2, 1, 4 };
		System.out.println(xoring(arr));
	}

	public static int ans(int[] arr) {
		int unique = 0;
		for (int val : arr) {
			unique = unique ^ val;
		}
		return unique;
	}

	public static int xoring(int[] arr) {
		int res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		return res;
	}

}
