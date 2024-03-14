package com.tapan.dsa.BinarySearchIn2DArray;

import java.util.Arrays;

public class ReturnTheElement {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 39 }, { 33, 34, 38, 50 } };
		int target = 37;
//		int[] res = solve(arr, target);
		System.out.println(Arrays.toString(doesElementExist(arr, target)));
		
	}

	public static int[] solve(int[][] arr, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == target) {
					ans[0] = i;
					ans[1] = j;

				}
			}
		}
		return ans;
	}

	public static int[] doesElementExist(int[][] arr, int target) {
		int r = 0;
		int c = arr.length - 1;
		while (r < arr.length && c >= 0) {
			if (arr[r][c] == target) {
				return new int[] { r, c };
			}
			if (arr[r][c] < target) {
				r++;
			} else {
				c--;
			}
		}

		return new int[] { -1, -1 };
	}

}
