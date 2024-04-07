package com.tapan.dsa.twoPointer;

import java.util.Arrays;

public class TwoSum2 {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int[] res = solution(arr, 9);
		System.out.println(Arrays.toString(res));

	}

	public static int[] solution(int[] arr, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < arr.length - 1; i++) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[i] + arr[j] == target) {
					ans[0] = i + 1;
					ans[1] = j + 1;
					break;

				} else {
					j++;
				}
			}
		}
		return ans;
	}

}
