package com.tapan.dsa.twoPointer;

import java.util.Arrays;

public class TripletSumInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 10, 8 };
		System.out.println(find3Number(arr, 13));

	}

	public static boolean find3Number(int[] arr, int target) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 2; i++) {
			int l = i + 1;
			int r = arr.length - 1;
			while (l < r) {
				if (arr[i] + arr[l] + arr[r] == target) {
					return true;
				} else if (arr[i] + arr[l] + arr[r] > target) {
					r--;
				} else {
					l++;
				}
			}
		}
		return true;
	}

}
