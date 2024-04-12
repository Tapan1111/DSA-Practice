package com.tapan.dsa.recursion;

import java.util.Arrays;

public class EliminationGame {
	public static void main(String[] args) {
		int n = 9;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int res[] = lastRemianingArr(arr);
		System.out.println((Arrays.toString(res)));
	}

	public static int lastRemianing(int n) {
		int head = 1;
		int remain = n;
		int step = 1;
		boolean left = true;
		while (remain > 1) {
			if (left || remain % 2 == 1) {
				head = head + step;

			}
			remain = remain / 2;
			step = step * 2;
			left = !left;
		}
		return remain;

	}

	public static int[] lastRemianingArr(int[] arr) {
		int[] ans = new int[1];
		int head = 0;
		int remain = arr.length;
		int step = 1;
		boolean left = true;
		for (int i = 0; i < arr.length; i++) {
			while (remain > 1) {
				if (left || remain % 2 == 1) {
					head = head + step;

				}
				remain = remain / 2;
				step = step * 2;
				left = !left;
			}
			ans[0] = arr[head];

		}

		return ans;

	}
}
