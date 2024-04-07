package com.tapan.dsa.twoPointer;

import java.util.Arrays;

public class ThreeSum {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 10, 18, 24 };
		int[] res = threesumSolve2(arr, 29);
		System.out.println(Arrays.toString(res));

	}

//	public static int[] threesumSolve(int[] arr, int target) {
//		int[] ans = new int[3];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				for (int k = j + 1; k < arr.length; k++) {
//					if (arr[i] + arr[j] + arr[k] == target) {
//						ans[0] = i;
//						ans[1] = j;
//						ans[2] = k;
//					}
//				}
//			}
//		}
//		return ans;
//	}

	public static int[] threesumSolve2(int[] arr, int target) {
//		Arrays.sort(arr);
		int[] ans = new int[3];
		for (int i = 0; i < arr.length - 2; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while (j < arr.length && k >= 0) {
				if (arr[i] + arr[j] + arr[k] == target) {
					ans[0] = i;
					ans[1] = j;
					ans[2] = k;
					break;
				}
				else if (arr[i] + arr[j] + arr[k] > target) {
					k--;
				} else {
					j++;
				}
			}
		}
		return ans;
	}

}
