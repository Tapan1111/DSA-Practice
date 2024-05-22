package com.tapan.dsa.recursion;

import java.util.Arrays;

public class SumTriangleFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		sumTriangle(arr);
	}

	public static void sumTriangle(int[] arr) {

		int[] ans = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			ans[i - 1] = arr[i] + arr[i - 1];
		}
		System.out.println(Arrays.toString(ans));
		sumTriangle(ans);
	}
}
