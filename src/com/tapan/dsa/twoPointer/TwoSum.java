package com.tapan.dsa.twoPointer;

import java.util.Arrays;

public class TwoSum {
	public static int[] findpair(int[] arr, int k) {
		int[] ans = new int[2];
//		Arrays.sort(arr);
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {

			if (arr[i] + arr[j] == k) {
				ans[0] = i;
				ans[1] = j;
				break;
			} else if (arr[i] + arr[j] > k && arr[i] > arr[i + 1]) {
				i++;
			} else if (arr[i] + arr[j] > k) {
				j--;
			} else {
				i++;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4 };
		int[] res = findpair(arr, 6);
		System.out.println(Arrays.toString(res));

	}

}
