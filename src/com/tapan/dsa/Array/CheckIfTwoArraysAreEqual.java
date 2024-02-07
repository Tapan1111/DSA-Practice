package com.tapan.dsa.Array;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqual {
	public static void main(String[] args) {
		CheckIfTwoArraysAreEqual check = new CheckIfTwoArraysAreEqual();

		int[] arr1 = { 1, 2, 5, 4, 0 };
		int[] arr2 = { 2, 4, 5, 0, 1 };
		System.out.println(check.solve(arr1, arr2));

	}

	public static boolean solve(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		return true;

	}
}
