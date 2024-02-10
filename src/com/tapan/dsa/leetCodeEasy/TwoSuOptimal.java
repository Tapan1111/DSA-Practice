package com.tapan.dsa.leetCodeEasy;

import java.util.Arrays;

public class TwoSuOptimal {
	public static void main(String[] args) {
		TwoSuOptimal twosum = new TwoSuOptimal();
		int[] arr = { 5, 4, 3, 2, 7 };
		int target = 12;
		int[] shhowRes = twosum.twoSum(arr, target);
		System.out.println(Arrays.toString(shhowRes));


	}

	public int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		int[] result = new int[2];
		int max = -1;
		for (int i = 0; i < n; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
//		System.out.println(max);
		boolean[] arr = new boolean[max + 1];
		for (int i = 0; i < n; i++) {
			arr[nums[i]] = true;
		}

		int f = -1;
		int l = -1;
		for (int i = 0; i < n; i++) {
			int req = target - nums[i];
			if (req <= max && arr[req] && f == -1 && l == -1) {
				f = i;
				l = req;

				result[0] = f;
				result[1] = l;
			}

		}
		return result;
	}
}
